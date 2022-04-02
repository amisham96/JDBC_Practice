package com.myapp.service;

import java.util.List;

import com.myapp.dao.DaoEmployee;
import com.myapp.entity.Employee;

public class EmployeeService {

	static DaoEmployee employeeDao = new DaoEmployee();

	public int insertNewEmployee(Employee employee) {
		return employeeDao.insertNewEmployee(employee);
	}
	
	public List<Employee> getAllEmployee(){
		return employeeDao.getAllEmployee();
	}

}
