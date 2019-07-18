package com.cmd;

import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

public class TestsimpleCmd {

	public static void main(String[] args) {
		Runtime runtime = Runtime.getRuntime();
		Map<String, String> lineMap = new HashMap<String, String>();// 存放返回值
		try {
			Process exec = runtime.exec("cmd /c java");
			BufferedInputStream bis = new BufferedInputStream(exec.getInputStream());
			InputStreamReader isr = new InputStreamReader(bis);// 将字节流转化成字符流
			int read = isr.read();
			System.out.println(read);
			int i;
			
			while ((i = isr.read()) != -1) {
				System.out.println((char) i);
			}

			isr.close();
			bis.close();

		} catch (IOException e) {
			e.printStackTrace();
		}
		System.out.println(lineMap.toString());
	}
}
