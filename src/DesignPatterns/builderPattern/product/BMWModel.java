package DesignPatterns.builderPattern.product;

public class BMWModel extends CarModel {

	@Override
	protected void start() {
		// TODO Auto-generated method stub
		System.out.println("���������������ġ�����");
	}

	@Override
	protected void stop() {
		// TODO Auto-generated method stub
		System.out.println("����������stop�ġ�����");

	}

	@Override
	protected void alarm() {
		// TODO Auto-generated method stub
		System.out.println("����������alarm�ġ�����");

	}

	@Override
	protected void engineBoom() {
		// TODO Auto-generated method stub
		System.out.println("����������engineBoom�ġ�����");

	}

}
