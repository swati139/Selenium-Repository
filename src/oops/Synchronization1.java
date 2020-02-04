package oops;

import java.util.concurrent.TimeUnit;

import org.junit.rules.Timeout;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Synchronization1  {

	public static void main(String[] args) throws Exception
	{
		
		WebDriver driver=new FirefoxDriver();
		driver.get("https://facebook.com");
		//Explicit Wait
		//_______________
		Thread.sleep(10000);
		driver.manage().window().maximize();
		//Implicit Wait
		//________________
		driver.manage().timeouts().implicitlyWait(36,TimeUnit.SECONDS);
		driver.findElement(By.id("email")).sendKeys("Kishore");	
        driver.findElement(By.id("pass")).sendKeys("Kumar");
        driver.findElement(By.xpath("//*[@id='login_form']/table/tbody/tr[3]/td[2]/div/a")).click();
         WebDriverWait ww=new WebDriverWait(driver,60);
         ww.until(ExpectedConditions.titleContains("login"));
         ww.until(ExpectedConditions.numberOfElementsToBe(By.tagName("select"), 4));
         ww.until(ExpectedConditions.numberOfElementsToBeLessThan(By.tagName("a"),100));
         
       	}
	}


