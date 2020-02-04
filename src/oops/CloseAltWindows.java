package oops;

import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class CloseAltWindows {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new FirefoxDriver();
		driver.get("https://www.naukri.com/psu-government-jobs");
		driver.manage().window().maximize();
		
		int i;
		for(i=0;i<8;i++)
		{		
		driver.findElement(By.xpath("//*[@id='tabJ-1']/ul/li[1]/a/img")).click();
		
		}
		
		ArrayList windows=new ArrayList(driver.getWindowHandles());
		Thread.sleep(10000);
		
		int j;
		for(j=0;j<8;j++)
		{
		driver.switchTo().window((String)windows.get(i)).close();
		j=j+1;
		}
			
			}

}
