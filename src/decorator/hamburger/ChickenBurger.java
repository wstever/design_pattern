package decorator.hamburger;

//���ȱ��ࣨ��װ���ߵĳ�ʼ״̬����Щ�Լ��ļ�װ�Σ��൱�������Person��
public class ChickenBurger extends Hamburger {
	public ChickenBurger() {
		name = "���ȱ�";
	}
	public double getPrice() {
		return 10;
	}
}
