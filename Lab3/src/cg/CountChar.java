package cg;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.*;
public class CountChar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the string");
		String st=sc.next();
		char ch[]=st.toCharArray();
		List<Character> l=new ArrayList<Character>();
		Set<Character> s=new TreeSet<Character>();
		for(int i=0;i<ch.length;i++)
		{
			l.add(ch[i]);
			s.add(ch[i]);
		}
		for(Character a:s)
		{
			System.out.println("Frequency of "+a +" is "+Collections.frequency(l, a));
		}
	}

}
