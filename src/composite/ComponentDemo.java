package composite;

import java.util.ArrayList;
import java.util.List;

public class ComponentDemo {

	public abstract class Component {
		String name;
		public abstract void add(Component c);
		public abstract void remove(Component c);
		public abstract void eachChild();
	}

	// ��ϲ�����
	public class Leaf extends Component {
		// Ҷ�ӽڵ㲻�߱���ӵ����������Բ�ʵ��
		public void add(Component c) {
			System.out.println("");
		}
		// Ҷ�ӽڵ㲻�߱���ӵ�������ȻҲ����ɾ��
		public void remove(Component c) {
			System.out.println("");
		}
		// Ҷ�ӽڵ�û���ӽڵ�������ʾ�Լ���ִ�н��
		public void eachChild() {
			System.out.println(name + "ִ����");
		}
	}

	// �����
	public class Composite extends Component {
		// ��������ڵ���ӽڵ�
		List<Component> list = new ArrayList<Component>();
		// ��ӽڵ� ��Ӳ���
		public void add(Component c) {
			list.add(c);
		}
		// ɾ���ڵ� ɾ������
		public void remove(Component c) {
			list.remove(c);
		}
		// �����ӽڵ�
		public void eachChild() {
			System.out.println(name + "ִ����");
			for (Component c : list) {
				c.eachChild();
			}
		}
	}

	public static void main(String[] args) {
		ComponentDemo demo = new ComponentDemo();
		// ������ڵ�
		Composite rootComposite = demo.new Composite();
		rootComposite.name = "���ڵ�";
		// ��ڵ�
		Composite compositeLeft = demo.new Composite();
		compositeLeft.name = "��ڵ�";
		// �����ҽڵ㣬�������Ҷ�Ӽ��㣬Ҳ�����Ӳ���
		Composite compositeRight = demo.new Composite();
		compositeRight.name = "�ҽڵ�";
		Leaf leaf1 = demo.new Leaf();
		leaf1.name = "��-�ӽڵ�1";
		Leaf leaf2 = demo.new Leaf();
		leaf2.name = "��-�ӽڵ�2";
		compositeRight.add(leaf1);
		compositeRight.add(leaf2);
		// ���ҽڵ���� ���ڵ�
		rootComposite.add(compositeRight);
		rootComposite.add(compositeLeft);
		// ������ϲ���
		rootComposite.eachChild();
	}
}
