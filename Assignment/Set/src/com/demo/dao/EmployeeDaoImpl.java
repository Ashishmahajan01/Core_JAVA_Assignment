package com.demo.dao;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

import com.demo.beans.Employee;

public class EmployeeDaoImpl implements EmployeeDao {
	private static Set<Employee> empset;
	static {
		empset = new HashSet<>();
		empset.add(new Employee(1,"Ashish",2500.55));
		empset.add(new Employee(2,"Deepuk",11100.55));
		empset.add(new Employee(3,"As",250));
		empset.add(new Employee(4,"nj",50));
		empset.add(new Employee(5,"Ap",25));
		empset.add(new Employee(7,"pk",10));
	}
	@Override
	public void save(Employee e) {
		empset.add(e);
		
	}

	@Override
	public Set<Employee> getAll() {
		return empset;
	}

	@Override
	public Employee DisplayById(int id) {
		for(Employee e: empset) {
			if(id == e.getEmpid())
				return e;
		}
		return null;
		
	}

	@Override
	public Set<Employee> displayByName(String name) {
		Set<Employee> res = new  HashSet<>();
		for(Employee e: empset) {
			if(name.equalsIgnoreCase(e.getEname()))
				res.add(e);
		}
		return res;
	}

	@Override
	public List<Employee> sortBySal() {
		List<Employee> res = new  ArrayList<>();
		res.addAll(empset);
		res.sort(null);
		return res;
	}

	@Override
	public Set<Employee> sortByName() {
		Comparator<Employee> comobj = (o1,o2)->{return o1.getEname().compareTo(o2.getEname());}; 
		Set<Employee> res = new  TreeSet<>(comobj);
		res.addAll(empset);
		
		return res;
	}

	

}
