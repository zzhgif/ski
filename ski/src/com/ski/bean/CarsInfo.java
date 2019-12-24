package com.ski.bean;
//购物车信息表			
public class CarsInfo {
	private	int cars_id;//购物车编号
	private	int	user_id;//用户编号
	private	String ski_id;//商品编号
	private	int	caes_count;//商品数量
	public CarsInfo() {
		super();
		// TODO Auto-generated constructor stub
	}
	public CarsInfo(int cars_id, int user_id, String ski_id, int caes_count) {
		super();
		this.cars_id = cars_id;
		this.user_id = user_id;
		this.ski_id = ski_id;
		this.caes_count = caes_count;
	}
	public int getCars_id() {
		return cars_id;
	}
	public void setCars_id(int cars_id) {
		this.cars_id = cars_id;
	}
	public int getUser_id() {
		return user_id;
	}
	public void setUser_id(int user_id) {
		this.user_id = user_id;
	}
	public String getSki_id() {
		return ski_id;
	}
	public void setSki_id(String ski_id) {
		this.ski_id = ski_id;
	}
	public int getCaes_count() {
		return caes_count;
	}
	public void setCaes_count(int caes_count) {
		this.caes_count = caes_count;
	}
	
}