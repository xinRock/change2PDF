package com.cmd;

import java.io.IOException;
import java.io.InputStream;
import java.util.HashMap;
import java.util.Map;

public class TestsimpleCmd {

	public static void main(String[] args) {
		Runtime runtime = Runtime.getRuntime();
		Map<String, String> lineMap = new HashMap<String, String>();// 存放返回值
		try {
			//cmd /c 是相当于以超级管理员身份运行的cmd命令
			Process exec = runtime.exec("c:/nircmd.exe elevate time 14:17:00");
			//Process exec = runtime.exec("cmd /c start D:\\Users\\zookeeper-3.4.6\\zookeeper-3.4.6\\bin\\zkServer.cmd");
			//Process exec = runtime.exec("cmd /c start D:\\Users\\zookeeper-3.4.6\\zookeeper-3.4.6\\bin\\zkCli.cmd");
			InputStream inputStream = exec.getInputStream();
			int i;
			System.out.println(inputStream.read());
			
			while ((i = inputStream.read()) != -1) {
				System.out.println((char) i);
			}
			inputStream.close();

		} catch (IOException e) {
			e.printStackTrace();
		}
		System.out.println(lineMap.toString());
	}
}
