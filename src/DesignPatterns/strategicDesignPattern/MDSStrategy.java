package DesignPatterns.strategicDesignPattern;
/* ���Եľ���ʵ�֣�����ҵ�������һ�𣬻����Զ����ݻ�
 * ��д������Խ�ɫ(ʵ���Ͼ���ʵ�����涨��Ĺ����ӿ�)
 **/
public class MDSStrategy implements Strategy {
	@Override
    public void encrypt() {
        System.out.println("ִ��MDS����");
    }
}
