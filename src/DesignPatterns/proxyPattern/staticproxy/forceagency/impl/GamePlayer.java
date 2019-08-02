package DesignPatterns.proxyPattern.staticproxy.forceagency.impl;

import DesignPatterns.proxyPattern.staticproxy.forceagency.IGamePlayer;

public class GamePlayer implements IGamePlayer {

	// 玩家姓名
	private String name = "";

	// 我的代理是谁
	private IGamePlayer proxy = null;

	// 找到自己的代理
	@Override
	public IGamePlayer getProxy() {
		// TODO Auto-generated method stub
		this.proxy = new GamePlayerProxy(this);
		return this.proxy;
	}

	public GamePlayer(String name) {
		this.name = name;
	}

	@Override
    public void login(String user, String password) {
        if(this.isProxy()){
            System.out.println("登录名为" + user + "的用户" + this.name + "登陆成功");
        }else{
            System.out.println("请使用指定代理访问");
        }
    }

    @Override
    public void killBoss() {
        if(this.isProxy()){
            System.out.println(this.name + " 在打怪");
        }else{
            System.out.println("请使用指定代理访问");
        }
    }

    @Override
    public void upgrade() {
        if(this.isProxy()){
            System.out.println(this.name + " 又生了一级");
        }else{
            System.out.println("请使用指定代理访问");
        }

    }
    //判断代理存不存在，这就是强制代理的点睛之笔
    private boolean isProxy(){
        if(this.proxy == null) return false;
        else return true;
    }

}
