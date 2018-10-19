package com;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.text.SimpleDateFormat;
import java.util.Date;

import test.Demo;

public class Service {

	public static void main(String[] args) throws Exception {
		System.out.println("������������");
		// ���������Socket
		ServerSocket ss = new ServerSocket(10005);
		// ���տͻ���Socket
		Socket fileLoaderSocket = ss.accept();

		// ��ӡ������Ϣ
		String ip = fileLoaderSocket.getInetAddress().getHostAddress();
		System.out.println(ip + "...conncected");

		// �����ļ���������
		InputStream in = fileLoaderSocket.getInputStream();
		// ʵ��������fileSave
		SimpleDateFormat dateFormat = new SimpleDateFormat("MMddhhmmss");
		String format = dateFormat.format(new Date());
		String srcFilePathdoc = "D:\\xuniji\\new\\" + format + ".doc";
		String srcFilePathpdf = "D:\\xuniji\\new\\" + format + ".pdf";
		OutputStream fileSave = new FileOutputStream(srcFilePathdoc);

		// ��������buf
		byte[] buf = new byte[1024];
		int len = 0;
		// �ж��Ƿ�����ļ�ĩβ
		while ((len = in.read(buf)) != -1) {
			fileSave.write(buf, 0, len);
			// ˢ��
			fileSave.flush();
		}
		fileSave.close();
		// �����ļ����������Ϣ
		Demo.doc2pdf(srcFilePathdoc, srcFilePathpdf);
		OutputStream outputStream = fileLoaderSocket.getOutputStream();

		InputStream fileRead = new FileInputStream(srcFilePathpdf);
		// ��������
		byte[] buf2 = new byte[1024];
		int len2 = 0;
		// �ж��Ƿ�����ļ�ĩβ
		while ((len2 = fileRead.read(buf2)) != -1) {
			outputStream.write(buf2, 0, len2);
		}
		// ���߷���ˣ��ļ��Ѵ������
		fileLoaderSocket.shutdownOutput();
		fileRead.close();
		// BufferedWriter out = new BufferedWriter(new
		// OutputStreamWriter(fileLoaderSocket.getOutputStream()));
		//
		// out.write("�ļ��ϴ��ɹ�");

		// ˢ��
		// out.flush();
		// ��Դ�ر�
		fileLoaderSocket.close();
		ss.close();
		
	}

}
