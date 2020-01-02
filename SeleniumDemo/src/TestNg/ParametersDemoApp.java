package TestNg;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;



public class ParametersDemoApp {
@Parameters({"username"})
@Test
public void login(String uname)
{
	System.out.println("Username is:"+uname);
}
}
