package com.timeUnit;

import java.util.concurrent.TimeUnit;

/**
 * TimeUnit时间粒子单元对象 主要两个功能一是 时间换算 二是 线程类对象的方法重写
 * 
 * @author menggq
 *
 */
public class TestTimeUnit {

	public static void main(String[] args) {
		// 时间换算的使用
		System.out.println(TimeUnit.SECONDS.toMinutes(59)); // 0 转换成分钟只取整数
		System.out.println(TimeUnit.SECONDS.toMinutes(60)); // 1 转换成分钟只取整数
		System.out.println(TimeUnit.MICROSECONDS.toNanos(1)); // 1微秒=1000纳秒
	}

	// TimeUnit.sleep的可读性明显高于Thread.sleep。
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
