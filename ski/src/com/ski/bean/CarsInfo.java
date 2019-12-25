package com.ski.bean;
//购物车信息表			
public class CarsInfo {
	private	Integer cars_id;//购物车编号
	private	Integer	user_id;//用户编号
	private	String ski_id;//商品编号
	private	Integer	caes_count;//商品数量
	
	
	public CarsInfo() {
		super();
	}


	public CarsInfo(Integer cars_id, Integer user_id, String ski_id, Integer caes_count) {
		super();
		this.cars_id = cars_id;
		this.user_id = user_id;
		this.ski_id = ski_id;
		this.caes_count = caes_count;
	}


	public Integer getCars_id() {
		return cars_id;
	}


	public void setCars_id(Integer cars_id) {
		this.cars_id = cars_id;
	}


	public Integer getUser_id() {
		return user_id;
	}


	public void setUser_id(Integer user_id) {
		this.user_id = user_id;
	}


	public String getSki_id() {
		return ski_id;
	}


	public void setSki_id(String ski_id) {
		this.ski_id = ski_id;
	}


	public Integer getCaes_count() {
		return caes_count;
	}


	public void setCaes_count(Integer caes_count) {
		this.caes_count = caes_count;
	}


	@Override
	public String toString() {
		return "CarsInfo [cars_id=" + cars_id + ", user_id=" + user_id + ", ski_id=" + ski_id + ", caes_count="
				+ caes_count + "]";
	}
	
}