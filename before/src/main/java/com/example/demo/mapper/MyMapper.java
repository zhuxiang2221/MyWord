/**  
 * @Title: MyMapper.java
 * @Package com.example.demo.mapper
 * @Description: TODO
 * @author zx
 * @date 2018年8月3日
 */
package com.example.demo.mapper;


import tk.mybatis.mapper.common.Mapper;
import tk.mybatis.mapper.common.MySqlMapper;


/**
 * ClassName: MyMapper 
 * @Description: TODO
 * @author zx
 * @date 2018年8月3日
 */
public interface MyMapper<T> extends Mapper<T>, MySqlMapper<T> {
	
}
