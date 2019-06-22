package cg;
import java.util.Scanner;
public class Age {

	public static void main(String[] args)throws InvalidAgeException {
		// TODO Auto-generated method stub
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter age");
			int age=sc.nextInt();
			if(age<=15)
				throw new InvalidAgeException("Age should be above 15",age);
	}

}
