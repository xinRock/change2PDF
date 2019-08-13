package threadCommunication.lock.demo1;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;
/**
 * Lock�Ĳ�����
 * @author menggq
 *
 */
public class Test001 {
	public static void main(String[] args) {
		Res res = new Res();
		IntThread intThread = new IntThread(res);
		OutThread outThread = new OutThread(res);
		intThread.start();
		outThread.start();
	}
}
//������Դ
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
			// synchronized (res) {
			try {
				System.out.println("IntThread ��run ����");
				res.lock.lock();
				if (res.flag) {
					//res.condition.await();����Object.wait
					res.condition.await();
				}

				if (count == 0) {
					res.userName = "С��";
					res.userSex = "Ů";
				} else {
					res.userName = "С��";
					res.userSex = "��";
				}
				System.out.println(res.flag +"IntThread =" + count+"---"+res.userName + "," + res.userSex);
				
				count = (count + 1) % 2;
				res.flag = true;
				//res.Condition.Signal() ����Object.notify
				res.condition.signal();
				//Object.notify		
			} catch (Exception e) {
				// TODO: handle exception
				e.printStackTrace();
			} finally {
				res.lock.unlock();
			}
			System.out.println("IntThread ��run �뿪");
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
			System.out.println("OutThread ��run ����");
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
			System.out.println("OutThread  �� run �뿪");
		}
	}

}
