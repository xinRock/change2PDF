package DesignPatterns.proxyPattern.staticproxy.impl;

import DesignPatterns.proxyPattern.staticproxy.IGamePlayer;

public class GamePlayer implements IGamePlayer {
	
	//Íæ¼ÒÐÕÃû
	private String name = "";
	public GamePlayer(String name) {
        this.name = name;
    }
	@Override
	public void login(String name, String password) {
		// TODO Auto-generated method stub
		System.out.println("Congradulation! " + this.name + " logined in.");
	}

	@Override
	public void killBoss() {
		// TODO Auto-generated method stub
		System.out.println(this.name + " is killing his boss..");
	}

	@Override
	public void upgrade() {
		// TODO Auto-generated method stub
		System.out.println(this.name + " uograded 1.");
	}

}
