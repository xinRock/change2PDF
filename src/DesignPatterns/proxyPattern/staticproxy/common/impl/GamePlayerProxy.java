package DesignPatterns.proxyPattern.staticproxy.common.impl;

import DesignPatterns.proxyPattern.staticproxy.common.IGamePlayer;

public class GamePlayerProxy implements IGamePlayer {
	private IGamePlayer gamePlayer = null;
    //通过构造函数传递参数确定对谁进行代练(传递 代理者名字就可以代理了）
    public GamePlayerProxy(String name){
        try{
        	gamePlayer = new GamePlayer(this, name);
        }catch(Exception e){
        	System.err.println(e.getMessage());
            e.printStackTrace();
        }
    }
	
	
	@Override
	public void login(String user, String password) {
		// TODO Auto-generated method stub
		this.gamePlayer.login(user, password);
	}

	@Override
	public void killBoss() {
		// TODO Auto-generated method stub
		this.gamePlayer.killBoss();
	}

	@Override
	public void upgrade() {
		// TODO Auto-generated method stub
		this.gamePlayer.upgrade();
	}

}
