package adapter;

/**
 * ������ģʽ�� Adapter ������һ����Ľӿ�ת���ɿͻ�ϣ��������һ���ӿڡ�
 *  ������ģʽ��ʹ��ԭ�����ڽӿڲ����ݶ�����һ��������Щ�����һ������
 */
class AdapterDemo {
	public static void main(String[] args) {
		// ��ԴA��ʼ����
		PowerA powerA = new PowerAImpl();
		start(powerA);
		PowerB powerB = new PowerBImpl();
		PowerAAdapter pa = new PowerAAdapter(powerB);
		start(pa);
	}

	// ���巽������ԴA����
	public static void start(PowerA powerA) {
		System.out.println("....һЩ�ظ��Ĵ���.....");
		powerA.insert();
		System.out.println("....һЩ�ظ��Ĵ���.....\n");
	}

	/**
	 * public static void start(PowerB powerB){
	 * System.out.println("....һЩ�ظ��Ĵ���....."); powerB.connect();
	 * System.out.println("....һЩ�ظ��Ĵ���....."); }
	 */
}

// ������������
class PowerAAdapter implements PowerA {
	private PowerB powerB;// Ҫ��������Ľӿ�

	public PowerAAdapter(PowerB powerB) {
		this.powerB = powerB;
	}

	// ʵ�ֽӿ�PowerA�����ȻҪʵ��PowerA����ķ���
	public void insert() {
		powerB.connect();
	}
}

/**
 * ��ԴA�ӿ�
 */
interface PowerA {
	public void insert();
}

class PowerAImpl implements PowerA {
	public void insert() {
		System.out.println("��ԴA�ӿڲ��룬��ʼ����");
	}
}

/**
 * ��ԴB�ӿ�
 */
interface PowerB {
	public void connect();
}

class PowerBImpl implements PowerB {
	public void connect() {
		System.out.println("��ԴB�ӿ������ӣ���ʼ����");
	}
}