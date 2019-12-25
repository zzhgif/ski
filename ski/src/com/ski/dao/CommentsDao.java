package com.ski.dao;

import java.util.List;
import java.util.Map;

import com.ski.bean.Comments;

public interface CommentsDao {
	
	/**
	 *    查询所有的评论
	 * @return
	 */
	public List<Comments> querAll();
	
	/**
	 * 根据评论编号查询相应的评论
	 * @param com_id  
	 * @return
	 */
	public Map<String, Object> query(String com_id);
	
	/**
	 * 插入一条评论
	 * @param comment
	 * @return
	 */
	public int insert(Comments comment);
	
	/**
	 * 根据评论编号对评论进行修改
	 * @param comment
	 * @return
	 */
	public int alter(Comments comment);
	
	/**
	 * 根据评论编号对评论进行删除
	 * @param com_id
	 * @return
	 */
	public int delete(String com_id);
	
	/**
	 * 根据评论编号获取评论内容
	 * @param com_id
	 * @return
	 */
	public String getCom_content(String com_id);

}
