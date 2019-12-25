package com.ski.dao.impl;

import java.util.List;
import java.util.Map;

import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;

import com.ski.bean.Comments;
import com.ski.bean.ReplyCommemt;
import com.ski.dao.ReplyCommentDao;
import com.ski.utils.JDBCDataUtils;

public class ReplyCommentDaoImpl implements ReplyCommentDao{
	JdbcTemplate template =null;
	
	public ReplyCommentDaoImpl(){
		template=new JdbcTemplate(JDBCDataUtils.getDataSource());
	}

	@Override
	public List<ReplyCommemt> querAll() {
		String sql="selete * from replycomment";
		List<ReplyCommemt>list =template.query(sql, new BeanPropertyRowMapper<ReplyCommemt>(ReplyCommemt.class));
		return list;
	}

	@Override
	public Map<String, Object> query(String rep_id) {
		String sql="selete * from replycomment where rep_id=?";
		return template.queryForMap(sql, rep_id);
	}

	@Override
	public int insert(ReplyCommemt replyComment) {
		String sql="insert into replycomment values(null,?,?,?,?)";
		return template.update(sql, replyComment.getRep_id(),replyComment.getUser_id(),replyComment.getReply_content(),replyComment.getReply_time(),replyComment.getCom_id());
	}

	@Override
	public int alter(ReplyCommemt replyCommemt) {
		String sql="update replycomment set user_id = ?, reply_content  = ?,reply_time  =? ,com_id=? where rep_id = ?";
		return template.update(sql, replyCommemt.getUser_id(),replyCommemt.getReply_content(),replyCommemt.getReply_time(),replyCommemt.getCom_id(),replyCommemt.getRep_id());
	}

	@Override
	public int delete(String rep_id) {
		String sql="delete from replycomment where rep_id=?";
		return template.update(sql, rep_id);
	}

}
