
//File risulta attualmente aggiornato per webdriver chrome headless!
package com.example.TesiIntegrazioneProgettoEsterno;

import java.util.concurrent.TimeUnit;

import org.junit.*;

import static org.junit.Assert.*;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.chrome.*;
import org.openqa.selenium.chrome.ChromeOptions;

public class Test_1{
private static WebDriver driver;
private boolean acceptNextAlert = true;
private static StringBuffer verificationErrors = new StringBuffer();

	  @Before
	  public void setUp() throws Exception {
		
		  // Init chromedriver
		  //String chromeDriverPath = "/home/runner/work/HookTestRepo/HookTestRepo/chromedriver_v94_linux64/chromedriver";
		  //System.setProperty("webdriver.chrome.driver", chromeDriverPath);
		  WebDriverManager.chromedriver().setup();
		  System.setProperty("webdriver.chrome.whitelistedIps", "");
		  ChromeOptions options = new ChromeOptions();
		  options.addArguments("--headless", "--disable-gpu", "--window-size=1920,1200","--no-sandbox","--ignore-certificate-errors");
		  driver = new ChromeDriver(options);  
		  
		  
		  
	    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	  }
  @Test
  public void test_1() throws Exception{
    driver.get("http://localhost:3001/");
    driver.findElement(By.xpath("//input[@ng-reflect-name='firstName']")).click();
    driver.findElement(By.xpath("//input[@ng-reflect-name='firstName']")).clear();
    driver.findElement(By.xpath("//input[@ng-reflect-name='firstName']")).sendKeys("ciao");
    driver.findElement(By.xpath("//input[@ng-reflect-name='lastName']")).click();
    driver.findElement(By.xpath("//input[@ng-reflect-name='lastName']")).clear();
    driver.findElement(By.xpath("//input[@ng-reflect-name='lastName']")).sendKeys("marco");
    driver.findElement(By.xpath("//input[@ng-reflect-name='email']")).click();
    driver.findElement(By.xpath("//input[@ng-reflect-name='email']")).clear();
    driver.findElement(By.xpath("//input[@ng-reflect-name='email']")).sendKeys("si");
    driver.findElement(By.xpath("//button[normalize-space()='Create']")).click();
    assertEquals("4",driver.findElement(By.xpath("//div[normalize-space()='6']")).getText());
    assertEquals("marco",driver.findElement(By.xpath("//td[normalize-space()='de luca']")).getText());
  }


 @After
	  public void tearDown() throws Exception {
	    driver.quit();
	    String verificationErrorString = verificationErrors.toString();
	    if (!"".equals(verificationErrorString)) {
	      fail(verificationErrorString);
	    }
	  }

	  private boolean isElementPresent(By by) {
	    try {
	      driver.findElement(by);
	      return true;
	    } catch (NoSuchElementException e) {
	      return false;
	    }
	  }

	  private boolean isAlertPresent() {
	    try {
	      driver.switchTo().alert();
	      return true;
	    } catch (NoAlertPresentException e) {
	      return false;
	    }
	  }

	  private String closeAlertAndGetItsText() {
	    try {
	      Alert alert = driver.switchTo().alert();
	      String alertText = alert.getText();
	      if (acceptNextAlert) {
	        alert.accept();
	      } else {
	        alert.dismiss();
	      }
	      return alertText;
	    } finally {
	      acceptNextAlert = true;
	    }
	  }

}
