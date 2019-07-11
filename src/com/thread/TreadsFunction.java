package com.thread;

import java.text.SimpleDateFormat;
import java.util.Date;

public class TreadsFunction {

	public static void main(String[] args) {
		// startThred();
		startThred2();

	}

	//interrupt����
	public static void startThred2() {
		/*
		 * �����ߣ�����˯���������̡߳� ��һ�������еľֲ��ڲ�������Ҫ���ø÷����������ֲ���������ô�������������final��
		 */
		final Thread lin = new Thread() {
			public void run() {
				System.out.println("��:�������ݣ�˯����!");
				try {
					// ��һ���̴߳���˯������ʱ�����������̵߳���interrupt()�����жϣ���sleep()�������׳�
					// InterruptedException�쳣
					Thread.sleep(100000000);
				} catch (InterruptedException e) {
					System.out.println("��:�����أ�����������!");
				}
			}
		};
		/*
		 * ������:�ж�˯���������߳�
		 */
		Thread huang = new Thread() {
			public void run() {
				System.out.println("��:��ʼ��ǽ��");
				for (int i = 0; i < 5; i++) {
					System.out.println("��:80!");
					try {
						Thread.sleep(1000);
					} catch (InterruptedException e) {
					}
				}
				System.out.println("�۵�!");
				System.out.println("��:�㶨��");

				// �ж�lin��˯������
				lin.interrupt();
			}
		};
		lin.setPriority(10);
		huang.setPriority(1);
		lin.start();
		huang.start();
	}
	
	// ����һ������ͨ���߳�ÿ��һ�������ʱ��
	public static void startThred() {
		new Thread(new Runnable() {
			@Override
			public void run() {
				SimpleDateFormat format = new SimpleDateFormat("hh:mm:ss");
				// ���ϵͳʱ���ʱ���롣ÿ��һ����ʾһ�Ρ����ܻ����������������Ϊ����1��������runnable״̬���ȴ�����ʱ��Ƭ����running״̬����Ҫһ��ʱ��
				while (true) {
					try {
						Thread.sleep(1000);

					} catch (InterruptedException e) {
						e.printStackTrace();

					}
					System.out.println(format.format(new Date()));
				}
			}
		}).start();
	}
}
