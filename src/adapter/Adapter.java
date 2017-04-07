package adapter;

// �Ѵ��ڵġ��������⹦�ܡ������������Ǽ��еı�׼�ӿڵ���
class Adaptee {
	public void specificRequest() {
		System.out.println("����������� ���⹦��...");
	}
}

// Ŀ��ӿڣ����Ϊ��׼�ӿ�
interface Target {
	public void request();
}

// ����Ŀ���ֻ࣬�ṩ��ͨ����
class ConcreteTarget implements Target {
	public void request() {
		System.out.println("��ͨ�� ���� ��ͨ����...");
	}
}

// �������࣬�̳��˱������࣬ͬʱʵ�ֱ�׼�ӿ�
class Adapter extends Adaptee implements Target {
	public void request() {
		super.specificRequest();
	}

	// ������public class Client {
	public static void main(String[] args) {
		// ʹ����ͨ������
		Target concreteTarget = new ConcreteTarget();
		concreteTarget.request();

		// ʹ�����⹦���࣬��������
		Target adapter = new Adapter();
		adapter.request();
	}
}
