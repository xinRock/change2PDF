package com.thread.simple2;

import java.util.Date;
import java.util.concurrent.TimeUnit;

/**
 * 
 * @author menggq
 *
 */
public class Thread2 implements Runnable {

	private static int threadInitNumber;
	private static long threadSeqNumber;

	public Thread2() {
		super();
	}

	private static  int nextThreadNum() {
		return threadInitNumber++;
	}

	private static  long nextThreadID() {
		return ++threadSeqNumber;
	}

	@Override
	public void run() {

		try {
			TimeUnit.SECONDS.sleep(5);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		System.out.println("zhixingOvertime:" + new Date().toString() + "==" + threadSeqNumber + "==" + threadInitNumber);

	}

}
