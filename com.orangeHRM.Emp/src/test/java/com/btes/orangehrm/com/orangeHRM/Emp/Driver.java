package com.btes.orangehrm.com.orangeHRM.Emp;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;



public class Driver {
	String path;
	WebDriver driver;
	@BeforeSuite
	public void Launch()
	{
		path=System.getProperty("user.dir")+"//Drivers//chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", path);
		
		driver=new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/");
		
	}
	@AfterSuite
	public void Close_Browser()
	{
		driver.close();
	}

}
