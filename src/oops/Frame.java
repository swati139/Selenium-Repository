package oops;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Frame {

	public static void main(String[] args) throws Exception {
		
		WebDriver driver=new FirefoxDriver();
		driver.get("http://docs.oracle.com/javase/7/docs/api/");
		driver.manage().window().maximize();
		
		WebElement f1=driver.findElement(By.name("packageListFrame"));
	    WebElement f2=driver.findElement(By.name("packageFrame"));
		
	    List<WebElement> links=driver.switchTo().frame(f1).findElements(By.tagName("a"));
	    
		int i;
		
		for(i=1;i<links.size();i++)
			
			links.get(i).click();
		    Thread.sleep(10000);
		    driver.switchTo().parentFrame();
		    List<WebElement> l=driver.switchTo().frame(f2).findElements(By.tagName("a"));
		    Thread.sleep(10000);
		    System.out.println(l.size());
		    driver.switchTo().parentFrame();
		    driver.switchTo().frame(f1);
		    Thread.sleep(10000);	   	   		

	}

}

