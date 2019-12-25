package com.ski.bean;
//收货地址表			
public class RecInfo {
	private Integer rec_id;//收货编号
	private String rec_address;//收货地址
	private String rec_name;//收货姓名
	private String rec_phone;//收货电话
	
	public RecInfo() {
		super();
	}


	public RecInfo(Integer rec_id, String rec_address, String rec_name, String rec_phone) {
		super();
		this.rec_id = rec_id;
		this.rec_address = rec_address;
		this.rec_name = rec_name;
		this.rec_phone = rec_phone;
	}


	public Integer getRec_id() {
		return rec_id;
	}


	public void setRec_id(Integer rec_id) {
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


	public String getRec_phone() {
		return rec_phone;
	}


	public void setRec_phone(String rec_phone) {
		this.rec_phone = rec_phone;
	}

	@Override
	public String toString() {
		return "RecInfo [rec_id=" + rec_id + ", rec_address=" + rec_address + ", rec_name=" + rec_name + ", rec_phone="
				+ rec_phone + "]";
	}
}

