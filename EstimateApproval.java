package automationFramework;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class EstimateApproval {
	public WebDriver driver;
	 String driverPath = "D:\\jitendra\\Selenium drivers\\latestchromedriver\\chromedriver.exe";
	 public String  baseUrl;
	
	
	@Test (priority=1)
	 public void BlankApproval() {
	 	 System.setProperty("webdriver.chrome.driver", driverPath);
	 	   driver = new ChromeDriver();
	 	   driver.manage().window().maximize();
	 	   driver.manage().deleteAllCookies();
	 	   driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	 	 
	 driver.get("https://devreassure.innov.co.in/complaints/view/37");
	 driver.findElement(By.xpath("//input[@type='text']")).click();
	 driver.findElement(By.xpath("//input[@type='text']")).clear();
	 driver.findElement(By.xpath("//input[@type='text']")).sendKeys("claimedu");
	 driver.findElement(By.xpath("//input[@type='password']")).clear();
	 driver.findElement(By.xpath("//input[@type='password']")).sendKeys("claimedu");
	 driver.findElement(By.xpath("//button[@type='submit']")).click();
	          
	 // Approve estimation quick link
	 try {
		 
		 Thread.sleep(5000);
		 driver.findElement(By.xpath("//div[@id=\'fieldRightSidebarContainer\']/div/section/div/a/span[2]")).click();
	          }
	          catch (Exception e)
	          {
	          	System.out.println("Test Failed: Approve Estimation button is disabled or not present");
	          	driver.close();
	          }
	 //Submit button
	 try {
		 Thread.sleep(5000);
		 driver.findElement(By.xpath("//button[contains(.,\'Submit\')]")).click();
         }
         catch (Exception e)
         {
         	System.out.println("Test Failed: Submit button is disabled or not present");
         	driver.close();
         }
	//blank approval 
	//For error Message
	 driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	 driver.switchTo().activeElement();
	 WebDriverWait wait1 = new WebDriverWait(driver, 120);
	 String Successmsg1 = driver.findElement(By.xpath("//p[contains(.,'Request method is not valid')]")).getText();
	 wait1.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//p[contains(.,'Request method is not valid')]")));
	 driver.findElement(By.xpath("//button[contains(.,'Ok')]")).click();
	                         
	 if (Successmsg1.contentEquals("Request method is not valid"))
	 {
	 	 
	 	 System.out.println(Successmsg1);

	 }
	 else {
	  System.out.println("blank approval error message is incorrect");
	  driver.close();
	 }
	 try {
		 driver.findElement(By.id("mat-input-24")).clear();
			 }
		 catch (Exception e)
		 {
		 	System.out.println("Test Failed: Price1 is not available");
		 	driver.close();
		 }
		 try {
		 driver.findElement(By.id("mat-input-35")).clear();
		}
		catch (Exception e)
		{
			System.out.println("Test Failed: Price2 is not available");
			driver.close();
		}
		try {
		 driver.findElement(By.id("mat-input-46")).clear();
		}
		catch (Exception e)
		{
			System.out.println("Test Failed: Price3 is not available");
			driver.close();
		}

		try {
			Thread.sleep(5000);
		    driver.findElement(By.xpath("//mat-select[@id=\'mat-select-9\']/div/div")).click();
			}
			catch (Exception e)
			{
				System.out.println("Test Failed: Approval Type is not available");
				driver.close();
			}
		try {
			 driver.findElement(By.xpath("//mat-option[2]/span")).clear();
			}
			catch (Exception e)
			{
				System.out.println("Test Failed: Approval Type value is not available");
				driver.close();
			}

		try {
			 driver.findElement(By.xpath("//div[2]/div/button/span")).clear();
			}
			catch (Exception e)
			{
				System.out.println("Test Failed: submit is not available");
				driver.close();
			}
		//For error Message
		 driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		 driver.switchTo().activeElement();
		 WebDriverWait wait2 = new WebDriverWait(driver, 120);
		 String errorsmsg1 = driver.findElement(By.xpath("//span[contains(.,'Approved GST Amount :')]")).getText();
		 wait2.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[contains(.,'Approved GST Amount :')]")));

		 String errorsmsg2 = driver.findElement(By.xpath("//span[contains(.,'Approved Total :')]")).getText();
		 wait2.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[contains(.,'Approved Total :')]"))); 
		 driver.findElement(By.xpath("//button[contains(.,'Ok')]")).click();
		 if (errorsmsg1.contentEquals("Approved Total :"))
		 {
		 	 System.out.println(errorsmsg1);
		 	 }
		 else {
		  System.out.println("blank approval error1 message is incorrect");
		  driver.close();
		 }
		 if (errorsmsg2.contentEquals("Approved GST Amount :"))
		 {
		 	 System.out.println(errorsmsg2);
		 	 }
		 else {
		  System.out.println("blank approval error2 message is incorrect");
		  driver.close();
		 }

	 
	 
	 driver.close();
	}
}
