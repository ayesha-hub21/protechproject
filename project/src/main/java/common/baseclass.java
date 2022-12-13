package common;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;

import java.io.File;
import java.io.IOException;
import java.util.Date;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.io.FileHandler;
import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;

public class baseclass implements ITestListener {
 
	@Override
	public void onTestSuccess(ITestResult result) {
		this.driver= ((baseclass)result.getInstance()).driver;
		try {
			shots();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}



	@Override
	public void onTestFailure(ITestResult result) {
		this.driver= ((baseclass)result.getInstance()).driver;
		try {
			shots();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public  WebDriver driver;
	

	  
	  @BeforeTest (alwaysRun = true)
	  @Parameters ({"url","brow"})
	  public void beforeTest(String url, String brow) throws InterruptedException, IOException {
		 
		 
		  if(brow.equalsIgnoreCase("chrome")  ) {
		  System.setProperty("webdriver.chrome.driver", "C:\\Users\\Ash and Adii\\Desktop\\project1\\Drivers\\chromedriver.exe");
		 driver = new ChromeDriver(); 
		 
		  }
		  else if(brow.equalsIgnoreCase("firefox")) {
			
		  System.setProperty("webdriver.gecko.driver", "C:\\Users\\Ash and Adii\\Desktop\\project1\\Drivers\\geckodriver.exe");
		 driver = new FirefoxDriver();  }
		  
		  else {
			  System.setProperty("webdriver.edge.driver", "C:\\Users\\Ash and Adii\\Desktop\\project1\\Drivers\\msedgedriver.exe");
				 driver = new EdgeDriver();  
	  }
				 
		  driver.get(url);
		driver.manage().window().maximize();
		
		
		Thread.sleep(5000);
	//shots();
	  }
	  
	  
	
	  @AfterTest (alwaysRun = true)
	  public void afterTest() {
		  
	driver.close();
	}
		
	  public void shots() throws IOException {
			Date dt = new Date();		
	String currentdt= dt.toString().replace(" ", "_").replace(":", "_");
	 File cap=  ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		FileHandler.copy(cap, new File("C:\\Users\\Ash and Adii\\Desktop\\project\\pictures\\"+currentdt+".png"));
		}
			
		public void shots_v2(String ss) throws IOException {
				File cap=  ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
				FileHandler.copy(cap, new File("C:\\Users\\Ash and Adii\\Desktop\\project\\pictures\\"+ss+".png"));
				
	  }
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
