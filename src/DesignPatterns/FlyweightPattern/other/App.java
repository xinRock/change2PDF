package DesignPatterns.FlyweightPattern.other;

public class App {

	public static void main(String[] args) {
		FlyWeight flyWeight = FlyWeightFactory.getFlyWeight("one");
		FlyWeight flyWeight2 = FlyWeightFactory.getFlyWeight("one");
		
		//�ж��Ƿ���ͬһ������
		System.out.println(flyWeight==flyWeight2);
	}
}
