package DesignPatterns.proxyPattern.staticproxy.common;

import java.util.Date;

import DesignPatterns.proxyPattern.staticproxy.common.impl.GamePlayerProxy;
/**
 * һ����ͨ����
 * @author menggq
 *
 */
public class Client {
	public static void main(String[] args) {
        IGamePlayer proxy = new GamePlayerProxy("����");
        System.out.println(new Date().toString());
        proxy.login("����", "password");
        proxy.killBoss();
        proxy.upgrade();
        System.out.println(new Date().toString());
    }
}
