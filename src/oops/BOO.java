package oops;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BOO {

	public static void main(String[] args) {
		
				WebDriver driver=new FirefoxDriver();
				driver.get("http://facebook.com");
				driver.manage().window().maximize();
		        driver.findElement(By.id("email")).sendKeys("Swati");
		        driver.findElement(By.id("pass")).sendKeys("Shaha");
		        driver.findElement(By.id("day")).sendKeys("24");

	}

}
