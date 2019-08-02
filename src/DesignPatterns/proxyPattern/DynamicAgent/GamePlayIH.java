package DesignPatterns.proxyPattern.DynamicAgent;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
//动态代理类

//动态代理就是根据被代理的接口生成所有的方法，也就是说给定一个接口，动态代理会宣称"我已经实现该接口的所有方法了"。
public class GamePlayIH implements InvocationHandler {

	//被代理者
    Class cls = null;
    //被代理的实例
    Object obj = null;
    public GamePlayIH(Object obj){
        this.obj = obj;
    }
	@Override
	public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
		
		Object result = method.invoke(this.obj, args);
		return result;
		
	}

}
