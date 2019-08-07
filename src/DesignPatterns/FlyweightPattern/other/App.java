package DesignPatterns.FlyweightPattern.other;

public class App {

	public static void main(String[] args) {
		FlyWeight flyWeight = FlyWeightFactory.getFlyWeight("one");
		FlyWeight flyWeight2 = FlyWeightFactory.getFlyWeight("one");
		
		//判断是否是同一个对象
		System.out.println(flyWeight==flyWeight2);
	}
}
