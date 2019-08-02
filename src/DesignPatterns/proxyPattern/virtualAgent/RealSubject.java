package DesignPatterns.proxyPattern.virtualAgent;

public class RealSubject implements Subject {

	@Override
	public void requst() {
		System.out.println("我就是要执行的主题。");
	}

}
