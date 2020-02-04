package oops;

import java.io.File;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class MethodScreenSht 
{

    public WebDriver driver;
        		
	public void launchApp(String url,String sspath)throws Exception
	{
	driver=new FirefoxDriver();
	driver.get(url);
	driver.manage().window().maximize();
	
	File f=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	FileUtils.copyFile(f, new File(sspath));

	   
	}
}
