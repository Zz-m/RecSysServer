package server;

import java.util.ArrayList;
import java.util.List;
/**
 * 
 * @author adj
 *
 */
public class ItemList {
	

	public static List<Item> getItemList() {
		List<Item> list = new ArrayList<Item>();
		
			Item item1 = new Item();
			item1.setId("1");
			item1.setName("华尔狼111 The Wolf Of Wall Street (2013)");
			item1.setSummary("迪卡普里奥将在片中扮演长岛股票经纪人贝尔福特，他因为在上世纪90年代的一起大规模有价证券欺诈案中拒绝与警方合作，入狱20个月。");
			item1.setImageUri("http://192.168.1.105:8080/RecSysServer/image/1.jpg");
			list.add(item1);
			Item item2 = new Item();
			item2.setId("2");
			item2.setName("被嫌弃的松子的一生 Kiraware Matsuko No Issh (2006)");
			item2.setSummary("有一天父亲（香川照之饰）突然来找阿笙（瑛太饰），告诉他有个素未谋面的姑姑死了，叫他去收拾下姑姑的房子。在河边的破烂小屋里，阿笙渐渐开始了解父亲口中的姑姑，到底有着怎样的一生。 ");
			item2.setImageUri("http://192.168.1.105:8080/RecSysServer/image/2.jpg");
			list.add(item2);
			Item item3 = new Item();
			item3.setId("3");
			item3.setName("冷风暴 (2012)");
			item3.setSummary("爱国志士沈木风受命铲除大汉奸易安之。策划“冷风暴”计划的邵一夫是一名与组织失去联系的老地下党，藏身于租界华人联盟");
			item3.setImageUri("http://192.168.1.105:8080/RecSysServer/image/3.jpg");
			list.add(item3);
			Item item4 = new Item();
			item4.setId("4");
			item4.setName("神盾局特工 (2013)");
			item4.setSummary("复仇者联盟以及随后影响深远的纽约之战，让外星人和超能力者不再是坊间传说的秘密。纽约之战过后，世界格局即将重新洗牌，野心家们则蠢蠢欲动，神盾局面临前所未有的挑战。在");
			item4.setImageUri("http://192.168.1.105:8080/RecSysServer/image/4.jpg");
			list.add(item4);
			Item item5 = new Item();
			item5.setId("5");
			item5.setName("林中小屋 The Cabin In The Woods (2012)");
			item5.setSummary("他们不知道的是，自己的一举一动都在一个神秘机构的监视之下，甚至会自觉不自觉按照那群人的引导进入圈套。“无意”之中，戴娜用拉丁文念出一段咒语");
			item5.setImageUri("http://192.168.1.105:8080/RecSysServer/image/5.jpg");
			list.add(item5);
			Item item6 = new Item();
			item6.setId("6");
			item6.setName("肖申克的救赎 The Shawshank Redemption (1994)");
			item6.setSummary("表面看来，他已如瑞德那样对那堵高墙从憎恨转变为处之泰然，但是对自由的渴望仍促使他朝着心中的希望和目标前进。而关于其罪行的真相，似乎更使这一切朝前推进了一步…… ");
			item6.setImageUri("http://192.168.1.105:8080/RecSysServer/image/6.jpg");
			list.add(item6);
		
		return list;
	}
}
