package DesignPatterns.ObserverPattern;
/***
 * Subject
 * ����Ҫ���۲��״̬�����仯ʱ����Ҫ֪ͨ���������й۲��߶���Subject��Ҫά�֣���ӣ�ɾ����֪ͨ��һ���۲��߶���Ķ����б�
 * ���󱻹۲��߽ӿ�
 * ��������ӡ�ɾ����֪ͨ�۲��߷���
 * @author jstao
 *
 */
public interface Observerable {
	public void registerObserver(Observer o);
    public void removeObserver(Observer o);
    public void notifyObserver();
    void setMessage(String s);
}
