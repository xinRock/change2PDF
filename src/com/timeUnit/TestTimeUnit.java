package com.timeUnit;

import java.util.concurrent.TimeUnit;

/**
 * TimeUnitʱ�����ӵ�Ԫ���� ��Ҫ��������һ�� ʱ�任�� ���� �߳������ķ�����д
 * 
 * @author menggq
 *
 */
public class TestTimeUnit {

	public static void main(String[] args) {
		// ʱ�任���ʹ��
		System.out.println(TimeUnit.SECONDS.toMinutes(59)); // 0 ת���ɷ���ֻȡ����
		System.out.println(TimeUnit.SECONDS.toMinutes(60)); // 1 ת���ɷ���ֻȡ����
		System.out.println(TimeUnit.MICROSECONDS.toNanos(1)); // 1΢��=1000����
	}

	// TimeUnit.sleep�Ŀɶ������Ը���Thread.sleep��
	public static void testTimeUnitSleep() throws InterruptedException {
		TimeUnit.MINUTES.sleep(5);
	}

	//  Thread.Wait
	public static void testTimeUnitWait() throws InterruptedException {
		Object lock = new Object();
		synchronized (lock) {
			TimeUnit.MINUTES.timedWait(lock, 5);
		}
	}

	// Thread.join
	public static void testTimeUnitJoin() throws InterruptedException {
		Thread thread = new Thread(new Runnable() {
			@Override
			public void run() {

				System.out.println("run");
				try {
					TimeUnit.MINUTES.sleep(1);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				System.out.println("Over run.");

			}
		});
		thread.start();
		TimeUnit.MINUTES.timedJoin(thread, 5);
		System.out.println("Over Main.");
	}

}
