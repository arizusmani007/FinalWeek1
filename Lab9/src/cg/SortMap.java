package cg;

import java.util.*;

public class SortMap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			Map<Integer,Integer> m=new HashMap<Integer,Integer>();
			m.put(1, 100);
			m.put(2, 200);
			m.put(3, 100);
			m.put(10, 540);
			m.put(6, 700);
			SortMap sm=new SortMap();
			sm.getValues(m);
	}
	public List<Integer> getValues(Map<Integer,Integer> m)
	{
		List<Integer> l=new ArrayList<Integer>(m.values());
		Collections.sort(l);
		System.out.println(l);
		return l;
		
		
	}
	

}
