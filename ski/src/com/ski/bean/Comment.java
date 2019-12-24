package com.ski.bean;

import java.util.Date;
//评论表		
public class Comment {
	private	int com_id;//评论编号
	private	int user_id;//用户编号
	private	String com_content;//评论内容
	private	Date com_time;//评论时间
	public int getCom_id() {
		return com_id;
	}
	public void setCom_id(int com_id) {
		this.com_id = com_id;
	}
	public int getUser_id() {
		return user_id;
	}
	public void setUser_id(int user_id) {
		this.user_id = user_id;
	}
	public String getCom_content() {
		return com_content;
	}
	public void setCom_content(String com_content) {
		this.com_content = com_content;
	}
	public Date getCom_time() {
		return com_time;
	}
	public void setCom_time(Date com_time) {
		this.com_time = com_time;
	}
	public Comment(int com_id, int user_id, String com_content, Date com_time) {
		super();
		this.com_id = com_id;
		this.user_id = user_id;
		this.com_content = com_content;
		this.com_time = com_time;
	}
	public Comment() {
		super();
		// TODO Auto-generated constructor stub
	}
}

