package DesignPatterns.proxyPattern;
/*
 * Subject���������ɫ
 * 	������������ǳ�����Ҳ�����ǽӿڣ���һ������ͨ��ҵ�����Ͷ��壻
 * 
 */
public interface IGamePlayer {

	//��ҵ�½
    public void login(String name, String password);
    
    //��boss
    public void killBoss();
    
    //����
    public void upgrade();
}
