package com.changefloat;

/**
 * 
 * 将100.2转成IEEE754 二进制表示
 * @author menggq
 *
 */
public class ChangeFloat {
	public static void main(String[] args) {
		String value = convert(100.2f);
		System.out.println(value);
	}

	public static String convert(float num) {
		int intVal = Float.floatToIntBits(num);
		return intVal > 0 ? "0" + Integer.toBinaryString(intVal) : Integer.toBinaryString(intVal);
	}

}
