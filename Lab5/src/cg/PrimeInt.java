package cg;

import java.util.Scanner;

public class PrimeInt {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter n");
			int n=sc.nextInt();
			PrimeInt p=new PrimeInt();
			for(int i=2;i<=n;i++)
			{
				p.findPrime(i);
			}
	}
	public void findPrime(int n)
	{
		int c=0;
		for(int i=1;i<=n;i++)
		{
			if(n%i==0)
				c++;
		}
		if(c==2)
			System.out.println(n);
		
	}

}
