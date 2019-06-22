package cg;
import java.util.Arrays;
import java.util.Scanner;
public class UpperLower {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter number of objects");
			int n=sc.nextInt();
			System.out.println("Enter objects");
			String a[]=new String[n];
			for(int i=0;i<n;i++)
			{
				a[i]=sc.next();
			}
			Arrays.sort(a);
			if(n%2==0)
			{
				for(int i=0;i<n/2;i++)
				{
					a[i]=a[i].toUpperCase();
				}
				for(int i=n/2;i<n;i++)
				{
					a[i]=a[i].toLowerCase();
				}
			}
			else
			{
				for(int i=0;i<(n/2)+1;i++)
				{
					a[i]=a[i].toUpperCase();
				}
				for(int i=(n/2)+1;i<n;i++)
				{
					a[i]=a[i].toLowerCase();
				}
			}
			for(int i=0;i<n;i++)
			{
				System.out.println(a[i]);
			}
			
	}

}
