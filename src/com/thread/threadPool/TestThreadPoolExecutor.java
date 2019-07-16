package com.thread.threadPool;

import java.util.Date;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

import com.thread.simple1.Thread1;
import com.thread.simple2.Thread2;

/**
 * 
 * @author menggq
 * 所有线程池的基础类  ThreadPoolExecutor
 */
public class TestThreadPoolExecutor {

	
	public static void main(String[] args) {
		Thread1 thread1=new Thread1();
		System.out.println("ThreadPoolExecutor");
		ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(0, Integer.MAX_VALUE, 60L, TimeUnit.SECONDS, new SynchronousQueue());
		System.out.println("ThreadPoolExecutor1");
		
		Thread2 thread2=new Thread2();
		threadPoolExecutor.execute(thread2);
		System.out.println("ThreadPoolExecutor2");
	}
}
