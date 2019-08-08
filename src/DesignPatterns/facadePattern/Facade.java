package DesignPatterns.facadePattern;
/**
 * ��۶���,�ṩ���˶���ϵͳ�ķ�װ��
 * �ⲿ�ͻ���ͨ��������۶�����ڲ�ϵͳ���з��ʡ�������ϵͳ�ڲ�ʵ��ϸ��
 * Facade
 * Ϊ���÷�����򵥵ĵ��ýӿڡ�
 * 
 **/
public class Facade {

	private ModuleA moduleA;
    private  ModuleB moduleB;
    private ModuleC moduleC;
    public Facade(){
        moduleA = new ModuleA();
        moduleB = new ModuleB();
        moduleC = new ModuleC();
    }

    /**
     * ����ABC�Ľӿ�
     */
    public void doABC(){
        moduleA.aMethod();
        moduleB.bMethod();
        moduleC.cMethod();
    }
    
    /**
     * ����AB�Ľӿ�
     */
    public void doAB(){
        moduleA.aMethod();
        moduleB.bMethod();
    }
    /**
     * ����AC�Ľӿ�
     */
    public void doAC(){
        moduleA.aMethod();
        moduleC.cMethod();
    }
    /**
     * ����BC�Ľӿ�
     */
    public void doBC(){
        moduleB.bMethod();
        moduleC.cMethod();
    }
}
