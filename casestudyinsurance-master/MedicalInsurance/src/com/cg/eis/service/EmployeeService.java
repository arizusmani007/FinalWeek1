package com.cg.eis.service;
import java.util.Map;
import com.cg.eis.bean.Employee;

public interface EmployeeService {
	public boolean addEmployee(Employee ob);
	public Employee findScheme(int id);
	public boolean display();
	public default void printStatement(Employee ob) {
		 
		 System.out.println("========================================");
		 System.out.println("Statement for EmployeeID: "+ob.getId());
		 System.out.println("Employee Name: "+ob.getName());
		 System.out.println("Designation: "+ob.getDesignation());
		 System.out.println("Salary: "+ob.getSalary());
		 System.out.println("Medical Insurace Scheme: "+ob.getInsuranceScheme());
		 System.out.println("========================================");
		  }
}
