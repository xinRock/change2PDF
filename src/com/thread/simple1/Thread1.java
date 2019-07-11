package com.thread.simple1;

import java.util.concurrent.TimeUnit;

public class Thread1 extends Thread {

	@Override
	public void run() {
		try {
			System.out.println("Thread1的run方法，进入了");
			TimeUnit.SECONDS.sleep(2);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("Thread1的run方法，开始业务处理");
		super.run();
	}

	@Override
	public void interrupt() {
		super.interrupt();
	}
	

}
