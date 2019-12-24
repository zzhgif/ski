package com.ski.bean;

import java.util.Date;
//订单表			
public class OrderInfo {
	private	int order_id; //订单编号
	private	String ski_id;//商品编号
	private	int	count;//商品数量
	private	Date order_data;//订单时间
	private	int rec_id;//收货编号
	private	int user_id;//用户编号
	public int getOrder_id() {
		return order_id;
	}
	public void setOrder_id(int order_id) {
		this.order_id = order_id;
	}
	public String getSki_id() {
		return ski_id;
	}
	public void setSki_id(String ski_id) {
		this.ski_id = ski_id;
	}
	public int getCount() {
		return count;
	}
	public void setCount(int count) {
		this.count = count;
	}
	public Date getOrder_data() {
		return order_data;
	}
	public void setOrder_data(Date order_data) {
		this.order_data = order_data;
	}
	public int getRec_id() {
		return rec_id;
	}
	public void setRec_id(int rec_id) {
		this.rec_id = rec_id;
	}
	public int getUser_id() {
		return user_id;
	}
	public void setUser_id(int user_id) {
		this.user_id = user_id;
	}
	public OrderInfo(int order_id, String ski_id, int count, Date order_data, int rec_id, int user_id) {
		super();
		this.order_id = order_id;
		this.ski_id = ski_id;
		this.count = count;
		this.order_data = order_data;
		this.rec_id = rec_id;
		this.user_id = user_id;
	}
	public OrderInfo() {
		super();
		// TODO Auto-generated constructor stub
	}
	
}
