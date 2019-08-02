package DesignPatterns.proxyPattern.staticproxy.forceagency;
/**
 * subject����
 * @author menggq
 *
 */
public interface IGamePlayer {
	public void login(String user, String password);
    public void killBoss();
    public void upgrade();
    //ÿ����ͨ��getProxy���ҵ��Լ��Ĵ���
    public IGamePlayer getProxy();
}
