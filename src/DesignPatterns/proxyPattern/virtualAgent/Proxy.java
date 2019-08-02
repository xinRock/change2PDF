package DesignPatterns.proxyPattern.virtualAgent;
/**
 * 
 * @author menggq
 *虚拟代理 
 *这个其实就是在需要的时候初始化对象，避免被代理对象较多而引起的初始化缓慢而修改了一下代理类初始化的代码
 *
 */
public class Proxy implements Subject{
	//要代理的实现类
	private Subject subject;
    //实现接口中定义的方法
	@Override
	public void requst() {
		// TODO Auto-generated method stub
		if(subject == null){
            subject = new RealSubject();
        }else{
        	//主题方法
            subject.requst();
        }
	}
}
