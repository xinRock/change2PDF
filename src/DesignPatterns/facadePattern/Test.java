package DesignPatterns.facadePattern;
/**
 * �ͻ�����
 * @author menggq
 * Clients
 * �����ߡ�ͨ��Facade�ӿڵ����ṩĳ���ܵ��ڲ���Ⱥ��
 *
 */
public class Test {
	public static void main(String[] args) {
		Facade facade = new Facade();
		facade.doAB();
		facade.doABC();
	}
}
