package oops;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class SendKeys {

	public static void main(String[] args) {
		
		WebDriver driver=new FirefoxDriver();
		driver.get("https://facebook.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS) ;
		
		//Creating action object
		
		Actions actions_Obj=new Actions(driver);
		
		//Refresh the page
		actions_Obj.sendKeys(Keys.F5).build().perform();
		
		//Sending Control+t key to open new tab
		actions_Obj.sendKeys(Keys.CONTROL+"t").build().perform();
		
		//Sending Control+n keys to open new window
		actions_Obj.sendKeys(Keys.CONTROL+"n").build().perform();
		
		

	}

}
