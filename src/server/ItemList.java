package server;

import java.util.ArrayList;
import java.util.List;

public class ItemList {
	

	public static List getItemList() {
		List<Item> list = new ArrayList<Item>();
		
			Item item1 = new Item();
			item1.setId("1");
			item1.setName("华尔街之狼 The Wolf Of Wall Street (2013)");
			item1.setSummary("迪卡普里奥将在片中扮演长岛股票经纪人贝尔福特，他因为在上世纪90年代的一起大规模有价证券欺诈案中拒绝与警方合作，入狱20个月。");
			item1.setImageUri("http://192.168.1.105:8080/RecSysServer/image/thewolf.jpg");
			list.add(item1);
			Item item2 = new Item();
			item2.setId("2");
			item2.setName("被嫌弃的松子的一生 Kiraware Matsuko No Issh (2006)");
			item2.setSummary("有一天父亲（香川照之饰）突然来找阿笙（瑛太饰），告诉他有个素未谋面的姑姑死了，叫他去收拾下姑姑的房子。在河边的破烂小屋里，阿笙渐渐开始了解父亲口中的姑姑，到底有着怎样的一生。 ");
			item2.setImageUri("http://192.168.1.105:8080/RecSysServer/image/kmn.jpg");
			list.add(item2);
			Item item3 = new Item();
			item3.setId("3");
			item3.setName("冷风暴 (2012)");
			item3.setSummary("爱国志士沈木风受命铲除大汉奸易安之。策划“冷风暴”计划的邵一夫是一名与组织失去联系的老地下党，藏身于租界华人联盟");
			item3.setImageUri("http://192.168.1.105:8080/RecSysServer/image/storm.jpg");
			list.add(item3);
		
		return list;
	}
}
