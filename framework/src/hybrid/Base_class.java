package hybrid;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class Base_class implements Framework_constants
{
	public static WebDriver driver;
	
	@BeforeMethod
	public void openapplication()
	{
		System.setProperty(GECKO_KEY,GECKO_VALUE);
		driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.get(URL);
	}
	@AfterMethod
	public void closeapp()
	{
		driver.close();
	//msg is conflictimg	
		
	}
}

	


