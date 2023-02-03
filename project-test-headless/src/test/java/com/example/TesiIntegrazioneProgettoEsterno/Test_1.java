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
driver.findElement(By.xpath("//input[@ng-reflect-name='firstName']")).click();
driver.findElement(By.xpath("//h1[normalize-space()='Angular With Java']")).click();
driver.findElement(By.xpath("//div[normalize-space()='3']")).click();
driver.findElement(By.xpath("//button[normalize-space()='Get All Users']")).click();
driver.findElement(By.xpath("//h2[normalize-space()='Users']")).click();
driver.findElement(By.xpath("//th[normalize-space()='User Id']")).click();
driver.findElement(By.xpath("//th[normalize-space()='Firstname']")).click();
driver.findElement(By.xpath("//th[normalize-space()='Lastname']")).click();
driver.findElement(By.xpath("//th[normalize-space()='Email']")).click();
driver.findElement(By.xpath("//td[normalize-space()='abc3@gmail.com']")).click();
driver.findElement(By.xpath("//tbody[@_ngcontent-qrk-c49='']/tr[3]/td[2]")).click();
driver.findElement(By.xpath("//app-root[@ng-version='9.0.4']")).click();
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

