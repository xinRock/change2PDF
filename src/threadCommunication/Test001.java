package threadCommunication;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;
//对象资源
class Res {
	public String userSex;
	public String userName;
	public boolean flag = false;
	public Lock lock = new ReentrantLock();
	public Condition condition = lock.newCondition();
}

class IntThread extends Thread {
	private Res res;

	public IntThread(Res res) {
		this.res = res;
	}

	@Override
	public void run() {
		int count = 0;
		while (true) {
			try {
				System.out.println("IntThread 的run 进入");
				res.lock.lock();
				if (res.flag) {
					res.condition.await();
				}

				if (count == 0) {
					res.userName = "小红";
					res.userSex = "女";
				} else {
					res.userName = "小军";
					res.userSex = "男";
				}
				System.out.println(res.flag +"IntThread =" + count+"---"+res.userName + "," + res.userSex);
				
				count = (count + 1) % 2;
				res.flag = true;
				res.condition.signal();
			} catch (Exception e) {
				// TODO: handle exception
				e.printStackTrace();
			} finally {
				res.lock.unlock();
			}
			System.out.println("IntThread 的run 离开");
		}
	}

}

class OutThread extends Thread {
	private Res res;

	public OutThread(Res res) {
		this.res = res;
	}

	@Override
	public void run() {
		while (true) {
			System.out.println("OutThread 的run 进入");
			synchronized (res) {
				try {
					
					res.lock.lock();
					if (!res.flag) {
						res.condition.await();
					}
					Thread.sleep(2000);
					System.out.println(res.flag +"===OutThread ="+res.userName + "," + res.userSex);
					res.flag = false;
					res.condition.signal();
				} catch (Exception e) {
					// TODO: handle exception
					e.printStackTrace();
				} finally {
					res.lock.unlock();
				}

			}
			System.out.println("OutThread  的 run 离开");
		}
	}

}

public class Test001 {

	public static void main(String[] args) {

		Res res = new Res();
		IntThread intThread = new IntThread(res);
		OutThread outThread = new OutThread(res);
		intThread.start();
		outThread.start();
	}

}
