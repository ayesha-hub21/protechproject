package testng.project;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

/**
 * Hello world!
 *
 */
public class App {

public static WebDriver driver;

    public static void main( String[] args ) throws InterruptedException
    {
    	System.setProperty("webdriver.chrome.driver", "C:\\Users\\Ash and Adii\\Desktop\\project1\\Drivers\\chromedriver.exe");
		driver=new ChromeDriver();  // opening browser	
		driver.get("https://www.amazon.com"); // navigating to website		
	 
		Thread.sleep(10000); 
    }
}
