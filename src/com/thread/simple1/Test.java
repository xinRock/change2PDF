package com.thread.simple1;

public class Test {
	public static void main(String[] args) {
		Thread1 thread = new Thread1();
		Thread dd=new Thread(thread);
		//����������ʽ
		thread.start();//�Լ�����
		//dd.start();//��������
		
		System.out.println("��������");
	}
}
