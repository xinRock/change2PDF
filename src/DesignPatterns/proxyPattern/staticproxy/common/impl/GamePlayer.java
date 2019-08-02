package DesignPatterns.proxyPattern.staticproxy.common.impl;

import DesignPatterns.proxyPattern.staticproxy.common.IGamePlayer;

public class GamePlayer implements IGamePlayer{

	private String name = "";
    public GamePlayer(IGamePlayer _gamePlayer, String _name) throws Exception{
        if(_gamePlayer == null){
            throw new Exception("不能创建真实角色");
        }else{
            this.name = _name;
        }
    }
	@Override
	public void login(String user, String password) {
		// TODO Auto-generated method stub
		System.out.println("登录名为" + user + "的用户" + this.name + "登陆成功");
	}

	@Override
	public void killBoss() {
		// TODO Auto-generated method stub
		System.out.println(this.name + " 在打怪");
	}

	@Override
	public void upgrade() {
		// TODO Auto-generated method stub
		System.out.println(this.name + " 又生了一级");
	}

}
