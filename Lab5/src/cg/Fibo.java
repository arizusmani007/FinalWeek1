package cg;
import java.util.Scanner;
public class Fibo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter n");
		int n=sc.nextInt();
		
		Fibo f=new Fibo();
		f.find(n);
		f.findrecur(n);
		int s=f.findrecur(n);
		System.out.println(s);
	}
	public void find(int n)
	{
		int a=1,b=1;
		for(int i=1;i<n;i++)
		{
			int sum=a+b;
			a=b;
			b=sum;
		}
		System.out.println(a);
	}
	public int findrecur(int n)
	{
		if(n==1 || n==2)
			return 1;
		else
			return findrecur(n-1)+findrecur(n-2);
	}
	
}
