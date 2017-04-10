package flyweight;

import java.util.Hashtable;

//工厂方法类
public class FlyweightFactory {
	// 定义了一个Hashtable用来存储各个对象
	private Hashtable<Object, Flyweight> flyweights = new Hashtable<Object, Flyweight>();

	public FlyweightFactory() {
	}

	public Flyweight getFlyWeight(Object obj) {
		// 选出要实例化的对象
		Flyweight flyweight = (Flyweight) flyweights.get(obj);
		if (flyweight == null) {
			// 产生新的ConcreteFlyweight
			flyweight = new ConcreteFlyweight((String) obj);
			flyweights.put(obj, flyweight);
		}
		// 将该对象返回，如果在Hashtable中没有要选择的对象，此时变量flyweight为null
		// 产生一个新的flyweight存储在Hashtable中，并将该对象返回。
		return flyweight;
	}

	public int getFlyweightSize() {
		return flyweights.size();
	}
}
