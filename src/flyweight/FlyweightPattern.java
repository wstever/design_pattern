package flyweight;
 
public class FlyweightPattern {
	FlyweightFactory factory = new FlyweightFactory();
	Flyweight fly1, fly2, fly3, fly4, fly5, fly6;

	public FlyweightPattern() {
		fly1 = factory.getFlyWeight("Google");
		fly2 = factory.getFlyWeight("Qutr");
		fly3 = factory.getFlyWeight("Google");
		fly4 = factory.getFlyWeight("Google");
		fly5 = factory.getFlyWeight("Google");
		fly6 = factory.getFlyWeight("Google");
	}

	public void showFlyweight() {
		fly1.operation();
		fly2.operation();
		fly3.operation();
		fly4.operation();
		fly5.operation();
		fly6.operation();
		int objSize = factory.getFlyweightSize();
		System.out.println("objSize = " + objSize);
	}

	public static void main(String[] args) {
		System.out.println("The FlyWeight Pattern!");
		FlyweightPattern fp = new FlyweightPattern();
		fp.showFlyweight();
	}
}