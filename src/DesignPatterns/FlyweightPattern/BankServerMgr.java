package DesignPatterns.FlyweightPattern;

import java.util.HashMap;
import java.util.Map;

import DesignPatterns.FlyweightPattern.impl.BCMServer;
import DesignPatterns.FlyweightPattern.impl.CCBServer;
import DesignPatterns.FlyweightPattern.impl.ICBCServer;

/**
 * ��Ԫ���� 
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
	 * ����ID��ȡ��Ӧ�����з�����ʵ��
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
	 * ��������ID����������ʵ��
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