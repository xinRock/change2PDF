package DesignPatterns.ObserverPattern;

public class Test {
	public static void main(String[] args) {
		//���۲��߾���ʵ��
		Observerable server = new WechatServer();
		
		Observer userZhang = new User("ZhangSan");
		Observer userLi = new User("LiSi");
		Observer userWang = new User("WangWu");
		//��Ӿ���۲���
		server.registerObserver(userZhang);
		server.registerObserver(userLi);
		server.registerObserver(userWang);
		server.setMessage("������λPHP������������õ����ԣ�");

		System.out.println("----------------------------------------------");
		//�Ƴ����ֹ۲���
		server.removeObserver(userZhang);
		server.setMessage("JAVA������������õ����ԣ�");

	}
}
