package DesignPatterns.builderPattern.product;

public class BenzModel extends CarModel {

	@Override
	protected void start() {
		// TODO Auto-generated method stub
		System.out.println("����������run....");
	}

	@Override
	protected void stop() {
		// TODO Auto-generated method stub
		System.out.println("����������stop....");
	}

	@Override
	protected void alarm() {
		// TODO Auto-generated method stub
		System.out.println("����������alarm....");
	}

	@Override
	protected void engineBoom() {
		// TODO Auto-generated method stub
		System.out.println("����������engineBoom....");
	}

}
