package DesignPatterns.beanFactory;
/**
 * getCanonicalName�Ƿ��ر�׼��name
 * getName�Ƿ������ȫ·��name  ����DesignPatterns.beanFactory.Apple
 * @author menggq
 *
 */
public class Test {

	public static void main(String[] args) {

//		Fruit apple1 = new Apple();
//        Fruit banana1 = new Banana();
//
//        apple1.get();
//        banana1.get();

        System.out.println("-------------");

        //��һ������
//        Fruit apple2 = FruitFactory.getApple();
//        Fruit banana2 = FruitFactory.getBanana();
//        apple2.get();
//        banana2.get();
//        System.out.println("-------------");

        //�ڶ�������
        Fruit apple = FruitFactory2.getFruit("apple");
        apple.get();
        System.out.println("-------------");


        //����������
//        Fruit fruit = FruitFactory3.getFruit(Apple.class.getName());
//        fruit.get();
//        System.out.println("-------------");
	}
}
