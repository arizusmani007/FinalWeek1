package cg;
import java.io. *;
public class Name {

	public static void main(String[] args)throws BlankNameException,IOException {
		// TODO Auto-generated method stub
		BufferedReader sc=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter first name");
		String firstName=sc.readLine();
		System.out.println("Enter last name");
		String lastName=sc.readLine();
		if(firstName.equals("") || lastName.equals(""))
		throw new BlankNameException("Name is blank",firstName,lastName);
		}
		

}

