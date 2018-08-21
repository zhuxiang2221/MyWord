/**  
 * @Title: MyBean.java
 * @Package com.example.demo.jsonlibtest
 * @Description: TODO
 * @author zx
 * @date 2018年8月15日
 */
package com.example.demo.jsonlibtest;

import java.util.List;

/**
 * ClassName: MyBean 
 * @Description: TODO
 * @author zx
 * @date 2018年8月15日
 */
public class MyBean {
	private String title;
	private List<Person> data;
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public List<Person> getData() {
		return data;
	}
	public void setData(List<Person> data) {
		this.data = data;
	}
	
	
}
