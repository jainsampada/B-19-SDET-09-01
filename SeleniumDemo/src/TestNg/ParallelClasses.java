package TestNg;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class ParallelClasses {
	String path;
	WebDriver driver;
@Test 
public void Launch()
{
		
	path=System.getProperty("user.dir")+"//Drivers//chromedriver.exe";
	//System.out.println(path);
	//Setting key and path of Chrome driver
	System.setProperty("webdriver.chrome.driver", path);
	//Launching Chrome Browser
	driver=new ChromeDriver();
	//Opening facebook application to test
	driver.manage().window().maximize();
	driver.get("https://www.gmail.com");
	}
}

