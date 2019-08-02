package DesignPatterns.proxyPattern.staticproxy.forceagency;
/**
 * subject主题
 * @author menggq
 *
 */
public interface IGamePlayer {
	public void login(String user, String password);
    public void killBoss();
    public void upgrade();
    //每个人通过getProxy来找到自己的代理
    public IGamePlayer getProxy();
}
