package CSSSrelector;

import java.awt.List;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GoogleDemo {
WebDriver driver;
WebElement searchbtn;
String priceonly;
String[] sortpriceonly;
int[] arr;
String path;
String get5prop;

public void zoopla_price() {

	path=System.getProperty("user.dir")+"//Drivers//chromedriver.exe";
//System.out.println(path);
System.setProperty("webdriver.chrome.driver", path);
driver= new ChromeDriver();
//driver = new ChromeDriver();
driver.manage().window().maximize();
driver.get("https://www.zoopla.co.uk/");
driver.findElement(By.id("search-input-location")).sendKeys("London");
searchbtn=driver.findElement(By.xpath("//*[contains(@value,'Search')]"));
if(searchbtn.isDisplayed()) {
//System.out.println("hello");
searchbtn.submit();
}
ArrayList<WebElement> price= (ArrayList<WebElement>)driver.findElements(By.cssSelector("[class$='text-price']"));

System.out.println(price.size());

Object []linkText =new Object[price.size()];
int i=0;

//Storing List elements text into String array
for(WebElement a: price)
{
	System.out.println(a.getText());
  //linkText[i]=a.getText().replaceAll("[^0-9]", "");
 
  //Integer.parseInt(linkText[i]);
  System.out.println("linkText  "+ linkText[i]);
  i++;
}


Arrays.sort(linkText);
for(int j=0; j<=linkText.length-1; j++) {
System.out.println(linkText[j]);
}





}
void get5thproperty() throws InterruptedException {
Thread.sleep(700);
WebElement neprop = driver.findElement(By.xpath("/html/body/div[5]/div[2]/div[1]/ul/li[6]/div/div[2]/a"));
if(neprop.isDisplayed()) {
neprop.click();
}
else {
System.out.println("notfound");
}
}


public static void main (String[] args) throws InterruptedException{
// TODO Auto-generated method stub
	GoogleDemo oo = new GoogleDemo();
oo.zoopla_price();


}

}