package com.san.empapp.dao;

import com.san.empapp.model.Employee;

public class TestEmployeeDao {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Employee employee=new Employee();
employee.setNAME("san");
employee.setDESIGANTION("developer");
EmployeeDao dao=new EmployeeDao();
dao.save(employee);
System.out.println(employee);
	}

}
