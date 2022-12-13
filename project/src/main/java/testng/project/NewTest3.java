package testng.project;

import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.DataProvider;

public class NewTest3 {
	
	public  WebDriver driver;
	
  @Test(dataProvider = "dp")
  public void f(String n, String s) {
	  
	  
	  driver.findElement(By.xpath("hgyuyu")).sendKeys(n);
	  driver.findElement(By.xpath("hftyftyg")).sendKeys(s);
  }

  @DataProvider
  public Object[][] dp() {
    return new Object[][] {
      new Object[] { "abc@yahoo.com", "sjahsu77" },
      new Object[] { "def@gmail.com", "bhgdyugdhsg" },
    };
  }
}
