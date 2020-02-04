package oops;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class MultipleWindow3 {

	public static void main(String[] args) {	        	
	        
	            //System.setProperty("webdriver.chrome.driver", "/Users/pg/Downloads/chromedriver.exe");
	            WebDriver driver=new FirefoxDriver();
	            driver.get("https://www.facebook.com/");
	            driver.findElement(By.id("terms-link")).click();
	            String mainWindow=driver.getWindowHandle();
	            Set<String> allWindow=driver.getWindowHandles();
	            Iterator<String> it=allWindow.iterator();
	            while(it.hasNext())
	            {
	                String child=it.next();
	                if(!mainWindow.equals(child))
	                {
	                    driver.switchTo().window(child);
	                    driver.findElement(By.xpath("//*[@href='/r.php?locale=en_GB']")).click();
	                    driver.close();
	                    driver.switchTo().window(mainWindow);
	                    driver.findElement(By.id("email")).sendKeys("Pankaj");
	                }
	            }
	        }
	

	}


