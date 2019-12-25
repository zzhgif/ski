package com.ski.dao;

import java.util.List;
import java.util.Map;

import com.ski.bean.AdminInfo;

public interface AdminInfoDao {
	
	/**
	 * 查询所有员工信息
	 * @return
	 */
	public List<AdminInfo> querAll();
	
	/**
	 * 根据员工编号，查询某一个员工信息
	 * @param emp_id
	 * @return
	 */
	public Map<String, Object> query(String emp_id);
	
	/**
	 * 插入一条员工信息
	 * @param adminInfo
	 * @return
	 */
	public int insert(AdminInfo adminInfo);
	
	/**
	 * 根据员工编号修改员工信息
	 * @param adminInfo
	 * @return
	 */
	public int alter(AdminInfo adminInfo);
	
	/**
	 *     根据员工编号删除一条员工记录
	 * @param emp_id
	 * @return
	 */
	public int delete(String emp_id);
	
	/**
	 * 根据员工编号 获取相应的员工姓名
	 * @param emp_id
	 * @return
	 */
	public String getName(String emp_id);
	
	/**
	 * 根据员工姓名查询员工编号
	 * @param emp_name
	 * @return
	 */
	public String getEmpId(String emp_name);

}
