package cg;
import java.util.Arrays;
import java.util.Scanner;
public class Small {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number of elements");
		int n=sc.nextInt();
		int a[]=new int[n];
		System.out.println("Enter the elements");
		for(int i=0;i<n;i++)
		{
			a[i]=sc.nextInt();
		}
		Small s=new Small();
		s.getSecondSmallest(a);
	}
	public int getSecondSmallest(int a[])
	{	
		int s=0;
		Arrays.sort(a);
		s=a[1];
		System.out.println(s);
		return s;
	}

}
