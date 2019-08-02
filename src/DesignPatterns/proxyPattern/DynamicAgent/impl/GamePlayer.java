package DesignPatterns.proxyPattern.DynamicAgent.impl;

import DesignPatterns.proxyPattern.DynamicAgent.IGamePlayer;

public class GamePlayer implements IGamePlayer{
	
	private String name = "";
    public GamePlayer(String _name){
        this.name = _name;
    }

	@Override
	public void login(String user, String password) {
		// TODO Auto-generated method stub
		System.out.println("��¼��Ϊ" + user + "���û���" + this.name + "��½�ɹ�");
	}

	@Override
	public void killBoss() {
		// TODO Auto-generated method stub
		System.out.println(this.name + " �ڴ��");
	}

	@Override
	public void upgrade() {
		// TODO Auto-generated method stub
		System.out.println(this.name + "������һ��");
	}

}
