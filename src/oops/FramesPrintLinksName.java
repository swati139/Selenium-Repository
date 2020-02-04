package oops;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FramesPrintLinksName {

	public static void main(String[] args) {
		

		WebDriver driver=new FirefoxDriver();
		driver.get("https://docs.oracle.com/javase/7/docs/api/");
		driver.manage().window().maximize();
		
		//Creating WebElement for Frame
		WebElement f1=driver.findElement(By.name("packageListFrame"));
		//Switch focus to Frame
		List <WebElement> links=driver.switchTo().frame(f1).findElements(By.tagName("a"));
		
		int i;
		for(i=0;i<links.size();i++)
			
			System.out.println(links.get(i).getText());
		
		

	}

}
