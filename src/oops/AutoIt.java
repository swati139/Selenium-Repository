package oops;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class AutoIt {

	public static void main(String[] args)throws Exception {
		
		WebDriver driver=new FirefoxDriver();
		driver.get("https://transfer.pcloud.com/");
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//*[@id='recipients']/div/div/div[1]/div[3]/input")).sendKeys("brijshaha@gmail.com");
		driver.findElement(By.xpath("//*[@id='sendermail']")).sendKeys("swati.bbs@gmail.com");
        driver.findElement(By.xpath("//*[@id='message']")).sendKeys("Hi");
        driver.findElement(By.xpath("//*[@id='ppaccepted']")).click();
        
        driver.findElement(By.xpath("//*[@id='upload-form']/div/div[2]/div/div[1]/div[2]/a/span/span")).click();
        Runtime.getRuntime().exec("C:\\Users\\MaX-DcORE\\Desktop\\SeleniumWD\\upload.exe");
        
        Thread.sleep(10000);
        driver.findElement(By.xpath("//*[@id='begin-transfer']")).click();
        
        
        
	}

}
