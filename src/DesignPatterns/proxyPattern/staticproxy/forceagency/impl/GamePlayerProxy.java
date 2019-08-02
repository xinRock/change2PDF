package DesignPatterns.proxyPattern.staticproxy.forceagency.impl;

import DesignPatterns.proxyPattern.staticproxy.forceagency.IGamePlayer;

public class GamePlayerProxy implements IGamePlayer {

	private IGamePlayer proxy = null;
	// �������
	private String name;

	//ͨ�����캯�����ݲ���ȷ����˭���д���
	public GamePlayerProxy(String name) {
		this.name = name;
	}
	public GamePlayerProxy(IGamePlayer iGamePlayer) {
		this.proxy = iGamePlayer;
	}

	@Override
	public IGamePlayer getProxy() {
		// ����Ĵ���û�У����Ծ����Լ�
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
