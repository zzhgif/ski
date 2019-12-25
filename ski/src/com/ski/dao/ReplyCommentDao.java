package com.ski.dao;

import java.util.List;
import java.util.Map;

import com.ski.bean.ReplyCommemt;

public interface ReplyCommentDao {
	
	/**
	 *     查看所有的评论信息
	 * @return
	 */
	public List<ReplyCommemt> querAll();
	
	/**
	 * 根据回复编号查询特定的一条评论
	 * @param rep_id
	 * @return
	 */
	public Map<String, Object> query(String rep_id);
	
	/**
	 * 增加一条评论信息
	 * @param replyComment
	 * @return
	 */
	public int insert(ReplyCommemt replyComment);
	
	/**
	 * 根据评论编号修改评论信息
	 * @param replyCommemt
	 * @return
	 */
	public int alter(ReplyCommemt replyCommemt);
	
	/**
	 * 根据评论编号删除评论信息
	 * @param rep_id
	 * @return
	 */
	public int delete(String rep_id);
	
}
