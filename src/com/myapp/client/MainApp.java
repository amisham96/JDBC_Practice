package com.myapp.client;

import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

import com.myapp.entity.Employee;
import com.myapp.service.EmployeeService;
import com.myapp.utility.impl.DBConnectionImpl;

public class MainApp {

	static Scanner sc = new Scanner(System.in);
	static DBConnectionImpl connection = new DBConnectionImpl();
	static EmployeeService employeeService = new EmployeeService();

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		boolean flag = true;

		do {
			System.out.println("1. Insert new data");
			System.out.println("2. get all data");
			System.out.println("3. update data");
			System.out.println("4. delete data");
			System.out.println("5. Exit");
			System.out.println("Enter your choice");
			int choice = sc.nextInt();
			switch (choice) {

			case 1: {
				int result = employeeService.insertNewEmployee(createNewData());
				System.out.println(result + "row affected");
				break;
			}
			case 2: {
				List<Employee> result = employeeService.getAllEmployee();
				for (Employee employee : result) {
					System.out.println(employee.toString());
				}
				break;
			}
			case 3: {

				break;
			}
			case 4: {

				break;
			}
			case 5: {
				flag = false;
				String result = connection.closeConnection();
				System.out.println(result);
				break;
			}
			default:{
				System.err.println("Invalid choice");
				break;
			}
			}
		} while (flag);
	}

	public static Employee createNewData() {
		Employee employee = new Employee();
		System.out.println("Enter employee id");
		employee.setEmployee_id(sc.nextInt());
		sc.nextLine();
		System.out.println("Enter employee name");
		employee.setEmployee_name(sc.nextLine());
		System.out.println("Enter employee contact");
		employee.setContact(sc.nextLong());

		return employee;
	}
}
