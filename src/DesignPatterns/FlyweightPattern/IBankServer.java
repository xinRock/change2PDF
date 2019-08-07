package DesignPatterns.FlyweightPattern;
/**
 * ������Ԫ�ࣺ
 * @author menggq
 *
 */
public interface IBankServer
{
    /**
     * ��ѯ�˻���Ϣ
     * 
     * @return
     */
    int checkAccount();
    
    /**
     * ת��
     * 
     * @return
     */
    boolean transferAccount(int money, int accountID);
    
    /**
     * ��Ǯ
     * 
     * @return
     */
    int saveMoney(int money);
    
    /**
     * ȡǮ
     * 
     * @return
     */
    int drawMoney(int money);
}