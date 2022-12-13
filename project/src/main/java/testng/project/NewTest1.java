package testng.project;

import org.testng.annotations.Test;

import common.baseclass;
import pages.part1;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Date;
import java.util.Properties;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.io.FileHandler;
import org.testng.annotations.AfterTest;

public class NewTest1 extends baseclass {
	
	
	@Test (groups = {"regression"})
	
	
public void T1() throws InterruptedException {
		System.out.println("this is t1");
		
		//part1 ob1= new part1(driver);
		
		//ob1.signin_function();
		Thread.sleep(5000);
		
		//ob1.starthere_function();
		Thread.sleep(5000);
		
		//part1 ob1= new part1(driver);
		//ob1.text_function();
	
		
		//driver.findElement(By.xpath("//*[text()='Early Black Friday Deals']")).click();
		
		
		Thread.sleep(5000);
		}
	
	
	@Test (priority=2)
   public void T2() throws InterruptedException, IOException {
		System.out.println("this is t2");
		
	//	driver.findElement(By.xpath("//*[text()='Amazon Basics']")).click();
	//Thread.sleep(5000);
		
		//Function without argument
		//part1 ob1 =new part1(driver);
		//.fbEmail_function();
		//Thread.sleep(5000);
		
		//Function with argument
		
	//part1 ob =new part1(driver);
		//ob1.fbEmail_function_2("ash@yahoo.com");
		//Thread.sleep(5000);
		
		//shots();
		
 
	
		Properties prop= new Properties();
		FileInputStream fin = new FileInputStream("C:\\Users\\Ash and Adii\\Desktop\\project\\fbdata.properties");
	
	prop.load(fin);
		
	String emaildata= prop.getProperty("Email");
	String passdata= prop.getProperty("password");
		
			System.out.println("Email=" + emaildata);
			System.out.println("password=" + passdata);
	}
	
	
	
		
		
		
		
		
		
		
		
		
		
	}

