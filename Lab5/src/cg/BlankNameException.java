package cg;

public class BlankNameException extends Exception {

	private String n1,n2;
	public BlankNameException(String msg,String n1,String n2)
	{
		super(msg);
		this.n1=n1;
		this.n2=n2;
		
	}
	
	public BlankNameException() {
		// TODO Auto-generated constructor stub
	}
	@Override

	public String toString() {
		return "BlankNameException [n1=" + n1 + ", n2=" + n2 + "]" + super.getMessage();
	}
}
