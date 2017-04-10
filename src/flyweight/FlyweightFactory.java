package flyweight;

import java.util.Hashtable;

//����������
public class FlyweightFactory {
	// ������һ��Hashtable�����洢��������
	private Hashtable<Object, Flyweight> flyweights = new Hashtable<Object, Flyweight>();

	public FlyweightFactory() {
	}

	public Flyweight getFlyWeight(Object obj) {
		// ѡ��Ҫʵ�����Ķ���
		Flyweight flyweight = (Flyweight) flyweights.get(obj);
		if (flyweight == null) {
			// �����µ�ConcreteFlyweight
			flyweight = new ConcreteFlyweight((String) obj);
			flyweights.put(obj, flyweight);
		}
		// ���ö��󷵻أ������Hashtable��û��Ҫѡ��Ķ��󣬴�ʱ����flyweightΪnull
		// ����һ���µ�flyweight�洢��Hashtable�У������ö��󷵻ء�
		return flyweight;
	}

	public int getFlyweightSize() {
		return flyweights.size();
	}
}
