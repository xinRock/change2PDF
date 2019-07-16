package com.thread.threadPool;

import java.util.Date;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

import com.thread.simple2.Thread2;
import com.thread.simple3.Thread3;

/**
 * class ScheduledThreadPoolExecutor extends ThreadPoolExecutor implements ScheduledExecutorService
 * @author menggq
 *
 */
public class TestScheduledThreadPoolExecutor{
	
	
	
	public static void main(String[] args) {
		TestScheduledThreadPoolExecutor testScheduledThreadPoolExecutor=new TestScheduledThreadPoolExecutor();
		testScheduledThreadPoolExecutor.testschedule();
		//testScheduledThreadPoolExecutor.testschedule2();
		//testScheduledThreadPoolExecutor.testscheduleAtFixedRate();
		//testScheduledThreadPoolExecutor.testscheduleWithFixedDelay();
	}
	/**
	 * 
	 */
	public void testschedule() {
		ScheduledThreadPoolExecutor scheduledThreadPoolExecutor=new ScheduledThreadPoolExecutor(3);
		//schedule 是先等待阻隔时间然后再执行任务线程，主线程如果执行完了不管子线程的进度如何
		//向定时任务线程池提交一个延时Runnable任务（仅执行一次至少也是一次）
		scheduledThreadPoolExecutor.schedule(new Thread2(), 3l, TimeUnit.SECONDS);
		try {
			TimeUnit.SECONDS.sleep(50);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		//关闭线程之前必须至少执行一次完整的任务
		scheduledThreadPoolExecutor.shutdown();
	}
	/**
	 * 
	 */
	public void testschedule2() {
		ScheduledThreadPoolExecutor scheduledThreadPoolExecutor=new ScheduledThreadPoolExecutor(3);
		//schedule 是先等待阻隔时间然后再执行任务线程，主线程如果执行完了不管子线程的进度如何
		//向定时任务线程池提交一个延时Callable任务（仅执行一次至少也是一次）
		scheduledThreadPoolExecutor.schedule(new Thread3(), 3l, TimeUnit.SECONDS);
		try {
			TimeUnit.SECONDS.sleep(5);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		//关闭线程之前必须至少执行一次完整的任务
		scheduledThreadPoolExecutor.shutdown();
	}
	/**
	 * 固定时间间隔的任务不论每次任务花费多少时间，
	 * 下次任务开始执行时间是确定的，当然执行任务的时间不能超过执行周期。
	 */
	public void testscheduleAtFixedRate(){
		ScheduledThreadPoolExecutor scheduledThreadPoolExecutor=new ScheduledThreadPoolExecutor(3);
		System.out.println("begintime:" + new Date().toString());
		scheduledThreadPoolExecutor.scheduleAtFixedRate(
			new Thread2(), 100, 4000, TimeUnit.MILLISECONDS);//100表示首次执行任务的延迟时间，400表示每次执行任务的间隔时间（不考虑任务的执行时间）
		try {
			System.out.println("begintime2:" + new Date().toString());
			TimeUnit.SECONDS.sleep(50);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("endtime:" + new Date().toString());
		scheduledThreadPoolExecutor.shutdown();
	}
	
	/**
	 * 固定延时间隔的任务是指每次执行完任务以后都延时一个固定的时间。由于操作系统调度以及每次任务执行的语句可能不同，
	 * 所以每次任务执行所花费的时间是不确定的，也就导致了每次任务的执行周期存在一定的波动。 即真实间隔时间是执行任务时间和设置值的总和
	 */
	public void testscheduleWithFixedDelay(){
		ScheduledThreadPoolExecutor scheduledThreadPoolExecutor=new ScheduledThreadPoolExecutor(1);
		scheduledThreadPoolExecutor.scheduleWithFixedDelay(new Runnable() {
			@Override
			public void run() {
				try {
					TimeUnit.SECONDS.sleep(2);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				System.out.print("time:");
				System.out.println(new Date().toString());
			}
		}, 100, 4000, TimeUnit.MILLISECONDS);//100表示首次执行任务的延迟时间，4000表示每次执行任务的间隔时间  
		try {
			TimeUnit.SECONDS.sleep(50);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		scheduledThreadPoolExecutor.shutdown();
	}
	
}
