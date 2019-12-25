package com.ski.dao.impl;

import java.util.List;

import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;

import com.ski.bean.OrderInfo;
import com.ski.dao.OrderInfoDao;
import com.ski.utils.JDBCDataUtils;

public class OrderInfoDaoImpl implements OrderInfoDao {
	JdbcTemplate template =null;
	
	public OrderInfoDaoImpl(){
		template=new JdbcTemplate(JDBCDataUtils.getDataSource());
	}

	@Override
	public List<OrderInfo> querAll() {
		String sql="selete * from order_info";
		List<OrderInfo>list =template.query(sql, new BeanPropertyRowMapper<OrderInfo>(OrderInfo.class));
		return list;
	}

	@Override
	public OrderInfo query(String rec_id) {
		String sql="select * from order_info where order_id=?";
		return template.queryForObject(sql, OrderInfo.class, rec_id);
	}

	@Override
	public int insert(OrderInfo orderInfo) {
		String sql="insert into order_info values(null,?,?,?,?,?,?)";
		return template.update(sql, orderInfo.getSki_id(),orderInfo.getCount(),orderInfo.getOrder_data(),orderInfo.getRec_id(),orderInfo.getUser_id(),orderInfo.getOrder_state());
	}

	@Override
	public int alter(OrderInfo orderInfo) {
		String sql="update order_info set ski_id = ?, count= ?,order_date=?,rec_id=?,user_id=?,order_state=? where order_id = ?";
		return template.update(sql, orderInfo.getSki_id(),orderInfo.getCount(),orderInfo.getOrder_data(),orderInfo.getRec_id(),orderInfo.getUser_id(),orderInfo.getOrder_state(),orderInfo.getOrder_state());
	}

	@Override
	public int delete(String order_id) {
		String sql="delete from order_info where order_id=?";
		return template.update(sql, order_id);
	}

}
