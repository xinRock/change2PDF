package DesignPatterns.builderPattern;
/**
 * 
 在一般的建造者模式中，有如下4个角色：

	产品类（实际就是上面的第四种模板方法模式的实现）
		通常是实现了模板方法模式，也就是有模板方法和基本方法；
	抽象建造者Builder
		规范产品的组建，一般由子类实现。
	具体构建着ConcreteBuilder
		实现抽象建造者的所有方法，并且返回一个组建好的对象。
	导演类
		负责根据客户的需要安排已有模块的顺序，然后告诉Builder开始建造，然后获得ConcreteBuilder返回的对象，最后呈现给客户
		所以说，不论是经由模板模式构建的产品类还是抽象或具体的建造者，对于客户都是屏蔽的，客户只需要将他的具体需求告诉导演类，最终由导演类统筹安排，将结果返回给客户。
	建造者模式的使用场景有：
	如果需求是：相同的方法，不同的执行顺序，产生不同的事件结果时，可以考虑使用。
	一个对象由多个零件或部件构成，，但是运行产生的结果又不相同；
	所以，，建造者模式关注的是零件类型和装配顺序不同！！！这是他与工厂方法最大的不同！！
	工厂模式的重点则是创建，创建零件的它的主要职责，组装顺序是它不care的！！
 * 
 */
import java.util.ArrayList;

import DesignPatterns.builderPattern.abstractBuilder.impl.BMWBuilder;
import DesignPatterns.builderPattern.abstractBuilder.impl.BenzBuilder;
import DesignPatterns.builderPattern.product.BMWModel;
import DesignPatterns.builderPattern.product.BenzModel;
/**
 * 
 * @author menggq
 *负责根据客户的需要安排已有模块的顺序，然后告诉Builder开始建造，然后获得ConcreteBuilder返回的对象，最后呈现给客户
 *所以说，不论是经由模板模式构建的产品类还是抽象或具体的建造者，对于客户都是屏蔽的，客户只需要将他的具体需求告诉导演类，
 *最终由导演类统筹安排，将结果返回给客户。
 *
 */
public class Director {

	private ArrayList<String> sequence = new ArrayList<String>();
    private BenzBuilder benzBuilder = new BenzBuilder();
    private BMWBuilder bmwBuilder = new BMWBuilder();
    
    /**
     * 获得A类型的奔驰汽车
     * @return
     */
    public BenzModel getABenzModel() {
        this.sequence.clear();
        this.sequence.add("start");
        this.sequence.add("stop");
        this.benzBuilder.setSequence(sequence);
        return (BenzModel) this.benzBuilder.getCarModel();
    }
    
    /**
     * 获得B类型的奔驰汽车
     * @return
     */
    public BenzModel getBBenzModel() {
        this.sequence.clear();
        
        this.sequence.add("engine boom");
        this.sequence.add("start");
        this.sequence.add("stop");
        this.benzBuilder.setSequence(sequence);
        return (BenzModel) this.benzBuilder.getCarModel();
    }
    
    /**
     * 获得A类型的宝马车型
     * @return
     */
    public BMWModel getABMWModel() {
        this.sequence.clear();
        
        this.sequence.add("alarm");
        this.sequence.add("start");
        this.sequence.add("stop");
        
        this.bmwBuilder.setSequence(sequence);
        return (BMWModel) this.bmwBuilder.getCarModel();
    }
    
    /**
     * 获得B类型的宝马车型
     * @return
     */
    public BMWModel getBBMWModel() {
        this.sequence.clear();
        
        this.sequence.add("start");
        
        this.bmwBuilder.setSequence(sequence);
        return (BMWModel) this.bmwBuilder.getCarModel();
        
    }
    
}
