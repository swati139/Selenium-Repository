package oops;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
public class Example {

	public static void main(String[] args) {
		
     WebDriver driver=new FirefoxDriver();
     driver.get("http://facebook.com");
     driver.manage().window().maximize();
     driver.close();
	}

}
