package test.request;

import java.util.ArrayList;
import java.util.List;

public class TestAdd {

	/**
	 * @param args
	 */
	private static List<Item> list = new ArrayList<Item>();
	public static void main(String[] args) {
		TestAdd t = new TestAdd();
		t.add(new Item("6",null,null,null));
		t.add(new Item("5",null,null,null));
		t.add(new Item("4",null,null,null));
		t.add(new Item("3",null,null,null));
		t.add(new Item("2",null,null,null));
		t.add(new Item("1",null,null,null));
		for(int i = 0; i < list.size(); i++){
			System.out.println(list.get(i).getId());
		}

	}
	public void add(Item item) {
		if(item.getId() == null || item.getId() == "" || list.size() == 0) {
			list.add(item);
		}else {
			for(int i = 0; i < list.size(); i++) {
				if(Integer.parseInt(list.get(i).getId()) > Integer.parseInt(item.getId()) || i == list.size()-1) {
					if(i == list.size()-1 && Integer.parseInt(list.get(i).getId()) < Integer.parseInt(item.getId())) {
						list.add(i+1, item);
						break;
					}
					list.add(i, item);
					break;
				}else {
					continue;
				}
			}
		}
		
	}

}
