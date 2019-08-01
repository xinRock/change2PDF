package DesignPatterns.modelFunction;

/**
 * ģ�巽��ģʽ
 * 
 * @author menggq
 *
 */
public abstract class HummerModel {

	/**
	 * ���ȣ����ģ��Ҫ�ܷ��������������ǵ�������������ҡ���� ���Ծ�������ô������Ҫ���ݲ�ͬ���ͺ��Լ�ʵ�ַ����ķ���
	 */
	public abstract void start();

	/**
	 * �����ܹ���������Ҫ�ܹ�ֹͣ
	 */
	public abstract void stop();

	/**
	 * �����Ȼ���
	 */
	public abstract void alarm();

	/**
	 * ��������ʱ��¡¡��
	 */
	public abstract void engineBoom();

	public void run() {
		// ����
		this.start();
		// ������¡¡��
		this.engineBoom();
		// ����������
		this.alarm();
		// ֹͣ
		this.stop();
	}
}
