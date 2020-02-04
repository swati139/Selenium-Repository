package oops;



	
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import com.thoughtworks.selenium.webdriven.WebDriverBackedSelenium;
	

		public class CallRc {

			public static void main(String[] args) {
				WebDriver driver=new FirefoxDriver();
				driver.get("http://facebook.com");
				driver.manage().window().maximize();
				
				driver.findElement(By.id("email")).sendKeys("Swati");
				
				WebDriverBackedSelenium s=new WebDriverBackedSelenium(driver,"http://facebook.com");
                s.type("id=pass","Swati");
                driver.findElement(By.id("day")).sendKeys("24");
                s.select("id=month", "Apr");
                
                
                
				
			}
	}

