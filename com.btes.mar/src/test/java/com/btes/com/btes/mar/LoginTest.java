package com.btes.com.btes.mar;

import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.testng.annotations.AfterGroups;
import org.testng.annotations.BeforeGroups;
import org.testng.annotations.Test;

public class LoginTest extends Driver{
	String actualTitle,expTitle="Demo";
	

	
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
		}
		
}
