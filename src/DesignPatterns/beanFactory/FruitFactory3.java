package DesignPatterns.beanFactory;
/**
 * ͨ������
 *
 * ͨ�������ȡ������ʵ������Ӱ��
 */
public class FruitFactory3 {
	
	{
		System.out.println("FruitFactory33��static");
	}
	static{
		System.out.println("FruitFactory33��staticstatic");
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
