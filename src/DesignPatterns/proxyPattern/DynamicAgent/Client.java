package DesignPatterns.proxyPattern.DynamicAgent;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;

import DesignPatterns.proxyPattern.DynamicAgent.impl.GamePlayer;
/**
 * 场景类
 * @author menggq
 *
 */
public class Client {
	public static void main(String[] args) {
		//主题类
        IGamePlayer player = new GamePlayer("张三");
        
        InvocationHandler handler = new GamePlayIH(player);
        System.out.println(System.currentTimeMillis());
        //主题类的加载器
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
newProxyInstance，方法有三个参数：
loader: 用哪个类加载器去加载代理对象
interfaces:动态代理类需要实现的接口
h:动态代理方法在执行时，会调用h里面的invoke方法去执行*/