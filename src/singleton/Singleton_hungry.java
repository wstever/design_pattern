package singleton;

public class Singleton_hungry {

	// ����ʽ������.�����ʼ��ʱ���Ѿ�����ʵ����
	private Singleton_hungry() {
	}

	private static final Singleton_hungry singleton = new Singleton_hungry();

	// ��̬��������
	public static Singleton_hungry getInstance() {
		return singleton;
	}
}


