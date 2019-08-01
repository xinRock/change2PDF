package DesignPatterns.proxyPattern.impl;

import DesignPatterns.proxyPattern.IGamePlayer;

public class GamePlayerProxy implements IGamePlayer {

	private IGamePlayer proxy = null;

	public GamePlayerProxy(IGamePlayer iGamePlayer) {
		this.proxy = iGamePlayer;
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
