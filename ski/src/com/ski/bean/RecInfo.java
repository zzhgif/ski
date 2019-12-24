package com.ski.bean;
//收货地址表			
public class RecInfo {
	private int rec_id;//收货编号
	private String rec_address;//收货地址
	private String rec_name;//收货姓名
	private char rec_phone;//收货电话
	public int getRec_id() {
		return rec_id;
	}
	public void setRec_id(int rec_id) {
		this.rec_id = rec_id;
	}
	public String getRec_address() {
		return rec_address;
	}
	public void setRec_address(String rec_address) {
		this.rec_address = rec_address;
	}
	public String getRec_name() {
		return rec_name;
	}
	public void setRec_name(String rec_name) {
		this.rec_name = rec_name;
	}
	public char getRec_phone() {
		return rec_phone;
	}
	public void setRec_phone(char rec_phone) {
		this.rec_phone = rec_phone;
	}
	public RecInfo(int rec_id, String rec_address, String rec_name, char rec_phone) {
		super();
		this.rec_id = rec_id;
		this.rec_address = rec_address;
		this.rec_name = rec_name;
		this.rec_phone = rec_phone;
	}
	public RecInfo() {
		super();
		// TODO Auto-generated constructor stub
	}
}

