package DesignPatterns.FlyweightPattern.impl;

import DesignPatterns.FlyweightPattern.IBankServer;

public class ICBCServer implements IBankServer {

	@Override
	public int checkAccount() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public boolean transferAccount(int money, int accountID) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public int saveMoney(int money) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int drawMoney(int money) {
		// TODO Auto-generated method stub
		return 0;
	}

}
