package DesignPatterns.modelFunction;
/**
 *  ģ�巽��ģʽ
 * @author menggq
 *
 */
public class HummerH1Model  extends HummerModel{

	@Override
	public void start() {
		// TODO Auto-generated method stub
		System.out.println("H1�ͺ�������������.....");
	}

	@Override
	public void stop() {
		// TODO Auto-generated method stub
		System.out.println("H1�ͺ�������Ϩ���.....");
	}

	@Override
	public void alarm() {
		// TODO Auto-generated method stub
		System.out.println("H1�ͺ����������ѵ�.....");
	}

	@Override
	public void engineBoom() {
		System.out.println("H1�ͺ�������¡¡���.....");
	}

}
