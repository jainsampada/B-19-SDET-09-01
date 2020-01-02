package TestNg;


import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;
public class Demo {
@BeforeSuite
public void Launch()
{
	System.out.println("Before Suite");
}

@AfterSuite
public void Close()
{
	System.out.println("After Suite");
}
@BeforeClass
public void BeforeClass()
{
	System.out.println("Before Class");
}
@AfterClass
public void AfterClass()
{
	System.out.println("After Class");
}
@BeforeTest
public void Beforete()
{
	System.out.println("Before Test");
}
@AfterTest
public void Afterte()
{
	System.out.println("After Test");
}
@Test
public void Login()
{
	System.out.println("Test Case 1");
}
@Test
public void Logout()
{
	System.out.println("Test Case 2");
}
@Test
public void Check()
{
	System.out.println("Test Case 3");
}
}
