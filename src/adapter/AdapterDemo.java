package adapter;

/**
 * 适配器模式（ Adapter ）：将一个类的接口转换成客户希望的另外一个接口。
 *  适配器模式，使得原本由于接口不兼容而不能一起工作的那些类可以一起工作。
 */
class AdapterDemo {
	public static void main(String[] args) {
		// 电源A开始工作
		PowerA powerA = new PowerAImpl();
		start(powerA);
		PowerB powerB = new PowerBImpl();
		PowerAAdapter pa = new PowerAAdapter(powerB);
		start(pa);
	}

	// 定义方法：电源A工作
	public static void start(PowerA powerA) {
		System.out.println("....一些重复的代码.....");
		powerA.insert();
		System.out.println("....一些重复的代码.....\n");
	}

	/**
	 * public static void start(PowerB powerB){
	 * System.out.println("....一些重复的代码....."); powerB.connect();
	 * System.out.println("....一些重复的代码....."); }
	 */
}

// 定义适配器类
class PowerAAdapter implements PowerA {
	private PowerB powerB;// 要进行适配的接口

	public PowerAAdapter(PowerB powerB) {
		this.powerB = powerB;
	}

	// 实现接口PowerA，则必然要实现PowerA里面的方法
	public void insert() {
		powerB.connect();
	}
}

/**
 * 电源A接口
 */
interface PowerA {
	public void insert();
}

class PowerAImpl implements PowerA {
	public void insert() {
		System.out.println("电源A接口插入，开始工作");
	}
}

/**
 * 电源B接口
 */
interface PowerB {
	public void connect();
}

class PowerBImpl implements PowerB {
	public void connect() {
		System.out.println("电源B接口已连接，开始工作");
	}
}