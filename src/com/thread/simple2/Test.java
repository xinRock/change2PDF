package com.thread.simple2;

public class Test {
	public static void main(String[] args) {
		Thread2 thread = new Thread2();
		Thread dd=new Thread(thread);
		
		dd.start();
		System.out.println("处理完了");
	}
}
