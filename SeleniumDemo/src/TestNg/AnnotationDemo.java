package TestNg;


import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class AnnotationDemo {

WebDriver driver;
String path,expTitle="OrangeHRM",actualTitle;

//@BeforeClass
//public void acc()
//{
//	System.out.println("Before Class");
//}
//@BeforeMethod
//public void acc12()
//{
//	System.out.println("Before Method");
//}
//@AfterMethod
//public void acc123()
//{
//	System.out.println("After Method");
//}
@BeforeSuite
public void Launch()
{
	
	System.out.println("Before Suite");
//	//Setting Path through getProperty Method and placing it in path variable  
//	path=System.getProperty("user.dir")+"//Drivers//chromedriver.exe";
//	//System.out.println(path);
//	//Setting key and path of Chrome driver
//	System.setProperty("webdriver.chrome.driver", path);
//	//Launching Chrome Browser
//	driver=new ChromeDriver();
//	//Opening facebook application to test
//	//driver.get("https://www.facebook.com/");
//	driver.get("https://opensource-demo.orangehrmlive.com/");
}
//@BeforeTest
//public void beftest()
//{
//	System.out.println("Before Test");
//}
//@AfterTest
//public void aftetest()
//{
//	System.out.println("After Test");
//}
@Test
public void CheckTitle()
{
	actualTitle=driver.getTitle();
	if(expTitle.equals(actualTitle))
	{
		System.out.println("You are on Correct page");
	}
	else
	{
		System.out.println("Not on correct page");
	}
	System.out.println("Test method 1");
}
@Test
public void Login()
{
	driver.findElement(By.id("txtUsername")).sendKeys("admin");
	driver.findElement(By.id("txtPassword")).sendKeys("admin");
	driver.findElement(By.id("btnLogin")).submit();
	System.out.println("Test method 2");
}
@AfterSuite
public void Close_Browser()
{
	driver.close();
	//System.out.println("After Suite");
}
//@AfterClass
//public void acc1()
//{
//	System.out.println("After Class");
//}
}
