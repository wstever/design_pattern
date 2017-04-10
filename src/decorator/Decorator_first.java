package decorator;
//下面定义三种装饰，这是第二个，功能依次细化，即装饰者的功能越来越多  
public class Decorator_first extends Decorator {
	public Decorator_first(Human human) {
		super(human);
	}
	public void goClothespress() {
		System.out.println("去衣柜找找看。。");
	}
	public void findPlaceOnMap() {
		System.out.println("在Map上找找。。");
	}
	public void wearClothes() {
		super.wearClothes();
		goClothespress();
	}
	public void walkToWhere() {
		super.walkToWhere();
		findPlaceOnMap();
	}
}

