package DesignPatterns.builderPattern;
/**
 * 
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
 * @author menggq
 *
 */
public class Client {

	public static void main(String[] args) {
        // TODO Auto-generated method stub
        Director director = new Director();
        //制造100台A类型的奔驰
        for(int i=0; i<1000; i++){
        	director.getBBenzModel().run();
        } 
        //制造2000台B类型的宝马
        for(int i=0; i<2000; i++){
        	//director.getBBMWModel().run();
        }
    }
	
}
