package com.ski.dao;

import java.util.List;

import com.ski.bean.CarsInfo;


public interface CarsInfoDao {
	/**
	 * 查询所有购物车
	 * @return
	 */
	public List<CarsInfo> querAll();
	
	/**
	 * 根据购物车编号，查询相应的购物车信息
	 * @param cart_id
	 * @return
	 */
	public CarsInfo query(String cart_id);
	
	/**
	 * 增加一个购物车
	 * @param carsInfo
	 * @return
	 */
	public int insert(CarsInfo carsInfo);
	
	/**
	 * 根据购物车编号，修改购物车中信息
	 * @param carsInfo
	 * @return
	 */
	public int alter(CarsInfo carsInfo);
	
	/**
	 * 根据购物车编号，移除相应的购物车
	 * @param cart_id
	 * @return
	 */
	public int delete(String cart_id);
}
