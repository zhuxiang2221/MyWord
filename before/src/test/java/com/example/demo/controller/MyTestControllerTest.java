/**  
 * @Title: MyTestControllerTest.java
 * @Package com.example.demo.controller
 * @Description: TODO
 * @author zx
 * @date 2018年8月6日
 */
package com.example.demo.controller;

import static org.junit.Assert.*;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.example.demo.bean.MyRequestBean;

/**
 * ClassName: MyTestControllerTest 
 * @Description: TODO
 * @author zx
 * @date 2018年8月6日
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class MyTestControllerTest {
	@Autowired
	MyTestController con;

	/**
	 * Test method for {@link com.example.demo.controller.MyTestController#Hello(java.lang.String)}.
	 */
	@Test
	public void testHello() {
		fail("Not yet implemented");
	}

	/**
	 * Test method for {@link com.example.demo.controller.MyTestController#Hello_Post(com.example.demo.bean.MyRequestBean)}.
	 */
	@Test
	public void testHello_Post() {
		fail("Not yet implemented");
	}

	/**
	 * Test method for {@link com.example.demo.controller.MyTestController#getAllProduct(com.example.demo.bean.MyRequestBean)}.
	 */
	@Test
	public void testGetAllProduct() {
		MyRequestBean req = new MyRequestBean();
		con.getAllProduct(req);
	}

}
