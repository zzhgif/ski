package com.ski.dao.impl;

import java.util.List;
import java.util.Map;

import org.omg.CORBA.portable.RemarshalException;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;

import com.ski.bean.Comments;
import com.ski.bean.RecInfo;
import com.ski.dao.RecInfoDao;
import com.ski.utils.JDBCDataUtils;

public class RecInfoDaoImpl implements RecInfoDao {
	JdbcTemplate template =null;
	
	public RecInfoDaoImpl(){
		template=new JdbcTemplate(JDBCDataUtils.getDataSource());
	}

	@Override
	public List<RecInfo> querAll() {
		String sql="select * from rec_info";
		List<RecInfo>list =template.query(sql, new BeanPropertyRowMapper<RecInfo>(RecInfo.class));
		return list;
	}

	@Override
	public Map<String, Object> query(String rec_id) {
		String sql="select * from rec_info where rec_id=?";
		return template.queryForMap(sql, rec_id);
	}

	@Override
	public int insert(RecInfo recInfo) {
		String sql="insert into rec_info values(null,?,?,?)";
		return template.update(sql, recInfo.getRec_address(),recInfo.getRec_name(),recInfo.getRec_phone());
	}

	@Override
	public int alter(RecInfo recInfo) {
		String sql="update comments set rec_adress= ?, rec_name= ?, rec_phone=? where rec_id = ?";
		return template.update(sql, recInfo.getRec_address(),recInfo.getRec_name(),recInfo.getRec_phone(),recInfo.getRec_id());
	}

	@Override
	public int delete(String rec_id) {
		String sql="delete from comments where rec_id=?";
		return template.update(sql, rec_id);
	}

}
