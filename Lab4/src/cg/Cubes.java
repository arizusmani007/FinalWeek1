package cg;
import java.util.Scanner;
public class Cubes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number");
		int n=sc.nextInt();
		Cubes c=new Cubes();
		c.findCube(n);
	}

	public void findCube(int n)
	{
		int sum=0;
		while(n!=0)
		{
			int r=n%10;
			sum+=r*r*r;
			n=n/10;
		}
		System.out.println(sum);
	}
}
