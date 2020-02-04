package oops;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class MultipleWindow {

	public static void main(String[] args) throws InterruptedException {
		 WebDriver driver = new FirefoxDriver();
		 driver.get("http://toolsqa.com/automation-practice-switch-windows/");
		 driver.manage().window().maximize();
		 String parentWindowHandle = driver.getWindowHandle();
		 System.out.println("Parent window's handle -> " + parentWindowHandle);
		 
		 WebElement clickElement = driver.findElement(By.id("button1")); 
		 
		 for(int i = 0; i < 3; i++)
		 {
		 clickElement.click();
		 Thread.sleep(3000);
		 }
		 
		 Set<String> allWindowHandles = driver.getWindowHandles();
		 
		 for(String handle : allWindowHandles)
		 {
		 System.out.println("Window handle - > " + handle);
		 }
		 
		 }

	}


