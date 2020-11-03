package automationFramework;

import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.ArrayList;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class InvoiceSubmission {
	public WebDriver driver;
	 String driverPath = "D:\\jitendra\\Selenium drivers\\latestchromedriver\\chromedriver.exe";
	 public String  baseUrl;
	 
	
	
	@Test (priority=2)
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
		 public void InvalidSubmission() {
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
				 public void ValidSubmission() {
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
				 
	
}
