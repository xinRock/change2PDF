package DesignPatterns.builderPattern;
/**
 * 
 ��һ��Ľ�����ģʽ�У�������4����ɫ��

	��Ʒ�ࣨʵ�ʾ�������ĵ�����ģ�巽��ģʽ��ʵ�֣�
		ͨ����ʵ����ģ�巽��ģʽ��Ҳ������ģ�巽���ͻ���������
	��������Builder
		�淶��Ʒ���齨��һ��������ʵ�֡�
	���幹����ConcreteBuilder
		ʵ�ֳ������ߵ����з��������ҷ���һ���齨�õĶ���
	������
		������ݿͻ�����Ҫ��������ģ���˳��Ȼ�����Builder��ʼ���죬Ȼ����ConcreteBuilder���صĶ��������ָ��ͻ�
		����˵�������Ǿ���ģ��ģʽ�����Ĳ�Ʒ�໹�ǳ�������Ľ����ߣ����ڿͻ��������εģ��ͻ�ֻ��Ҫ�����ľ���������ߵ����࣬�����ɵ�����ͳ�ﰲ�ţ���������ظ��ͻ���
	������ģʽ��ʹ�ó����У�
	��������ǣ���ͬ�ķ�������ͬ��ִ��˳�򣬲�����ͬ���¼����ʱ�����Կ���ʹ�á�
	һ�������ɶ������򲿼����ɣ����������в����Ľ���ֲ���ͬ��
	���ԣ���������ģʽ��ע����������ͺ�װ��˳��ͬ�������������빤���������Ĳ�ͬ����
	����ģʽ���ص����Ǵ��������������������Ҫְ����װ˳��������care�ģ���
 * 
 */
import java.util.ArrayList;

import DesignPatterns.builderPattern.abstractBuilder.impl.BMWBuilder;
import DesignPatterns.builderPattern.abstractBuilder.impl.BenzBuilder;
import DesignPatterns.builderPattern.product.BMWModel;
import DesignPatterns.builderPattern.product.BenzModel;
/**
 * 
 * @author menggq
 *������ݿͻ�����Ҫ��������ģ���˳��Ȼ�����Builder��ʼ���죬Ȼ����ConcreteBuilder���صĶ��������ָ��ͻ�
 *����˵�������Ǿ���ģ��ģʽ�����Ĳ�Ʒ�໹�ǳ�������Ľ����ߣ����ڿͻ��������εģ��ͻ�ֻ��Ҫ�����ľ���������ߵ����࣬
 *�����ɵ�����ͳ�ﰲ�ţ���������ظ��ͻ���
 *
 */
public class Director {

	private ArrayList<String> sequence = new ArrayList<String>();
    private BenzBuilder benzBuilder = new BenzBuilder();
    private BMWBuilder bmwBuilder = new BMWBuilder();
    
    /**
     * ���A���͵ı�������
     * @return
     */
    public BenzModel getABenzModel() {
        this.sequence.clear();
        this.sequence.add("start");
        this.sequence.add("stop");
        this.benzBuilder.setSequence(sequence);
        return (BenzModel) this.benzBuilder.getCarModel();
    }
    
    /**
     * ���B���͵ı�������
     * @return
     */
    public BenzModel getBBenzModel() {
        this.sequence.clear();
        
        this.sequence.add("engine boom");
        this.sequence.add("start");
        this.sequence.add("stop");
        this.benzBuilder.setSequence(sequence);
        return (BenzModel) this.benzBuilder.getCarModel();
    }
    
    /**
     * ���A���͵ı�����
     * @return
     */
    public BMWModel getABMWModel() {
        this.sequence.clear();
        
        this.sequence.add("alarm");
        this.sequence.add("start");
        this.sequence.add("stop");
        
        this.bmwBuilder.setSequence(sequence);
        return (BMWModel) this.bmwBuilder.getCarModel();
    }
    
    /**
     * ���B���͵ı�����
     * @return
     */
    public BMWModel getBBMWModel() {
        this.sequence.clear();
        
        this.sequence.add("start");
        
        this.bmwBuilder.setSequence(sequence);
        return (BMWModel) this.bmwBuilder.getCarModel();
        
    }
    
}
