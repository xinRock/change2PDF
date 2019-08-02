package DesignPatterns.proxyPattern.staticproxy.common;

import java.util.Date;

import DesignPatterns.proxyPattern.staticproxy.common.impl.GamePlayerProxy;
/**
 * 一、普通代理
 * @author menggq
 *
 */
public class Client {
	public static void main(String[] args) {
        IGamePlayer proxy = new GamePlayerProxy("张三");
        System.out.println(new Date().toString());
        proxy.login("张三", "password");
        proxy.killBoss();
        proxy.upgrade();
        System.out.println(new Date().toString());
    }
}
