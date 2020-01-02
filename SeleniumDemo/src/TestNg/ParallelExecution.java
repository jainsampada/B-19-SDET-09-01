package TestNg;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ParallelExecution {
	String path;
	WebDriver driver;
	@Parameters("browser")
	@Test
	public void launch(String browser_name)
	{
		if(browser_name.equals("chrome")){
			path=System.getProperty("user.dir")+"//Drivers//chromedriver.exe";
			//System.out.println(path);
			//Setting key and path of Chrome driver
			System.setProperty("webdriver.chrome.driver", path);
			//Launching Chrome Browser
			driver=new ChromeDriver();
		}else if(browser_name.equals("firefox")){
			path=System.getProperty("user.dir")+"//Drivers//chromedriver.exe";
			//System.out.println(path);
			//Setting key and path of Chrome driver
			System.setProperty("webdriver.chrome.driver", path);
			//Launching Chrome Browser
			driver=new ChromeDriver();
		}
		
		//Opening facebook application to test
		driver.manage().window().maximize();
		driver.get("https://www.fb.com");
	}
}
