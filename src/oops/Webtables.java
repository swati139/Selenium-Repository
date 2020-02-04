package oops;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Webtables {

	public static void main(String[] args) {

		
		WebDriver driver=new FirefoxDriver();
		driver.get("https://money.rediff.com/sectors/bse/infra");
		driver.manage().window().maximize();
		
		//reading data from 5th row and 1st column
		System.out.println(driver.findElement(By.xpath("//*[@id='leftcontainer']/div[2]/div[2]/table/tbody/tr[5]/td[1]/a")).getText());
		
        //No. of rows in all tables in a page
		List <WebElement> r =driver.findElements(By.tagName("tr"));
		 System.out.println(r.size());
		 
		 //No. of row in a webtable
		 WebElement table=driver.findElement(By.xpath("//*[@id='leftcontainer']/div[2]/div[2]/table/tbody"));
		
		 List <WebElement> rows =table.findElements(By.tagName("tr"));
		 System.out.println(rows.size());
		 int x= rows.size();
		 //Alt code to find rows in Webtable
		 List <WebElement> row =table.findElements(By.xpath("//*[@id='leftcontainer']/div[2]/div[2]/table/tbody/descendant::tr"));
		 System.out.println(row.size());
		 	 
 
		 int i;
		//String xpath1="tr[";
		 //String xpath2="]/td[1]/a";
		 		 
		for(i=1;i<x;i++)
		{	 
		 System.out.println(table.findElement(By.xpath("tr[" + i +"]/td[1]/a")).getText());
		 		  
//		   String str=table.findElement(By.xpath("tr[" + i +"]/td[1]/a")).getText();
//		  
//		  System.out.println(str);
//			
//		 if(str=="Bharti Airtel Ltd.")
//		 
//		  System.out.println("Pass");
//		  System.out.println(table.findElement(By.xpath("tr[" + i +"]/td[6]"))); 
		 //To get no of columns
	      //----------------------
		 	
		 	
 		} 
	}}



		 
		 
		
	


