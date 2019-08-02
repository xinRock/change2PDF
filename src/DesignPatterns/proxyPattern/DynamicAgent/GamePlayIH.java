package DesignPatterns.proxyPattern.DynamicAgent;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
//��̬������

//��̬������Ǹ��ݱ�����Ľӿ��������еķ�����Ҳ����˵����һ���ӿڣ���̬���������"���Ѿ�ʵ�ָýӿڵ����з�����"��
public class GamePlayIH implements InvocationHandler {

	//��������
    Class cls = null;
    //�������ʵ��
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
