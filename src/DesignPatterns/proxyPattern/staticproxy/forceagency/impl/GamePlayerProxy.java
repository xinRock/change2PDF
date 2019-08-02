package DesignPatterns.proxyPattern.staticproxy.forceagency.impl;

import DesignPatterns.proxyPattern.staticproxy.forceagency.IGamePlayer;

public class GamePlayerProxy implements IGamePlayer {

	private IGamePlayer proxy = null;
	// 玩家名字
	private String name;

	//通过构造函数传递参数确定对谁进行代练
	public GamePlayerProxy(String name) {
		this.name = name;
	}
	public GamePlayerProxy(IGamePlayer iGamePlayer) {
		this.proxy = iGamePlayer;
	}

	@Override
	public IGamePlayer getProxy() {
		// 代理的代理没有，所以就是自己
		return this;
	}

	@Override
	public void login(String name, String password) {
		// TODO Auto-generated method stub
		this.proxy.login(name, password);
	}

	@Override
	public void killBoss() {
		// TODO Auto-generated method stub
		this.proxy.killBoss();
	}

	@Override
	public void upgrade() {
		// TODO Auto-generated method stub
		this.proxy.upgrade();
	}

}
