package threadCommunication;
/**
 *@functon 线程通信之生产类（继承Thread类） 
 *@author 温煦（昵称：沉沦之巅）
 */
public class producer extends Thread{

	//获得面包的类
    private Breads bre ;

    //无参构造
    public producer() {
        super();
    }

    //有参构造
    public producer(Breads bre) {
        super();
        this.bre = bre;
    }


    //set和get方法
    public Breads getBre() {
        return bre;
    }

    public void setBre(Breads bre) {
        this.bre = bre;
    }

    //继承重写run方法
    @Override
    public void run() {
        pro();
    }
    
    //生产面包
    private void pro() {
        // 本系统默认循环生产20个面包
        for (int i = 0; i <20; i++) {
            try {
                //沉睡0.3秒（演示效果需要，可以不加）
                Thread.currentThread().sleep(500);
            } catch (InterruptedException e) {         
                e.printStackTrace();
            }
            //调用面包类里的生产面包的方法
            System.out.println(i+"---producerstart");
            bre.produc();
            System.out.println(i+"---producerchulaile");
        }
    }
	
}
