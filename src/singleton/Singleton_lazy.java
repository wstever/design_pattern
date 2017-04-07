package singleton;

public class Singleton_lazy {

	// 懒汉式单例类.在第一次调用的时候，实例化自己
	private Singleton_lazy() {

	}

	private static Singleton_lazy singleton = null;

	// 静态工厂方法
	public static Singleton_lazy getInstance() {
		if (singleton == null) {
			singleton = new Singleton_lazy();
		}
		return singleton;
	}
}
