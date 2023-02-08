
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

public class Test_Hooks{
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
		  
		  
		  
	    driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
	  }
  @Test
  public void test_loc_Hooks_release_1_1() throws Exception{
    driver.get("http://localhost:3001/");
    Thread.sleep(5000);
	//String a = driver.findElement(By.xpath("//html/body")).getText();
	//System.out.println(a);
	//driver.findElement(By.xpath("//html/body")).click();
	//int len_page = driver.getPageSource().length();
	//System.out.println(len_page);
	//System.out.println(driver.getPageSource().substring(len_page-10000, len_page));
	//driver.findElement(By.xpath("//html/body")).click();
	//driver.findElement(By.xpath("//html/body")).click();
	//System.out.println("T R O V A T O ");
    driver.findElement(By.xpath("//*[@x934114515538-x-test-tpl-1]//*[@x934114515538-x-test-hook-9]//*[@x934107962964-x-test-tpl-2]//*[@x934107962964-x-test-hook-10]")).click();
    driver.findElement(By.xpath("//*[@x934114515538-x-test-tpl-1]//*[@x934114515538-x-test-hook-9]//*[@x934107962964-x-test-tpl-2]//*[@x934107962964-x-test-hook-10]")).clear();
    driver.findElement(By.xpath("//*[@x934114515538-x-test-tpl-1]//*[@x934114515538-x-test-hook-9]//*[@x934107962964-x-test-tpl-2]//*[@x934107962964-x-test-hook-10]")).sendKeys("Marco");
    driver.findElement(By.xpath("//*[@x934114515538-x-test-tpl-1]//*[@x934114515538-x-test-hook-9]//*[@x934107962964-x-test-tpl-2]//*[@x934107962964-x-test-hook-13]")).click();
    driver.findElement(By.xpath("//*[@x934114515538-x-test-tpl-1]//*[@x934114515538-x-test-hook-9]//*[@x934107962964-x-test-tpl-2]//*[@x934107962964-x-test-hook-13]")).clear();
    driver.findElement(By.xpath("//*[@x934114515538-x-test-tpl-1]//*[@x934114515538-x-test-hook-9]//*[@x934107962964-x-test-tpl-2]//*[@x934107962964-x-test-hook-13]")).sendKeys("De Luca");
    driver.findElement(By.xpath("//*[@x934114515538-x-test-tpl-1]//*[@x934114515538-x-test-hook-9]//*[@x934107962964-x-test-tpl-2]//*[@x934107962964-x-test-hook-17]")).click();
    driver.findElement(By.xpath("//*[@x934114515538-x-test-tpl-1]//*[@x934114515538-x-test-hook-9]//*[@x934107962964-x-test-tpl-2]//*[@x934107962964-x-test-hook-17]")).clear();
    driver.findElement(By.xpath("//*[@x934114515538-x-test-tpl-1]//*[@x934114515538-x-test-hook-9]//*[@x934107962964-x-test-tpl-2]//*[@x934107962964-x-test-hook-17]")).sendKeys("ciao@gmail.com");
    driver.findElement(By.xpath("//*[@x934114515538-x-test-tpl-1]//*[@x934114515538-x-test-hook-9]//*[@x934107962964-x-test-tpl-2]//*[@x934107962964-x-test-hook-18]")).click();
    driver.findElement(By.xpath("//*[@x934114515538-x-test-tpl-1]//*[@x934114515538-x-test-hook-9]//*[@x934107962964-x-test-tpl-2]//*[@x934107962964-x-test-hook-20]//*[@x934110935862-x-test-tpl-1]//*[@x934110935862-x-test-hook-5]")).click();
    System.out.println("F I N I T O ");
	Thread.sleep(5000);
	String a1 = driver.findElement(By.xpath("//html/body")).getText();
	System.out.println(a1);	
    assertEquals("4",driver.findElement(By.xpath("//*[@x934114515538-x-test-tpl-1]//*[@x934114515538-x-test-hook-9]//*[@x934107962964-x-test-tpl-2]//*[@x934107962964-x-test-hook-20]//*[@x934110935862-x-test-tpl-1]//*[@x934110935862-x-test-hook-3]")).getText());
    System.out.println("DOPO PRIMA ASSERT");
	assertEquals("De Luca",driver.findElement(By.xpath("//*[@x934114515538-x-test-tpl-1]//*[@x934114515538-x-test-hook-9]//*[@x934107962964-x-test-tpl-21]//*[@x934107962964-x-test-hook-22]//*[@x934112684301-x-test-tpl-1]//*[@x934112684301-x-test-hook-11][4]//*[@x934112684301-x-test-hook-14]")).getText());
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
