package automationFramework;

import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.ArrayList;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class InvoiceSubmission {
	public WebDriver driver;
	 String driverPath = "D:\\jitendra\\Selenium drivers\\latestchromedriver\\chromedriver.exe";
	 public String  baseUrl;
	 
	
	
	@Test (priority=2)
	 public void BlankGeneration() {
	 	 System.setProperty("webdriver.chrome.driver", driverPath);
	 	   driver = new ChromeDriver();
	 	   driver.manage().window().maximize();
	 	   driver.manage().deleteAllCookies();
	 	   driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	 try {	 
	 driver.get("https://devreassure.innov.co.in/complaints/view/48");
	 }
	 catch (Exception e)
    {
    	System.out.println("Test Failed: Unable to open the URL");
    	driver.close();
    }
	 
	 driver.findElement(By.xpath("//input[@type='text']")).click();
	 driver.findElement(By.xpath("//input[@type='text']")).clear();
	 try {
	 driver.findElement(By.xpath("//input[@type='text']")).sendKeys("IND067");
	 }
	 catch (Exception e)
    {
    	System.out.println("Test Failed: Username field not available");
    	driver.close();
    }
	 driver.findElement(By.xpath("//input[@type='password']")).clear();
	 try {
	 driver.findElement(By.xpath("//input[@type='password']")).sendKeys("Welcome@123");
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
	          
	 // Invoice Submit quick link
	 try {
		 
		 driver.findElement(By.xpath("//div[@id='fieldRightSidebarContainer']/div/section/div[5]/a/span[2]")).click();
	          }
	          catch (Exception e)
	          {
	          	System.out.println("Test Failed: Invoice Submit button is disabled or not present");
	          	driver.close();
	          }
	 
	 //  generate Now Button
	 try {
		 
		 driver.findElement(By.xpath("//app-popupform/div[2]/div/button/span")).click();
	          }
	          catch (Exception e)
	          {
	          	System.out.println("Test Failed: generate Now button is disabled or not present");
	          	driver.close();
	          }
	
	 //  Invoice Number validation check
	 try {
		 Thread.sleep(2000);
		 driver.switchTo().activeElement();
		String Error1 = driver.findElement(By.xpath("//mat-error[contains(.,'Invoice Number Required')]")).getText();

      	System.out.println("Expected error1: "+Error1);
      	if (Error1.contentEquals("Invoice Number Required"))
      	{

          	System.out.println("Test Passed: validation for leaving invoice number is: "+Error1);
      		
      	}
      	
      	else {
      		System.out.println("Test Failed: Incorrect validation message for invoice number");
      	}
      	}
	          catch (Exception e)
	          {
	          	System.out.println("Test Failed: validation message not present for invoice number");
	          	driver.close();
	          }
	
	 //  Invoice Date validation check
	 try {
		 Thread.sleep(2000);
		 driver.switchTo().activeElement();
		String Error2 = driver.findElement(By.xpath("//mat-error[contains(.,'Invoice Date Required')]")).getText();

      	System.out.println("Expected error2: "+Error2);
      	if (Error2.contentEquals("Invoice Date Required"))
      	{

          	System.out.println("Test Passed: validation for leaving invoice Date is: "+Error2);
      		
      	}
      	
      	else {
      		System.out.println("Test Failed: Incorrect validation message for invoice date");
      	}
      	}
	          catch (Exception e)
	          {
	          	System.out.println("Test Failed: validation message not present for invoice date");
	          	driver.close();
	          }
	// For Cancel Button
	 try {
		 driver.findElement(By.xpath("//div[2]/div/button[2]/span")).click();
	 }
	 catch (Exception e)
     {
     	System.out.println("Test Failed: Cancel Button is not present");
     	driver.close();
     }
	 driver.close();
	}
	
	
	
	
	// Invalid submission
		 @Test (priority=1)
		 public void InvalidGeneartion() {
		 	 System.setProperty("webdriver.chrome.driver", driverPath);
		 	   driver = new ChromeDriver();
		 	   driver.manage().window().maximize();
		 	   driver.manage().deleteAllCookies();
		 	   driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		 try {	 
		 driver.get("https://devreassure.innov.co.in/complaints/view/48");
		 }
		 catch (Exception e)
	    {
	    	System.out.println("Test Failed: Unable to open the URL");
	    	driver.close();
	    }
		 
		 driver.findElement(By.xpath("//input[@type='text']")).click();
		 driver.findElement(By.xpath("//input[@type='text']")).clear();
		 try {
		 driver.findElement(By.xpath("//input[@type='text']")).sendKeys("IND067");
		 }
		 catch (Exception e)
	    {
	    	System.out.println("Test Failed: Username field not available");
	    	driver.close();
	    }
		 driver.findElement(By.xpath("//input[@type='password']")).clear();
		 try {
		 driver.findElement(By.xpath("//input[@type='password']")).sendKeys("Welcome@123");
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
		          
		 // Invoice Submit quick link
		 try {
			 
			 driver.findElement(By.xpath("//div[@id='fieldRightSidebarContainer']/div/section/div[5]/a/span[2]")).click();
		          }
		          catch (Exception e)
		          {
		          	System.out.println("Test Failed: Invoice Submit button is disabled or not present");
		          	driver.close();
		          }
		 //  Calendar icon
		 
	 try {
			 
			 driver.findElement(By.xpath("//*[@id=\"popupForm\"]/div/div[2]/div/mat-form-field/div/div[1]/div[4]/mat-datepicker-toggle/button")).click();
		          }
		          catch (Exception e)
		          {
		          	System.out.println("Test Failed:  Calendar icon is disabled or not present");
		          	driver.close();
		          }
	//future date1
	 
	try {
			 
			 driver.findElement(By.xpath("//*[@id=\"mat-datepicker-5\"]/div/mat-month-view/table/tbody/tr[4]/td[6]/div")).click();
		          }
		          catch (Exception e)
		          {
		          	System.out.println("Test Failed:  future date1 icon is disabled or not present");
		          	driver.close();
		          }
	//future date2

	try {
			 
			 driver.findElement(By.xpath("//*[@id=\"mat-datepicker-5\"]/div/mat-month-view/table/tbody/tr[5]/td[4]/div")).click();
		          }
		          catch (Exception e)
		          {
		          	System.out.println("Test Failed:  future date2 icon is disabled or not present");
		          	driver.close();
		          }
  	try { 
  		Robot r = new Robot(); r.keyPress(KeyEvent.VK_ESCAPE); 
  			r.keyRelease(KeyEvent.VK_ESCAPE);
  		} catch (Exception e) { 

      		System.out.println("Escape error");
  		}
		 
		 
		 
		 //  generate Now Button
		 try {
			 
			 driver.findElement(By.xpath("//app-popupform/div[2]/div/button/span")).click();
		          }
		          catch (Exception e)
		          {
		          	System.out.println("Test Failed: generate Now button is disabled or not present");
		          	driver.close();
		          }
		
			
		 //  Invoice Date validation check
		 try {
			 Thread.sleep(2000);
			 driver.switchTo().activeElement();
			String Error3 = driver.findElement(By.xpath("//mat-error[contains(.,'Invoice Date Required')]")).getText();

	      	System.out.println("Expected error3: "+Error3);
	      	if (Error3.contentEquals("Invoice Date Required"))
	      	{

	          	System.out.println("Test Passed: validation for leaving invoice Date is: "+Error3);
	      		
	      	}
	      	
	      	else {
	      		System.out.println("Test Failed: Incorrect validation message for invoice date");
	      	}
	      	}
		          catch (Exception e)
		          {
		          	System.out.println("Test Failed: validation message not present for invoice date");
		          	driver.close();
		          }
		 //  Calendar icon for Past dates
		 
		 try {

			 driver.findElement(By.xpath("//*[@id=\"popupForm\"]/div/div[2]/div/mat-form-field/div/div[1]/div[4]/mat-datepicker-toggle/button")).click();
			          }
			          catch (Exception e)
			          {
			          	System.out.println("Test Failed:  Calendar icon is disabled or not present");
			          	driver.close();
			          }
		 //year selection icon
		 try {
			 
			 driver.findElement(By.xpath("//*[@id=\"mat-datepicker-5\"]/mat-calendar-header/div/div/button[1]/span/div")).click();
		          }
		          catch (Exception e)
		          {
		          	System.out.println("Test Failed:  Year selection icon is disabled or not present");
		          	driver.close();
		          }
		//year selection
			 try {
				 
				 driver.findElement(By.xpath("//*[@id=\"mat-datepicker-5\"]/div/mat-multi-year-view/table/tbody/tr[6]/td[4]/div")).click();
			          }
			          catch (Exception e)
			          {
			          	System.out.println("Test Failed:  Year selection icon is disabled or not present");
			          	driver.close();
			          }

			//month selection
			 try {
				 
				 driver.findElement(By.xpath("//*[@id=\"mat-datepicker-5\"]/div/mat-year-view/table/tbody/tr[4]/td[1]/div")).click();
			          }
			          catch (Exception e)
			          {
			          	System.out.println("Test Failed:  Month selection icon is disabled or not present");
			          	driver.close();
			          }

		 
		//Past date1
try {
				 
				 driver.findElement(By.xpath("//*[@id=\"mat-datepicker-5\"]/div/mat-month-view/table/tbody/tr[2]/td[4]/div")).click();
			          }
			          catch (Exception e)
			          {
			          	System.out.println("Test Failed:  Past date1 icon is disabled or not present");
			          	driver.close();
			          }

		//Past date2

		try {
				 
				 driver.findElement(By.xpath("//*[@id=\"mat-datepicker-5\"]/div/mat-month-view/table/tbody/tr[4]/td[4]/div")).click();
			          }
			          catch (Exception e)
			          {
			          	System.out.println("Test Failed:  Past date2 icon is disabled or not present");
			          	driver.close();
			          }

	  	try { 
	  		Robot r = new Robot(); r.keyPress(KeyEvent.VK_ESCAPE); 
	  			r.keyRelease(KeyEvent.VK_ESCAPE);
	  		} catch (Exception e) { 

	      		System.out.println("Escape error");
	  		}
			 
			 
			 //  generate Now Button
			 try {
				 
				 driver.findElement(By.xpath("//app-popupform/div[2]/div/button/span")).click();
			          }
			          catch (Exception e)
			          {
			          	System.out.println("Test Failed: generate Now button is disabled or not present");
			          	driver.close();
			          }
			
				
			 //  Invoice Date validation check
			 try {
				 Thread.sleep(2000);
				 driver.switchTo().activeElement();
				String Error4 = driver.findElement(By.xpath("//mat-error[contains(.,'Invoice Date Required')]")).getText();

		      	System.out.println("Expected error4: "+Error4);
		      	if (Error4.contentEquals("Invoice Date Required"))
		      	{

		          	System.out.println("Test Passed: validation for leaving invoice Date is: "+Error4);
		      		
		      	}
		      	
		      	else {
		      		System.out.println("Test Failed: Incorrect validation message for invoice date");
		      	}
		      	}
			          catch (Exception e)
			          {
			          	System.out.println("Test Failed: validation message not present for invoice date");
			          	driver.close();
			          }
		 driver.close();
		}
		// Valid submission
				 @Test (priority=3)
				 public void ValidGeneration() {
				 	 System.setProperty("webdriver.chrome.driver", driverPath);
				 	   driver = new ChromeDriver();
				 	   driver.manage().window().maximize();
				 	   driver.manage().deleteAllCookies();
				 	   driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
				 try {	 
				 driver.get("https://devreassure.innov.co.in/complaints/view/48");
				 }
				 catch (Exception e)
			    {
			    	System.out.println("Test Failed: Unable to open the URL");
			    	driver.close();
			    }
				 
				 driver.findElement(By.xpath("//input[@type='text']")).click();
				 driver.findElement(By.xpath("//input[@type='text']")).clear();
				 try {
				 driver.findElement(By.xpath("//input[@type='text']")).sendKeys("IND067");
				 }
				 catch (Exception e)
			    {
			    	System.out.println("Test Failed: Username field not available");
			    	driver.close();
			    }
				 driver.findElement(By.xpath("//input[@type='password']")).clear();
				 try {
				 driver.findElement(By.xpath("//input[@type='password']")).sendKeys("Welcome@123");
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
				          
				 // Invoice Submit quick link
				 try {
					 
					 driver.findElement(By.xpath("//div[@id='fieldRightSidebarContainer']/div/section/div[5]/a/span[2]")).click();
				          }
				          catch (Exception e)
				          {
				          	System.out.println("Test Failed: Invoice Submit button is disabled or not present");
				          	driver.close();
				          }
				 
				 //Valid Invoice Number
				  try { 
					 driver.findElement(By.xpath("//*[@id=\"mat-input-19\"]")).sendKeys("TestInvoice123");
				          }
				          catch (Exception e)
				          {
				          	System.out.println("Test Failed:  Calendar icon is disabled or not present");
				          	driver.close();
				          }
			 
				 
				 //  Calendar icon
				 
			 try {
					 
					 driver.findElement(By.xpath("//*[@id=\"popupForm\"]/div/div[2]/div/mat-form-field/div/div[1]/div[4]/mat-datepicker-toggle/button")).click();
				          }
				          catch (Exception e)
				          {
				          	System.out.println("Test Failed:  Calendar icon is disabled or not present");
				          	driver.close();
				          }
			//Valid date1
			 
			try {
					 
					 driver.findElement(By.xpath("//*[@id=\"mat-datepicker-5\"]/div/mat-month-view/table/tbody/tr[2]/td[3]/div")).click();
				          }
				          catch (Exception e)
				          {
				          	System.out.println("Test Failed:  Date icon is disabled or not present");
				          	driver.close();
				          }
			//Get Current Page 
			String currentPageHandle = driver.getWindowHandle();               

			//Generate Now button
			try {
				 
				 driver.findElement(By.xpath("//*[@id=\"mat-dialog-0\"]/app-popupform/div[2]/div/button[1]/span")).click();
			          }
			          catch (Exception e)
			          {
			          	System.out.println("Test Failed:  Generate button is disabled or not present");
			          	driver.close();
			          }
		// New Tab Operations
			// Get all Open Tabs
			ArrayList<String> tabHandles = new ArrayList<String>(driver.getWindowHandles());

			String pageTitle = "My Title";
			boolean myNewTabFound = false;

			for(String eachHandle : tabHandles)
			{
			    driver.switchTo().window(eachHandle);
			    // Check Your Page Title 
			    if(driver.getTitle().equalsIgnoreCase(pageTitle))
			    {
			    	
			    	String Title1=driver.getTitle();
			        // Report ur new tab is found with appropriate title 
                      System.out.println("Title of the page is: "+Title1);
			        //Close the current tab
			        driver.close(); // Note driver.quit() will close all tabs

			        //Switch focus to Old tab
			        driver.switchTo().window(currentPageHandle);
			        myNewTabFound = true;           
			    }
			    else {

                    System.out.println("Test failed: title is incorrect");
			    	
			    }
			    
			    
			}
			
			

			if(myNewTabFound)
			{
			    // Report page not opened as expected       
			}
			
			 //  Success message  check
			 try {
				 Thread.sleep(2000);
				 driver.switchTo().activeElement();
				String SuccessMsg = driver.findElement(By.xpath("//*[@id=\"mat-dialog-0\"]/app-popupform/alert/div")).getText();

		      	System.out.println("Success Message: "+SuccessMsg);
		      	if (SuccessMsg.contentEquals("Invoice has been created successfully."))
		      	{

		          	System.out.println("Test Passed: Success for invoice generation: "+SuccessMsg);
		      		
		      	}
		      	
		      	else {
		      		System.out.println("Test Failed: Incorrect Success message for invoice date");
		      	}
		      	}
			          catch (Exception e)
			          {
			          	System.out.println("Test Failed: Success message not present for invoice date");
			          	driver.close();
			          }
			 // for close button
                   try {
				 
				 driver.findElement(By.xpath("//*[@id=\"mat-dialog-0\"]/app-popupform/div[2]/div/button/span")).click();
			          }
			          catch (Exception e)
			          {
			          	System.out.println("Test Failed:  Close button is disabled or not present");
			          	driver.close();
			          }

          							 }
				// Download Invoice Button submission
				 @Test (priority=4)
				 public void DownloadInvoice() throws InterruptedException {
				 	 System.setProperty("webdriver.chrome.driver", driverPath);
				 	   driver = new ChromeDriver();
				 	   driver.manage().window().maximize();
				 	   driver.manage().deleteAllCookies();
				 	   driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
				 try {	 
				 driver.get("https://devreassure.innov.co.in/complaints/view/48");
				 }
				 catch (Exception e)
			    {
			    	System.out.println("Test Failed: Unable to open the URL");
			    	driver.close();
			    }
				 
				 driver.findElement(By.xpath("//input[@type='text']")).click();
				 driver.findElement(By.xpath("//input[@type='text']")).clear();
				 try {
				 driver.findElement(By.xpath("//input[@type='text']")).sendKeys("IND067");
				 }
				 catch (Exception e)
			    {
			    	System.out.println("Test Failed: Username field not available");
			    	driver.close();
			    }
				 driver.findElement(By.xpath("//input[@type='password']")).clear();
				 try {
				 driver.findElement(By.xpath("//input[@type='password']")).sendKeys("Welcome@123");
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
				    Thread.sleep(5000);      
				 //Get Current Page 
       			String currentPageHandle = driver.getWindowHandle(); 
			// for Download Invoice 
                
                try {
   				 
   				 driver.findElement(By.xpath("//*[@id=\"fieldRightSidebarContainer\"]/div/section[1]/div[5]/a/span[2]")).click();
   			          }
   			          catch (Exception e)
   			          {
   			          	System.out.println("Test Failed:  Download Invoice button is disabled or not present");
   			          	driver.close();
   			          }
   		   

    			
    		// New Tab Operations
 			// Get all Open Tabs
 			ArrayList<String> tabHandles1 = new ArrayList<String>(driver.getWindowHandles());

 			String pageTitle = "My Title";
 			boolean myNewTabFound = false;

 			for(String eachHandle : tabHandles1)
 			{
 			    driver.switchTo().window(eachHandle);
 			    // Check Your Page Title 
 			    if(driver.getTitle().equalsIgnoreCase(pageTitle))
 			    {
 			    	String Title =driver.getTitle();
 			        // Report ur new tab is found with appropriate title 
                       System.out.println("title of the page is: "+Title);
 			        //Close the current tab
 			        driver.close(); // Note driver.quit() will close all tabs

 			        //Switch focus to Old tab
 			        driver.switchTo().window(currentPageHandle);
 			        myNewTabFound = true;           
 			    }
 			    else {

                    System.out.println("Test Failed: title is incorrect");
 			    }
 			}

 			if(myNewTabFound)
 			{
 			    // Report page not opened as expected       
 			}

			driver.close();	 
				 
				 }	 
				 
				 
				 // Invoice Submmission
				 
				 @Test (priority=5)
				 public void BlankSubmission() {
				 	 System.setProperty("webdriver.chrome.driver", driverPath);
				 	   driver = new ChromeDriver();
				 	   driver.manage().window().maximize();
				 	   driver.manage().deleteAllCookies();
				 	   driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
				 try {	 
				 driver.get("https://devreassure.innov.co.in/complaints/view/48");
				 }
				 catch (Exception e)
			    {
			    	System.out.println("Test Failed: Unable to open the URL");
			    	driver.close();
			    }
				 
				 driver.findElement(By.xpath("//input[@type='text']")).click();
				 driver.findElement(By.xpath("//input[@type='text']")).clear();
				 try {
				 driver.findElement(By.xpath("//input[@type='text']")).sendKeys("IND067");
				 }
				 catch (Exception e)
			    {
			    	System.out.println("Test Failed: Username field not available");
			    	driver.close();
			    }
				 driver.findElement(By.xpath("//input[@type='password']")).clear();
				 try {
				 driver.findElement(By.xpath("//input[@type='password']")).sendKeys("Welcome@123");
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
				          
				 // Invoice Submit quick link
				 try {
					 
					 driver.findElement(By.xpath("//*[@id=\"fieldRightSidebarContainer\"]/div/section[1]/div[6]/a/span[2]")).click();
				          }
				          catch (Exception e)
				          {
				          	System.out.println("Test Failed: Invoice Submit quick link is disabled or not present");
				          	driver.close();
				          }
			//blank submisson 
				 // Invoice Submit quick link
				 try {
					 
					 driver.findElement(By.xpath("//*[@id=\"submit_invoice___fields\"]/div/button/span")).click();
				          }
				          catch (Exception e)
				          {
				          	System.out.println("Test Failed:  Submit  button is disabled or not present");
				          	driver.close();
				          }
				 //Server side validation check
				 
				 
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
			 	 //  Blank Invoice Attachment validation check
			 	 try {
			 		 Thread.sleep(2000);
			 		String Error11 = driver.findElement(By.xpath("//*[@id=\"mat-error-1\"]")).getText();

			       	System.out.println("Actual error for blank attachment: "+Error11);
			       	if (Error11.contentEquals("Invoice Required"))
			       	{

			           	System.out.println("Test Passed: validation for leaving attachment blank is: "+Error11);
			       		
			       	}
			       	
			       	else {
			       		System.out.println("Test Failed: Incorrect validation message for leaving attachment blank");
			       	}
			       	}
			 	          catch (Exception e)
			 	          {
			 	          	System.out.println("Test Failed: validation message not present for leaving attachment blank");
			 	          	driver.close();
			 	          }
			 	// blank remarks
			 	try {
			 		 Thread.sleep(2000);

			 		String Error12 = driver.findElement(By.xpath("//*[@id=\"mat-error-0\"]")).getText();

			       	System.out.println("Actual error for blank attachment: "+Error12);
			       	if (Error12.contentEquals("Remarks Required"))
			       	{

			           	System.out.println("Test Passed: validation for leaving Remarks blank is: "+Error12);
			       		
			       	}
			       	
			       	else {
			       		System.out.println("Test Failed: Incorrect validation message for leaving Remarks blank");
			       	}
			       	}
			 	          catch (Exception e)
			 	          {
			 	          	System.out.println("Test Failed: validation message not present for leaving Remarks blank");
			 	          	driver.close();
			 	          }
				// valid Remarks
			   	try {
					driver.findElement(By.xpath("//*[@id=\"mat-input-13\"]")).sendKeys("This is a dummy text");
				}

				catch (Exception e)
				{
					System.out.println("Remark field is disabled or not Present");
					driver.close();

				}

			   	
			 //  Attachment upload
			  

			  	try {
			   
			    		driver.findElement(By.xpath("//*[@id=\"submit_invoice___fields\"]/app-file/div/button[1]/span/mat-icon")).click();
			    	}

			    	catch (Exception e)
			    	{
			    		System.out.println("File Upload Button is disabled or not Present in Product Number");
			    		driver.close();
			    	}
			    	//Pop Up Operations form invalid file upload 
			    	try {
			    		 driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
			            driver.switchTo().activeElement();
			    	
			          try {  driver.findElement(By.xpath("//input[@type='file']")).sendKeys("C:\\Users\\TECHFOUR\\Desktop\\invalid.exe");
			          Thread.sleep(5000);
			          }

			       	catch (Exception e)
			       	{
			       		System.out.println("Photo could not be uploaded");
			    	}
			          WebDriverWait wait = new WebDriverWait(driver, 120);
			          String Successmsg = driver.findElement(By.xpath("//span[contains(.,'Please upload a file with valid format.')]")).getText();
			  		 wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[contains(.,'Please upload a file with valid format.')]")));
			  		
			  		 if (Successmsg.contentEquals("Please upload a file with valid format."))
			           {
			          	 
			          	 System.out.println(Successmsg);

			  			driver.findElement(By.xpath("//button[contains(.,'Finish')]")).click();

			           }
			  		  else {
			  			  System.out.println("Test Failed as invalid file got uploaded");

			  		  }

			          
			          
			    	}
			    	catch (Exception e)
			    	{
			    		System.out.println("Could not switch to claim form upload pop up");
			    		//driver.close();
			    	
			    	
			    	}
			    	
			    	//Pop Up Operations form valid file one upload
			    	try {
			    		driver.findElement(By.xpath("//*[@id=\"submit_invoice___fields\"]/app-file/div/button[1]/span/mat-icon")).click();
			    	}

			    	catch (Exception e)
			    	{
			    		System.out.println("  Upload Button is disabled or not Present");
			    		driver.close();

			    	}
			    	   	try {
			    		 driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
			            driver.switchTo().activeElement();
			            Thread.sleep(5000);
			    	// First photo
			          try {  driver.findElement(By.xpath("//input[@type='file']")).sendKeys("C:\\Users\\TECHFOUR\\Downloads\\dummy.pdf");
			          Thread.sleep(5000);
			            String a= driver.findElement(By.xpath("//h4/a/span")).getText();
			            System.out.println("file path after upload is: "+ a);
			  			driver.findElement(By.xpath("//button[contains(.,'Finish')]")).click();
			          }
			       	catch (Exception e)
			       	{
			       		System.out.println("Photo could not be uploaded");
			    	} 
			    	}
			    	catch (Exception e)
			    	{
			    		System.out.println("Could not switch to  upload pop up");
			    		//driver.close();
			    	}
			    	   

			    	  //Photo deletion operation 
			    	   	
			    	   	try {
			    	   		driver.findElement(By.xpath("//*[@id=\"submit_invoice___fields\"]/app-file/div/button[2]/span")).click();
			    	   	}

			    	   	catch (Exception e)
			    	   	{
			    	   		System.out.println("View Files Button is disabled or not Present in Product Number");
			    	   		driver.close();

			    	   	}
			    	   	try {
			    	   		driver.findElement(By.xpath("//mat-icon[contains(.,'delete')]")).click();
			    	   	}

			    	   	catch (Exception e)
			    	   	{
			    	   		System.out.println("Delete Button is disabled or not Present in Product Number");
			    	   		driver.close();

			    	   	}

			    	   	try {
			    	   		String b= driver.switchTo().alert().getText();
			    	   		System.out.println(b);
			    	   		driver.switchTo().alert().dismiss();
			    	   	}

			    	   	catch (Exception e)
			    	   	{
			    	   		System.out.println("Cancel Button is disabled or not Present in Product Number");
			    	   		driver.close();

			    	   	}
			    	   	try {
			    	   		driver.findElement(By.xpath("//mat-icon[contains(.,'delete')]")).click();
			    	   	}

			    	   	catch (Exception e)
			    	   	{
			    	   		System.out.println("Delete Button is disabled or not Present in Product Number");
			    	   		driver.close();

			    	   	}

			    	   	try {
			    	   		String c= driver.switchTo().alert().getText();
			    	   		System.out.println(c);
			    	   		driver.switchTo().alert().accept();
			    	   		Thread.sleep(2000);

			    	 			driver.findElement(By.xpath("//button[contains(.,'Finish')]")).click();
			    	   	}

			    	   	catch (Exception e)
			    	   	{
			    	   		System.out.println("OK Button is disabled or not Present in Product Number");
			    	   		driver.close();

			    	   	}
			    	 //Photo upload cancel button
			    	   	try {
			    	   		driver.findElement(By.xpath("//*[@id=\"submit_invoice___fields\"]/app-file/div/button[1]/span/mat-icon")).click();
			    	   	}

			    	   	catch (Exception e)
			    	   	{
			    	   		System.out.println("Defect Upload Button is disabled or not Present");
			    	   		driver.close();

			    	   	}
			    	   	
			    	   	try {
			    	   		 driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
			    	           driver.switchTo().activeElement();
			    	           Thread.sleep(5000);
			    	   	}
			    	   	catch (Exception e)
			    	   	{
			    	   		System.out.println("Photo upload pop up not found");
			    	   		driver.close();

			    	   	}
			    	   	try {                            
			    	   		driver.findElement(By.xpath("/html/body/div[3]/div[2]/div/mat-dialog-container/app-dialog/div[2]/button[1]/span")).click();
			    	  	}
			    	  	catch (Exception e)
			    	  	{
			    	  		System.out.println("Cancel button not found");
			    	  		driver.close();

			    	  	}
			    	//  Attachment upload
					      

				      	try {
				       
				        		driver.findElement(By.xpath("//*[@id=\"submit_invoice___fields\"]/app-file/div/button[1]/span/mat-icon")).click();
				        	}

				        	catch (Exception e)
				        	{
				        		System.out.println("File Upload Button is disabled or not Present");
				        		driver.close();
				        	}
				        	//Pop Up Operations form invalid file upload 
				        	try {
				        		 driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
				                driver.switchTo().activeElement();
				        	
				              try {  driver.findElement(By.xpath("//input[@type='file']")).sendKeys("C:\\Users\\TECHFOUR\\Desktop\\invalid.exe");
				              Thread.sleep(5000);
				              }

				           	catch (Exception e)
				           	{
				           		System.out.println("Photo could not be uploaded");
				        	}
				              WebDriverWait wait = new WebDriverWait(driver, 120);
				              String Successmsg = driver.findElement(By.xpath("//span[contains(.,'Please upload a file with valid format.')]")).getText();
				      		 wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[contains(.,'Please upload a file with valid format.')]")));
				      		
				      		 if (Successmsg.contentEquals("Please upload a file with valid format."))
				               {
				              	 
				              	 System.out.println(Successmsg);

				      			driver.findElement(By.xpath("//button[contains(.,'Finish')]")).click();

				               }
				      		  else {
				      			  System.out.println("Test Failed as invalid file got uploaded");

				      		  }

				              
				              
				        	}
				        	catch (Exception e)
				        	{
				        		System.out.println("Could not switch to claim form upload pop up");
				        		//driver.close();
				        	
				        	
				        	}
				        	
				        	//Pop Up Operations form valid file one upload
				        	try {
				        		driver.findElement(By.xpath("//*[@id=\"submit_invoice___fields\"]/app-file/div/button[1]/span/mat-icon")).click();
				        	}

				        	catch (Exception e)
				        	{
				        		System.out.println("  Upload Button is disabled or not Present");
				        		driver.close();

				        	}
				        	   	try {
				        		 driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
				                driver.switchTo().activeElement();
				                Thread.sleep(5000);
				        	// First photo
				              try {  driver.findElement(By.xpath("//input[@type='file']")).sendKeys("C:\\Users\\TECHFOUR\\Downloads\\dummy.pdf");
				              Thread.sleep(5000);
				                String a= driver.findElement(By.xpath("//h4/a/span")).getText();
				                System.out.println("file path after upload is: "+ a);
				      			driver.findElement(By.xpath("//button[contains(.,'Finish')]")).click();
				              }
				           	catch (Exception e)
				           	{
				           		System.out.println("Photo could not be uploaded in ");
				        	} 
				        	}
				        	catch (Exception e)
				        	{
				        		System.out.println("Could not switch to upload pop up");
				        		//driver.close();
				        	}
				        	    // Invoice Submit quick link
								 try {
									 
									 driver.findElement(By.xpath("//*[@id=\"submit_invoice___fields\"]/div/button/span")).click();
								          }
								          catch (Exception e)
								          {
								          	System.out.println("Test Failed:  Submit  button is disabled or not present");
								          	driver.close();
								          }
								 
								 //  Success message  check
								 try {
									 Thread.sleep(2000);
									 driver.switchTo().activeElement();
									String SuccessMsg2 = driver.findElement(By.xpath("//*[@id=\"modal-body\"]/p")).getText();

							      	System.out.println("Success Message: "+SuccessMsg2);
							      	if (SuccessMsg2.contentEquals("Invoice has been submitted for approval."))
							      	{

							          	System.out.println("Test Passed: Success for invoice generation: "+SuccessMsg2);
							      		
							      	}
							      	
							      	else {
							      		System.out.println("Test Failed: Incorrect Success message for invoice submission");
							      	}
							      	}
								          catch (Exception e)
								          {
								          	System.out.println("Test Failed: Success message not present for invoice submission");
								          	driver.close();
								          }
								 // for close button
					                   try {
									 
									 driver.findElement(By.xpath("//*[@id=\"modal-action-button\"]/span")).click();
								          }
								          catch (Exception e)
								          {
								          	System.out.println("Test Failed:  Ok button is disabled or not present");
								          	driver.close();
								          }

								 
								
				 }	

				}