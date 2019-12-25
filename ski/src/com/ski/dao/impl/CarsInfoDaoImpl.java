package com.ski.dao.impl;

import java.util.List;

import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;

import com.ski.bean.CarsInfo;
import com.ski.dao.CarsInfoDao;
import com.ski.utils.JDBCDataUtils;

public class CarsInfoDaoImpl implements CarsInfoDao {
	JdbcTemplate template =null;
	
	public CarsInfoDaoImpl(){
		template=new JdbcTemplate(JDBCDataUtils.getDataSource());
	}

	@Override
	public List<CarsInfo> querAll() {
		String sql="selete * from cart_info";
		List<CarsInfo>list =template.query(sql, new BeanPropertyRowMapper<CarsInfo>(CarsInfo.class));
		return list;
	}

	@Override
	public CarsInfo query(String cart_id) {
		String sql="select * from cart_info where cart_id=?";
		return template.queryForObject(sql, CarsInfo.class, cart_id);
	}

	@Override
	public int insert(CarsInfo carsInfo) {
		String sql="insert into cart_info values(null,?,?,?)";
		return template.update(sql, carsInfo.getUser_id(),carsInfo.getSki_id(),carsInfo.getCaes_count());
	}

	@Override
	public int alter(CarsInfo carsInfo) {
		String sql="update cart_info set user_id = ?, ski_id= ?,cart_count=? where cart_id = ?";
		return template.update(sql, carsInfo.getUser_id(),carsInfo.getSki_id(),carsInfo.getCaes_count(),carsInfo.getCars_id());
	}

	@Override
	public int delete(String cart_id) {
		String sql="delete from cart_info where cart_id =?";
		return template.update(sql, cart_id);
	}

}
