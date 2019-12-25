package com.ski.bean;
//商品信息表
public class SkiInfo {
	private String ski_id;//商品编号
	private String ski_name;//商品名字
	private String ski_type;//商品类型
	private Double ski_price;//商品价格
	private String ski_size;//商品大小
	private String ski_color;//商品颜色
	private String ski_des;//商品描述
	private Integer ski_state;//商品状态
	private String ski_picture;//商品图片
	
	public SkiInfo(){}

	public SkiInfo(String ski_id, String ski_name, String ski_type, Double ski_price, String ski_size, String ski_color,
			String ski_des, Integer ski_state, String ski_picture) {
		super();
		this.ski_id = ski_id;
		this.ski_name = ski_name;
		this.ski_type = ski_type;
		this.ski_price = ski_price;
		this.ski_size = ski_size;
		this.ski_color = ski_color;
		this.ski_des = ski_des;
		this.ski_state = ski_state;
		this.ski_picture = ski_picture;
	}

	public String getSki_id() {
		return ski_id;
	}

	public void setSki_id(String ski_id) {
		this.ski_id = ski_id;
	}

	public String getSki_name() {
		return ski_name;
	}

	public void setSki_name(String ski_name) {
		this.ski_name = ski_name;
	}

	public String getSki_type() {
		return ski_type;
	}

	public void setSki_type(String ski_type) {
		this.ski_type = ski_type;
	}

	public Double getSki_price() {
		return ski_price;
	}

	public void setSki_price(Double ski_price) {
		this.ski_price = ski_price;
	}

	public String getSki_size() {
		return ski_size;
	}

	public void setSki_size(String ski_size) {
		this.ski_size = ski_size;
	}

	public String getSki_color() {
		return ski_color;
	}

	public void setSki_color(String ski_color) {
		this.ski_color = ski_color;
	}

	public String getSki_des() {
		return ski_des;
	}

	public void setSki_des(String ski_des) {
		this.ski_des = ski_des;
	}

	public Integer getSki_state() {
		return ski_state;
	}

	public void setSki_state(Integer ski_state) {
		this.ski_state = ski_state;
	}

	public String getSki_picture() {
		return ski_picture;
	}

	public void setSki_picture(String ski_picture) {
		this.ski_picture = ski_picture;
	}

	@Override
	public String toString() {
		return "SkiInfo [ski_id=" + ski_id + ", ski_name=" + ski_name + ", ski_type=" + ski_type + ", ski_price="
				+ ski_price + ", ski_size=" + ski_size + ", ski_color=" + ski_color + ", ski_des=" + ski_des
				+ ", ski_state=" + ski_state + ", ski_picture=" + ski_picture + "]";
	}
	

}