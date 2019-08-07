package threadCommunication;

import java.util.concurrent.TimeUnit;

/**
 *@functon �߳�ͨ��֮����� 
 *@author ���㣨�ǳƣ�����֮�ۣ�
 *@time 2017.12.5 
 */
public class Breads {
    
	 //�޲ι���
    public Breads() {
    	super();
    }
    //�вι���
    public Breads(int bid, int num) {
        super();
        this.bid = bid;
        this.num = num;
    }
	
    //�����id
    private int bid;
    //����ĸ���
    private int num;
    
    //��������ķ�����������demo����������⣬�Ͱ�synchronized�ؼ��ּӵ�����������Ŷ��
    public synchronized void produc(){
        
        //�������������Ϊ0ʱ���÷������ڵȴ�״̬
        if(0 != num){
            try {
                wait();//�ȴ�
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        //���������Ϊ0ʱ����ô�Ϳ�ʼ���������Ŷ
        num  =  num +1;//������1
        bid = bid + 1 ;//id��ȻҲ�ü�1
        String threadname = Thread.currentThread().getName();
        System.out.println(threadname+"������һ�����Ϊ"+bid+"�������");
        try {
			TimeUnit.SECONDS.sleep(1);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
        notify();//��ִ�����ȥ�����������ڵȴ����߳�
    }
    //��������ķ���
    public synchronized void consume(){
        //�����������Ϊ0ʱ���÷������ڵȴ�״̬
        if(num == 0 ){
            try {
                wait();//�ȴ�
            } catch (InterruptedException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
        }
        //����������ˣ��������������Ϊ0��
        num  =  num -1;//������1
        String name1 = Thread.currentThread().getName();
        System.out.println(name1+"����һ��������Ϊ"+bid);
        try {
			TimeUnit.SECONDS.sleep(1);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
        notify();//��ִ�����ȥ�����������ڵȴ����߳�
    }

    
    //set��get����
    public int getBid() {
        return bid;
    }

    public void setBid(int bid) {
        this.bid = bid;
    }

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

   

}