package test.request;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;



/**
 * 
 * @author adj
 * 
 */
public class Item implements Serializable {

	private String id;
	private String name;
	private String summary;
	private String imageUri;

	/*
	 * 无参构造 测试完修改
	 */
	public Item() {
		setName("网络错误");
		setSummary("错误");
		setImageUri("asd");
	}

	/*
	 * json字符串构造
	 */


	/*
	 * 参数构造
	 */
	public Item(String id, String name, String summary, String imageUri) {
		this.id = id;
		this.name = name;
		this.summary = summary;
		this.imageUri = imageUri;
	}

	/*
	 * 新线程获取图片
	 */


	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSummary() {
		return summary;
	}

	public void setSummary(String summary) {
		this.summary = summary;
	}

	public String getImageUri() {
		return imageUri;
	}

	public void setImageUri(String imageUri) {
		this.imageUri = imageUri;
	}



	/*
	 * 读取图片线程类
	 */


}
