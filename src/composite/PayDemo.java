package composite;

import java.util.ArrayList;
import java.util.List;

public class PayDemo {

	public abstract class Market {
		String name;

		public abstract void add(Market m);

		public abstract void remove(Market m);

		public abstract void PayByCard();
	}

	// �ֵ� ��������м��˵�
	public class MarketBranch extends Market {
		// ���˵��б�
		List<Market> list = new ArrayList<PayDemo.Market>();
		public MarketBranch(String s) {
			this.name = s;
		}
		public void add(Market m) {
			list.add(m);
		}
		public void remove(Market m) {
			list.remove(m);
		}
		// ����֮�󣬸÷ֵ��µļ��˵��Զ��ۼӻ���
		public void PayByCard() {
			System.out.println(name + "����,�������ۼ���û�Ա��");
			for (Market m : list) {
				m.PayByCard();
			}
		}
	}

	// ���˵� ���治���зֵ�ͼ��˵꣬��ײ�
	public class MarketJoin extends Market {
		public MarketJoin(String s) {
			this.name = s;
		}

		public void add(Market m) {
		}

		public void remove(Market m) {
		}

		public void PayByCard() {
			System.out.println(name + "����,�������ۼ���û�Ա��");
		}
	}

	public static void main(String[] args) {
		PayDemo demo = new PayDemo();
		MarketBranch rootBranch = demo.new MarketBranch("�ܵ�");
		MarketBranch qhdBranch = demo.new MarketBranch("�ػʵ��ֵ�");
		MarketJoin hgqJoin = demo.new MarketJoin("�ػʵ��ֵ�һ���������˵�");
		MarketJoin btlJoin = demo.new MarketJoin("�ػʵ��ֵ����������˵�");

		qhdBranch.add(hgqJoin);
		qhdBranch.add(btlJoin);
		rootBranch.add(qhdBranch);
		rootBranch.PayByCard();
	}
}