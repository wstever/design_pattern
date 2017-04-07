package bridge;

public class BridgeDemo {

	public static void main(String[] args) {

		AbstractRoad speedWay = new SpeedWay();
		speedWay.aCar = new Car();
		
		speedWay.run();
		AbstractRoad street = new Street();
		street.aCar = new Bus();
		street.run();

		/*People man = new Man();
		man.road = speedWay;
		man.run();*/


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
		System.out.println("在市区街道行驶");
	}
}

class SpeedWay extends AbstractRoad {
	void run() {
		super.run();
		aCar.run();
		System.out.println("在高速公路行驶");
	}
}

class Car extends AbstractCar {
	void run() {
		super.run();
		System.out.print("小汽车");
	}
}

class Bus extends AbstractCar {
	void run() {
		super.run();
		System.out.print("公交车");
	}
}

abstract class People {
	AbstractRoad road;

	void run() {
	}
}

class Man extends People {
	void run() {
		super.run();
		System.out.print("男人开着");
		road.run();
	}
}

class Woman extends People {
	void run() {
		super.run();
		System.out.print("女人开着");
		road.run();
	}
}
