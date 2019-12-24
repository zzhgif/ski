package com.ski.bean;

import java.util.Date;
//回复表			
public class Replycommemt {
	private	int user_id;//用户编号
	private	String reply_content;//回复内容
	private	Date reply_time;//回复时间
	private	int com_id;//评论id
	public int getUser_id() {
		return user_id;
	}
	public void setUser_id(int user_id) {
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
	public int getCom_id() {
		return com_id;
	}
	public void setCom_id(int com_id) {
		this.com_id = com_id;
	}
	public Replycommemt() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Replycommemt(int user_id, String reply_content, Date reply_time, int com_id) {
		super();
		this.user_id = user_id;
		this.reply_content = reply_content;
		this.reply_time = reply_time;
		this.com_id = com_id;
	}
	
}
