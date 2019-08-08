package DesignPatterns.beanFactory;
/**
 * 通过反射
 *
 * 通过反射获取，新增实体类无影响
 */
public class FruitFactory3 {
	
	{
		System.out.println("FruitFactory33无static");
	}
	static{
		System.out.println("FruitFactory33有staticstatic");
	}
	

	public static Fruit getFruit(String type){
		try {
			Class<?> forName = Class.forName(type);
			return (Fruit)forName.newInstance();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (InstantiationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
		
	}
}
