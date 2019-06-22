package cg;

import java.util.Scanner;

public class Squaresum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter n");
		int n=sc.nextInt();
		Squaresum s=new Squaresum();
		s.calculateDifference(n);
		
	}
	public int calculateDifference(int n)
	{
		
		int Sum=0;
		int x=0;
		int y=0;
		for(int i=1;i<=n;i++)
		{
			x+=Math.pow(i,2);
			y+=i;
		}
		int z=(int)Math.pow(y,2);
		Sum=x-z;
		System.out.println(Sum);
		return Sum;
	}

}
