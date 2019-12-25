package com.ski.bean;

import java.util.Date;
//评论表		
public class Comments {
	private	Integer com_id;//评论编号
	private	Integer user_id;//用户编号
	private	String com_content;//评论内容
	private	Date com_time;//评论时间
	
	
	
	public Comments() {
		super();
	}


	public Comments(Integer com_id, Integer user_id, String com_content, Date com_time) {
		super();
		this.com_id = com_id;
		this.user_id = user_id;
		this.com_content = com_content;
		this.com_time = com_time;
	}


	public Integer getCom_id() {
		return com_id;
	}


	public void setCom_id(Integer com_id) {
		this.com_id = com_id;
	}


	public Integer getUser_id() {
		return user_id;
	}


	public void setUser_id(Integer user_id) {
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


	@Override
	public String toString() {
		return "Comment [com_id=" + com_id + ", user_id=" + user_id + ", com_content=" + com_content + ", com_time="
				+ com_time + "]";
	}
	
	
}

