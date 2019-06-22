package cg;

import java.util.Scanner;

public class Increasing {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter n");
		int n=sc.nextInt();
		Increasing s=new Increasing();
		if(s.checkNumber(n))
			System.out.println(n+ " is an increasing number");
		
	}
	public boolean checkNumber(int n)
	{	
		if(n==0)
			return false;
		while(n!=1)
		{
			int r=n%10;
			n=n/10;
			int s=n%10;
			if(r<s)
			return false;
		}
		
		
		return true;
	}

}
