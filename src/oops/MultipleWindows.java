package oops;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class MultipleWindows {

	


	public static void main(String[] args) {
		
		WebDriver driver=new FirefoxDriver();
		driver.get("https://facebook.com");
		driver.manage().window().maximize();
		
		driver.findElement(By.id("privacy-link")).click();
		driver.findElement(By.id("cookie-use-link")).click();
		String mainWindow=driver.getWindowHandle();
		/*Set<String> set =driver.getWindowHandles();
		 // Using Iterator to iterate with in windows
		 Iterator<String> itr= set.iterator();
		 while(itr.hasNext()){
		 String childWindow=itr.next();
		    // Compare whether the main windows is not equal to child window. If not equal, we will close.
		 if(!mainWindow.equals(childWindow)){
		 driver.switchTo().window(childWindow);
		 System.out.println(driver.switchTo().window(childWindow).getTitle());
		 driver.close();
		 }
		 }
		 // This is to switch to the main window
		 driver.switchTo().window(mainWindow);*/
		
		//Counting No. of window
		ArrayList windows=new ArrayList(driver.getWindowHandles());
		
		System.out.println(windows);
		
        int i;
        
        for(i=0;i<windows.size();i++)
        {
        	System.out.println(driver.switchTo().window((String)windows.get(i)).getTitle());
        	List <WebElement> links=driver.switchTo().window((String)windows.get(i)).findElements(By.tagName("a"));
        	System.out.println(links.size());
        	driver.switchTo().window((String)windows.get(i)).close();
        }
        	WebDriver driver1=driver.switchTo().window((String)windows.get(i));
       
			}}
		 /*Set<String> allWindowHandles = driver.getWindowHandles();
		 
		 for(String handle : allWindowHandles)
		 {
		 System.out.println("Window handle - > " + handle);
		 }
		 
	}}*/