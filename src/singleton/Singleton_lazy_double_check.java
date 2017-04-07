package singleton;

public class Singleton_lazy_double_check {

	// 懒汉式单例类.在第一次调用的时候，实例化自己
	private Singleton_lazy_double_check() {

	}

	private static Singleton_lazy_double_check singleton = null;

	// 静态工厂方法
	public static Singleton_lazy_double_check getInstance() {
		if (singleton == null) {
			synchronized (Singleton_lazy_double_check.class) {
				if (singleton == null) {
					singleton = new Singleton_lazy_double_check();
				}
			}
		}
		return singleton;
	}
}
