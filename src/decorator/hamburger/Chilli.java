package decorator.hamburger;

//������װ���ߵĵڶ��㣬�൱�������decorator_first��
public class Chilli extends Condiment {
	Hamburger hamburger;
	public Chilli(Hamburger hamburger) {
		this.hamburger = hamburger;
	}
	public String getName() {
		return hamburger.getName() + " ������";
	}
	public double getPrice() {
		return hamburger.getPrice(); // ��������ѵ�Ŷ
	}
}