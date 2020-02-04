package oops;

		import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
		public class Practice {

			public static void main(String[] args) {
				
		     /*WebDriver driver=new FirefoxDriver();
		     driver.get("http://login.yahoo.com");
		     driver.manage().window().maximize();
		     driver.close();*/
				
			 /*System.setProperty("webdriver.ie.driver", "C:\\Users\\MaX-DcORE\\Desktop\\SeleniumWD\\Jar\\IEDriverServer.exe");
				WebDriver driver=new InternetExplorerDriver();
			    driver.get("http://login.yahoo.com");
			    driver.manage().window().maximize();
			    driver.close();*/
			    
				System.setProperty("webdriver.chrome.driver", "C:\\Users\\MaX-DcORE\\Desktop\\SeleniumWD\\Jar\\chromedriver.exe");
				WebDriver driver=new ChromeDriver();
			    driver.get("http://login.yahoo.com");
			    driver.manage().window().maximize();
			    driver.close();
		     
			}
	}


