
import org.junit.Test;
import org.junit.Before;
import org.junit.After;
import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.core.IsNot.not;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Alert;
import org.openqa.selenium.Keys;
import java.util.*;
import java.net.MalformedURLException;
import java.net.URL;
public class BlankestimationTest {
  private WebDriver driver;
  private Map<String, Object> vars;
  JavascriptExecutor js;
  @Before
  public void setUp() {
    driver = new ChromeDriver();
    js = (JavascriptExecutor) driver;
    vars = new HashMap<String, Object>();
  }
  @After
  public void tearDown() {
    driver.quit();
  }
  @Test
  public void blankestimation() {
    // Test name: Blank estimation
    // Step # | name | target | value
    // 1 | open | https://devreassure.innov.co.in/complaints/view/23 | 
    driver.get("https://devreassure.innov.co.in/complaints/view/23");
    // 2 | setWindowSize | 1382x744 | 
    driver.manage().window().setSize(new Dimension(1382, 744));
    // 3 | click | css=.form-group-custom:nth-child(1) .form-control-custom | 
    driver.findElement(By.cssSelector(".form-group-custom:nth-child(1) .form-control-custom")).click();
    // 4 | type | css=.ng-valid | IND068
    driver.findElement(By.cssSelector(".ng-valid")).sendKeys("IND068");
    // 5 | type | css=.ng-untouched | Welcome@123
    driver.findElement(By.cssSelector(".ng-untouched")).sendKeys("Welcome@123");
    // 6 | click | css=button | 
    driver.findElement(By.cssSelector("button")).click();
    // 7 | click | css=.quick-links-container > .icon-menu .enabled > .link-title | 
    driver.findElement(By.cssSelector(".quick-links-container > .icon-menu .enabled > .link-title")).click();
    // 8 | runScript | window.scrollTo(0,1307.5) | 
    js.executeScript("window.scrollTo(0,1307.5)");
    // 9 | mouseOver | css=.form-sub-actions > .mat-focus-indicator | 
    {
      WebElement element = driver.findElement(By.cssSelector(".form-sub-actions > .mat-focus-indicator"));
      Actions builder = new Actions(driver);
      builder.moveToElement(element).perform();
    }
    // 10 | mouseOut | css=.form-sub-actions > .mat-focus-indicator | 
    {
      WebElement element = driver.findElement(By.tagName("body"));
      Actions builder = new Actions(driver);
      builder.moveToElement(element, 0, 0).perform();
    }
    // 11 | mouseOver | css=.mat-accent > .mat-button-wrapper | 
    {
      WebElement element = driver.findElement(By.cssSelector(".mat-accent > .mat-button-wrapper"));
      Actions builder = new Actions(driver);
      builder.moveToElement(element).perform();
    }
    // 12 | click | css=.mat-accent > .mat-button-wrapper | 
    driver.findElement(By.cssSelector(".mat-accent > .mat-button-wrapper")).click();
    // 13 | mouseOut | css=.mat-accent > .mat-button-wrapper | 
    {
      WebElement element = driver.findElement(By.tagName("body"));
      Actions builder = new Actions(driver);
      builder.moveToElement(element, 0, 0).perform();
    }
    // 14 | click | css=.mat-button > .mat-button-wrapper | 
    driver.findElement(By.cssSelector(".mat-button > .mat-button-wrapper")).click();
    // 15 | click | id=mat-error-0 | 
    // HSN/HAC Code is Required-part 1
    driver.findElement(By.id("mat-error-0")).click();
    // 16 | click | id=mat-error-13 | 
    // QTY-Part1
    driver.findElement(By.id("mat-error-13")).click();
    // 17 | click | id=mat-error-6 | 
    // Unit price-part1
    driver.findElement(By.id("mat-error-6")).click();
    // 18 | click | id=mat-error-7 | 
    // IGST-part1
    driver.findElement(By.id("mat-error-7")).click();
    // 19 | click | id=mat-error-1 | 
    // HSN/HAC Code is Required-part2
    driver.findElement(By.id("mat-error-1")).click();
    // 20 | click | id=mat-error-14 | 
    // Qty-part2
    driver.findElement(By.id("mat-error-14")).click();
    // 21 | click | id=mat-error-8 | 
    // unit price-part2
    driver.findElement(By.id("mat-error-8")).click();
    // 22 | click | id=mat-error-9 | 
    // IGST-PART2
    driver.findElement(By.id("mat-error-9")).click();
    // 23 | click | id=mat-error-2 | 
    // HSN/HAC Code is Required-part 3
    driver.findElement(By.id("mat-error-2")).click();
    // 24 | click | id=mat-error-10 | 
    // QTY-part3
    driver.findElement(By.id("mat-error-10")).click();
    // 25 | click | id=mat-error-11 | 
    // Unit price0part3
    driver.findElement(By.id("mat-error-11")).click();
    // 26 | click | id=mat-error-12 | 
    // IGST-Part3
    driver.findElement(By.id("mat-error-12")).click();
    // 27 | click | id=mat-error-3 | 
    // Expected repair completion date
    driver.findElement(By.id("mat-error-3")).click();
    // 28 | click | id=mat-error-4 | 
    // Repair Type
    driver.findElement(By.id("mat-error-4")).click();
    // 29 | click | id=mat-error-5 | 
    // Defect Type
    driver.findElement(By.id("mat-error-5")).click();
    // 30 | click | css=.ng-tns-c125-93:nth-child(2) | 
    // Approval type dropdown icon
    driver.findElement(By.cssSelector(".ng-tns-c125-93:nth-child(2)")).click();
    // 31 | click | xpath=//span[contains(.,'Save As Draft')] | 
    // Save As Draft
    driver.findElement(By.xpath("//span[contains(.,\'Save As Draft\')]")).click();
    // 32 | click | xpath=//span[contains(.,'Submit For Approval')] | 
    // Submit For Approval
    driver.findElement(By.xpath("//span[contains(.,\'Submit For Approval\')]")).click();
  }
}
