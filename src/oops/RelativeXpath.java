package oops;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class RelativeXpath {

	public static void main(String[] args) 
	{
		WebDriver driver=new FirefoxDriver();
		driver.get("http://facebook.com");
		driver.manage().window().maximize();
		
//         List <WebElement> elements=driver.findElements(By.xpath("//*[contains(@id,'c')]"));
//	{
//		
//         int i;
//         for(i=0;i<elements.size();i++)
//		{
//			System.out.println(elements.get(i).getText());
//	}
		//Getting all parent elements
        /* List <WebElement> elements1=driver.findElements(By.xpath("//select[@id='day']/ancestor::*"));
     	
         {
             int j;
            for(j=0;j<elements1.size();j++)
  		{
    			System.out.println(elements1.get(j).getText());
    	}*/
		//To get all links above day
              /*List <WebElement> links = driver.findElements(By.xpath("//select[@id='day']/preceding::a"));
              {
            	  int l;
                  for(l=0;l<links.size();l++)
        		{
         			System.out.println(links.get(l).getText());
         	}*/
                  //To get all the values in day drop down
                 /* List <WebElement> values = driver.findElements(By.xpath("//select[@id='month']/descendant::*"));
                  {
                	  int l;
                      for(l=1;l<values.size();l++)
            		{
             			System.out.println(values.get(l).getText());
             	}*/
                 
		//To get all the values in day drop down
         List <WebElement> values = driver.findElements(By.xpath("//select[@id='day']/following::a"));
         {
       	  int k;
             for(k=0;k<values.size();k++)
   		{
    			System.out.println(values.get(k).getText());
    	}
              }
		}	
}




