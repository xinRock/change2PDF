package DesignPatterns.beanFactory;
/**
 *    û����Σ�ͨ���������֣����ִ�����ʵ���ࡣ
 *
 *     ȱ�㣬ÿ�������µ�ʵ���࣬����Ҫ��һ������
 * */
public class FruitFactory {
	{
		System.out.println("FruitFactory��static");
	}
	static{
		System.out.println("FruitFactory��staticstatic");
	}
	
	public static Fruit getApple(){
        return new Apple();
    }

    public  static Fruit getBanana(){
        return new Banana();
    }
}
