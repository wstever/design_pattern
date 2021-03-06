package decorator.hamburger;

public class Test {

	public static void main(String[] args) {
		Hamburger hamburger = new ChickenBurger();
		System.out.println(hamburger.getName() + "  송풀：" + hamburger.getPrice());
		Lettuce lettuce = new Lettuce(hamburger);
		System.out.println(lettuce.getName() + "  송풀：" + lettuce.getPrice());
		Chilli chilli = new Chilli(hamburger);
		System.out.println(chilli.getName() + "  송풀：" + chilli.getPrice());
		Chilli chilli2 = new Chilli(lettuce);
		System.out.println(chilli2.getName() + "  송풀：" + chilli2.getPrice());
	}
}
