package com.btes.orangehrm.com.orangeHRM.Emp;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class LoginTest extends Driver {
	String expTitle="OrnageHRM";
	
@Test
public void CheckTitle()
{
	Assert.assertEquals(expTitle, driver.getTitle());
	
}
@Test
public void CheckLogin()
{
	driver.findElement(By.id("txtUsername")).sendKeys("Admin");
	driver.findElement(By.id("txtPassword")).sendKeys("admin123");
	driver.findElement(By.id("btnLogin")).submit();
}
}
