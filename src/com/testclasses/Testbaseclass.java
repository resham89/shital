
package com.testclasses;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;

import com.pomclasses.Loginpomclass;

public class Testbaseclass {
      WebDriver driver;
      @Parameters("browser")
      @BeforeMethod
      public void setUp(String a)
      {
    	  if(a.equals("chrome")) 
    	  {
    	  System.setProperty("webdriver.chrome.driver","D:\\webdriver\\chromedriver_win32\\chromedriver.exe\\");
    	  driver=new ChromeDriver();
    	  }
    	  else
    	  {
    		  System.setProperty("webdriver.gecko.driver","D:\\geckodriver\\geckodriver.exe\\");
    	  driver=new FirefoxDriver();
    	  }
    	  
    	  driver.get("https://www.makemytrip.com");
    	  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
    	  
      }

      @AfterMethod
      public void tearDown()
      {
    	driver.close();  
      } 
}