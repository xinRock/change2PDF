package com.thread.simple1;

import java.util.concurrent.TimeUnit;

public class Thread1 extends Thread {

	@Override
	public void run() {
		try {
			System.out.println("Thread1��run������������");
			TimeUnit.SECONDS.sleep(2);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("Thread1��run��������ʼҵ����");
		super.run();
	}

	@Override
	public void interrupt() {
		super.interrupt();
	}
	

}
