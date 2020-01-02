package TestNgApp;

import org.testng.annotations.AfterGroups;
import org.testng.annotations.BeforeGroups;
import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class LoginTest extends Driver{
String actualTitle,expTitle="Demo";
@BeforeGroups
public void BefGroup()
{
	System.out.println("Before groups");
}

@AfterGroups
public void AftGroup()
{
	System.out.println("After groups");
}
	@Test(groups={"Smoke","Positive"},priority=0)
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
	@Test(groups={"Smoke"},priority=2)
	public void Login()
	{
		driver.findElement(By.id("txtUsername")).sendKeys("admin");
		driver.findElement(By.id("txtPassword")).sendKeys("admin");
		driver.findElement(By.id("btnLogin")).submit();
	}
	@Test(groups={"Sanity"},dependsOnMethods="Login")
	public void Logou()
	{
		System.out.println("Logout");
	}
	@Test(groups={"Smoke"},priority=1)
	public void check()
	{
		System.out.println("Check ascending Condition");
	}
}
