package oops;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class WebtableAssignment {

	public static void main(String[] args) {
		WebDriver driver=new FirefoxDriver();
		driver.get("https://money.rediff.com/sectors/bse/infra");
		driver.manage().window().maximize();
		
		 WebElement table=driver.findElement(By.xpath("//*[@id='leftcontainer']/div[2]/div[2]/table/tbody"));
			
		 List <WebElement> rows =table.findElements(By.tagName("tr"));
		 System.out.println(rows.size());
		
		 int i; 
		
		 for(i=1;i<rows.size();i++)
		 {	
			
		 //System.out.println(table.findElement(By.xpath("tr[" + i +"]/td[1]/a")).getText());
		 		  
		 String str=table.findElement(By.xpath("tr[" + i +"]/td[1]/a")).getText();
		  
		  
		 System.out.println(str);
			
  	      if(str=="Bharti Airtel Ltd.")
		 
     	  System.out.println("Pass");
		  System.out.println(table.findElement(By.xpath("tr[" + i +"]/td[6]"))); 
	 		
	 	}}	
}

	


