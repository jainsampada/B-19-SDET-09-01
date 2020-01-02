package TestNg;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class HardAssertionDemo {
	String path;
	WebDriver driver;
	String title="Facebook";
//@Test
//public void Launch()
//{
//path=System.getProperty("user.dir")+"//Drivers//chromedriver.exe";
////System.out.println(path);
////Setting key and path of Chrome driver
//System.setProperty("webdriver.chrome.driver", path);
////Launching Chrome Browser
//driver=new ChromeDriver();
////Opening facebook application to test
//driver.manage().window().maximize();
//driver.get("https://www.fb.com");
//Assert.assertEquals(driver.getTitle(), "Facebook – log in or sign up");//Hard Assertion
//
//System.out.println("Hello");
//
//}
	@Test
	public void Launch()
	{
		SoftAssert ast=new SoftAssert();
	path=System.getProperty("user.dir")+"//Drivers//chromedriver.exe";
	//System.out.println(path);
	//Setting key and path of Chrome driver
	System.setProperty("webdriver.chrome.driver", path);
	//Launching Chrome Browser
	driver=new ChromeDriver();
	//Opening facebook application to test
	driver.manage().window().maximize();
	driver.get("https://www.fb.com");
	ast.assertEquals(driver.getTitle(), title);//Hard Assertion
//	Assert.assertTrue(10>20, "True");
//	
	
//	Assert.assertEquals(driver.getTitle(), title);
	System.out.println("hello");
	
	}
}
