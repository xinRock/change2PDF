package DesignPatterns.facadePattern;
/**
 * 外观对象,提供过了对子系统的封装，
 * 外部客户端通过调用外观对象对内部系统进行访问。避免子系统内部实现细节
 * Facade
 * 为调用方定义简单的调用接口。
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
     * 调用ABC的接口
     */
    public void doABC(){
        moduleA.aMethod();
        moduleB.bMethod();
        moduleC.cMethod();
    }
    
    /**
     * 调用AB的接口
     */
    public void doAB(){
        moduleA.aMethod();
        moduleB.bMethod();
    }
    /**
     * 调用AC的接口
     */
    public void doAC(){
        moduleA.aMethod();
        moduleC.cMethod();
    }
    /**
     * 调用BC的接口
     */
    public void doBC(){
        moduleB.bMethod();
        moduleC.cMethod();
    }
}
