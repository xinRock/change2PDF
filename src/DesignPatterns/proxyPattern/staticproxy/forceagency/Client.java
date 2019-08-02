package DesignPatterns.proxyPattern.staticproxy.forceagency;


import DesignPatterns.proxyPattern.staticproxy.forceagency.impl.GamePlayer;

/**
 * 强制代理的客户端
 * 
 * 要求：强制代理不是要求代理替自己干活，而是通过代理来访问我。然后我自己干活~ 
（其实这个例子的意思是：你去看一个明星，那必须通过他的经纪人。你通过这个经纪人找到这个明星后肯定是和明星交流，而不是和经纪人交流）
 * 
 * @author menggq
 *
 */
public class Client {
	public static void main(String[] args) {
		//subject主题对象
		IGamePlayer player = new GamePlayer("张三");
		//获得代理，以便访问
		IGamePlayer proxy = player.getProxy();

		System.out.println(System.currentTimeMillis());
		//执行的是主题里的方法内容login
		proxy.login("张三", "password");
		//执行的是主题里的方法内容killBoss
		proxy.killBoss();
		//执行的是主题里的方法内容upgrade
		proxy.upgrade();
		System.out.println(System.currentTimeMillis());
	}
}
