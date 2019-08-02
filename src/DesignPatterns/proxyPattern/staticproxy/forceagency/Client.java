package DesignPatterns.proxyPattern.staticproxy.forceagency;


import DesignPatterns.proxyPattern.staticproxy.forceagency.impl.GamePlayer;

/**
 * ǿ�ƴ���Ŀͻ���
 * 
 * Ҫ��ǿ�ƴ�����Ҫ��������Լ��ɻ����ͨ�������������ҡ�Ȼ�����Լ��ɻ�~ 
����ʵ������ӵ���˼�ǣ���ȥ��һ�����ǣ��Ǳ���ͨ�����ľ����ˡ���ͨ������������ҵ�������Ǻ�϶��Ǻ����ǽ����������Ǻ;����˽�����
 * 
 * @author menggq
 *
 */
public class Client {
	public static void main(String[] args) {
		//subject�������
		IGamePlayer player = new GamePlayer("����");
		//��ô����Ա����
		IGamePlayer proxy = player.getProxy();

		System.out.println(System.currentTimeMillis());
		//ִ�е���������ķ�������login
		proxy.login("����", "password");
		//ִ�е���������ķ�������killBoss
		proxy.killBoss();
		//ִ�е���������ķ�������upgrade
		proxy.upgrade();
		System.out.println(System.currentTimeMillis());
	}
}
