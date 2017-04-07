package singleton;

public class Singleton_lazy_double_check {

	// ����ʽ������.�ڵ�һ�ε��õ�ʱ��ʵ�����Լ�
	private Singleton_lazy_double_check() {

	}

	private static Singleton_lazy_double_check singleton = null;

	// ��̬��������
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
