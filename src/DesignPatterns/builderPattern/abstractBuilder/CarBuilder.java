package DesignPatterns.builderPattern.abstractBuilder;

import java.util.ArrayList;

import DesignPatterns.builderPattern.product.CarModel;

/**
 * -抽象建造者-
 * @author menggq
 *
 */
public abstract class CarBuilder {
	//建造一个模型，你要给我一个顺序，就是组装顺序
    public abstract void setSequence(ArrayList<String> sequence);
    
    //设置完顺序后，既可以直接拿到这个车辆模型
    public abstract CarModel getCarModel();
}
