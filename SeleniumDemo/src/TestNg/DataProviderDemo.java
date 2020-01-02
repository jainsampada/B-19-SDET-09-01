package TestNg;


import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProviderDemo {
	
@DataProvider(name="CheckLogin")
public Object[][] Authenticate()
{
	Object[][] arr=new Object[3][2];
	arr[0][0]="admin";
	arr[0][1]="ad";
	
	arr[1][0]="pass";
	arr[1][1]="pass123";
	
	arr[2][0]="123demo";
	arr[2][1]="demo";
			
	return arr;
}

@Test(dataProvider="CheckLogin")
public void Login(Object uname,Object pass)
{
	System.out.println("Username is:"+uname);
	System.out.println("Password is:"+pass);
}
}
