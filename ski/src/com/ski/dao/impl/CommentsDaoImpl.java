package com.ski.dao.impl;

import java.util.List;
import java.util.Map;

import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;

import com.ski.bean.Comments;
import com.ski.dao.CommentsDao;
import com.ski.utils.JDBCDataUtils;

public class CommentsDaoImpl implements CommentsDao{
	JdbcTemplate template =null;
	
	public CommentsDaoImpl(){
		template=new JdbcTemplate(JDBCDataUtils.getDataSource());
	}

	@Override
	public List<Comments> querAll() {
		String sql="selete * from comments";
		List<Comments>list =template.query(sql, new BeanPropertyRowMapper<Comments>(Comments.class));
		return list;
	}

	@Override
	public Map<String, Object> query(String com_id) {
		String sql="select * from comments where com_id=?";
		return template.queryForMap(sql, com_id);
	}

	@Override
	public int insert(Comments comment) {
		String sql="insert into comments values(null,?,?,?)";
		return template.update(sql, comment.getUser_id(),comment.getCom_content(),comment.getCom_time());
	}

	@Override
	public int alter(Comments comment) {
		String sql="update comments set user_id = ?, com_content= ?,com_time=? where com_id = ?";
		return template.update(sql, comment.getUser_id(),comment.getCom_content(),comment.getCom_time(),comment.getCom_id());
	}

	@Override
	public int delete(String com_id) {
		String sql="delete from comments where com_id = ?";
		return template.update(sql, com_id);
	}

	@Override
	public String getCom_content(String com_id) {
		String sql="selete com_content from comments where com_id=?";
		return template.queryForObject(sql, String.class, com_id);
	}

}
