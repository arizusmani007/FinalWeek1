package cg;
import java.util.*;
public class SquareMap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter number of elements");
		int n=sc.nextInt();
		int a[]=new int[n];
		System.out.println("Enter elements");
		for(int i=0;i<n;i++)
		{
			a[i]=sc.nextInt();
		}
		SquareMap sm=new SquareMap();
		sm.getSquares(a);
	}
	public Map<Integer,Double> getSquares(int a[])
	{	
		List<Integer> l=new ArrayList<Integer>();
		for(int i=0;i<a.length;i++)
		{
			l.add(a[i]);
		}
		
		Map<Integer,Double> m=new HashMap<Integer,Double>();
		for(Integer i:l)
		{
			m.put(i, Math.pow(i, 2));
		}
		System.out.println(m);
		return m;
	}

}
