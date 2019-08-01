package DesignPatterns.prototypePattern;
/**
 * ԭ��ģʽ(Prototype Pattern)
 * 
 * ԭ��ģʽ�ĺ�����һ��clone������ͨ���÷������ж���Ŀ�����
 * java�ṩ��һ��Cloneable�ӿ�����ʶ��������ǿ��Կ����ģ�JVM��ֻ�������ǵĶ�����п��ܱ�������
 * @author menggq
 *
 */
public class PrototypeClass implements Cloneable {

	@Override
	protected Object clone() throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		// return super.clone();

		PrototypeClass prototypeClass = null;
		try {
			prototypeClass = (PrototypeClass) super.clone();
		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
		}
		return prototypeClass;
	}

}
/*�ŵ㣺
ԭ��ģʽ�����ڴ���������Ŀ�������ֱ��newһ���������ܺúܶ࣬�ر�����һ��ѭ�����ڲ������������ʱ��
�ӱܹ��캯����Լ����ֱ�����ڴ��п��������캯���ǲ��ᱻִ�еġ�
ʹ�ó�����
��Դ�Ż����������ʼ����Ҫ�ǳ������Դ���������ݡ�Ӳ����Դ�ȣ�
���ܺͰ�ȫҪ��ĳ������ù�new����һ��������Ҫ�ǳ�����������׼��������Ȩ�ޣ������ʹ��ԭ��ģʽ��
һ���������޸��ߵĳ�����һ��������Ҫ�ṩ������������ʣ����Ҹ��������߿�����Ҫ�޸���ֵʱ��
��ʵ�ʵ���Ŀ�У�ԭ��ģʽһ���빤��ģʽһ����֣��ù�clone��������һ������Ȼ���ɹ��������ṩ�������ߡ�
�����ǳ������
ǳ������Object���ṩ�ķ���cloneֻ�ǿ���������������ڲ������顢���ö���ȶ�������������ָ��ԭ���������Ŷ��Ԫ�ص�ַ�����������Ľ������ڲ�����ĵ�ַ��
������������Ƕ�����
���߷ֿ�ʹ��
final��clone���మ��ɱ������ʹ��clone���Ͳ�Ҫ��final�ؼ����ˡ�*/