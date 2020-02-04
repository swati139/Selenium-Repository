package oops;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Assignment {

	public static void main(String[] args) {
		
		WebDriver driver =new FirefoxDriver();
		driver.get("http://flipkart.com");
		driver.manage().window().maximize();
		
		
		

	}

}
