package DesignPatterns.modelFunction;
/**
 *  模板方法模式
 * @author menggq
 *
 */
public class HummerH1Model  extends HummerModel{

	@Override
	public void start() {
		// TODO Auto-generated method stub
		System.out.println("H1型号是这样启动的.....");
	}

	@Override
	public void stop() {
		// TODO Auto-generated method stub
		System.out.println("H1型号是这样熄火的.....");
	}

	@Override
	public void alarm() {
		// TODO Auto-generated method stub
		System.out.println("H1型号是这样鸣笛的.....");
	}

	@Override
	public void engineBoom() {
		System.out.println("H1型号是这样隆隆响的.....");
	}

}
