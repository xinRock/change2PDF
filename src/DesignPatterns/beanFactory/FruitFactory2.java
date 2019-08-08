package DesignPatterns.beanFactory;

public class FruitFactory2 {

	{
		System.out.println("FruitFactory22ÎÞstatic");
	}
	static{
		System.out.println("FruitFactory22ÓÐstaticstatic");
	}
	
	public static Fruit getFruit(String type) {

		if (type.equalsIgnoreCase("apple")) {

			return new Apple();

		} else if (type.equalsIgnoreCase("banana")) {
			return new Banana();

		} else {
			return null;
		}

	}
}
