package hybrid;

import java.io.File;
import java.io.IOException;

import org.apache.poi.hpsf.Date;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;



public class Generic_TakesScreenshot 
{
	public static void getData(WebDriver driver) throws IOException
	{
		String photo="./photos";
		Date d=new Date();
		String d1=d.toString();
		String d2=d1.replace(":", "-");
		TakesScreenshot tss=(TakesScreenshot)driver;
		File src=tss.getScreenshotAs(OutputType.FILE);
		File dst=new File(photo+d2+".jpeg");
		FileHandler.copy(src,dst);
	}
		
		
	}
