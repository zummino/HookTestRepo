package com.example.Prova5;



import java.util.regex.Pattern;

import java.util.concurrent.TimeUnit;

import org.junit.*;

import static org.junit.Assert.*;

import static org.hamcrest.CoreMatchers.*;

import org.openqa.selenium.*;

import org.openqa.selenium.chrome.ChromeDriver;

import org.openqa.selenium.support.ui.Select;

import org.apache.commons.io.FileUtils;

import java.io.File;



public class UntitledTestCase {

  private WebDriver driver;

  private String baseUrl;

  private boolean acceptNextAlert = true;

  private StringBuffer verificationErrors = new StringBuffer();

  JavascriptExecutor js;

  @Before

  public void setUp() throws Exception {

    System.setProperty("webdriver.chrome.driver", "");

    driver = new ChromeDriver();

    baseUrl = "https://www.google.com/";

    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));

    js = (JavascriptExecutor) driver;

  }



  @Test

  public void testUntitledTestCase() throws Exception {

driver.get("http://localhost:3001/");
driver.findElement(By.xpath("//*[@x934114515538-x-test-tpl-1]//*[@x934114515538-x-test-hook-9]//*[@x934107962964-x-test-tpl-2]//*[@x934107962964-x-test-hook-10]")).click();
driver.findElement(By.xpath("//*[@x934114515538-x-test-tpl-1]//*[@x934114515538-x-test-hook-9]//*[@x934107962964-x-test-tpl-1]//*[@x934111808532-x-test-tpl-1]//*[@x934111808532-x-test-hook-2]")).click();
driver.findElement(By.xpath("//*[@x934114515538-x-test-tpl-1]//*[@x934114515538-x-test-hook-9]//*[@x934107962964-x-test-tpl-2]//*[@x934107962964-x-test-hook-20]//*[@x934110935862-x-test-tpl-1]//*[@x934110935862-x-test-hook-3]")).click();
driver.findElement(By.xpath("//*[@x934114515538-x-test-tpl-1]//*[@x934114515538-x-test-hook-9]//*[@x934107962964-x-test-tpl-2]//*[@x934107962964-x-test-hook-20]//*[@x934110935862-x-test-tpl-1]//*[@x934110935862-x-test-hook-5]")).click();
driver.findElement(By.xpath("//*[@x934114515538-x-test-tpl-1]//*[@x934114515538-x-test-hook-9]//*[@x934107962964-x-test-tpl-21]//*[@x934107962964-x-test-hook-22]//*[@x934112684301-x-test-tpl-1]//*[@x934112684301-x-test-hook-2]")).click();
driver.findElement(By.xpath("//*[@x934114515538-x-test-tpl-1]//*[@x934114515538-x-test-hook-9]//*[@x934107962964-x-test-tpl-21]//*[@x934107962964-x-test-hook-22]//*[@x934112684301-x-test-tpl-1]//*[@x934112684301-x-test-hook-6]")).click();
driver.findElement(By.xpath("//*[@x934114515538-x-test-tpl-1]//*[@x934114515538-x-test-hook-9]//*[@x934107962964-x-test-tpl-21]//*[@x934107962964-x-test-hook-22]//*[@x934112684301-x-test-tpl-1]//*[@x934112684301-x-test-hook-7]")).click();
driver.findElement(By.xpath("//*[@x934114515538-x-test-tpl-1]//*[@x934114515538-x-test-hook-9]//*[@x934107962964-x-test-tpl-21]//*[@x934107962964-x-test-hook-22]//*[@x934112684301-x-test-tpl-1]//*[@x934112684301-x-test-hook-8]")).click();
driver.findElement(By.xpath("//*[@x934114515538-x-test-tpl-1]//*[@x934114515538-x-test-hook-9]//*[@x934107962964-x-test-tpl-21]//*[@x934107962964-x-test-hook-22]//*[@x934112684301-x-test-tpl-1]//*[@x934112684301-x-test-hook-9]")).click();
driver.findElement(By.xpath("//*[@x934114515538-x-test-tpl-1]//*[@x934114515538-x-test-hook-9]//*[@x934107962964-x-test-tpl-21]//*[@x934107962964-x-test-hook-22]//*[@x934112684301-x-test-tpl-1]//*[@x934112684301-x-test-hook-11][3]//*[@x934112684301-x-test-hook-15]")).click();
driver.findElement(By.xpath("//*[@x934114515538-x-test-tpl-1]//*[@x934114515538-x-test-hook-9]//*[@x934107962964-x-test-tpl-21]//*[@x934107962964-x-test-hook-22]//*[@x934112684301-x-test-tpl-1]//*[@x934112684301-x-test-hook-11][3]//*[@x934112684301-x-test-hook-13]")).click();
driver.findElement(By.xpath("//*[@x934114515538-x-test-tpl-1]//*[@x934114515538-x-test-hook-9]")).click();
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

