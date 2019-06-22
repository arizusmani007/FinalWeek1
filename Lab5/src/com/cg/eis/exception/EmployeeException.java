package com.cg.eis.exception;

public class EmployeeException extends Exception {
	private double salary;
	public EmployeeException(String msg,double salary) {
		super(msg);
		this.salary=salary;
		
	}
	public EmployeeException() {
	// TODO Auto-generated constructor stub
}
	@Override
	public String toString() {
		return "EmployeeException [salary=" + salary + "]"+super.getMessage();
	}
	
}
