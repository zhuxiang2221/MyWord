/**  
 * @Title: Product.java
 * @Package com.example.demo.entity
 * @Description: TODO
 * @author zx
 * @date 2018年8月3日
 */
package com.example.demo.entity;

import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * ClassName: Product
 * 
 * @Description: TODO
 * @author zx
 * @date 2018年8月3日
 */
@Table(name = "product")
public class Product {
	@Id
	@Column(name = "init")
	private Integer productInit;
	@Column(name = "id")
	private Integer productId;
	@Column(name = "name")
	private String productName;
	@Column(name = "contion")
	private String productContion;

	public Integer getProductInit() {
		return productInit;
	}

	public void setProductInit(Integer productInit) {
		this.productInit = productInit;
	}

	public Integer getProductId() {
		return productId;
	}

	public void setProductId(Integer productId) {
		this.productId = productId;
	}

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public String getProductContion() {
		return productContion;
	}

	public void setProductContion(String productContion) {
		this.productContion = productContion;
	}

}
