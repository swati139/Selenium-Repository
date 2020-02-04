package oops;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


public class Calling {

	public static void main(String[] args)throws Exception {
		
		WebDriver driver=new FirefoxDriver();
		driver.get("http://facebook.com");
		driver.manage().window().maximize();
		
		Thread.sleep(5000);
		
		PageObject PO=new PageObject();
         driver.findElement(PO.uid).sendKeys("Kishore");
         driver.findElement(PO.pwd).sendKeys("abcd");
	}

}
