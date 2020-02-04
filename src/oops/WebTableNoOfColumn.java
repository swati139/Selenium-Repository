package oops;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class WebTableNoOfColumn {

	public static void main(String[] args) {
		
			WebDriver driver=new FirefoxDriver();
			driver.get("https://money.rediff.com/sectors/bse/infra");
			driver.manage().window().maximize();
			
			WebElement header=driver.findElement(By.xpath("//*[@id='leftcontainer']/div[2]/div[2]/table/thead/tr"));
		 	List <WebElement> column=header.findElements(By.tagName("th"));
		 	 System.out.println(column.size());
		 	 
		 	int j;
		 	
		 	for(j=1;j<=column.size();j++){
		 		
		 		System.out.println(header.findElement(By.xpath("th["+ j +"]")).getText());
		 		
		 	}}	

		




	}


