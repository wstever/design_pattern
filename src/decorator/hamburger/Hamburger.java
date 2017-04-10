package decorator.hamburger;

//汉堡基类（被装饰者，相当于上面的Human）
public abstract class Hamburger {
	protected String name;
	public String getName() {
		return name;
	}
	public abstract double getPrice();
}
