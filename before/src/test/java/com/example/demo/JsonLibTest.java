/**  
 * @Title: JsonLibTest.java
 * @Package com.example.demo
 * @Description: TODO
 * @author zx
 * @date 2018年8月15日
 */
package com.example.demo;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import net.sf.json.JSONObject;

/**
 * ClassName: JsonLibTest 
 * @Description: TODO
 * @author zx
 * @date 2018年8月15日
 */
public class JsonLibTest {

	/**
	 * @Description: TODO
	 * @param @param args   
	 * @return void  
	 * @throws
	 * @author zx
	 * @date 2018年8月15日
	 */
	public static void main(String[] args) {
		Map<String,String> map = new HashMap<String,String>();
		map.put("1", "v1");
		map.put("2", "v2");
		List<String> list = new ArrayList<String>();
		list.add("A");
		list.add("B");
		A a = new A();
		B b = new B();
		b.setId("b");
		b.setMap(map);
		b.setStrList(list);
		B b1 = new B();
		b1.setId("b1");
		b1.setMap(map);
		b1.setStrList(list);
		B b2 = new B();
		b2.setId("b2");
		b2.setMap(map);
		b2.setStrList(list);
		
		List<B> listB = new ArrayList<B>();
		listB.add(b);
		listB.add(b1);
		listB.add(b2);
		
		Map<String,B> mapB = new HashMap<String,B>();
		mapB.put("key1", b);
		mapB.put("key2", b1);
		mapB.put("key3", b2);
		a.setId("a1");
		a.setB(b);
		a.setList(listB);
		a.setMap(mapB);
		JSONObject obj = JSONObject.fromObject(a);
		System.out.println(obj.toString());
		JSONObject obj1 = JSONObject.fromObject(obj.toString());
		System.out.println(obj1);
		A a1 = (A)JSONObject.toBean(obj1, A.class);
		System.out.println(JSONObject.fromObject(a1));
		
	}

}
