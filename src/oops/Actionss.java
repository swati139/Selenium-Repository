package oops;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class Actionss {

	public static void main(String[] args)throws Exception {
		
		WebDriver driver=new FirefoxDriver();
		driver.get("https://www.naukri.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS) ;
		//Create webelement for company link
		
		WebElement companies=driver.findElement(By.xpath("//html/body/div[2]/div/ul/li[3]/a/div"));
		//create action object
		Actions action_Obj=new Actions(driver);
		
		action_Obj.moveToElement(companies).build().perform();
		driver.findElement(By.xpath("//html/body/div[2]/div/ul/li[3]/div/ul/li[2]/a")).click();
		
		//Click on the  8th element on Tools menu
	//	WebElement tools=driver.findElement(By.xpath("/html/body/div[2]/div/ul/li[4]/a/div"));
		
//		action_Obj.moveToElement(tools).build().perform();
//		
//		int i;
//		
//		for(i=0;i<9;i++)
//		{
//			action_Obj.sendKeys(Keys.DOWN).build().perform();
//		
//		}
//		    action_Obj.sendKeys(Keys.ENTER).build().perform();
		
	//DragAndDrop
		
//		action_Obj.dragAndDrop(source, target).build().perform();
//    //Right Click
//		action_Obj.contextClick().build().perform();
//	//Click and hold
//		
//		action_Obj.clickAndHold().build().perform();
		
		
		
		
		
	}
	

}
