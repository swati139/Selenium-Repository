package oops;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Synchronization {

	
		
		public static void main(String[] args) throws Exception
		{
		WebDriver driver=new FirefoxDriver();
		driver.get("https://accounts.google.com/ServiceLogin/identifier?service=mail&passsive=true&flowName=GlifWebSignIn&flowEntry=AddSession");
		driver.manage().window().maximize();
		
		driver.findElement(By.id("identifierId")).sendKeys("Shantishaha25");
		Thread.sleep(5000);
		driver.findElement(By.id("identifierNext")).click();
		driver.findElement(By.xpath("//*[@id='password']/div[1]/div/div[1]/input")).sendKeys("abcdef");
		}

	}


