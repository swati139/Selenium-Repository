package oops;



import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Webtables2 {

	public static void main(String[] args) {
		WebDriver driver=new FirefoxDriver();
		driver.get("https://money.rediff.com/sectors/bse/infra");
		driver.manage().window().maximize();
		
		WebElement table=driver.findElement(By.xpath("//*[@id='leftcontainer']/div[2]/div[2]/table/tbody"));
		
		 List <WebElement> rows =table.findElements(By.tagName("tr"));
		 //int x=rows.size();
		 System.out.println(rows.size());
		 
		 

	}

}
