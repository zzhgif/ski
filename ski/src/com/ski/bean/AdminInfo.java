package com.ski.bean;
//管理员表
public class AdminInfo {
	private	String emp_id;//员工编号
	private	String emp_name;//员工姓名
	private	String	emp_pwd;//员工密码
	private	char emp_phone;//员工电话
	private	int	emp_state;//员工状态
	private	String emp_address;//员工地址
	public String getEmp_id() {
		return emp_id;
	}
	public void setEmp_id(String emp_id) {
		this.emp_id = emp_id;
	}
	public String getEmp_name() {
		return emp_name;
	}
	public void setEmp_name(String emp_name) {
		this.emp_name = emp_name;
	}
	public String getEmp_pwd() {
		return emp_pwd;
	}
	public void setEmp_pwd(String emp_pwd) {
		this.emp_pwd = emp_pwd;
	}
	public char getEmp_phone() {
		return emp_phone;
	}
	public void setEmp_phone(char emp_phone) {
		this.emp_phone = emp_phone;
	}
	public int getEmp_state() {
		return emp_state;
	}
	public void setEmp_state(int emp_state) {
		this.emp_state = emp_state;
	}
	public String getEmp_address() {
		return emp_address;
	}
	public void setEmp_address(String emp_address) {
		this.emp_address = emp_address;
	}
	public AdminInfo(String emp_id, String emp_name, String emp_pwd, char emp_phone, int emp_state,
			String emp_address) {
		super();
		this.emp_id = emp_id;
		this.emp_name = emp_name;
		this.emp_pwd = emp_pwd;
		this.emp_phone = emp_phone;
		this.emp_state = emp_state;
		this.emp_address = emp_address;
	}
	public AdminInfo() {
		super();
		// TODO Auto-generated constructor stub
	}
	
}