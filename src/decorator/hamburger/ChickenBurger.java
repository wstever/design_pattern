package decorator.hamburger;

//鸡腿堡类（被装饰者的初始状态，有些自己的简单装饰，相当于上面的Person）
public class ChickenBurger extends Hamburger {
	public ChickenBurger() {
		name = "鸡腿堡";
	}
	public double getPrice() {
		return 10;
	}
}
