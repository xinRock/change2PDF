package DesignPatterns.ObserverPattern;

public class Test {
	public static void main(String[] args) {
		//被观察者具体实例
		Observerable server = new WechatServer();
		
		Observer userZhang = new User("ZhangSan");
		Observer userLi = new User("LiSi");
		Observer userWang = new User("WangWu");
		//添加具体观察者
		server.registerObserver(userZhang);
		server.registerObserver(userLi);
		server.registerObserver(userWang);
		server.setMessage("有人认位PHP是世界上最好用的语言！");

		System.out.println("----------------------------------------------");
		//移除部分观察者
		server.removeObserver(userZhang);
		server.setMessage("JAVA是世界上最好用的语言！");

	}
}
