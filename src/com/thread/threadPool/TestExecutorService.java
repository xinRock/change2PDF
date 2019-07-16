package com.thread.threadPool;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;

import org.junit.Test;
import org.junit.runner.RunWith;

import com.thread.simple2.Thread2;
/**
 * 
 * 
 * @author menggq
 *
 */
public  class TestExecutorService {

	
	public static void main(String[] args) {
		TestExecutorService executorService=new TestExecutorService();
		//executorService.testnewFixedThreadPool();
		//executorService.testnewSingleThreadExecutor();
		executorService.testnewCachedThreadPool();
	}
	
	/**
	 * ExecutorService newFixedThreadPool(int nThreads)可以创建固定数量的线程池；
	 * new ThreadPoolExecutor(var0, var0, 0L, TimeUnit.MILLISECONDS, new LinkedBlockingQueue());
	 */
	public void testnewFixedThreadPool() {
		System.out.println("newFixedThreadPoolo");
		ExecutorService newFixedThreadPool = Executors.newFixedThreadPool(1);
		System.out.println("newFixedThreadPool1");
		newFixedThreadPool.submit(new Thread2());
		System.out.println("newFixedThreadPool2");
	}
	/**
	 * ExecutorService newSingleThreadExecutor()可以创建只有一个线程的线程池
	 * new ThreadPoolExecutor(1, 1, 0L, TimeUnit.MILLISECONDS, new LinkedBlockingQueue())
	 */
	public void testnewSingleThreadExecutor() {
		System.out.println("newSingleThreadExecutor");
		ExecutorService newSingleThreadExecutor = Executors.newSingleThreadExecutor();
		System.out.println("newSingleThreadExecutor1");
		newSingleThreadExecutor.submit(new Thread2());
		System.out.println("newSingleThreadExecutor2");
	}
	
	/**
	 * 有些东西在junit下测试不准，就比如下面的
	 * ExecutorService newCachedThreadPool() 可以返回一个根据实际情况调整线程数量的线程池
	 * new ThreadPoolExecutor(0, Integer.MAX_VALUE, 60L, TimeUnit.SECONDS, new SynchronousQueue())
	 */
	public void testnewCachedThreadPool() {
		System.out.println("newCachedThreadPool");
		ExecutorService newCachedThreadPool = Executors.newCachedThreadPool();
		System.out.println("newCachedThreadPool1");
		newCachedThreadPool.execute(new Thread2());
		
		for (int i = 0; i < 51; i++) {
			try {
				Thread.sleep(1000l);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			boolean shutdown = newCachedThreadPool.isShutdown();
			System.out.println(shutdown);
		}
		System.out.println("newCachedThreadPool2");
	}
	/**
	 * 一个ThreadScheduledExecutor
	 * ScheduledExecutorService newSingleThreadScheduledExecutor()可以返回一个可以执行定时任务线程的线程池
	 * new DelegatedScheduledExecutorService(new ScheduledThreadPoolExecutor(1));
	 * new ThreadPoolExecutor(1, Integer.MAX_VALUE, 0L, TimeUnit.NANOSECONDS, new DelayedWorkQueue())
	 * 
	 */
	public void testnewSingleThreadScheduledExecutor() {
		System.out.println("newSingleThreadScheduledExecutor");
		ScheduledExecutorService newSingleThreadScheduledExecutor = Executors.newSingleThreadScheduledExecutor();
		
		System.out.println("newSingleThreadScheduledExecutor1");
		newSingleThreadScheduledExecutor.execute(new Thread2());
		
		for (int i = 0; i < 51; i++) {
			try {
				Thread.sleep(1000l);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			boolean shutdown = newSingleThreadScheduledExecutor.isShutdown();
			System.out.println(shutdown);
		}
		System.out.println("newSingleThreadScheduledExecutor2");
	}
	/**
	 * ScheduledExecutorService newScheduledThreadPool(int corePoolSize)可以返回指定数量可以执行定时任务的线程池
	 * new ScheduledThreadPoolExecutor(var0);
	 * 详情请看TestScheduledThreadPoolExecutor
	 */
	public void testnewScheduledThreadPool() {
		System.out.println("newScheduledThreadPool");
		ScheduledExecutorService newScheduledThreadPool = Executors.newScheduledThreadPool(2);
		
		System.out.println("newScheduledThreadPool1");
		newScheduledThreadPool.execute(new Thread2());
		
		
		for (int i = 0; i < 51; i++) {
			try {
				Thread.sleep(1000l);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			boolean shutdown = newScheduledThreadPool.isShutdown();
			System.out.println(shutdown);
		}
		System.out.println("newScheduledThreadPool2");
	}
	
	
}
