package com.thread.threadPool.timer;

import java.util.Timer;
import java.util.TimerTask;
/**
 * �����1��ִ��һ�ε�����1�����п����ӳ�60����
 * JDK 5.0�Ժ��Ƽ�ʹ��ScheduledThreadPoolExecutor	
 * @author menggq
 * ʹ��Timer��TimerTask����һЩȱ�ݣ�
1.Timerֻ������һ���̡߳����������ִ�е�ʱ�䳬�����õ���ʱʱ�佫�����һЩ���⡣
2.Timer�������߳�û�д����쳣�����һ���׳����ܼ��쳣�����̻߳�������ֹ��
 *
 */
public class TestTimer {

	public static void main(String[] args) {
		Timer  timer = new Timer();
	    timer.schedule(new TimerTask() {
	        @Override
	        public void run() {
	           System.out.println("time:");
	        }
	    }, 5000, 1000);
	  //5000��ʾ��һ��ִ�������ӳ�ʱ���״�ִ�У�1000��ʾ�Ժ�ÿ���೤ʱ��ִ��һ��run���������
	}
}
