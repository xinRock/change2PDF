package DesignPatterns.proxyPattern.staticproxy;

import DesignPatterns.proxyPattern.staticproxy.impl.GamePlayer;
import DesignPatterns.proxyPattern.staticproxy.impl.GamePlayerProxy;

/**
 * 
 在代理模式中，有三个角色的定义：
	Subject抽象主题角色
	抽象主题可以是抽象类也可以是接口，是一个最普通的业务类型定义；
	RealSubject具体主题角色
	也叫作被委托角色。是具体业务逻辑的具体执行者；
	Proxy代理主题角色
	也叫委托类、代理类，它负责对真实角色的应用，把所有抽象主题类定义的方法委托给真实主题角色实现，并且在真实主题角色处理完毕后做预处理和善后工作；
	RealSubject 和 Proxy都继承自Subject
 * @author menggq
 *
 */
public class Client {

	public static void main(String[] args) {
        //Subject 主题
        IGamePlayer gamePlayer = new GamePlayer("Tom");
        
        //Proxy代理主题角色
        //委托类、代理类
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
