package DesignPatterns.strategicDesignPattern;
/*
 * 外部环境调用类似于客户端
 **/
public class App {
    public static void main(String[] args) {
        //具体执行哪个策略由外部环境决定，这里可以融合工厂模式
        //Context context = new Context(new MD5Strategy());//执行真正的MD5加密
        Context context = new Context(new MDSStrategy());//执行MDS加密
        context.encrypt();
    }
}
