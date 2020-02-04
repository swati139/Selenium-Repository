package oops;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Mmethods {

	    public WebDriver driver;
	    
	    		
		public void launchApp(String url)
		{
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\MaX-DcORE\\Desktop\\SeleniumWD\\Jar\\geckodriver.exe"); 	
		driver=new FirefoxDriver();
		driver.get(url);
		driver.manage().window().maximize();
		}
				
		public void closeApp()
		{
			driver.close();				
		}
		
		public void elementAvailable(String elementLoc,boolean exp)
		{
			System.out.println("driver="+driver);
			boolean a=driver.findElement(By.id(elementLoc)).isDisplayed();
			
			if(a==exp)
			System.out.println("Pass");
			else
			System.out.println("Fail");	
		}
		public void elementsCount(String Loc,int exp)
		{
		 List <WebElement> elements=driver.findElements(By.id(Loc));
		 if(elements.size()==exp)
				System.out.println("Pass");
				else
				System.out.println("Fail");	
			}
		public void elementEnabled(String elementLoc1,boolean exp1)
		{
		System.out.println("driver="+driver);
		boolean b=driver.findElement(By.id(elementLoc1)).isEnabled();
		
		if(b==exp1)
		System.out.println("Pass");
		else
		System.out.println("Fail");
		
		}
		public void titleLength(int exp2)
		{
		String a=driver.getTitle();
		if(a.length()==exp2)
		System.out.println("Pass");
		else
		System.out.println("Fail");
			
		}
		public void containsString(String r,boolean exp3)
		{
			String c=driver.getCurrentUrl();
		
			if(c.contains(r)==exp3)
			System.out.println("Pass");
			else
			System.out.println("Fail");
			
		
		}
		public void startsWith(String k,boolean exp4)
		{
			String e=driver.getTitle();	
			if(e.startsWith(k)==exp4)
			System.out.println("Pass");
			else
			System.out.println("Fail");
			
		
		}


}


