package DesignPatterns.prototypePattern;
/**
 * 原型模式(Prototype Pattern)
 * 
 * 原型模式的核心是一个clone方法，通过该方法进行对象的拷贝，
 * java提供了一个Cloneable接口来标识这个对象是可以拷贝的，JVM中只有这个标记的对象才有可能被拷贝；
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
/*优点：
原型模式是在内存二进制流的拷贝，比直接new一个对象性能好很多，特别是在一个循环体内产生大量对象的时候；
逃避构造函数的约束：直接在内存中拷贝，构造函数是不会被执行的。
使用场景：
资源优化场景：类初始化需要非常多的资源，包括数据、硬件资源等；
性能和安全要求的场景：用过new产生一个对象需要非常繁琐的数据准备货访问权限，则可以使用原型模式；
一个对象多个修改者的场景：一个对象需要提供给其他对象访问，而且各个调用者可能需要修改其值时。
在实际的项目中，原型模式一般与工厂模式一起出现，用过clone方法创建一个对象，然后由工厂方法提供给调用者。
深拷贝与浅拷贝：
浅拷贝：Object类提供的方法clone只是拷贝本对象，其对象内部的数组、引用对象等都不拷贝，还是指向原声对象的呢哦不元素地址。（即拷贝的仅仅是内部对象的地址）
深拷贝：拷贝的是对象本身
二者分开使用
final与clone的相爱相杀：若想使用clone，就不要加final关键字了。*/