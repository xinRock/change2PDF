package DesignPatterns.proxyPattern.staticproxy;

import DesignPatterns.proxyPattern.staticproxy.impl.GamePlayer;
import DesignPatterns.proxyPattern.staticproxy.impl.GamePlayerProxy;

/**
 * 
 �ڴ���ģʽ�У���������ɫ�Ķ��壺
	Subject���������ɫ
	������������ǳ�����Ҳ�����ǽӿڣ���һ������ͨ��ҵ�����Ͷ��壻
	RealSubject���������ɫ
	Ҳ������ί�н�ɫ���Ǿ���ҵ���߼��ľ���ִ���ߣ�
	Proxy���������ɫ
	Ҳ��ί���ࡢ�����࣬���������ʵ��ɫ��Ӧ�ã������г��������ඨ��ķ���ί�и���ʵ�����ɫʵ�֣���������ʵ�����ɫ������Ϻ���Ԥ������ƺ�����
	RealSubject �� Proxy���̳���Subject
 * @author menggq
 *
 */
public class Client {

	public static void main(String[] args) {
        //Subject ����
        IGamePlayer gamePlayer = new GamePlayer("Tom");
        
        //Proxy���������ɫ
        //ί���ࡢ������
        IGamePlayer proxy = new GamePlayerProxy(gamePlayer);
        
        proxy.login("Tom", "123");
        proxy.killBoss();
        proxy.upgrade(); 
        
        //Another player
        IGamePlayer gamePlayer2 = new GamePlayer("Jack");
        IGamePlayer proxy2 = new GamePlayerProxy(gamePlayer2);
        proxy2.login("Jack", "456");
        proxy2.killBoss();
        proxy2.upgrade(); 
        
    }
}
