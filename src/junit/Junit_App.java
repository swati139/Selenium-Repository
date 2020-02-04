package junit;

import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;

public class Junit_App {
	public WebDriver driver;
	
	@Before
	public void launchApp()
	{
		driver=new FirefoxDriver();
		driver.get("http://facebook.com");
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		driver.manage().window().maximize();
	}
	@After
	public void closeApp()
	{
		driver.close();
	}
	@Test
	public void test1()
	{
		driver.findElement(By.id("email")).sendKeys("dfsf");
		
		Assert.assertEquals(true, driver.findElement(By.id("pass")).isDisplayed());
		Assert.assertEquals(true, driver.findElement(By.id("pass")).isEnabled());
		System.out.println(driver.getTitle());
		
	
	}
		
	@Test
	public void test2()
	{
        driver.findElement(By.id("email")).sendKeys("dfsf");
		
		Assert.assertEquals(false, driver.findElement(By.id("pass")).isDisplayed());
		Assert.assertEquals(true, driver.findElement(By.id("pass")).isEnabled());
		System.out.println(driver.getTitle());
	}
		
	@Ignore@Test
	public void e1()
	{
		System.out.println("This is Test3");
	}
		

}
