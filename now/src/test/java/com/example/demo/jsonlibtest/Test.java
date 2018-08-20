/**  
 * @Title: Test.java
 * @Package com.example.demo.jsonlibtest
 * @Description: TODO
 * @author zx
 * @date 2018年8月15日
 */
package com.example.demo.jsonlibtest;

import com.alibaba.fastjson.JSON;

import net.sf.json.JSONObject;

/**
 * ClassName: Test 
 * @Description: TODO
 * @author zx
 * @date 2018年8月15日
 */
public class Test {

	/**
	 * @Description: TODO
	 * @param @param args   
	 * @return void  
	 * @throws
	 * @author zx
	 * @date 2018年8月15日
	 */
	public static void main(String[] args) {
		String json = "{'title':'hello','data':[{'name':'Wallace'},{'name':'Grommit'}]}";
		long start = System.currentTimeMillis();
		MyBean bean = (MyBean)JSONObject.toBean( JSONObject.fromObject(json), MyBean.class);
		long end1 = System.currentTimeMillis();
		System.out.println("jsonlib时间："+(end1-start)+"   "+JSONObject.fromObject(bean).toString());
		long start2 = System.currentTimeMillis();
		MyBean obj1 = JSON.parseObject(json, MyBean.class);
		long end2 = System.currentTimeMillis();
		System.out.println("fastjson时间："+(end2-start2)+"   "+JSON.toJSONString(obj1));
	}

}
