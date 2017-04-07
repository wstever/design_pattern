package bridge;

public class TraditionalDemo {
	// ����
	public static void main(String[] args) {
		// С�����ڸ��ٹ�·��ʻ
		CarOnSpeedWay carOnSpeedWay = new CarOnSpeedWay();
		carOnSpeedWay.run();
		// �������������ֵ���ʻ
		BusOnStreet busOnStreet = new BusOnStreet();
		busOnStreet.run();
	}
}

// ���� ·
class Road {
	void run() {
		System.out.println("·");
	}
}

// �����ֵ�
class Street extends Road {
	void run() {
		System.out.println("�����ֵ�");
	}
}

// ���ٹ�·
class SpeedWay extends Road {
	void run() {
		System.out.println("���ٹ�·");
	}
}

// С�����������ֵ���ʻ
class CarOnStreet extends Street {
	void run() {
		System.out.println("С�����������ֵ���ʻ");
	}
}

// С�����ڸ��ٹ�·��ʻ
class CarOnSpeedWay extends SpeedWay {
	void run() {
		System.out.println("С�����ڸ��ٹ�·��ʻ");
	}
}

// �������������ֵ���ʻ
class BusOnStreet extends Street {
	void run() {
		System.out.println("�������������ֵ���ʻ");
	}
}

// �������ڸ��ٹ�·��ʻ
class BusOnSpeedWay extends SpeedWay {
	void run() {
		System.out.println("�������ڸ��ٹ�·��ʻ");
	}
}
