package com.ski.utils;

import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Properties;

import javax.sql.DataSource;

import com.alibaba.druid.pool.DruidDataSourceFactory;

public class JDBCDataUtils {
	private static DataSource ds;
	
	static {	
		try {
			Properties pro=new Properties();
			pro.load(JDBCDataUtils.class.getClassLoader().getResourceAsStream("druid.properties"));
			ds=DruidDataSourceFactory.createDataSource(pro);
		} catch (IOException e) {
			e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public static Connection getConnection() {
		try {
			return ds.getConnection();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return null;
	}
	
	private static void closeObject(Connection conn) throws SQLException{
		if (conn!=null) {
			conn.close();
		}
	}
	
	private static void closeObject(PreparedStatement stat) throws SQLException{
		if (stat!=null) {
			stat.close();
		}
	}
	
	private  static void closeObject(ResultSet rs) throws SQLException{
		if (rs!=null) {
			rs.close();
		}
	}
	
	public  static void close(Connection conn,PreparedStatement pstat){
		try {
			closeObject(pstat);
		} catch (SQLException e) {}finally {
			try {
				closeObject(conn);
			} catch (SQLException e) {}
		}
	}
	
	public static void close(Connection conn,PreparedStatement pstat,ResultSet rs){
		try {
			closeObject(rs);
		} catch (SQLException e) {}finally {
			try {
				closeObject(pstat);
			} catch (SQLException e) {}finally {
				try {
					closeObject(conn);
				} catch (SQLException e) {}
			}
		}	
	}
	 
	public static DataSource getDataSource(){
	        return  ds;
	}

}
