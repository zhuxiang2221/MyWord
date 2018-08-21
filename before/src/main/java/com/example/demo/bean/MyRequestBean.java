package com.example.demo.bean;

import java.util.List;

public class MyRequestBean {
	private String time;
	private String sId;
	private List<MyProductBean> list;

	public String getTime() {
		return time;
	}

	public void setTime(String time) {
		this.time = time;
	}

	public String getsId() {
		return sId;
	}

	public void setsId(String sId) {
		this.sId = sId;
	}

	public List<MyProductBean> getList() {
		return list;
	}

	public void setList(List<MyProductBean> list) {
		this.list = list;
	}

}
