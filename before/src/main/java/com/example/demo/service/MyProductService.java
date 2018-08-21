/**  
 * @Title: MyProductService.java
 * @Package com.example.demo.service
 * @Description: TODO
 * @author zx
 * @date 2018年8月3日
 */
package com.example.demo.service;

import java.util.List;

import com.example.demo.entity.Product;

/**
 * ClassName: MyProductService 
 * @Description: TODO
 * @author zx
 * @date 2018年8月3日
 */
public interface MyProductService {
	List<Product> getLists();
	List<Product> getListById(String str);
	int addByBean(Product pro);
	int batchAdd(List<Product> list);
	int delById(String str);
	int batchDel(List<String> list);
	int updateById(Product pro);
	int batchUpdateByIds(List<Product> list);
	
}
