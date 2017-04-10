package decorator.hamburger;

//生菜（装饰者的第一层，相当于上面的decorator_zero）
public class Lettuce extends Condiment {
	Hamburger hamburger;
	public Lettuce(Hamburger hamburger) {
		this.hamburger = hamburger;
	}
	public String getName() {
		return hamburger.getName() + " 加生菜";
	}
	public double getPrice() {
		return hamburger.getPrice() + 1.5;
	}
}