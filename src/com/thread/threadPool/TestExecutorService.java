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
	 * ExecutorService newFixedThreadPool(int nThreads)���Դ����̶��������̳߳أ�
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
	 * ExecutorService newSingleThreadExecutor()���Դ���ֻ��һ���̵߳��̳߳�
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
	 * ��Щ������junit�²��Բ�׼���ͱ��������
	 * ExecutorService newCachedThreadPool() ���Է���һ������ʵ����������߳��������̳߳�
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
	 * һ��ThreadScheduledExecutor
	 * ScheduledExecutorService newSingleThreadScheduledExecutor()���Է���һ������ִ�ж�ʱ�����̵߳��̳߳�
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
	 * ScheduledExecutorService newScheduledThreadPool(int corePoolSize)���Է���ָ����������ִ�ж�ʱ������̳߳�
	 * new ScheduledThreadPoolExecutor(var0);
	 * �����뿴TestScheduledThreadPoolExecutor
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
