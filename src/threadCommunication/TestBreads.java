package threadCommunication;
/**
 *@functon �߳�ͨ��֮������ 
 *@author ���㣨�ǳƣ�����֮�ۣ�
 */
public class TestBreads {
	 public static void main(String[] args) {
	        
	        //newһ�������Ҳ����Դ�� Object
	        Breads bre = new Breads();
	        
	        //newһ����������
	        producer proth = new producer(bre);
	        //newһ����������
	        consume conth = new consume(bre);
	        
	        //newһ����������������߳�
	        Thread t1 = new Thread(proth,"������");
	        
	        //newһ����������������߳�
	        Thread t2 = new Thread(conth,"������");
	        
	        //�����߳�
	        t1.start();
	        t2.start();
	        
	    }
}
