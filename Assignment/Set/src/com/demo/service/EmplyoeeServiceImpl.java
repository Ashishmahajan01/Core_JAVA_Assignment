package com.demo.service;

import java.util.List;
import java.util.Scanner;
import java.util.Set;

import com.demo.beans.Employee;
import com.demo.dao.EmployeeDao;
import com.demo.dao.EmployeeDaoImpl;

public class EmplyoeeServiceImpl  implements EmployeeService{
	private EmployeeDao edao;
	

	public EmplyoeeServiceImpl() {
		super();
		this.edao = new EmployeeDaoImpl();
	}
	
	@Override
	public void addnewEmployee() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Employee Id: ");
		int id =sc.nextInt();
		System.out.println("Enter Employee Name:");
		String ename = sc.next();
		System.out.println("Enter Employee Salary:");
		double sal = sc.nextDouble();
		Employee e = new Employee(id,ename,sal);
		edao.save(e);
		
	}

	@Override
	public Set<Employee> displayAll() {
		return edao.getAll();
	}

	@Override
	public Employee displayById() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Id:");
		int id = sc.nextInt();
		Employee e = new Employee(id,null,0.0);
		Employee res =edao.DisplayById(id);
		return res;
	}

	@Override
	public Set<Employee> displayByName() {
		System.out.println("Enter Name:");
		Scanner sc = new Scanner (System.in);
		String name=sc.next();
		
		return edao.displayByName(name);
	}

	@Override
	public List<Employee> sortBySal() {
		return edao.sortBySal();
	}

	@Override
	public Set<Employee> sortByName() {
		return edao.sortByName();
	}

}
