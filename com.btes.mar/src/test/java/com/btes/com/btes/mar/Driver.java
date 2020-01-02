package com.btes.com.btes.mar;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

public class Driver {
	public static String path;
	public static WebDriver driver;
	
	@BeforeSuite
	public void Launch()
	{
		
//		System.out.println("Before Suite");
//		//Setting Path through getProperty Method and placing it in path variable  
		path=System.getProperty("user.dir")+"//Drivers//chromedriver.exe";
//		//System.out.println(path);
//		//Setting key and path of Chrome driver
		System.setProperty("webdriver.chrome.driver", path);
//		//Launching Chrome Browser
		driver=new ChromeDriver();
//		//Opening facebook application to test
//		//driver.get("https://www.facebook.com/");
		driver.get("https://opensource-demo.orangehrmlive.com/");
	}
	@AfterSuite
	public void close_Browser()
	{
		driver.close();
	}
}
