package DesignPatterns.facadePattern;
/**
 * 客户端类
 * @author menggq
 * Clients
 * 调用者。通过Facade接口调用提供某功能的内部类群。
 *
 */
public class Test {
	public static void main(String[] args) {
		Facade facade = new Facade();
		facade.doAB();
		facade.doABC();
	}
}
