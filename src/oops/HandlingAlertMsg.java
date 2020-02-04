package oops;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class HandlingAlertMsg {

	public static void main(String[] args)throws Exception {
		{
			WebDriver driver=new FirefoxDriver();
			driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
			driver.manage().window().maximize();
			
			driver.findElement(By.name("proceed")).click();
			
			//Importing Alert
			Alert alert=driver.switchTo().alert();
			System.out.println(alert.getText());
			Thread.sleep(5000);
			alert.dismiss();
			
			
			
		}

	}

}
