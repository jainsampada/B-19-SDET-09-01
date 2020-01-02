package Test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ClickLinks {
	public static void main(String[] args) {
		String path;
		WebDriver driver;
		path=System.getProperty("user.dir")+"//Drivers//chromedriver.exe";
//		//System.out.println(path);
//		//Setting key and path of Chrome driver
		System.setProperty("webdriver.chrome.driver", path);
		driver=new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("https://www.facebook.com/");
			
			driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
			
			int count = driver.findElements(By.xpath
					("//ul[contains(@class,'pageFooterLinkList')]/li/a")).size();
			
			for(int i=0;i<count;i++) {
				WebElement elm = driver.findElement(By.xpath
						("//ul[contains(@class,'pageFooterLinkList')]/li["+(i+1)+"]/a"));
				
				String linktext = elm.getText();
				String alink = elm.getAttribute("href");//
				System.out.println(linktext+"---"+alink);
				//elm.click();
				driver.navigate().to(alink);
				
				System.out.println("Current page URL-"+driver.getCurrentUrl());
				
				driver.navigate().back();
				
			 
				
				
			}
			

		}
}
