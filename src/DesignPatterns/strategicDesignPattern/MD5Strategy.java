package DesignPatterns.strategicDesignPattern;
/**
 * 策略的具体实现，不与业务代码在一起，还可以独立演化
 * 编写具体策略角色(实际上就是实现上面定义的公共接口)
 **/
public class MD5Strategy implements Strategy {
	@Override
    public void encrypt() {
        System.out.println("执行真正的MD5加密");
    }
}
