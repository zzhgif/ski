package com.ski.dao;

import java.util.List;

import com.ski.bean.OrderInfo;


public interface OrderInfoDao {
	
	/**
	 * 查询得到所有订单
	 * @return
	 */
	public List<OrderInfo> querAll();
	
	/**
	 * 根据订单编号，查询得到特定订单
	 * @param rec_id
	 * @return
	 */
	public OrderInfo query(String rec_id);
	
	
	/**
	 * 增加一条订单
	 * @param orderInfo
	 * @return
	 */
	public int insert(OrderInfo orderInfo);
	
	/**
	 * 根据订单编号对订单进行修改
	 * @param orderInfo
	 * @return
	 */
	public int alter(OrderInfo orderInfo);
	
	/**
	 * 根据订单编号，删除订单
	 * @param order_id
	 * @return
	 */
	public int delete(String order_id);
}
