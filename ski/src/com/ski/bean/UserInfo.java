package com.ski.bean;
//用户表			

public class UserInfo {
	private Integer user_id;//用户编号
	private	String user_name;//用户名
	private	String user_pwd;//用户密码
	private	String user_phone;//手机
	private String user_email;//邮箱
	
	public UserInfo() {}
	

	public UserInfo(Integer user_id, String user_name, String user_pwd, String user_phone, String user_email) {
		super();
		this.user_id = user_id;
		this.user_name = user_name;
		this.user_pwd = user_pwd;
		this.user_phone = user_phone;
		this.user_email = user_email;
	}


	public Integer getUser_id() {
		return user_id;
	}


	public void setUser_id(int user_id) {
		this.user_id = user_id;
	}


	public String getUser_name() {
		return user_name;
	}


	public void setUser_name(String user_name) {
		this.user_name = user_name;
	}


	public String getUser_pwd() {
		return user_pwd;
	}


	public void setUser_pwd(String user_pwd) {
		this.user_pwd = user_pwd;
	}


	public String getUser_phone() {
		return user_phone;
	}


	public void setUser_phone(String user_phone) {
		this.user_phone = user_phone;
	}


	public String getUser_email() {
		return user_email;
	}


	public void setUser_email(String user_email) {
		this.user_email = user_email;
	}


	@Override
	public String toString() {
		return "UserInfo [user_id=" + user_id + ", user_name=" + user_name + ", user_pwd=" + user_pwd + ", user_phone="
				+ user_phone + ", user_email=" + user_email + "]";
	}
	
}