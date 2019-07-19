package com.cmd;

import java.io.IOException;
import java.io.InputStream;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class TestBuildCmd {

	public static void main(String[] args) throws Exception {
		
		ProcessBuilder processBuilder = new ProcessBuilder("cmd","/c","ping 14.215.177.39");
		Process start = processBuilder.start();
		java.util.Scanner scanner = new Scanner(start.getInputStream());
		
		while (scanner.hasNextLine()) {
			System.out.println(scanner.nextLine().toString());
		}
		scanner.close();
	}


}
