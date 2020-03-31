import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

import java.util.HashMap;
import java.util.Map;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
public class TestBaiduTest {
  private WebDriver driver;
  private Map<String, Object> vars;
  JavascriptExecutor js;
  @Before
  public void setUp() {
    System.setProperty("webdriver.gecko.driver", "/Users/perfect/Documents/geckodriver");
    driver = new FirefoxDriver();
    js = (JavascriptExecutor) driver;
    vars = new HashMap<String, Object>();
  }
  @After
  public void tearDown() {
    driver.quit();
  }
  @Test
  public void testBaidu() {
    driver.get("https://www.baidu.com/");
    driver.manage().window().setSize(new Dimension(721, 692));
    driver.findElement(By.id("kw")).sendKeys("天津大学");
    driver.findElement(By.id("kw")).sendKeys(Keys.ENTER);
    {
      WebElement element = driver.findElement(By.cssSelector("#result_logo > .index-logo-srcnew"));
      Actions builder = new Actions(driver);
      builder.moveToElement(element).perform();
    }
    {
      WebElement element = driver.findElement(By.tagName("body"));
      Actions builder = new Actions(driver);
      builder.moveToElement(element, 0, 0).perform();
    }
  }
}

