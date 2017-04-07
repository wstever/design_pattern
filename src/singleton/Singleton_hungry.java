package singleton;

public class Singleton_hungry {

	// 饿汉式单例类.在类初始化时，已经自行实例化
	private Singleton_hungry() {
	}

	private static final Singleton_hungry singleton = new Singleton_hungry();

	// 静态工厂方法
	public static Singleton_hungry getInstance() {
		return singleton;
	}
}


