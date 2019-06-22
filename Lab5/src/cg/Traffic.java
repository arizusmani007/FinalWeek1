package cg;
import java.util.Scanner;
public class Traffic {
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		String choice=sc.next();
		switch(choice)
		{
		case "red":System.out.println("stop");
					break;
		case "green":System.out.println("go");
					break;
		case "yellow":System.out.println("ready");
					break;
					default:break;
		}
	}
}
