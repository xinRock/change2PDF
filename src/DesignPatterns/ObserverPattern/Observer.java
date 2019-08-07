package DesignPatterns.ObserverPattern;
/***
 * Observer
 * ��Subject��״̬�����仯ʱ��Observer����ͨ��һ��callback�����õ�֪ͨ��
 * ����۲���
 * ������һ��update()�����������۲��ߵ���notifyObservers()����ʱ���۲��ߵ�update()�����ᱻ�ص���
 * @author jstao
 *
 */
public interface Observer {
	public void update(String message);
}
