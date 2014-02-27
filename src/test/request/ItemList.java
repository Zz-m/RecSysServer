package test.request;

import java.util.ArrayList;
import java.util.List;

public class ItemList {

	/**
	 * @param args
	 */
	private List<Item> list = new ArrayList<Item>();

	public ItemList(){}
	public ItemList(List<Item> list){
		this.list = list;
	}
	public List<Item> getList() {
		return list;
	}

	public void setList(List<Item> list) {
		this.list = list;
	}

	/*
	 * 添加元素时按照id排序
	 */
	public void add(Item item) {
		if(item.getId() == null || item.getId() == "" || list.size() == 0) {
			list.add(item);
		}else {
			for(int i = 0; i < list.size(); i++) {
				if(Integer.parseInt(list.get(i).getId()) > Integer.parseInt(item.getId()) || i == list.size()-1) {
					list.add(i, item);
					break;
				}else {
					continue;
				}
			}
		}
		
	}
	public void add(int location, Item item) {
		list.add(location, item);
	}
	public void delete(int location) {
		list.remove(location);
	}
	public int size() {
		return list.size();
	}
	public Item get(int location) {
		return list.get(location);
	}

}
