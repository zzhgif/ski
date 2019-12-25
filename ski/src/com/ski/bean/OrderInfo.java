package com.ski.bean;

import java.util.Date;
//订单表			
public class OrderInfo {
	private	Integer order_id; //订单编号
	private	String ski_id;//商品编号
	private	Integer	count;//商品数量
	private	Date order_data;//订单时间
	private	Integer rec_id;//收货编号
	private	Integer user_id;//用户编号	
	
	
	public OrderInfo() {
		super();
	}

	public OrderInfo(Integer order_id, String ski_id, Integer count, Date order_data, Integer rec_id, Integer user_id) {
		super();
		this.order_id = order_id;
		this.ski_id = ski_id;
		this.count = count;
		this.order_data = order_data;
		this.rec_id = rec_id;
		this.user_id = user_id;
	}

	public Integer getOrder_id() {
		return order_id;
	}

	public void setOrder_id(Integer order_id) {
		this.order_id = order_id;
	}

	public String getSki_id() {
		return ski_id;
	}

	public void setSki_id(String ski_id) {
		this.ski_id = ski_id;
	}

	public Integer getCount() {
		return count;
	}

	public void setCount(Integer count) {
		this.count = count;
	}

	public Date getOrder_data() {
		return order_data;
	}

	public void setOrder_data(Date order_data) {
		this.order_data = order_data;
	}

	public Integer getRec_id() {
		return rec_id;
	}

	public void setRec_id(Integer rec_id) {
		this.rec_id = rec_id;
	}

	public Integer getUser_id() {
		return user_id;
	}

	public void setUser_id(Integer user_id) {
		this.user_id = user_id;
	}

	@Override
	public String toString() {
		return "OrderInfo [order_id=" + order_id + ", ski_id=" + ski_id + ", count=" + count + ", order_data="
				+ order_data + ", rec_id=" + rec_id + ", user_id=" + user_id + "]";
	}
	
	
	
}
