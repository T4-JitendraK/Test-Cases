package automationFramework;

import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class EstimationSubmission {
	public WebDriver driver;
	 String driverPath = "D:\\jitendra\\Selenium drivers\\latestchromedriver\\chromedriver.exe";
	 public String  baseUrl;
	 
	 
	 
	 
	 @Test (priority=1)
	 public void BlankEstimation() {
	 	 System.setProperty("webdriver.chrome.driver", driverPath);
	 	   driver = new ChromeDriver();
	 	   driver.manage().window().maximize();
	 	   driver.manage().deleteAllCookies();
	 	   driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	 	 
	 driver.get("https://devreassure.innov.co.in/complaints/view/38");
	 driver.findElement(By.xpath("//input[@type='text']")).click();
	 driver.findElement(By.xpath("//input[@type='text']")).clear();
	 driver.findElement(By.xpath("//input[@type='text']")).sendKeys("IND068");
	 driver.findElement(By.xpath("//input[@type='password']")).clear();
	 driver.findElement(By.xpath("//input[@type='password']")).sendKeys("Welcome@123");
	 driver.findElement(By.xpath("//button[@type='submit']")).click();
              
	 // add estimation quick link
	 try {
	          driver.findElement(By.xpath("//span[contains(.,'Add Estimation')]")).click();
              }
              catch (Exception e)
	          {
	          	System.out.println("Test Failed: Add Estimation button is disabled or not present");
	          	driver.close();
	          }
	         /*driver.findElement(By.id("mat-input-20")).clear();

	    	 WebElement element = driver.findElement(By.id("mat-input-21"));//Enter ID for the element. You can use Name, xpath, cssSelector whatever you like
	    	 element.sendKeys(Keys.TAB);
	    	 element.sendKeys(Keys.ENTER);
	         
	         driver.findElement(By.id("mat-input-21")).clear();
	         driver.findElement(By.id("mat-input-23")).clear();
	         */
	// submit button
	          try {
	          	driver.findElement(By.xpath("//div[10]/mat-expansion-panel/div/div/div[2]/div/button/span")).click();
	          }

	          catch (Exception e)
	          {
	          	System.out.println("Test Failed:Submit button is disabled or not present");
	          	driver.close();
	          }
	          // error pop up for blank submission
	          try {
	          	 Thread.sleep(2000);
	           	String Msg= driver.findElement(By.xpath("//span[contains(.,'Error : Please fill all required field.')]")).getText();
	           	System.out.println("Pop-up Error message is :"+ Msg);
	           	
	           }

	           catch (Exception e)
	           {
	           	System.out.println("Test Failed:Pop-upError Message not found");
	           	driver.close();
	           }

	          
	           try {
	           	driver.findElement(By.xpath("//span[contains(.,'Close')]")).click();
	           }

	           catch (Exception e)
	           {
	           	System.out.println("Test Failed:Close button is disabled or not present");
	           	driver.close();
	           }
	           //Validation check for HSN1
                              	 try {
                              		 Thread.sleep(2000);
                    	String HSN1Message=driver.findElement(By.xpath("//mat-error[contains(.,'HSN/HAC Code is Required')]")).getText();
                    	if (HSN1Message.contentEquals("HSN/HAC Code is Required")) {
                    		System.out.println("Message for leaving HSN code for part1 blank is :"+HSN1Message);
                    		}
                    	else {
                    		System.out.println("Test Failed: Wrong error Message for part1");
                    	}
                    }

                    catch (Exception e)
                    {
                    	System.out.println("Test Failed:Error Message no found for part1");
                    	driver.close();
                    }
                          /*    	 //Validation check for QTY1
                              	 try { driver.findElement(By.id("mat-input-20")).clear();
                              		 Thread.sleep(2000);	 
                    	String QTY1Message=driver.findElement(By.xpath("//mat-error[contains(.,'Qty is Required')]")).getText();
                    	if (QTY1Message.contentEquals("Qty is Required")) {
                    		System.out.println("Message for leaving QTY for part1 blank is :"+QTY1Message);
                    		}
                    	else {
                    		System.out.println("Test Failed: Wrong error Message");
                    	}
                    }

                    catch (Exception e)
                    {
                    	System.out.println("Test Failed:Error Message no found");
                    	driver.close();
                    }

                              	//Validation check for Unit price-part1
                              	 try {driver.findElement(By.id("mat-input-21")).clear();
                              		 Thread.sleep(2000);
                    	String UP1Message=driver.findElement(By.xpath("//mat-error[contains(.,'Unit Rate is Required')]")).getText();
                    	if (UP1Message.contentEquals("Unit Rate is Required")) {
                    		System.out.println("Message for leaving Unit Price for part1 blank is :"+UP1Message);
                    		}
                    	else {
                    		System.out.println("Test Failed: Wrong error Message");
                    	}
                    }

                    catch (Exception e)
                    {
                    	System.out.println("Test Failed:Error Message no found");
                    	driver.close();
                    }
                              	//Validation check for IGST-part1
                              	 try {driver.findElement(By.id("mat-input-23")).clear();
                              		 Thread.sleep(2000);
                    	String IGST1Message=driver.findElement(By.xpath("//mat-error[contains(.,'IGST Rate is Required')]")).getText();
                    	if (IGST1Message.contentEquals("IGST Rate is Required")) {
                    		System.out.println("Message for leaving IGST for part1 blank is :"+IGST1Message);
                    		}
                    	else {
                    		System.out.println("Test Failed: Wrong error Message");
                    	}
                    }

                    catch (Exception e)
                    {
                    	System.out.println("Test Failed:Error Message no found");
                    	driver.close();
                    }

 */
               

	 //Validation check for HSN2
  	 try {
  		 Thread.sleep(2000);
String HSN2Message=driver.findElement(By.id("mat-error-1")).getText();
if (HSN2Message.contentEquals("HSN/HAC Code is Required")) {
System.out.println("Message for leaving HSN code for part2 blank is :"+HSN2Message);
}
else {
System.out.println("Test Failed: Wrong error Message for part2");
}
}

catch (Exception e)
{
System.out.println("Test Failed:Error Message no found for part2");
driver.close();
}
  	//Validation check for HSN3
  	 try {
  		 Thread.sleep(2000);
String HSN3Message=driver.findElement(By.id("mat-error-2")).getText();
if (HSN3Message.contentEquals("HSN/HAC Code is Required")) {
System.out.println("Message for leaving HSN code for part3 blank is :"+HSN3Message);
}
else {
System.out.println("Test Failed: Wrong error Message for part3");
}
}

catch (Exception e)
{
System.out.println("Test Failed:Error Message no found for part3");
driver.close();
}
  	 
  	//Validation check for expected repair completion date
  	 try {
  		 Thread.sleep(2000);
String ExpDate=driver.findElement(By.id("mat-error-3")).getText();
if (ExpDate.contentEquals("Expected Repair Completion Date is Required")) {
System.out.println("Message for leaving HSN code for part3 blank is :"+ExpDate);
}
else {
System.out.println("Test Failed: Wrong error Message for expected repair completion date");
}
}

catch (Exception e)
{
System.out.println("Test Failed:Error Message no found for expected repair completion date");
driver.close();
}
  	//Validation check for RepairType
  	 try {
  		 Thread.sleep(2000);
String RepairType=driver.findElement(By.id("mat-error-4")).getText();
if (RepairType.contentEquals("Repair Type Required")) {
System.out.println("Message for leaving HSN code for part3 blank is :"+RepairType);
}
else {
System.out.println("Test Failed: Wrong error Message for RepairType");
}
}

catch (Exception e)
{
System.out.println("Test Failed:Error Message no found for RepairType");
driver.close();
}

  	//Validation check for DefectType
  	 try {
  		 Thread.sleep(2000);
String DefectType=driver.findElement(By.xpath("//mat-error[contains(.,'Defect Type is Required')]")).getText();
if (DefectType.contentEquals("Defect Type is Required")) {
System.out.println("Message for leaving HSN code for part3 blank is :"+DefectType);
}
else {
System.out.println("Test Failed: Wrong error Message for DefectType");
}
}

catch (Exception e)
{
System.out.println("Test Failed:Error Message no found for DefectType");
driver.close();
}
  	 driver.close();
}
	 @Test (priority=2)
	 public void InvalidEstimation() {
	 	 System.setProperty("webdriver.chrome.driver", driverPath);
	 	   driver = new ChromeDriver();
	 	   driver.manage().window().maximize();
	 	   driver.manage().deleteAllCookies();
	 	   driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	 	 
	 driver.get("https://devreassure.innov.co.in/complaints/view/38");
	 driver.findElement(By.xpath("//input[@type='text']")).click();
	 driver.findElement(By.xpath("//input[@type='text']")).clear();
	 driver.findElement(By.xpath("//input[@type='text']")).sendKeys("IND068");
	 driver.findElement(By.xpath("//input[@type='password']")).clear();
	 driver.findElement(By.xpath("//input[@type='password']")).sendKeys("Welcome@123");
	 driver.findElement(By.xpath("//button[@type='submit']")).click();
	          
	 // add estimation quick link
	 try {
	          driver.findElement(By.xpath("//span[contains(.,'Add Estimation')]")).click();
	          }
	          catch (Exception e)
	          {
	          	System.out.println("Test Failed: Add Estimation button is disabled or not present");
	          	driver.close();
	          }
	 
	 try {
	 driver.findElement(By.id("mat-input-20")).clear();
	 driver.findElement(By.id("mat-input-20")).sendKeys("-100");
	 }
	 catch (Exception e)
	 {
	 	System.out.println("Test Failed: QTY1 is not available");
	 	driver.close();
	 }

	 
	 try {
	 driver.findElement(By.id("mat-input-27")).clear();
	 driver.findElement(By.id("mat-input-27")).sendKeys("-200");
	}
	catch (Exception e)
	{
		System.out.println("Test Failed: Price1 is not available");
		driver.close();
	}
	try {
	 driver.findElement(By.id("mat-input-34")).clear();
	 driver.findElement(By.id("mat-input-34")).sendKeys("-300");
	}
	catch (Exception e)
	{
		System.out.println("Test Failed: IGST1 is not available");
		driver.close();
	}

	try{
	 driver.findElement(By.id("mat-input-21")).clear();
	 driver.findElement(By.id("mat-input-21")).sendKeys("-5");
	}
	catch (Exception e)
	{
		System.out.println("Test Failed: QTY2 is not available");
		driver.close();
	}
	try {
	 driver.findElement(By.id("mat-input-28")).clear();
	 driver.findElement(By.id("mat-input-28")).sendKeys("-10");
	}
	catch (Exception e)
	{
		System.out.println("Test Failed: Price2 is not available");
		driver.close();
	}
	try {
	 driver.findElement(By.id("mat-input-35")).clear();
	 driver.findElement(By.id("mat-input-35")).sendKeys("-15");
	}
	catch (Exception e)
	{
		System.out.println("Test Failed: IGST2 is not available");
		driver.close();
	}

	try {
	 driver.findElement(By.id("mat-input-23")).clear();
	driver.findElement(By.id("mat-input-23")).sendKeys("-10");
	}
	catch (Exception e)
	{
		System.out.println("Test Failed: QTY3 is not available");
		driver.close();
	}
	try {
	 driver.findElement(By.id("mat-input-30")).clear();
	 driver.findElement(By.id("mat-input-30")).sendKeys("-20");
	}
	catch (Exception e)
	{
		System.out.println("Test Failed: Price3 is not available");
		driver.close();
	}
	try {
	 driver.findElement(By.id("mat-input-37")).clear();
	 driver.findElement(By.id("mat-input-37")).sendKeys("-30");
	 }
	catch (Exception e)
	{
		System.out.println("Test Failed: IGST3 is not available");
		driver.close();
	}
	try {
		 driver.findElement(By.xpath("//div[3]/div/mat-form-field/div/div/div[3]/input")).clear();
		 driver.findElement(By.xpath("//div[3]/div/mat-form-field/div/div/div[3]/input")).sendKeys("-500");
		 }
		catch (Exception e)
		{
			System.out.println("Test Failed: Discount is not available");
			driver.close();
		}



	try {
		 String InvalidQty=driver.findElement(By.xpath("//mat-error[contains(.,'Qty. must be > 0')]")).getText();
		 if (InvalidQty.contentEquals("Qty. must be > 0")) {
		 System.out.println("Message for entering invalid QTY1 is :"+InvalidQty);
		 
		 }
		 else {
		 System.out.println("Test Failed: Wrong error Message for InvalidQty");
		 }
		 }

		 catch (Exception e)
		 {
		 System.out.println("Test Failed:Error Message no found for InvalidQty");
		 driver.close();
		 }
	try {
		 String InvalidQty2=driver.findElement(By.xpath("//tr[2]/td[4]/div/mat-form-field/div/div[2]/div/mat-error")).getText();
		 if (InvalidQty2.contentEquals("Qty. must be > 0")) {
		 System.out.println("Message for entering invalid QTY2 is :"+InvalidQty2);
		 
		 }
		 else {
		 System.out.println("Test Failed: Wrong error Message for InvalidQty2");
		 }
		 }

		 catch (Exception e)
		 {
		 System.out.println("Test Failed:Error Message no found for InvalidQty2");
		 driver.close();
		 }
	try {
		 String InvalidQty3=driver.findElement(By.xpath("//tr[3]/td[4]/div/mat-form-field/div/div[2]/div/mat-error")).getText();
		 if (InvalidQty3.contentEquals("Qty. must be > 0")) {
		 System.out.println("Message for entering invalid QTY3 is :"+InvalidQty3);
		 
		 }
		 else {
		 System.out.println("Test Failed: Wrong error Message for InvalidQty3");
		 }
		 }

		 catch (Exception e)
		 {
		 System.out.println("Test Failed:Error Message no found for InvalidQty3");
		 driver.close();
		 }
	try {
		 	 String UnitPrice=driver.findElement(By.xpath("//mat-error[contains(.,'Unit Rate must be > 0')]")).getText();
		 if (UnitPrice.contentEquals("Unit Rate must be > 0")) {
		 System.out.println("Message for entering invalid UnitPrice is :"+UnitPrice);
		 }
		 else {
		 System.out.println("Test Failed: Wrong error Message for UnitPrice");
		 }
		 }

		 catch (Exception e)
		 {
		 System.out.println("Test Failed:Error Message no found for UnitPrice");
		 driver.close();
		 }
	try {
		 String UnitPrice2=driver.findElement(By.xpath("//tr[2]/td[5]/div/mat-form-field/div/div[2]/div/mat-error")).getText();
		 if (UnitPrice2.contentEquals("Unit Rate must be > 0")) {
		 System.out.println("Message for entering invalid UnitPrice2 is :"+UnitPrice2);
		 }
		 else {
		 System.out.println("Test Failed: Wrong error Message for UnitPrice2");
		 }
		 }

		 catch (Exception e)
		 {
		 System.out.println("Test Failed:Error Message no found for UnitPrice2");
		 driver.close();
		 }

	try {
		 String UnitPrice3=driver.findElement(By.xpath("//tr[3]/td[5]/div/mat-form-field/div/div[2]/div/mat-error")).getText();
		 if (UnitPrice3.contentEquals("Unit Rate must be > 0")) {
		 System.out.println("Message for entering invalid UnitPrice3 is :"+UnitPrice3);
		 }
		 else {
		 System.out.println("Test Failed: Wrong error Message for UnitPrice3");
		 }
		 }

		 catch (Exception e)
		 {
		 System.out.println("Test Failed:Error Message no found for UnitPrice3");
		 driver.close();
		 }
	try {
		 String IGST=driver.findElement(By.xpath("//mat-error[contains(.,'Invalid IGST Rate')]")).getText();
		 if (IGST.contentEquals("Invalid IGST Rate")) {
		 System.out.println("Message for entering invalid IGST is :"+IGST);
		 }
		 else {
		 System.out.println("Test Failed: Wrong error Message for IGST");
		 }
		 }

		 catch (Exception e)
		 {
		 System.out.println("Test Failed:Error Message no found for IGST");
		 driver.close();
		 }

	try {
		 String IGST2=driver.findElement(By.xpath("//tr[2]/td[7]/div/mat-form-field/div/div[2]/div/mat-error")).getText();
		 if (IGST2.contentEquals("Invalid IGST Rate")) {
		 System.out.println("Message for entering invalid IGST2 is :"+IGST2);
		 }
		 else {
		 System.out.println("Test Failed: Wrong error Message for IGST2");
		 }
		 }

		 catch (Exception e)
		 {
		 System.out.println("Test Failed:Error Message no found for IGST2");
		 driver.close();
		 }
	try {
		 String IGST3=driver.findElement(By.xpath("//tr[3]/td[7]/div/mat-form-field/div/div[2]/div/mat-error")).getText();
		 if (IGST3.contentEquals("Invalid IGST Rate")) {
		 System.out.println("Message for entering invalid IGST3 is :"+IGST3);
		 }
		 else {
		 System.out.println("Test Failed: Wrong error Message for IGST3");
		 }
		 }

		 catch (Exception e)
		 {
		 System.out.println("Test Failed:Error Message no found for IGST3");
		 driver.close();
		 }
	try {
		 String Disc=driver.findElement(By.xpath("//mat-error[contains(.,'Discount must be > 0')]")).getText();
		 if (Disc.contentEquals("Discount must be > 0")) {
		 System.out.println("Message for entering invalid Disc is :"+Disc);
		 }
		 else {
		 System.out.println("Test Failed: Wrong error Message for Disc");
		 }
		 }

		 catch (Exception e)
		 {
		 System.out.println("Test Failed:Error Message no found for Disc");
		 driver.close();
		 }

	 // Validation check for expected repair Completion date      
    try {
	driver.findElement(By.cssSelector("mat-datepicker-toggle.ng-tns-c72-58 > button:nth-child(1) > span:nth-child(1) > svg:nth-child(1)")).click();
}

catch (Exception e)
{
	System.out.println("Test Failed:Datepicker icon is disabled or not present");
	driver.close();
}
try {
	driver.findElement(By.xpath("//tr[5]/td[7]/div")).click();
}

catch (Exception e)
{
	System.out.println("Invalid date or date is disabled or element not found");
	driver.close();
}
	driver.close();
	 }
	 @Test (priority=3)
	 public void PartAdditionDeletion() {
	 	 System.setProperty("webdriver.chrome.driver", driverPath);
	 	   driver = new ChromeDriver();
	 	   driver.manage().window().maximize();
	 	   driver.manage().deleteAllCookies();
	 	   driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	 	 
	 driver.get("https://devreassure.innov.co.in/complaints/view/38");
	 driver.findElement(By.xpath("//input[@type='text']")).click();
	 driver.findElement(By.xpath("//input[@type='text']")).clear();
	 driver.findElement(By.xpath("//input[@type='text']")).sendKeys("IND068");
	 driver.findElement(By.xpath("//input[@type='password']")).clear();
	 driver.findElement(By.xpath("//input[@type='password']")).sendKeys("Welcome@123");
	 driver.findElement(By.xpath("//button[@type='submit']")).click();
	          
	 // add estimation quick link
	 try {
	          driver.findElement(By.xpath("//span[contains(.,'Add Estimation')]")).click();
	          }
	          catch (Exception e)
	          {
	          	System.out.println("Test Failed: Add Estimation button is disabled or not present");
	          	driver.close();
	          }
	 
	 //Part Addition
	 try {
		 driver.findElement(By.xpath("//div[2]/div/mat-button/mat-icon")).click();
	 }
	 
	 catch (Exception e)
	 {
	 	System.out.println("Test Failed: part addition '+' is not available");
	 	driver.close();
	 }
	 try {
		 driver.findElement(By.xpath("//mat-select[@id='mat-select-14']/div/div")).click();
	 }
	 
	 catch (Exception e)
	 {
	 	System.out.println("Test Failed: part addition dropdown not available");
	 	driver.close();
	 }
	 try {
		 driver.findElement(By.xpath("//mat-option[5]/span")).click();
	 }
	 
	 catch (Exception e)
	 {
	 	System.out.println("Test Failed: part addition dropdown value not available");
	 	driver.close();
	 }

	 try {
	 driver.findElement(By.id("mat-input-40")).clear();
	 driver.findElement(By.id("mat-input-40")).sendKeys("Test4");
	 }
	 catch (Exception e)
	 {
	 	System.out.println("Test Failed: HSNfield is not available");
	 	driver.close();
	 }

	 try {
		 driver.findElement(By.id("mat-input-41")).clear();
		 driver.findElement(By.id("mat-input-41")).sendKeys("2");
		 }
		 catch (Exception e)
		 {
		 	System.out.println("Test Failed: QTY field is not available");
		 	driver.close();
		 }
	 try {
		 driver.findElement(By.id("mat-input-42")).clear();
		 driver.findElement(By.id("mat-input-42")).sendKeys("120");
		 }
		 catch (Exception e)
		 {
		 	System.out.println("Test Failed: Price field is not available");
		 	driver.close();
		 }
	 try {
		 driver.findElement(By.id("mat-input-44")).clear();
		 driver.findElement(By.id("mat-input-44")).sendKeys("12");
		 }
		 catch (Exception e)
		 {
		 	System.out.println("Test Failed: Gst field is not available");
		 	driver.close();
		 }
	 
	 System.out.println("Part addition is successfull");
	 
	// part addition close
	 
	 //Part Deletion start
	 try {
		 driver.findElement(By.xpath("//tr[4]/td[10]/div/div/mat-button/mat-icon")).click();
		 
		 }
		 catch (Exception e)
		 {
		 	System.out.println("Test Failed: Delete button is not available");
		 	driver.close();
		 }

	 try {
		 driver.findElement(By.xpath("//button[contains(.,'No')]")).click();
		 
		 }
		 catch (Exception e)
		 {
			 driver.switchTo().activeElement();
		 	System.out.println("Test Failed: No button is not available on delete confirmation");
		 	driver.close();
		 }

	 try {
		 driver.findElement(By.xpath("//tr[4]/td[10]/div/div/mat-button/mat-icon")).click();
		 
		 }
		 catch (Exception e)
		 {
		 	System.out.println("Test Failed: Delete button is not available");
		 	driver.close();
		 }

	 try {
		 driver.findElement(By.xpath("//button[contains(.,'Yes')]")).click();
		 
		 }
		 catch (Exception e)
		 {
			 driver.switchTo().activeElement();
		 	System.out.println("Test Failed: No button is not available on delete confirmation");
		 	driver.close();
		 }


	 System.out.println("Part deletion is successfull");
	 driver.close();

	 }
	 @Test (priority=4)
	 public void AddEstimation() {
	 	 System.setProperty("webdriver.chrome.driver", driverPath);
	 	   driver = new ChromeDriver();
	 	   driver.manage().window().maximize();
	 	   driver.manage().deleteAllCookies();
	 	   driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	 	 
	 driver.get("https://devreassure.innov.co.in/complaints/view/38");
	 driver.findElement(By.xpath("//input[@type='text']")).click();
	 driver.findElement(By.xpath("//input[@type='text']")).clear();
	 driver.findElement(By.xpath("//input[@type='text']")).sendKeys("IND068");
	 driver.findElement(By.xpath("//input[@type='password']")).clear();
	 driver.findElement(By.xpath("//input[@type='password']")).sendKeys("Welcome@123");
	 driver.findElement(By.xpath("//button[@type='submit']")).click();
	          
	 // add estimation quick link
	 try {
	          driver.findElement(By.xpath("//span[contains(.,'Add Estimation')]")).click();
	          }
	          catch (Exception e)
	          {
	          	System.out.println("Test Failed: Add Estimation button is disabled or not present");
	          	driver.close();
	          }
	 try {
		 driver.findElement(By.id("mat-input-19")).clear();
		 driver.findElement(By.id("mat-input-19")).sendKeys("Test1");
		 }
		 catch (Exception e)
		 {
		 	System.out.println("Test Failed: HSN1 Code is not available");
		 	driver.close();
		 }

	 try {
		 driver.findElement(By.id("mat-input-26")).clear();
		 driver.findElement(By.id("mat-input-26")).sendKeys("Test2");
		 }
		 catch (Exception e)
		 {
		 	System.out.println("Test Failed: HSN2 Code is not available");
		 	driver.close();
		 }
	 try {
		 driver.findElement(By.id("mat-input-33")).clear();
		 driver.findElement(By.id("mat-input-33")).sendKeys("Test3");
		 }
		 catch (Exception e)
		 {
		 	System.out.println("Test Failed: HSN3 Code is not available");
		 	driver.close();
		 }
	 
	 try {
	 driver.findElement(By.id("mat-input-20")).clear();
	 driver.findElement(By.id("mat-input-20")).sendKeys("1");
	 }
	 catch (Exception e)
	 {
	 	System.out.println("Test Failed: QTY1 is not available");
	 	driver.close();
	 }

	 
	 try {
	 driver.findElement(By.id("mat-input-21")).clear();
	 driver.findElement(By.id("mat-input-21")).sendKeys("2000");
	}
	catch (Exception e)
	{
		System.out.println("Test Failed: Price1 is not available");
		driver.close();
	}
	try {
	 driver.findElement(By.id("mat-input-23")).clear();
	 driver.findElement(By.id("mat-input-23")).sendKeys("12");
	}
	catch (Exception e)
	{
		System.out.println("Test Failed: IGST1 is not available");
		driver.close();
	}

	try{
	 driver.findElement(By.id("mat-input-27")).clear();
	 driver.findElement(By.id("mat-input-27")).sendKeys("1");
	}
	catch (Exception e)
	{
		System.out.println("Test Failed: QTY2 is not available");
		driver.close();
	}
	try {
	 driver.findElement(By.id("mat-input-28")).clear();
	 driver.findElement(By.id("mat-input-28")).sendKeys("500");
	}
	catch (Exception e)
	{
		System.out.println("Test Failed: Price2 is not available");
		driver.close();
	}
	try {
	 driver.findElement(By.id("mat-input-30")).clear();
	 driver.findElement(By.id("mat-input-30")).sendKeys("12");
	}
	catch (Exception e)
	{
		System.out.println("Test Failed: IGST2 is not available");
		driver.close();
	}

	try {
	 driver.findElement(By.id("mat-input-34")).clear();
	driver.findElement(By.id("mat-input-34")).sendKeys("1");
	}
	catch (Exception e)
	{
		System.out.println("Test Failed: QTY3 is not available");
		driver.close();
	}
	try {
	 driver.findElement(By.id("mat-input-35")).clear();
	 driver.findElement(By.id("mat-input-35")).sendKeys("1000");
	}
	catch (Exception e)
	{
		System.out.println("Test Failed: Price3 is not available");
		driver.close();
	}
	try {
	 driver.findElement(By.id("mat-input-37")).clear();
	 driver.findElement(By.id("mat-input-37")).sendKeys("12");
	 }
	catch (Exception e)
	{
		System.out.println("Test Failed: IGST3 is not available");
		driver.close();
	}
	try {
		 driver.findElement(By.xpath("//div[3]/div/mat-form-field/div/div/div[3]/input")).clear();
		 driver.findElement(By.xpath("//div[3]/div/mat-form-field/div/div/div[3]/input")).sendKeys("50");
		 }
		catch (Exception e)
		{
			System.out.println("Test Failed: Discount is not available");
			driver.close();
		}

	 // Validation check for expected repair Completion date      
    try {
	driver.findElement(By.cssSelector("mat-datepicker-toggle.ng-tns-c72-58 > button:nth-child(1) > span:nth-child(1) > svg:nth-child(1)")).click();
}

catch (Exception e)
{
	System.out.println("Test Failed:Datepicker icon is disabled or not present");
	driver.close();
}
try {
	driver.findElement(By.xpath("//tr[5]/td[7]/div")).click();
}

catch (Exception e)
{
	System.out.println("Invalid date or date is disabled or element not found");
	driver.close();
}
try {
	 driver.findElement(By.xpath("//div[4]/div/mat-form-field/div/div/div[3]")).click();
	}
	catch (Exception e)
	{
		System.out.println("Test Failed: Repair Type dropdown is not available");
		driver.close();
	}
try {
	 driver.findElement(By.xpath("//span[contains(.,'Minor')]")).click();
	}
	catch (Exception e)
	{
		System.out.println("Test Failed: Repair Type field value is not available");
		driver.close();
	}

try {
	 driver.findElement(By.xpath("//div[5]/div/mat-form-field/div/div/div[3]/mat-select/div/div")).click();
	}
	catch (Exception e)
	{
		System.out.println("Test Failed: Defect Type dropdown is not available");
		driver.close();
	}
try {
	 driver.findElement(By.xpath("//span[contains(.,'Non Manufacturing Defect')]")).click();
	}
	catch (Exception e)
	{
		System.out.println("Test Failed: Defect Type field value is not available");
		driver.close();
	}

//Save as draft
try {
	 driver.findElement(By.xpath("//div[8]/div/mat-form-field/div/div/div[3]/mat-select/div/div[2]/div")).click();
	}
	catch (Exception e)
	{
		System.out.println("Test Failed: Approval Type dropdown is not available");
		driver.close();
	}


try {
	 driver.findElement(By.xpath("//span[contains(.,'Save As Draft')]")).click();
	}
	catch (Exception e)
	{
		System.out.println("Test Failed: Approval Type field value is not available");
		driver.close();
	}
try {
	 driver.findElement(By.xpath("//div[10]/mat-expansion-panel/div/div/div[2]/div/button/span")).click();
	}
	catch (Exception e)
	{
		System.out.println("Test Failed: Submission button is not available");
		driver.close();
	}
//For success Message
driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
String TitleW= driver.switchTo().activeElement().getText();
System.out.println("Model Box title is:" +TitleW);
WebDriverWait wait = new WebDriverWait(driver, 120);
String Successmsg = driver.findElement(By.xpath("//p[contains(.,'Estimation has been saved as draft , please cross check the final estimate amount post saving.')]")).getText();
wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//p[contains(.,'Estimation has been saved as draft , please cross check the final estimate amount post saving.')]")));
driver.findElement(By.xpath("//button[@id='modal-action-button']")).click();
                         
if (Successmsg.contentEquals("Estimation has been saved as draft , please cross check the final estimate amount post saving."))
{
	 
	 System.out.println(Successmsg);

}
else {
  System.out.println("Estimation save as draft success message is incorrect");

}

	 }


//estimate submission
@Test (priority=5)
public void EstimationSubmissionn() {
	 System.setProperty("webdriver.chrome.driver", driverPath);
	   driver = new ChromeDriver();
	   driver.manage().window().maximize();
	   driver.manage().deleteAllCookies();
	   driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	 
driver.get("https://devreassure.innov.co.in/complaints/view/38");
driver.findElement(By.xpath("//input[@type='text']")).click();
driver.findElement(By.xpath("//input[@type='text']")).clear();
driver.findElement(By.xpath("//input[@type='text']")).sendKeys("IND068");
driver.findElement(By.xpath("//input[@type='password']")).clear();
driver.findElement(By.xpath("//input[@type='password']")).sendKeys("Welcome@123");
driver.findElement(By.xpath("//button[@type='submit']")).click();
         
// add estimation quick link
try {
         driver.findElement(By.xpath("//span[contains(.,'Add Estimation')]")).click();
         }
         catch (Exception e)
         {
         	System.out.println("Test Failed: Add Estimation button is disabled or not present");
         	driver.close();
         }





try {
	 driver.findElement(By.xpath("//div[8]/div/mat-form-field/div/div/div[3]/mat-select/div")).click();
	}
	catch (Exception e)
	{
		System.out.println("Test Failed: Approval Type dropdown is not available");
		driver.close();
	}


try {
	 driver.findElement(By.xpath("//span[contains(.,'Submit For Approval')]")).click();
	}
	catch (Exception e)
	{
		System.out.println("Test Failed: Approval Type field value is not available");
		driver.close();
	}
try {
	 driver.findElement(By.xpath("//div[10]/mat-expansion-panel/div/div/div[2]/div/button")).click();
	}
	catch (Exception e)
	{
		System.out.println("Test Failed: Submission button is not available");
		driver.close();
	}
//For success Message
driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
String Titlee= driver.switchTo().activeElement().getText();
System.out.println("Model Box title is:" +Titlee);
WebDriverWait wait1 = new WebDriverWait(driver, 120);
String Successmsg1 = driver.findElement(By.xpath("//p[contains(.,'Estimation has been submitted for approval , please cross check the final estimate amount post saving.')]")).getText();
wait1.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//p[contains(.,'Estimation has been submitted for approval , please cross check the final estimate amount post saving.')]")));
driver.findElement(By.xpath("//button[@id='modal-action-button']")).click();
                        
if (Successmsg1.contentEquals("Estimation has been submitted for approval , please cross check the final estimate amount post saving."))
{
	 
	 System.out.println(Successmsg1);

}
else {
 System.out.println("Estimation submission success message is incorrect");

}

driver.close();

}

	 
 	 
}