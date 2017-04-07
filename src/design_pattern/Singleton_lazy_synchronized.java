package design_pattern;

public class Singleton_lazy_synchronized {

	// 懒汉式单例类.在第一次调用的时候，实例化自己
	private Singleton_lazy_synchronized() {

	}

	private static Singleton_lazy_synchronized singleton = null;

	// 静态工厂方法
	public static synchronized Singleton_lazy_synchronized getInstance() {
		if (singleton == null) {
			singleton = new Singleton_lazy_synchronized();
		}
		return singleton;
	}
}
