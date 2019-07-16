package com.thread.threadPool.timer;

import java.util.Timer;
import java.util.TimerTask;
/**
 * 如果是1秒执行一次的任务，1分钟有可能延迟60毫秒
 * JDK 5.0以后推荐使用ScheduledThreadPoolExecutor	
 * @author menggq
 * 使用Timer和TimerTask存在一些缺陷：
1.Timer只创建了一个线程。当你的任务执行的时间超过设置的延时时间将会产生一些问题。
2.Timer创建的线程没有处理异常，因此一旦抛出非受检异常，该线程会立即终止。
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
	  //5000表示第一次执行任务延迟时间首次执行，1000表示以后每隔多长时间执行一次run里面的任务
	}
}
