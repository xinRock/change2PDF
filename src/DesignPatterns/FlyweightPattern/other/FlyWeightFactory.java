package DesignPatterns.FlyweightPattern.other;

import java.util.concurrent.ConcurrentHashMap;

/**
 * xuhaixing
 * 2018/6/21 23:09
 **/
public class FlyWeightFactory {
    private static ConcurrentHashMap<String, FlyWeight> flyWeights = new ConcurrentHashMap<String, FlyWeight>();

    /**
     * ͨ���ڲ�״̬name�����������ⲿ״̬�ı䣬�ᵼ���̲߳���ȫ����
     * @param name
     * @return
     */
    public static  FlyWeight getFlyWeight(String name){
        if(flyWeights.get(name)==null){
            synchronized (flyWeights){
                if(flyWeights.get(name)==null){
                    FlyWeight flyWeight = new ConcreateFlyWeight(name);
                    flyWeights.put(name,flyWeight);
                }
            }
        }
        return flyWeights.get(name);
    }
}
