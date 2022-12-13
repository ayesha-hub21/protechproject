package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.asserts.SoftAssert;

public class part1 {

	public static WebDriver driver;
	
	@FindBy(xpath="//*[@id='nav-link-accountList']") WebElement signin;
	@FindBy(xpath="//*[text()='Start here.']") WebElement starthere;

	@FindBy(xpath="//*[text()='Connect with friends and the world around you on Facebook.']") WebElement facebooktext;
	@FindBy(xpath="//*[@name='email']") WebElement fbEmail;
	
	public part1(WebDriver driver) {
	part1.driver=driver;
	PageFactory.initElements(driver, this);
	}
	
	
	public void signin_function() {		
		Actions ob = new Actions(driver);
		ob.moveToElement(signin).build().perform();		
	}
	
	
	public void starthere_function() {
		starthere.click();
	}

	//assert
	
	public void text_function(){
	String actualText = facebooktext.getText();
	
	Assert.assertEquals(actualText,"Connect with friends and the world around you on Facebook.");
	
	//SOFT ASSERT
	
	SoftAssert SA = new SoftAssert();
    SA.assertEquals(actualText,"Connect with friends and the world around you on Facebook.");
	
	System.out.println("this is after asserted");
	
	SA.assertAll();
	}
	//Function without argument
	public void fbEmail_function() {
		fbEmail.sendKeys("ash@gmail.com");
	}
		//Function with argument
		
	public void fbEmail_function_2(String emailid) {
		fbEmail.sendKeys(emailid); }
	
}




	
	
	

