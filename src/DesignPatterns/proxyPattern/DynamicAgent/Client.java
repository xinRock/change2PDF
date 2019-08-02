package DesignPatterns.proxyPattern.DynamicAgent;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;

import DesignPatterns.proxyPattern.DynamicAgent.impl.GamePlayer;
/**
 * ������
 * @author menggq
 *
 */
public class Client {
	public static void main(String[] args) {
		//������
        IGamePlayer player = new GamePlayer("����");
        
        InvocationHandler handler = new GamePlayIH(player);
        System.out.println(System.currentTimeMillis());
        //������ļ�����
        ClassLoader cl = player.getClass().getClassLoader();
        
        IGamePlayer proxy = (IGamePlayer)Proxy.newProxyInstance(cl, new Class[] {IGamePlayer.class}, handler);
        
        proxy.login("zhangsan", "password");
        proxy.killBoss();
        proxy.upgrade();
        System.out.println(System.currentTimeMillis());
    }
}
/*public static Object newProxyInstance(ClassLoader loader,
Class<?>[] interfaces,
InvocationHandler h)
throws IllegalArgumentException
newProxyInstance������������������
loader: ���ĸ��������ȥ���ش������
interfaces:��̬��������Ҫʵ�ֵĽӿ�
h:��̬��������ִ��ʱ�������h�����invoke����ȥִ��*/