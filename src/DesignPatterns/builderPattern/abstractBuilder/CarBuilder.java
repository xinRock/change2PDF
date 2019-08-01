package DesignPatterns.builderPattern.abstractBuilder;

import java.util.ArrayList;

import DesignPatterns.builderPattern.product.CarModel;

/**
 * -��������-
 * @author menggq
 *
 */
public abstract class CarBuilder {
	//����һ��ģ�ͣ���Ҫ����һ��˳�򣬾�����װ˳��
    public abstract void setSequence(ArrayList<String> sequence);
    
    //������˳��󣬼ȿ���ֱ���õ��������ģ��
    public abstract CarModel getCarModel();
}
