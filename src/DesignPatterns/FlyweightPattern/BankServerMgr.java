package DesignPatterns.FlyweightPattern;

import java.util.HashMap;
import java.util.Map;

import DesignPatterns.FlyweightPattern.impl.BCMServer;
import DesignPatterns.FlyweightPattern.impl.CCBServer;
import DesignPatterns.FlyweightPattern.impl.ICBCServer;

/**
 * 享元工厂 
 * 
 * @author menggq
 *
 */
public class BankServerMgr {
	private BankServerMgr() {
	}

	private static final BankServerMgr instance = new BankServerMgr();

	public static BankServerMgr getInstance() {
		return instance;
	}

	private Map<String, IBankServer> bankServerCache = new HashMap<>();

	/**
	 * 根据ID获取对应的银行服务器实例
	 * 
	 * @param bankID
	 * @return
	 */
	public synchronized IBankServer getBankServer(String bankID) {
		IBankServer bankServer = bankServerCache.get(bankID);
		if (bankServer == null) {
			bankServer = createBankServerByID(bankID);
			bankServerCache.put(bankID, bankServer);
		}
		return bankServer;
	}

	/**
	 * 根据银行ID创建服务器实例
	 * 
	 * @param bankID
	 * @return
	 */
	private IBankServer createBankServerByID(String bankID) {
		if ("ICBC".equals(bankID)) {
			return new ICBCServer();
		}
		if ("BCM".equals(bankID)) {
			return new BCMServer();
		}
		if ("CCB".equals(bankID)) {
			return new CCBServer();
		}
		return null;
	}
}