package oops;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.PageFactory;

public class Callingg {

	public static void main(String[] args) {
		
		WebDriver driver=new FirefoxDriver();
		driver.get("http://facebook.com");
		driver.manage().window().maximize();
		
		
		PO_HomePage PO1=PageFactory.initElements(driver,PO_HomePage.class);
		PO1.uid.sendKeys("Kishore");
        PO1.pwd.sendKeys("abcd");
        PO1.link.click();
        
        PO_Registration Por=PageFactory.initElements(driver,PO_Registration.class);
        Por.uid1.sendKeys("Kishore");
	}

}
