package DesignPatterns.strategicDesignPattern;
/*
 * �ⲿ�������������ڿͻ���
 **/
public class App {
    public static void main(String[] args) {
        //����ִ���ĸ��������ⲿ������������������ںϹ���ģʽ
        //Context context = new Context(new MD5Strategy());//ִ��������MD5����
        Context context = new Context(new MDSStrategy());//ִ��MDS����
        context.encrypt();
    }
}
