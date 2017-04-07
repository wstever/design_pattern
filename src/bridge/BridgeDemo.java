package bridge;

public class BridgeDemo {

	public static void main(String[] args) {

		AbstractRoad speedWay = new SpeedWay();
		speedWay.aCar = new Car();
		speedWay.run();

		AbstractRoad street = new Street();
		street.aCar = new Bus();
		street.run();
	}
}

abstract class AbstractRoad {
	AbstractCar aCar;

	void run() {
	};
}

abstract class AbstractCar {
	void run() {
	};
}

class Street extends AbstractRoad {
	void run() {
		super.run();
		aCar.run();
		System.out.println("�������ֵ���ʻ");
	}
}

class SpeedWay extends AbstractRoad {
	void run() {
		super.run();
		aCar.run();
		System.out.println("�ڸ��ٹ�·��ʻ");
	}
}

class Car extends AbstractCar {
	void run() {
		super.run();
		System.out.print("С����");
	}
}

class Bus extends AbstractCar {
	void run() {
		super.run();
		System.out.print("������");
	}

}

