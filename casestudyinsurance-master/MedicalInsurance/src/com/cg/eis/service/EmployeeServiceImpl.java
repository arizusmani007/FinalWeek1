package com.cg.eis.service;
import java.util.*;

import com.cg.eis.bean.Employee;

public class EmployeeServiceImpl implements EmployeeService {
	
	static Map<Integer,Employee> emp=new TreeMap<Integer,Employee>();

	@Override
	public boolean addEmployee(Employee ob) {
		// TODO Auto-generated method stub
		emp.put(ob.getId(),ob);
		return true;
	}

	
	public Employee findScheme(int id) {
		// TODO Auto-generated method stub
		Employee ob=emp.get(id);
		String scheme="";
		if(ob.getSalary()>5000.00 && ob.getSalary()<20000.00 && ob.getDesignation().equals("System Associate"))
			//System.out.println("Scheme C");
			scheme="Scheme C";
			else if(ob.getSalary()>=20000.00 && ob.getSalary()<40000.00 && ob.getDesignation().equals("Programmer"))
			//System.out.println("Scheme B");
			scheme="Scheme B";
			else if(ob.getSalary()>=40000.00 && ob.getDesignation().equals("Manager"))
			//System.out.println("Scheme A");
			scheme="Scheme A";
			else if(ob.getSalary()<=5000.00 && ob.getDesignation().equals("Clerk"))
			//System.out.println("No Scheme");
			scheme="No Scheme";
			else 
			System.out.println("Not an Employee");
			ob.setInsuranceScheme(scheme);
		return ob;
	}

	@Override
	public boolean display() {
		// TODO Auto-generated method stub
		Collection<Employee> vc=emp.values();
		List<Employee> emplist=new ArrayList<Employee>(vc);
		for(Employee e:emplist)
		{
			printStatement(e);
		}
		return true;
	}
	
}
