package decorator.hamburger;

public class Test {

	public static void main(String[] args) {
		Hamburger hamburger = new ChickenBurger();
		System.out.println(hamburger.getName() + "  ��Ǯ��" + hamburger.getPrice());
		Lettuce lettuce = new Lettuce(hamburger);
		System.out.println(lettuce.getName() + "  ��Ǯ��" + lettuce.getPrice());
		Chilli chilli = new Chilli(hamburger);
		System.out.println(chilli.getName() + "  ��Ǯ��" + chilli.getPrice());
		Chilli chilli2 = new Chilli(lettuce);
		System.out.println(chilli2.getName() + "  ��Ǯ��" + chilli2.getPrice());
	}
}
