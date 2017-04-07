package design_pattern;

public class Singleton_lazy_synchronized {

	// ����ʽ������.�ڵ�һ�ε��õ�ʱ��ʵ�����Լ�
	private Singleton_lazy_synchronized() {

	}

	private static Singleton_lazy_synchronized singleton = null;

	// ��̬��������
	public static synchronized Singleton_lazy_synchronized getInstance() {
		if (singleton == null) {
			singleton = new Singleton_lazy_synchronized();
		}
		return singleton;
	}
}
