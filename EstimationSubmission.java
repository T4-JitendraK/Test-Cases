package automationFramework;

import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
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
	 	 
	 driver.get("https://devreassure.innov.co.in/complaints/view/23");
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
	          	driver.findElement(By.xpath("//div[2]/div/button/span")).click();
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
String DefectType=driver.findElement(By.id("//mat-error[contains(.,'Defect Type is Required')]")).getText();
if (DefectType.contentEquals("Repair Type Required")) {
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
	 	 
	 driver.get("https://devreassure.innov.co.in/complaints/view/23");
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
	 // invalid QTY part 1
	 try {
		 driver.findElement(By.id("mat-input-20")).clear();
		 driver.findElement(By.id("mat-input-20")).sendKeys("-1");
			 
		 Thread.sleep(2000);
		 String InvalidQty=driver.findElement(By.id("mat-error-0")).getText();
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
	 // invalid QTY part 2
	 try {
		 driver.findElement(By.id("mat-input-27")).clear();
		 driver.findElement(By.id("mat-input-27")).sendKeys("-5");
			 
		 Thread.sleep(2000);
		 String InvalidQty2=driver.findElement(By.id("mat-error-8")).getText();
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


	 // invalid UnitPrice part1
	 try {
		 driver.findElement(By.xpath("//td[5]/div/mat-form-field/div/div/div[3]/input")).clear();
		 driver.findElement(By.xpath("//td[5]/div/mat-form-field/div/div/div[3]/input")).sendKeys("-100");

 
		 Thread.sleep(2000);
		 String UnitPrice=driver.findElement(By.id("mat-error-3")).getText();
		 if (UnitPrice.contentEquals("Unit Rate must be > 0")) {
		 System.out.println("Message for entering invalid QTY1 is :"+UnitPrice);
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
   		Robot r = new Robot(); r.keyPress(KeyEvent.VK_TAB); 
   			r.keyRelease(KeyEvent.VK_TAB);
   		} catch (Exception e) { 

       		System.out.println("Tab error");
   		}

	 // invalid IGST part1
	 try {
		 driver.findElement(By.id("mat-input-23")).clear();
		 driver.findElement(By.id("mat-input-23")).sendKeys("-200");

		 Thread.sleep(2000);
		 String IGST=driver.findElement(By.id("mat-error-6")).getText();
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
   		Robot r = new Robot(); r.keyPress(KeyEvent.VK_TAB); 
   			r.keyRelease(KeyEvent.VK_TAB);
   		} catch (Exception e) { 

       		System.out.println("Escape error");
   		}

	 // invalid QTY part 2
	 try {
		 driver.findElement(By.id("mat-input-27")).clear();
		 driver.findElement(By.id("mat-input-27")).sendKeys("-5");
			 
		 Thread.sleep(2000);
		 String InvalidQty2=driver.findElement(By.id("mat-error-8")).getText();
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
	

	 // invalid UnitPrice part2
	 try {
		 driver.findElement(By.xpath("//tr[2]/td[5]/div/mat-form-field/div/div/div[3]/input")).clear();
		 driver.findElement(By.xpath("//tr[2]/td[5]/div/mat-form-field/div/div/div[3]/input")).sendKeys("-100");

 
		 Thread.sleep(2000);
		 String UnitPrice2=driver.findElement(By.id("mat-error-10")).getText();
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
   		Robot r = new Robot(); r.keyPress(KeyEvent.VK_TAB); 
   			r.keyRelease(KeyEvent.VK_TAB);
   		} catch (Exception e) { 

       		System.out.println("Escape error");
   		}

	 // invalid IGST part3
	 try {
		 driver.findElement(By.id("mat-input-30")).clear();
		 driver.findElement(By.id("mat-input-30")).sendKeys("-300");

		 Thread.sleep(2000);
		 String IGST2=driver.findElement(By.id("mat-error-12")).getText();
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
   		Robot r = new Robot(); r.keyPress(KeyEvent.VK_TAB); 
   			r.keyRelease(KeyEvent.VK_TAB);
   		} catch (Exception e) { 

       		System.out.println("Escape error");
   		}

	 
}
	 
}