package cg;
import java.util.Arrays;
import java.util.Scanner;
public class Reverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number of elements");
		int n=sc.nextInt();
		System.out.println("Enter the elements");
		int a[]=new int[n];
		for(int i=0;i<n;i++)
		{
			a[i]=sc.nextInt();
		}
		Reverse r=new Reverse();
		r.getSorted(a);
	}
	public int getSorted(int a[])
	{	
		String b[]=new String[a.length];
		for(int i=0;i<a.length;i++)
		{
			b[i]=Integer.toString(a[i]);
		}
		for(int i=0;i<a.length;i++)
		{
			StringBuilder sb=new StringBuilder(Integer.toString(a[i]));
			sb.reverse();
			a[i]=Integer.parseInt(sb.toString());
		}
		Arrays.sort(a);
		for(int i=0;i<a.length;i++)
		{
			System.out.println(a[i]);
		}
		return a.length;
	}

}
