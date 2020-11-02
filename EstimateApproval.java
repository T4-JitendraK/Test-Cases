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
	 try {	 
	 driver.get("https://devreassure.innov.co.in/complaints/view/37");
	 }
	 catch (Exception e)
     {
     	System.out.println("Test Failed: Unable to open the URL");
     	driver.close();
     }
	 
	 driver.findElement(By.xpath("//input[@type='text']")).click();
	 driver.findElement(By.xpath("//input[@type='text']")).clear();
	 try {
	 driver.findElement(By.xpath("//input[@type='text']")).sendKeys("claimedu");
	 }
	 catch (Exception e)
     {
     	System.out.println("Test Failed: Username field not available");
     	driver.close();
     }
	 driver.findElement(By.xpath("//input[@type='password']")).clear();
	 try {
	 driver.findElement(By.xpath("//input[@type='password']")).sendKeys("claimedu");
	 }
	 catch (Exception e)
     {
     	System.out.println("Test Failed: Password field is not available");
     	driver.close();
     }

		//driver.findElement(By.xpath("//*[@id=\"login-form\"]/div/form/button")).click();
	 try {
	 driver.findElement(By.xpath("//button[@type='submit']")).click();
	 }
	 catch (Exception e)
     {
     	System.out.println("Test Failed: login button is not present");
     	driver.close();
     }
	          
	 // Approve estimation quick link
	 try {
		 
		 driver.findElement(By.xpath("//div[@id=\'fieldRightSidebarContainer\']/div/section/div/a/span[2]")).click();
	          }
	          catch (Exception e)
	          {
	          	System.out.println("Test Failed: Approve Estimation button is disabled or not present");
	          	driver.close();
	          }
	 // Validation check for expected repair Completion date      
	    try {
	        driver.findElement(By.cssSelector("#invoiceForm > div > div.item-footer-block.invoice-main-field > div:nth-child(1) > div > mat-form-field > div > div.mat-form-field-flex.ng-tns-c72-56 > div.mat-form-field-suffix.ng-tns-c72-56.ng-star-inserted > mat-datepicker-toggle > button > span > svg")).click();
	        
		}

	catch (Exception e)
	{
		System.out.println("Test Failed:Datepicker icon is disabled or not present");
		driver.close();
	}
	try {

	    driver.findElement(By.cssSelector(".ng-star-inserted:nth-child(2) > .mat-calendar-body-cell:nth-child(3) > .mat-calendar-body-cell-content")).click();
		//driver.findElement(By.xpath("//tr[3]/td[3]/div")).click();
	}

	catch (Exception e)
	{
		System.out.println("Invalid date or date is disabled or element not found");
		driver.close();
	}

	 
	 
	 //Submit button of estimate approve
	 try {
		 Thread.sleep(5000);

		    driver.findElement(By.cssSelector(".mat-accent > .mat-button-wrapper")).click();
         }
         catch (Exception e)
         {
         	System.out.println("Test Failed: Submit button is disabled or not present");
         	driver.close();
         }
	//blank approval   
	//For error Message  
	 driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	   driver.switchTo().activeElement().getText();
		
	 WebDriverWait wait1 = new WebDriverWait(driver, 120);
	 
		 String Successmsg1  =driver.findElement(By.xpath("//section[@id='modal-body']/p")).getText();

	 	 System.out.println(Successmsg1);
	 	 	
wait1.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//section[@id='modal-body']/p")));
try{

    driver.findElement(By.xpath("//*[@id=\"modal-cancel-button\"]/span")).click();
}
catch (Exception e)
{
	System.out.println("Test Failed: OK button button on pop up is not present");
	driver.close();
}

	   // driver.findElement(By.cssSelector("#modal-cancel-button > .mat-button-wrapper")).click();
	 if (Successmsg1.contentEquals("Request method is not valid"))
	 {
	 	 
	 	 System.out.println(Successmsg1);

	 }
	 else {
	  System.out.println("blank approval error message is incorrect");
	  
	 }
	 try {
		 driver.findElement(By.id("mat-input-24")).clear();
		 driver.findElement(By.id("mat-input-24")).sendKeys("00");
			 }
		 catch (Exception e)
		 {
		 	System.out.println("Test Failed: Price1 is not available");
		 	driver.close();
		 }
		 try {
		 driver.findElement(By.id("mat-input-35")).clear();
driver.findElement(By.id("mat-input-35")).sendKeys("00");
		}
		catch (Exception e)
		{
			System.out.println("Test Failed: Price2 is not available");
			driver.close();
		}
		try {
		 driver.findElement(By.id("mat-input-46")).clear();

		    driver.findElement(By.id("mat-input-46")).sendKeys("00");
		}
		catch (Exception e)
		{
			System.out.println("Test Failed: Price3 is not available");
			driver.close();
		}

		try {
			Thread.sleep(5000);
		    driver.findElement(By.xpath("/html/body/app-root/div/mat-sidenav-container/mat-sidenav-content/main/app-complaint/app-layouts/div/div/app-field-builder/div/section[2]/div[1]/form/mat-accordion/div[10]/mat-expansion-panel/div/div/div[2]/app-invoice/div/div/div[3]/div[10]/div/mat-form-field/div/div[1]/div[3]/mat-select/div/div[1]/span/span")).click();
			}
			catch (Exception e)
			{
				System.out.println("Test Failed: Approval Type is not available");
				driver.close();
			}
		try {
			 driver.findElement(By.xpath("//mat-option[4]/span")).click();
			}
			catch (Exception e)
			{
				System.out.println("Test Failed: Approval Type value is not available");
				driver.close();
			}

		try {
			 driver.findElement(By.xpath("//div[2]/div/button/span")).click();
			}
			catch (Exception e)
			{
				System.out.println("Test Failed: submit is not available");
				driver.close();
			}
		//For error Message
		 driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		   driver.switchTo().activeElement().getText();
			
		 WebDriverWait wait2 = new WebDriverWait(driver, 120);
		 String errorsmsg1 = driver.findElement(By.xpath("//section/ul/li/span[2]")).getText();
		 wait2.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//section/ul/li/span[2]")));

		 String errorsmsg2 = driver.findElement(By.xpath("//section/ul/li[2]/span[2]")).getText();
		 wait2.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//section/ul/li[2]/span[2]"))); 

		 if (errorsmsg1.contentEquals("Field value must be greater than or equal to 1"))
		 {
		 	 System.out.println(errorsmsg1);
		 	 }
		 else {
		  System.out.println("blank approval error1 message is incorrect");
		  
		 }
		 if (errorsmsg2.contentEquals("Field value must be greater than or equal to 1"))
		 {
		 	 System.out.println(errorsmsg2);
		 	 }
		 else {
		  System.out.println("blank approval error2 message is incorrect");
		  
		 }
		 driver.findElement(By.xpath("//*[@id=\"modal-cancel-button\"]/span")).click();
	 
	 
	 driver.close();
	}
	@Test (priority=2)
	 public void InvalidApproval() {
	 	 System.setProperty("webdriver.chrome.driver", driverPath);
	 	   driver = new ChromeDriver();
	 	   driver.manage().window().maximize();
	 	   driver.manage().deleteAllCookies();
	 	   driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	 try {	 
	 driver.get("https://devreassure.innov.co.in/complaints/view/37");
	 }
	 catch (Exception e)
    {
    	System.out.println("Test Failed: Unable to open the URL");
    	driver.close();
    }
	 
	 driver.findElement(By.xpath("//input[@type='text']")).click();
	 driver.findElement(By.xpath("//input[@type='text']")).clear();
	 try {
	 driver.findElement(By.xpath("//input[@type='text']")).sendKeys("claimedu");
	 }
	 catch (Exception e)
    {
    	System.out.println("Test Failed: Username field not available");
    	driver.close();
    }
	 driver.findElement(By.xpath("//input[@type='password']")).clear();
	 try {
	 driver.findElement(By.xpath("//input[@type='password']")).sendKeys("claimedu");
	 }
	 catch (Exception e)
    {
    	System.out.println("Test Failed: Password field is not available");
    	driver.close();
    }

		//driver.findElement(By.xpath("//*[@id=\"login-form\"]/div/form/button")).click();
	 try {
	 driver.findElement(By.xpath("//button[@type='submit']")).click();
	 }
	 catch (Exception e)
    {
    	System.out.println("Test Failed: login button is not present");
    	driver.close();
    }
	          
	 // Approve estimation quick link
	 try {
		 
		 driver.findElement(By.xpath("//div[@id=\'fieldRightSidebarContainer\']/div/section/div/a/span[2]")).click();
	          }
	          catch (Exception e)
	          {
	          	System.out.println("Test Failed: Approve Estimation button is disabled or not present");
	          	driver.close();
	          }
	 // Validation check for expected repair Completion date      
	    try {
	        driver.findElement(By.cssSelector("#invoiceForm > div > div.item-footer-block.invoice-main-field > div:nth-child(1) > div > mat-form-field > div > div.mat-form-field-flex.ng-tns-c72-56 > div.mat-form-field-suffix.ng-tns-c72-56.ng-star-inserted > mat-datepicker-toggle > button > span > svg")).click();
	        
		}

	catch (Exception e)
	{
		System.out.println("Test Failed:Datepicker icon is disabled or not present");
		driver.close();
	}
	try {

	    driver.findElement(By.cssSelector(".ng-star-inserted:nth-child(2) > .mat-calendar-body-cell:nth-child(3) > .mat-calendar-body-cell-content")).click();
		//driver.findElement(By.xpath("//tr[3]/td[3]/div")).click();
	}

	catch (Exception e)
	{
		System.out.println("Invalid date or date is disabled or element not found");
		driver.close();
	}
	 try {
		 driver.findElement(By.id("mat-input-24")).clear();
		 driver.findElement(By.id("mat-input-24")).sendKeys("-100");
		 Thread.sleep(2000);
		 String Invalidprice1=driver.findElement(By.id("mat-error-5")).getText();
		 if (Invalidprice1.contentEquals("Approved Unit Rate must be >= 0")) {
		 System.out.println("Message for invalid price is  :"+Invalidprice1);
		 }
		 else {
		 System.out.println("Test Failed: Wrong error Message for Invalidprice1");
		 
		 }
			 }
		 catch (Exception e)
		 {
		 	System.out.println("Test Failed: Invalidprice1 message is not available");
		 	driver.close();
		 }
		 try {
		 driver.findElement(By.id("mat-input-35")).clear();
driver.findElement(By.id("mat-input-35")).sendKeys("-200");
Thread.sleep(2000);
String Invalidprice2=driver.findElement(By.id("mat-error-6")).getText();
if (Invalidprice2.contentEquals("Approved Unit Rate must be >= 0")) {
System.out.println("Message for invalid price2 is  :"+Invalidprice2);
}
else {
System.out.println("Test Failed: Wrong error Message for Invalidprice2");

}
	 }
catch (Exception e)
{
	System.out.println("Test Failed: Invalidprice2 message is not available");
	driver.close();
}
		 try {
			 driver.findElement(By.id("mat-input-46")).clear();

			    driver.findElement(By.id("mat-input-46")).sendKeys("-300");
			
		 Thread.sleep(2000);
		 String Invalidprice3=driver.findElement(By.id("mat-error-6")).getText();
		 if (Invalidprice3.contentEquals("Approved Unit Rate must be >= 0")) {
		 System.out.println("Message for invalid price2 is  :"+Invalidprice3);
		 }
		 else {
		 System.out.println("Test Failed: Wrong error Message for Invalidprice3");

		 }
		 	 }
		 catch (Exception e)
		 {
		 	System.out.println("Test Failed: Invalidprice3 message is not available");
		 	driver.close();
		 }
		 try {
			 driver.findElement(By.id("mat-input-263")).clear();
			 driver.findElement(By.id("mat-input-263")).sendKeys("-500");
			
		 Thread.sleep(2000);
		 String DiscAmt=driver.findElement(By.id("mat-error-8")).getText();
		 if (DiscAmt.contentEquals("Approved Discount must be >= 0")) {
		 System.out.println("Message for i is  :"+DiscAmt);
		 }
		 else {
		 System.out.println("Test Failed: Wrong error Message for DiscAmt");

		 }
		 	 }
		 catch (Exception e)
		 {
		 	System.out.println("Test Failed: DiscAmt message is not available");
		 	driver.close();
		 }


		try {
			Thread.sleep(5000);
		    driver.findElement(By.xpath("/html/body/app-root/div/mat-sidenav-container/mat-sidenav-content/main/app-complaint/app-layouts/div/div/app-field-builder/div/section[2]/div[1]/form/mat-accordion/div[10]/mat-expansion-panel/div/div/div[2]/app-invoice/div/div/div[3]/div[10]/div/mat-form-field/div/div[1]/div[3]/mat-select/div/div[1]/span/span")).click();
			}
			catch (Exception e)
			{
				System.out.println("Test Failed: Approval Type is not available");
				driver.close();
			}
		try {
			 driver.findElement(By.xpath("//mat-option[4]/span")).click();
			}
			catch (Exception e)
			{
				System.out.println("Test Failed: Approval Type value is not available");
				driver.close();
			}

		try {
			 driver.findElement(By.xpath("//div[2]/div/button/span")).click();
			}
			catch (Exception e)
			{
				System.out.println("Test Failed: submit is not available");
				driver.close();
			}

	
	
	
	
	}
	
	
	
	
	@Test (priority=3)
	 public void ValidApproval() {
	 	 System.setProperty("webdriver.chrome.driver", driverPath);
	 	   driver = new ChromeDriver();
	 	   driver.manage().window().maximize();
	 	   driver.manage().deleteAllCookies();
	 	   driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	 try {	 
	 driver.get("https://devreassure.innov.co.in/complaints/view/37");
	 }
	 catch (Exception e)
    {
    	System.out.println("Test Failed: Unable to open the URL");
    	driver.close();
    }
	 
	 driver.findElement(By.xpath("//input[@type='text']")).click();
	 driver.findElement(By.xpath("//input[@type='text']")).clear();
	 try {
	 driver.findElement(By.xpath("//input[@type='text']")).sendKeys("claimedu");
	 }
	 catch (Exception e)
    {
    	System.out.println("Test Failed: Username field not available");
    	driver.close();
    }
	 driver.findElement(By.xpath("//input[@type='password']")).clear();
	 try {
	 driver.findElement(By.xpath("//input[@type='password']")).sendKeys("claimedu");
	 }
	 catch (Exception e)
    {
    	System.out.println("Test Failed: Password field is not available");
    	driver.close();
    }

		//driver.findElement(By.xpath("//*[@id=\"login-form\"]/div/form/button")).click();
	 try {
	 driver.findElement(By.xpath("//button[@type='submit']")).click();
	 }
	 catch (Exception e)
    {
    	System.out.println("Test Failed: login button is not present");
    	driver.close();
    }
	          
	 // Approve estimation quick link
	 try {
		 
		 driver.findElement(By.xpath("//div[@id=\'fieldRightSidebarContainer\']/div/section/div/a/span[2]")).click();
	          }
	          catch (Exception e)
	          {
	          	System.out.println("Test Failed: Approve Estimation button is disabled or not present");
	          	driver.close();
	          }
	 // Validation check for expected repair Completion date      
	    try {
	        driver.findElement(By.cssSelector("#invoiceForm > div > div.item-footer-block.invoice-main-field > div:nth-child(1) > div > mat-form-field > div > div.mat-form-field-flex.ng-tns-c72-56 > div.mat-form-field-suffix.ng-tns-c72-56.ng-star-inserted > mat-datepicker-toggle > button > span > svg")).click();
	        
		}

	catch (Exception e)
	{
		System.out.println("Test Failed:Datepicker icon is disabled or not present");
		driver.close();
	}
	try {

	    driver.findElement(By.cssSelector(".ng-star-inserted:nth-child(2) > .mat-calendar-body-cell:nth-child(3) > .mat-calendar-body-cell-content")).click();
		//driver.findElement(By.xpath("//tr[3]/td[3]/div")).click();
	}

	catch (Exception e)
	{
		System.out.println("Invalid date or date is disabled or element not found");
		driver.close();
	}

	try {
		 driver.findElement(By.id("mat-input-24")).clear();
		 driver.findElement(By.id("mat-input-24")).sendKeys("2500");
			 }
		 catch (Exception e)
		 {
		 	System.out.println("Test Failed: Price1 is not available");
		 	driver.close();
		 }
		 try {
		 driver.findElement(By.id("mat-input-35")).clear();
driver.findElement(By.id("mat-input-35")).sendKeys("500");
		}
		catch (Exception e)
		{
			System.out.println("Test Failed: Price2 is not available");
			driver.close();
		}
		try {
		 driver.findElement(By.id("mat-input-46")).clear();

		    driver.findElement(By.id("mat-input-46")).sendKeys("500");
		}
		catch (Exception e)
		{
			System.out.println("Test Failed: Price3 is not available");
			driver.close();
		}

		try {
			Thread.sleep(5000);
		    driver.findElement(By.xpath("/html/body/app-root/div/mat-sidenav-container/mat-sidenav-content/main/app-complaint/app-layouts/div/div/app-field-builder/div/section[2]/div[1]/form/mat-accordion/div[10]/mat-expansion-panel/div/div/div[2]/app-invoice/div/div/div[3]/div[10]/div/mat-form-field/div/div[1]/div[3]/mat-select/div/div[1]/span/span")).click();
			}
			catch (Exception e)
			{
				System.out.println("Test Failed: Approval Type is not available");
				driver.close();
			}
		//Approval type options
		//Select an option-1
		//Select an Approve-2
		//Select an Reject-3
		//Select an On Hold-4
		//Select an Reject with fee-5
		//Select an Reject without fee-6
		//Select an Total Loss-7
		//Select an Reimbursement-8
		//Select an Partial Settlement-9
		//Select an Invoice rejected approved-10
		
		
		
		try {
			 driver.findElement(By.xpath("//mat-option[3]/span")).click();
			}
			catch (Exception e)
			{
				System.out.println("Test Failed: Approval Type value is not available");
				driver.close();
			}

		try {
			 driver.findElement(By.xpath("//div[2]/div/button/span")).click();
			}
			catch (Exception e)
			{
				System.out.println("Test Failed: submit is not available");
				driver.close();
			}
		try {
		
		driver.findElement(By.xpath("//*[@id=\"modal-action-button\"]/span")).click();
		}
		  catch (Exception e) {
	      System.out.println("Estimate was not put on hold");
	    }
	driver.close();
	}	
	
}
