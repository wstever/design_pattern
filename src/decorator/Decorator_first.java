package decorator;
//���涨������װ�Σ����ǵڶ�������������ϸ������װ���ߵĹ���Խ��Խ��  
public class Decorator_first extends Decorator {
	public Decorator_first(Human human) {
		super(human);
	}
	public void goClothespress() {
		System.out.println("ȥ�¹����ҿ�����");
	}
	public void findPlaceOnMap() {
		System.out.println("��Map�����ҡ���");
	}
	public void wearClothes() {
		super.wearClothes();
		goClothespress();
	}
	public void walkToWhere() {
		super.walkToWhere();
		findPlaceOnMap();
	}
}

