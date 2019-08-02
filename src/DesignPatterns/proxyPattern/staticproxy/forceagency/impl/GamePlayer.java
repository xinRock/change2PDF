package DesignPatterns.proxyPattern.staticproxy.forceagency.impl;

import DesignPatterns.proxyPattern.staticproxy.forceagency.IGamePlayer;

public class GamePlayer implements IGamePlayer {

	// �������
	private String name = "";

	// �ҵĴ�����˭
	private IGamePlayer proxy = null;

	// �ҵ��Լ��Ĵ���
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
            System.out.println("��¼��Ϊ" + user + "���û�" + this.name + "��½�ɹ�");
        }else{
            System.out.println("��ʹ��ָ���������");
        }
    }

    @Override
    public void killBoss() {
        if(this.isProxy()){
            System.out.println(this.name + " �ڴ��");
        }else{
            System.out.println("��ʹ��ָ���������");
        }
    }

    @Override
    public void upgrade() {
        if(this.isProxy()){
            System.out.println(this.name + " ������һ��");
        }else{
            System.out.println("��ʹ��ָ���������");
        }

    }
    //�жϴ���治���ڣ������ǿ�ƴ���ĵ㾦֮��
    private boolean isProxy(){
        if(this.proxy == null) return false;
        else return true;
    }

}
