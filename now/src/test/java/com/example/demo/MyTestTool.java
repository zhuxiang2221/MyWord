/**  
 * @Title: MyTestTool.java
 * @Package com.example.demo
 * @Description: TODO
 * @author zx
 * @date 2018年7月30日
 */
package com.example.demo;

import java.util.regex.Pattern;

/**
 * ClassName: MyTestTool 
 * @Description: TODO
 * @author zx
 * @date 2018年7月30日
 */
public class MyTestTool {
public static void main(String[] args) {
	 String pattern ="([1-9]\\d*\\.?\\d*)|(0\\.\\d*[1-9])";
	 boolean isMatch = Pattern.matches(pattern, "0.01");
	 System.out.println(isMatch);
}
}
