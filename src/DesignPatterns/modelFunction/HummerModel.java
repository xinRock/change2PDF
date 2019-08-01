package DesignPatterns.modelFunction;

/**
 * 模板方法模式
 * 
 * @author menggq
 *
 */
public abstract class HummerModel {

	/**
	 * 首先，这个模型要能发动起来，不管是电力发动还是手摇发动 所以具体是怎么发动就要根据不同的型号自己实现发动的方法
	 */
	public abstract void start();

	/**
	 * 不仅能够发动，还要能够停止
	 */
	public abstract void stop();

	/**
	 * 按喇叭会响
	 */
	public abstract void alarm();

	/**
	 * 发动引擎时有隆隆声
	 */
	public abstract void engineBoom();

	public void run() {
		// 启动
		this.start();
		// 启动后隆隆声
		this.engineBoom();
		// 动作按喇叭
		this.alarm();
		// 停止
		this.stop();
	}
}
