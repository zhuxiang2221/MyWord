/**  
 * @Title: MyProductServiceImpl.java
 * @Package com.example.demo.service.impl
 * @Description: TODO
 * @author zx
 * @date 2018年8月3日
 */
package com.example.demo.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;





import tk.mybatis.mapper.entity.Example;
import tk.mybatis.mapper.entity.Example.Criteria;

import com.example.demo.dao.MyproductDao;
import com.example.demo.entity.Product;
import com.example.demo.service.MyProductService;

/**
 * ClassName: MyProductServiceImpl 
 * @Description: TODO
 * @author zx
 * @date 2018年8月3日
 */
@Service("productService")
public class MyProductServiceImpl implements MyProductService {
	@Autowired
	MyproductDao myproductDao;
	

	/* (non-Javadoc)
	 * @see com.example.demo.service.MyProductService#getLists()
	 */
	@Override
	public List<Product> getLists() {
		List<Product> list = myproductDao.selectAll();
		return list;
	}


	/* (non-Javadoc)
	 * @see com.example.demo.service.MyProductService#getListById()
	 */
	@Override
	public List<Product> getListById(String str) {
		Example ex = new Example(Product.class);
		Criteria cr = ex.createCriteria();
		ex.setOrderByClause("id ASC");
		ex.setDistinct(true);
		cr.andLike("productName", "%"+str+"%");
		
		List<Product> list = myproductDao.selectByExample(ex);
		return list;
	}


	/* (non-Javadoc)
	 * @see com.example.demo.service.MyProductService#addByBean()
	 */
	@Override
	public int addByBean(Product pro) {
		int i = myproductDao.insertSelective(pro);
		return i;
	}


	/* (non-Javadoc)
	 * @see com.example.demo.service.MyProductService#batchAdd(java.util.List)
	 */
	@Override
	public int batchAdd(List<Product> list) {
		// TODO Auto-generated method stub
		return 0;
	}


	/* (non-Javadoc)
	 * @see com.example.demo.service.MyProductService#delById(java.lang.String)
	 */
	@Override
	public int delById(String str) {
		// TODO Auto-generated method stub
		return 0;
	}


	/* (non-Javadoc)
	 * @see com.example.demo.service.MyProductService#batchDel(java.util.List)
	 */
	@Override
	public int batchDel(List<String> list) {
		// TODO Auto-generated method stub
		return 0;
	}


	/* (non-Javadoc)
	 * @see com.example.demo.service.MyProductService#updateById(com.example.demo.entity.Product)
	 */
	@Override
	public int updateById(Product pro) {
		// TODO Auto-generated method stub
		return 0;
	}


	/* (non-Javadoc)
	 * @see com.example.demo.service.MyProductService#batchUpdateByIds(java.util.List)
	 */
	@Override
	public int batchUpdateByIds(List<Product> list) {
		// TODO Auto-generated method stub
		return 0;
	}


	

}
