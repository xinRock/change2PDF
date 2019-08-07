package DesignPatterns.FlyweightPattern;
/**
 * 抽象享元类：
 * @author menggq
 *
 */
public interface IBankServer
{
    /**
     * 查询账户信息
     * 
     * @return
     */
    int checkAccount();
    
    /**
     * 转账
     * 
     * @return
     */
    boolean transferAccount(int money, int accountID);
    
    /**
     * 存钱
     * 
     * @return
     */
    int saveMoney(int money);
    
    /**
     * 取钱
     * 
     * @return
     */
    int drawMoney(int money);
}