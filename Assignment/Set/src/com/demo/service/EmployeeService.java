package com.demo.service;

import java.util.List;
import java.util.Set;

import com.demo.beans.Employee;

public interface EmployeeService {

	void addnewEmployee();

	Set<Employee> displayAll();

	Employee displayById();

	Set<Employee> displayByName();

	List<Employee> sortBySal();

	Set<Employee> sortByName();


}
