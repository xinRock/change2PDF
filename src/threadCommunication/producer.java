package threadCommunication;
/**
 *@functon �߳�ͨ��֮�����ࣨ�̳�Thread�ࣩ 
 *@author ���㣨�ǳƣ�����֮�ۣ�
 */
public class producer extends Thread{

	//����������
    private Breads bre ;

    //�޲ι���
    public producer() {
        super();
    }

    //�вι���
    public producer(Breads bre) {
        super();
        this.bre = bre;
    }


    //set��get����
    public Breads getBre() {
        return bre;
    }

    public void setBre(Breads bre) {
        this.bre = bre;
    }

    //�̳���дrun����
    @Override
    public void run() {
        pro();
    }
    
    //�������
    private void pro() {
        // ��ϵͳĬ��ѭ������20�����
        for (int i = 0; i <20; i++) {
            try {
                //��˯0.3�루��ʾЧ����Ҫ�����Բ��ӣ�
                Thread.currentThread().sleep(500);
            } catch (InterruptedException e) {         
                e.printStackTrace();
            }
            //��������������������ķ���
            System.out.println(i+"---producerstart");
            bre.produc();
            System.out.println(i+"---producerchulaile");
        }
    }
	
}
