package com.example.Prova9;

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

public class Test_Abs{
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
  public void test_loc_Abs_release_1_1() throws Exception{
    driver.get("http://localhost:3001/");
    Thread.sleep(5000);
    driver.findElement(By.xpath("//html/body/app-root/div/div/div/form/div/div/input")).click();
    driver.findElement(By.xpath("//html/body/app-root/div/div/div/form/div/div/input")).clear();
    driver.findElement(By.xpath("//html/body/app-root/div/div/div/form/div/div/input")).sendKeys("mario");
    driver.findElement(By.xpath("//html/body/app-root/div/div/div/form/div/div[2]/input")).click();
    driver.findElement(By.xpath("//html/body/app-root/div/div/div/form/div/div[2]/input")).clear();
    driver.findElement(By.xpath("//html/body/app-root/div/div/div/form/div/div[2]/input")).sendKeys("rossi");
    driver.findElement(By.xpath("//html/body/app-root/div/div/div/form/div[2]/div/input")).click();
    driver.findElement(By.xpath("//html/body/app-root/div/div/div/form/div[2]/div/input")).clear();
    driver.findElement(By.xpath("//html/body/app-root/div/div/div/form/div[2]/div/input")).sendKeys("ciao@ciao.com");
    driver.findElement(By.xpath("//html/body/app-root/div/div/div/form/button")).click();
    driver.findElement(By.xpath("//html/body/app-root/div/div/div[2]/app-display-board/div/div[2]/button")).click();
    driver.get("http://localhost:3001/");
    Thread.sleep(5000);
    assertEquals("4",driver.findElement(By.xpath("//html/body/app-root/div/div/div[2]/app-display-board/div/div")).getText());
    assertEquals("rossi",driver.findElement(By.xpath("//html/body/app-root/div[2]/app-users/div/table/tbody/tr[4]/td[3]")).getText());
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
