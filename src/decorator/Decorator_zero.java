package decorator;

//���涨������װ�Σ����ǵ�һ�����ڶ�����������������ϸ������װ���ߵĹ���Խ��Խ��  
public class Decorator_zero extends Decorator {
	public Decorator_zero(Human human) {
		super(human);
	}

	public void goHome() {
		System.out.println("�����ӡ���");
	}

	public void findMap() {
		System.out.println("�鷿����Map����");
	}

	public void wearClothes() {
		super.wearClothes();
		goHome();
	}

	public void walkToWhere() {
		super.walkToWhere();
		findMap();
	}
}
