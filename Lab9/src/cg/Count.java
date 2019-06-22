package cg;
import java.util.*;
public class Count {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter String");
		String s=sc.next();
		char ch[]=s.toCharArray();
		Count c=new Count();
		c.countCharacter(ch);
	}
	public Map<Character,Integer> countCharacter(char ch[])
	{
		Map<Character,Integer> m=new HashMap<Character,Integer>();
		List<Character> l=new ArrayList<Character>();
		Set<Character> s=new HashSet<Character>();
		for(int i=0;i<ch.length;i++)
		{
			l.add(ch[i]);
			s.add(ch[i]);
		}
		Collections.sort(l);
		for(Character a:s)
		{	
			m.put(a, Collections.frequency(l, a));
		}
		System.out.println(m);
		return m;
	}

}
