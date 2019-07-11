package com.thread.simple3;

import java.util.concurrent.FutureTask;

public class Test {
	public static void main(String[] args) {
		Thread3 thread = new Thread3();
		FutureTask<Integer> result = new FutureTask<>(thread);
		Thread dd=new Thread(result);
		dd.start();
		System.out.println("处理完了");
	}
}
