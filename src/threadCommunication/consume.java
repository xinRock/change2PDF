package threadCommunication;
/**
 *@functon �߳�ͨ��֮�����ࣨ�̳�Thread�ࣩ 
 *@author ���㣨�ǳƣ�����֮�ۣ�
 */
public class consume extends Thread{
	//����������
    private Breads bre ;
    
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
        con();
    }
    
    //�������
    private void con() {
        // �������߱���һ�£���ϵͳĬ��ѭ������20��������������������Ѽ�����
        for(int i = 0;i<20;i++){
            try {
                //��˯0.3�루��ʾЧ����Ҫ�����Բ��ӣ�
                Thread.currentThread().sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            //��������������������ķ���
            System.out.println(i+"---consume start");
            bre.consume();
            System.out.println(i+"---consume end");
        }
    }

    //�вι���
    public consume(Breads bre) {
        super();
        this.bre = bre;
    }

    //�޲ι���
    public consume() {
        super();
    }
}
