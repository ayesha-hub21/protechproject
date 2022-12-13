package testng.project;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;

public class NewTest2 {
	public static WebDriver driver;
	
	@BeforeTest
	  public void beforeTest() throws InterruptedException {
		  System.setProperty("webdriver.chrome.driver", "C:\\Users\\Ash and Adii\\Desktop\\project1\\Drivers\\chromedriver.exe");
		 driver = new ChromeDriver();  	
		driver.get("https://www.homedepot.com");
		driver.manage().window().maximize();
		
		Thread.sleep(2000);
	  }
		
		 
      @BeforeMethod
  public void gotoapp() throws InterruptedException {
     System.out.println("go to website");
    	
     System.setProperty("webdriver.chrome.driver", "C:\\Users\\Ash and Adii\\Desktop\\project1\\Drivers\\chromedriver.exe");
  		driver=new ChromeDriver();  	
			
		driver.get("https://www.homedepot.com/");
		driver.manage().window().maximize();
		
		Thread.sleep(5000);
  }
  
  @Test
  public void myaccount() throws InterruptedException {
System.out.println("click on my account");
	driver.findElement(By.xpath("//*[@id='headerMyAccount']")).click();
	  Thread.sleep(5000);
	  
	
  }
  @AfterMethod
  public void closing() {
	  driver.close();
  }
  
  @BeforeMethod
  public void gotoapp2() throws InterruptedException {
     System.out.println("go to website");

     driver.get("https://www.homedepot.com/");
		driver.manage().window().maximize();
		
		Thread.sleep(5000);
   }
  
  @Test
  public void signin() throws InterruptedException {
System.out.println("click on signin");
  
  
   driver.findElement(By.xpath(" //*[text()=' Sign in ']")).click();
  
  Thread.sleep(5000);
  } 
 
   @AfterMethod
  public void closing2() {
	  driver.close();
  }
  
  
  
}


  