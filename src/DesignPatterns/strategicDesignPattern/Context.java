package DesignPatterns.strategicDesignPattern;
/**
 * 环境角色
 * 策略角色的外部封装类，根据不同策略执行不同行为，策略由外部环境决定
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
