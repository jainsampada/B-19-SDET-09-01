package ExceptionHandlingdemo;

public class InvalidAgeExcetion extends Throwable{
/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

public InvalidAgeExcetion()
{
	System.out.println("Age can not be greater then 18");
}
}
