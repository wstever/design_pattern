package singleton;

public class Singleton_lazy {

	// ����ʽ������.�ڵ�һ�ε��õ�ʱ��ʵ�����Լ�
	private Singleton_lazy() {

	}

	private static Singleton_lazy singleton = null;

	// ��̬��������
	public static Singleton_lazy getInstance() {
		if (singleton == null) {
			singleton = new Singleton_lazy();
		}
		return singleton;
	}
}
