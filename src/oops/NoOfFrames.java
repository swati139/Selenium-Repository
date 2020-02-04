package oops;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class NoOfFrames {

	public static void main(String[] args) {
		
		WebDriver driver=new FirefoxDriver();
		driver.get("https://docs.oracle.com/javase/7/docs/api/");
		driver.manage().window().maximize();
		
		//Count number of frames  in the page and count the number of links in each frame
		
		List <WebElement> frame = driver.findElements(By.tagName("frame"));
		System.out.println("The number of frames in the page is " + frame.size());
		
		int i; 
		for(i=0;i<frame.size();i++)
		{	
			List <WebElement> links= driver.switchTo().frame(i).findElements(By.tagName("a"));
			
			//System.out.println(driver.switchTo().frame(i).findElement(By.tagName("a")).getText());
			//System.out.println(links.get(5));
				
			System.out.println(links.size());
			driver.switchTo().parentFrame();
			
			
			
	

	}


	}}