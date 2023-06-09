package com.demo.dao;

import java.util.List;
import java.util.Set;

import com.demo.beans.Employee;

public interface EmployeeDao {

	void save(Employee e);

	Set<Employee> getAll();

	Employee DisplayById(int id);

	Set<Employee> displayByName(String name);

	List<Employee> sortBySal();

	Set<Employee> sortByName();

}
