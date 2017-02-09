package com.san.empapp.dao;

import org.springframework.jdbc.core.JdbcTemplate;

import com.san.empapp.model.Employee;
import com.san.empapp.util.ConnectionUtil;

public class EmployeeDao {
	private JdbcTemplate jdbctemplate=ConnectionUtil.getJdbcTemplate();
	public void save(Employee employee){
		String sql="insert into employee(name,designation,values(?,?)";
		Object[]params={employee.getNAME(),employee.getDESIGANTION()};
		int rows=jdbctemplate.update(sql,params);
		System.out.println("rows");
		}
		
		
	}


