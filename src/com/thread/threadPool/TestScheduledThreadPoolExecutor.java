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
		//schedule ���ȵȴ����ʱ��Ȼ����ִ�������̣߳����߳����ִ�����˲������̵߳Ľ������
		//��ʱ�����̳߳��ύһ����ʱRunnable���񣨽�ִ��һ������Ҳ��һ�Σ�
		scheduledThreadPoolExecutor.schedule(new Thread2(), 3l, TimeUnit.SECONDS);
		try {
			TimeUnit.SECONDS.sleep(50);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		//�ر��߳�֮ǰ��������ִ��һ������������
		scheduledThreadPoolExecutor.shutdown();
	}
	/**
	 * 
	 */
	public void testschedule2() {
		ScheduledThreadPoolExecutor scheduledThreadPoolExecutor=new ScheduledThreadPoolExecutor(3);
		//schedule ���ȵȴ����ʱ��Ȼ����ִ�������̣߳����߳����ִ�����˲������̵߳Ľ������
		//��ʱ�����̳߳��ύһ����ʱCallable���񣨽�ִ��һ������Ҳ��һ�Σ�
		scheduledThreadPoolExecutor.schedule(new Thread3(), 3l, TimeUnit.SECONDS);
		try {
			TimeUnit.SECONDS.sleep(5);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		//�ر��߳�֮ǰ��������ִ��һ������������
		scheduledThreadPoolExecutor.shutdown();
	}
	/**
	 * �̶�ʱ������������ÿ�����񻨷Ѷ���ʱ�䣬
	 * �´�����ʼִ��ʱ����ȷ���ģ���Ȼִ�������ʱ�䲻�ܳ���ִ�����ڡ�
	 */
	public void testscheduleAtFixedRate(){
		ScheduledThreadPoolExecutor scheduledThreadPoolExecutor=new ScheduledThreadPoolExecutor(3);
		System.out.println("begintime:" + new Date().toString());
		scheduledThreadPoolExecutor.scheduleAtFixedRate(
			new Thread2(), 100, 4000, TimeUnit.MILLISECONDS);//100��ʾ�״�ִ��������ӳ�ʱ�䣬400��ʾÿ��ִ������ļ��ʱ�䣨�����������ִ��ʱ�䣩
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
	 * �̶���ʱ�����������ָÿ��ִ���������Ժ���ʱһ���̶���ʱ�䡣���ڲ���ϵͳ�����Լ�ÿ������ִ�е������ܲ�ͬ��
	 * ����ÿ������ִ�������ѵ�ʱ���ǲ�ȷ���ģ�Ҳ�͵�����ÿ�������ִ�����ڴ���һ���Ĳ����� ����ʵ���ʱ����ִ������ʱ�������ֵ���ܺ�
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
		}, 100, 4000, TimeUnit.MILLISECONDS);//100��ʾ�״�ִ��������ӳ�ʱ�䣬4000��ʾÿ��ִ������ļ��ʱ��  
		try {
			TimeUnit.SECONDS.sleep(50);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		scheduledThreadPoolExecutor.shutdown();
	}
	
}
