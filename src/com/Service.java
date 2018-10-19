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
		System.out.println("服务器启动了");
		// 建立服务端Socket
		ServerSocket ss = new ServerSocket(10005);
		// 接收客户端Socket
		Socket fileLoaderSocket = ss.accept();

		// 打印连接信息
		String ip = fileLoaderSocket.getInetAddress().getHostAddress();
		System.out.println(ip + "...conncected");

		// 接收文件，并保存
		InputStream in = fileLoaderSocket.getInputStream();
		// 实例化对象fileSave
		SimpleDateFormat dateFormat = new SimpleDateFormat("MMddhhmmss");
		String format = dateFormat.format(new Date());
		String srcFilePathdoc = "D:\\xuniji\\new\\" + format + ".doc";
		String srcFilePathpdf = "D:\\xuniji\\new\\" + format + ".pdf";
		OutputStream fileSave = new FileOutputStream(srcFilePathdoc);

		// 建立数组buf
		byte[] buf = new byte[1024];
		int len = 0;
		// 判断是否读到文件末尾
		while ((len = in.read(buf)) != -1) {
			fileSave.write(buf, 0, len);
			// 刷新
			fileSave.flush();
		}
		fileSave.close();
		// 返回文件复制情况信息
		Demo.doc2pdf(srcFilePathdoc, srcFilePathpdf);
		OutputStream outputStream = fileLoaderSocket.getOutputStream();

		InputStream fileRead = new FileInputStream(srcFilePathpdf);
		// 建立数组
		byte[] buf2 = new byte[1024];
		int len2 = 0;
		// 判断是否读到文件末尾
		while ((len2 = fileRead.read(buf2)) != -1) {
			outputStream.write(buf2, 0, len2);
		}
		// 告诉服务端，文件已传输完毕
		fileLoaderSocket.shutdownOutput();
		fileRead.close();
		// BufferedWriter out = new BufferedWriter(new
		// OutputStreamWriter(fileLoaderSocket.getOutputStream()));
		//
		// out.write("文件上传成功");

		// 刷新
		// out.flush();
		// 资源关闭
		fileLoaderSocket.close();
		ss.close();
		
	}

}
