package server;

import java.util.ArrayList;
import java.util.List;

public class ItemList {
	

	public static List getItemList() {
		List<Item> list = new ArrayList<Item>();
		
			Item item1 = new Item();
			item1.setId("1");
			item1.setName("������֮�� The Wolf Of Wall Street (2013)");
			item1.setSummary("�Ͽ�����½���Ƭ�а��ݳ�����Ʊ�����˱������أ�����Ϊ��������90�����һ����ģ�м�֤ȯ��թ���оܾ��뾯������������20���¡�");
			item1.setImageUri("http://192.168.1.105:8080/RecSysServer/image/thewolf.jpg");
			list.add(item1);
			Item item2 = new Item();
			item2.setId("2");
			item2.setName("�����������ӵ�һ�� Kiraware Matsuko No Issh (2006)");
			item2.setSummary("��һ�츸�ף��㴨��֮�Σ�ͻȻ���Ұ��ϣ���̫�Σ����������и���δı��Ĺù����ˣ�����ȥ��ʰ�¹ùõķ��ӡ��ںӱߵ�����С������Ͻ�����ʼ�˽⸸�׿��еĹùã���������������һ���� ");
			item2.setImageUri("http://192.168.1.105:8080/RecSysServer/image/kmn.jpg");
			list.add(item2);
			Item item3 = new Item();
			item3.setId("3");
			item3.setName("��籩 (2012)");
			item3.setSummary("����־ʿ��ľ�����������󺺼��װ�֮���߻�����籩���ƻ�����һ����һ������֯ʧȥ��ϵ���ϵ��µ�����������绪������");
			item3.setImageUri("http://192.168.1.105:8080/RecSysServer/image/storm.jpg");
			list.add(item3);
		
		return list;
	}
}