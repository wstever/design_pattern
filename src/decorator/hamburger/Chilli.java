package decorator.hamburger;

//辣椒（装饰者的第二层，相当于上面的decorator_first）
public class Chilli extends Condiment {
	Hamburger hamburger;
	public Chilli(Hamburger hamburger) {
		this.hamburger = hamburger;
	}
	public String getName() {
		return hamburger.getName() + " 加辣椒";
	}
	public double getPrice() {
		return hamburger.getPrice(); // 辣椒是免费的哦
	}
}