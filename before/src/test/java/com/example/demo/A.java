/**  
 * @Title: A.java
 * @Package com.example.demo
 * @Description: TODO
 * @author zx
 * @date 2018年8月15日
 */
package com.example.demo;

import java.util.List;
import java.util.Map;

/**
 * ClassName: A 
 * @Description: TODO
 * @author zx
 * @date 2018年8月15日
 */
public class A {
	private B b;
	private String id;
	private List<B> list;
	private Map<String,B> map;
	
	public List<B> getList() {
		return list;
	}
	public void setList(List<B> list) {
		this.list = list;
	}
	public Map<String, B> getMap() {
		return map;
	}
	public void setMap(Map<String, B> map) {
		this.map = map;
	}
	public B getB() {
		return b;
	}
	public void setB(B b) {
		this.b = b;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	

}
