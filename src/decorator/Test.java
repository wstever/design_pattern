package decorator;

//�����࣬��һ����ͻᷢ�֣���java��I/O�����ж�ô����
public class Test {
	public static void main(String[] args) {
		Human person = new Person();
		Decorator decorator = new Decorator_two(new Decorator_first(new Decorator_zero(person)));
		decorator.wearClothes();
		decorator.walkToWhere();
	}
}