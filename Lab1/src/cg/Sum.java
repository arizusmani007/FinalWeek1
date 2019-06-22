package cg;
import java.util.Scanner;
public class Sum {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter n");
		int n=sc.nextInt();
		Sum s=new Sum();
		s.calculateSum(n);
		
	}
	public int calculateSum(int n)
	{
		
		int sum=0;
		for(int i=1;i<=n;i++)
		{
			if(i%3==0 || i%5==0)
			sum+=i;
		}
		System.out.println(sum);
		return sum;
	}

}
