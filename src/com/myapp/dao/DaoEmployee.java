package com.myapp.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.myapp.entity.Employee;
import com.myapp.utility.impl.DBConnectionImpl;

public class DaoEmployee {
	
	static DBConnectionImpl myConnection = new DBConnectionImpl();
	
	public int insertNewEmployee(Employee employee) {
		int result = 0;
		String query = "INSERT INTO tbl_employee VALUES(?, ?, ?)";
		Connection openConnection = myConnection.createConnection();
		try {
			PreparedStatement pstmt = openConnection.prepareStatement(query);
			pstmt.setInt(1, employee.getEmployee_id());
			pstmt.setString(2, employee.getEmployee_name());
			pstmt.setLong(3, employee.getContact());
			result = pstmt.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return result;
	}
	
	public List<Employee> getAllEmployee(){
		List<Employee> data = new ArrayList<Employee>();
		String query = "SELECT * FROM tbl_employee";
		Connection openConnection = myConnection.createConnection();
		try {
			PreparedStatement pstmt = openConnection.prepareStatement(query);
			ResultSet result = pstmt.executeQuery();
			
			while(result.next()) {
				Employee emp = new Employee();
				emp.setEmployee_id(result.getInt(1));
				emp.setEmployee_name(result.getString(2));
				emp.setContact(result.getLong(3));
				
				
				data.add(emp);
			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return data;
	}
}
