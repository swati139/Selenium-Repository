package oops;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class AbsoluteXpath {

	public static void main(String[] args) {
		
		WebDriver driver=new FirefoxDriver();
		driver.get("http://rediff.com");
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//html/body/div[2]/div/div[3]/p/a[1]")).click();
		//Relative Xpath
		//driver.findElement(By.xpath("//*[contains(@class, 'signin')]")).click();
		
	}

}
