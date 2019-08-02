package DesignPatterns.proxyPattern.virtualAgent;
/**
 * 
 * @author menggq
 *������� 
 *�����ʵ��������Ҫ��ʱ���ʼ�����󣬱��ⱻ�������϶������ĳ�ʼ���������޸���һ�´������ʼ���Ĵ���
 *
 */
public class Proxy implements Subject{
	//Ҫ�����ʵ����
	private Subject subject;
    //ʵ�ֽӿ��ж���ķ���
	@Override
	public void requst() {
		// TODO Auto-generated method stub
		if(subject == null){
            subject = new RealSubject();
        }else{
        	//���ⷽ��
            subject.requst();
        }
	}
}
