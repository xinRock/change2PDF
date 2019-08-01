package DesignPatterns.proxyPattern;
/*
 * Subject抽象主题角色
 * 	抽象主题可以是抽象类也可以是接口，是一个最普通的业务类型定义；
 * 
 */
public interface IGamePlayer {

	//玩家登陆
    public void login(String name, String password);
    
    //打boss
    public void killBoss();
    
    //升级
    public void upgrade();
}
