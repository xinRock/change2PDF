package com.thread.simple1;

public class Test {
	public static void main(String[] args) {
		Thread1 thread = new Thread1();
		Thread dd=new Thread(thread);
		//两种启动方式
		thread.start();//自己启动
		//dd.start();//被载启动
		
		System.out.println("处理完了");
	}
}
