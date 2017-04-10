package decorator.hamburger;

//���ˣ�װ���ߵĵ�һ�㣬�൱�������decorator_zero��
public class Lettuce extends Condiment {
	Hamburger hamburger;
	public Lettuce(Hamburger hamburger) {
		this.hamburger = hamburger;
	}
	public String getName() {
		return hamburger.getName() + " ������";
	}
	public double getPrice() {
		return hamburger.getPrice() + 1.5;
	}
}