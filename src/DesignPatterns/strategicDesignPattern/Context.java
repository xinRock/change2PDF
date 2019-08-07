package DesignPatterns.strategicDesignPattern;
/**
 * ������ɫ
 * ���Խ�ɫ���ⲿ��װ�࣬���ݲ�ͬ����ִ�в�ͬ��Ϊ���������ⲿ��������
 **/
public class Context {
    private Strategy strategy;

    public Context(Strategy strategy){
        this.strategy=strategy;
    }
    public void encrypt(){
        this.strategy.encrypt();
    }
}
