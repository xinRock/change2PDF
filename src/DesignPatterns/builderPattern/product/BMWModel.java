package DesignPatterns.builderPattern.product;

public class BMWModel extends CarModel {

	@Override
	protected void start() {
		// TODO Auto-generated method stub
		System.out.println("宝马是这样启动的。。。");
	}

	@Override
	protected void stop() {
		// TODO Auto-generated method stub
		System.out.println("宝马是这样stop的。。。");

	}

	@Override
	protected void alarm() {
		// TODO Auto-generated method stub
		System.out.println("宝马是这样alarm的。。。");

	}

	@Override
	protected void engineBoom() {
		// TODO Auto-generated method stub
		System.out.println("宝马是这样engineBoom的。。。");

	}

}
