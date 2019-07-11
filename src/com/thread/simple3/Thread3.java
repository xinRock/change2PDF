package com.thread.simple3;

import java.util.Date;
import java.util.concurrent.Callable;
import java.util.concurrent.TimeUnit;

/**
 * 
 * @author menggq
 *
 */
public class Thread3 implements  Callable<Integer>{
	
	@Override
	public Integer call() throws Exception {
		int sum = 0;

		System.out.println(new Date().toString());
		TimeUnit.SECONDS.sleep(5);// 时间单元粒子对象 主要两个功能一是 时间换算 二是 等待时间sleep

		for (int i = 0; i <= 1000000; i++) {
			sum += i;
		}
		System.out.println(new Date().toString());
		return sum;
	}

}
