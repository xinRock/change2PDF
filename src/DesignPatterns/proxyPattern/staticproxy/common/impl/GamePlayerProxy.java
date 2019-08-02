package DesignPatterns.proxyPattern.staticproxy.common.impl;

import DesignPatterns.proxyPattern.staticproxy.common.IGamePlayer;

public class GamePlayerProxy implements IGamePlayer {
	private IGamePlayer gamePlayer = null;
    //ͨ�����캯�����ݲ���ȷ����˭���д���(���� ���������־Ϳ��Դ����ˣ�
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
