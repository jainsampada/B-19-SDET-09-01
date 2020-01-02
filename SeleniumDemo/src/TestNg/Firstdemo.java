package TestNg;

import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Firstdemo {
	String path;
	WebDriver driver;
	WebElement id;
	@Test
	public void Launch()
	{
	//Setting Path through getProperty Method and placing it in path variable  
		path=System.getProperty("user.dir")+"//Drivers//chromedriver.exe";
		//System.out.println(path);
		//Setting key and path of Chrome driver
		System.setProperty("webdriver.chrome.driver", path);
		//Launching Chrome Browser
		driver=new ChromeDriver();
		//Opening facebook application to test
		driver.manage().window().maximize();
		driver.get("https://www.fb.com");
		//driver.navigate().to("https://www.facebook.com/");
		//driver.findElement(By.id("login1")).sendKeys("admin");
		//driver.findElement(By.id("password")).sendKeys("admin");
		//driver.findElement(By.name("proceed")).click();
		//driver.navigate().back();
		//driver.findElement(By.linkText("Forgotten account?")).click();
		//driver.findElement(By.partialLinkText("account")).click();
		//Select sl=new Select(driver.findElement(By.id("day")));
		id=driver.findElement(By.xpath("//input[@name='email']"));
		if(id.isDisplayed())
		{
		id.sendKeys("admin");
		}
		driver.findElement(By.xpath("//input[@name='pass']")).sendKeys("admin");
		driver.findElement(By.xpath("//a[contains(text(),'Forgotten account?')]")).click();
	}	
}
