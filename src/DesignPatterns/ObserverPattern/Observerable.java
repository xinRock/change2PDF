package DesignPatterns.ObserverPattern;
/***
 * Subject
 * 当需要被观察的状态发生变化时，需要通知队列中所有观察者对象。Subject需要维持（添加，删除，通知）一个观察者对象的队列列表。
 * 抽象被观察者接口
 * 声明了添加、删除、通知观察者方法
 * @author jstao
 *
 */
public interface Observerable {
	public void registerObserver(Observer o);
    public void removeObserver(Observer o);
    public void notifyObserver();
    void setMessage(String s);
}
