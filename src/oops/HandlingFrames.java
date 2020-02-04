package oops;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class HandlingFrames {

	public static void main(String[] args) {
		WebDriver driver=new FirefoxDriver();
		driver.get("https://docs.oracle.com/javase/7/docs/api/");
		driver.manage().window().maximize();
		
		WebElement f1=driver.findElement(By.name("packageListFrame"));
		driver.switchTo().frame(f1).findElement(By.xpath("/html/body/div[2]/ul/li[1]/a")).click();
	    driver.switchTo().parentFrame();
	    
	    WebElement f2=driver.findElement(By.name("packageFrame"));
		driver.switchTo().frame(f2).findElement(By.xpath("/html/body/div/ul[1]/li[1]/a/i")).click();
		
//Count the number of frames
		
		
	}

}