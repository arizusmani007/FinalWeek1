package cg;
import java.util.Scanner;
import java.math.*;

public class Square {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter n");
		int n=sc.nextInt();
		Square s=new Square();
		if(s.checkNumber(n))
			System.out.println(n+" is a power of 2");	

		
	}
	public boolean checkNumber(int n)
	{
		if(n==0)
			return false;
		while(n!=1)
		{
			if(n%2!=0)
				return false;
			n=n/2;
		}
		return true;
	}

}
