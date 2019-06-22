package cg;

public class InvalidAgeException extends Exception {

	private int age;
	public InvalidAgeException(String msg,int age) {
		super(msg);
		this.age=age;
		
	}
	public InvalidAgeException() {
	// TODO Auto-generated constructor stub
}
	@Override
	public String toString() {
		return "InvalidAgeException [age=" + age + "]"+super.getMessage();
	}
}
