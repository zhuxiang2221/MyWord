/**  
 * @Title: JGitUtil.java
 * @Package com.example.demo.gittest
 * @Description: TODO
 * @author zx
 * @date 2018年8月15日
 */
package com.example.demo.gittest;

import java.io.File;

import org.eclipse.jgit.api.CloneCommand;
import org.eclipse.jgit.api.Git;
import org.eclipse.jgit.transport.UsernamePasswordCredentialsProvider;

/**
 * ClassName: JGitUtil
 * 
 * @Description: TODO
 * @author zx
 * @date 2018年8月15日
 */
public class JGitUtil {
	/**
	 * 
	 * @Description: TODO
	 * @param @param url git文件地址
	 * @param @param localPath 本地目录（注意不能存在）
	 * @param @return   
	 * @return String  
	 * @throws
	 * @author zx
	 * @date 2018年8月15日
	 */
	public static String cloneRepository(String url, String localPath) {
		try {
			System.out.println("开始下载......");
			CloneCommand cc = Git.cloneRepository().setURI(url);
			cc.setCredentialsProvider(new UsernamePasswordCredentialsProvider("zhuxiang2221","ZHUxiang@123"));
			cc.setDirectory(new File(localPath)).call();

			System.out.println("下载完成......");

			return "success";
		} catch (Exception e) {
			e.printStackTrace();
			return "error";
		}
	}

	/**
	 * @Description: TODO
	 * @param @param args
	 * @return void
	 * @throws
	 * @author zx
	 * @date 2018年8月15日
	 */
	public static void main(String[] args) {
		String localPath = "D:\\localGitTest\\test20180816";
		String url = "https://github.com/zhuxiang2221/MyWord.git";

		System.out.println(cloneRepository(url, localPath));

	}

}
