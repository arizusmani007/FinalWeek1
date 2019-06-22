package com.cg.eis.exception;
import java.util.Scanner;
public class EmployeeSal {

	public static void main(String[] args)throws EmployeeException {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter salary");
		double sal=sc.nextDouble();
		if(sal<3000)
			throw new EmployeeException("Salary should be more than 3000",sal);
	}

}
