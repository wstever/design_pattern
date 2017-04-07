package singleton;

public class Singleton_lazy_inner_class {

	private static class LazyHolder {
		private static final Singleton_lazy_inner_class INSTANCE
		     = new Singleton_lazy_inner_class();
	}

	private Singleton_lazy_inner_class() {

	}

	public static final Singleton_lazy_inner_class getInstance() {
		return LazyHolder.INSTANCE;
	}
}
