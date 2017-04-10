package decorator;
//下面定义三种装饰，这是第三个功能依次细化，即装饰者的功能越来越多  
public class Decorator_two extends Decorator {
	public Decorator_two(Human human) {
		super(human);
	}

	public void findClothes() {
		System.out.println("找到一件D&G。。");
	}

	public void findTheTarget() {
		System.out.println("在Map上找到神秘花园和城堡。。");
	}

	public void wearClothes() {
		super.wearClothes();
		findClothes();
	}

	public void walkToWhere() {
		super.walkToWhere();
		findTheTarget();
	}
}
