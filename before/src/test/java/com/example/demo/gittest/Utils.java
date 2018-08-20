/**  
 * @Title: Utils.java
 * @Package com.example.demo.gittest
 * @Description: TODO
 * @author zx
 * @date 2018年8月15日
 */
package com.example.demo.gittest;

import java.io.File;

import org.tmatesoft.sqljet.core.internal.lang.SqlParser.bool_return;

/**
 * ClassName: Utils
 * 
 * @Description: TODO
 * @author zx
 * @date 2018年8月15日
 */
public class Utils {
	public static boolean isDirExists(String localPath) {
		boolean flag = false;
		File file = new File(localPath);
		if (file.exists()) {
			if (file.isDirectory()) {
				System.out.println("dir exists");
				flag = true;
			} else {
				System.out
						.println("the same name file exists, can not create dir");
			}
		} else {
			System.out.println("dir not exists, create it ...");
			try {
				file.mkdir();
				flag = true;
			} catch (Exception e) {
				e.printStackTrace();
			}

		}

		return flag;
	}

}
