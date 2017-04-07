package singleton;

public class TestSingletonMain {
	public static void main(String[] args) {
		TestSingleton ts1 = TestSingleton.getInstance();
		ts1.setName("jason");
		TestSingleton ts2 = TestSingleton.getInstance();
		ts2.setName("0539");

		ts1.printInfo();
		ts2.printInfo();

		if (ts1 == ts2) {
			System.out.println("��������ͬһ��ʵ��");
		} else {
			System.out.println("�����Ĳ���ͬһ��ʵ��");
		}
	}
}
