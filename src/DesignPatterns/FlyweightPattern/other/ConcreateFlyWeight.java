package DesignPatterns.FlyweightPattern.other;
/**
 * xuhaixing
 * 2018/6/21 23:05
 * ��Ԫ������
 **/
public class ConcreateFlyWeight implements FlyWeight{

    //�ڲ�״̬
    private String name;
    
    public ConcreateFlyWeight(String name){
        this.name=name;
    }
    //�ⲿ״̬  externalState
    public void doing(String externalState) {
        System.out.println("name="+name+" exterState="+externalState);
    }
}

