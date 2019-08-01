package DesignPatterns.modelFunction;

public class HummerH2Model extends HummerModel {

	@Override
	public void start() {
		// TODO Auto-generated method stub
		System.out.println("H2型号是这样启动的。。。。");
	}

	@Override
	public void stop() {
		// TODO Auto-generated method stub
		System.out.println("H2型号是这样熄火的。。。。");
	}

	@Override
	public void alarm() {
		// TODO Auto-generated method stub
		System.out.println("H2型号是这样鸣笛的。。。。");
	}

	@Override
	public void engineBoom() {
		// TODO Auto-generated method stub
		System.out.println("H2型号是这样保持启动状态的。。。。");
	}

}
