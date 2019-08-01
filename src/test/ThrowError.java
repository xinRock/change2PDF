package test;

import java.util.Random;

import com.exception.MyException;

public class ThrowError {
	
	public static void main(String[] args) throws MyException {
		int i=0;
		int sum= new Random().nextInt();
		
		try {
			System.out.println(sum/i);
		} catch (Exception e) {
			MyException myException = new MyException("´íÎói");
			
			throw myException;
		}
	}

}
