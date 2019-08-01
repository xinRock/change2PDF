package DesignPatterns.builderPattern.product;

import java.util.ArrayList;

/**
 * 产品类
 * @author menggq
 *
 */
public abstract class CarModel {

	//这个参数是各个基本方法执行的顺序
    private ArrayList<String> sequence = new ArrayList<String>();
    
    
    protected abstract void start();
    
    protected abstract void stop();
    
    protected abstract void alarm();
    
    protected abstract void engineBoom();
    
    final public void run() {
        //循环一遍sequence，谁在前就限制性谁
        for(int i=0; i<this.sequence.size(); i++) {
            String actionName = this.sequence.get(i);
            if(actionName.equalsIgnoreCase("start"))
                this.start();
            else if(actionName.equalsIgnoreCase("stop"))
                this.stop();
            else if(actionName.equalsIgnoreCase("alarm"))
                this.alarm();
            else if(actionName.equalsIgnoreCase("engine boom"))
                this.engineBoom();
        }
    }
    
    
    final public void setSequence(ArrayList<String> sequence) {
        this.sequence = sequence;
    }
	
}
