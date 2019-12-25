package com.ski.bean;

import java.util.Date;
//回复表			
public class Replycommemt {
	private	Integer user_id;//用户编号
	private	String reply_content;//回复内容
	private	Date reply_time;//回复时间
	private	Integer com_id;//评论id
	
	public Replycommemt() {
		super();
	}

	public Replycommemt(Integer user_id, String reply_content, Date reply_time, Integer com_id) {
		super();
		this.user_id = user_id;
		this.reply_content = reply_content;
		this.reply_time = reply_time;
		this.com_id = com_id;
	}

	public Integer getUser_id() {
		return user_id;
	}

	public void setUser_id(Integer user_id) {
		this.user_id = user_id;
	}

	public String getReply_content() {
		return reply_content;
	}

	public void setReply_content(String reply_content) {
		this.reply_content = reply_content;
	}

	public Date getReply_time() {
		return reply_time;
	}

	public void setReply_time(Date reply_time) {
		this.reply_time = reply_time;
	}

	public Integer getCom_id() {
		return com_id;
	}

	public void setCom_id(Integer com_id) {
		this.com_id = com_id;
	}

	@Override
	public String toString() {
		return "Replycommemt [user_id=" + user_id + ", reply_content=" + reply_content + ", reply_time=" + reply_time
				+ ", com_id=" + com_id + "]";
	}
}
