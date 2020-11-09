package automationFramework;

import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.concurrent.TimeUnit;
import java.util.Iterator;
import java.util.Set;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class InvoiceApproval {
	public WebDriver driver;
	 String driverPath = "D:\\jitendra\\Selenium drivers\\latestchromedriver\\chromedriver.exe";
	 public String  baseUrl;
	 
	
/*	
	@Test (priority=1)
	 public void InvoiceApprove() {
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
	          
	 // Invoice approval quick link
	 try {
		 
		 driver.findElement(By.xpath("//*[@id=\"fieldRightSidebarContainer\"]/div/section[1]/div[2]/a/span[2]")).click();
	          }
	          catch (Exception e)
	          {
	          	System.out.println("Test Failed: Invoice Approval button is disabled or not present");
	          	driver.close();
	          }
	 
	 // Remarks get
	 
	 try { 
		 String Remarks =driver.findElement(By.xpath("//*[@id=\"mat-input-15\"]")).getText();
	      System.out.println("Remarks : "+ Remarks) ;   
	 }
	 catch (Exception e)
     {
     	System.out.println("Test Failed: Remarks text not present");
     	driver.close();
     }
	 
	 //  Remarks field
	 try {
		 Thread.sleep(5000);
		 driver.findElement(By.xpath("//*[@id=\"mat-input-15\"]")).clear();
	          }
	          catch (Exception e)
	          {
	          	System.out.println("Test Failed: generate Now button is disabled or not present");
	          	driver.close();
	          }
	 //tab
	 try { 
	   		Robot r = new Robot(); r.keyPress(KeyEvent.VK_TAB); 
	   			r.keyRelease(KeyEvent.VK_TAB);
	   		} catch (Exception e) { 

	       		System.out.println("Tab error");
	   		}

	 try {
		 Thread.sleep(2000);
		String Error1 = driver.findElement(By.xpath("//*[@id=\"mat-error-1\"]")).getText();

      	System.out.println("Actual error1: "+Error1);
      	if (Error1.contentEquals("Remarks Required"))
      	{

          	System.out.println("Test Passed: validation for leaving remarks field blank is: "+Error1);
      		
      	}
      	
      	else {
      		System.out.println("Test Failed: Incorrect validation message for blank remarks ");
      	}
      	}
	          catch (Exception e)
	          {
	          	System.out.println("Test Failed: validation message not present for blank remarks ");
	          	driver.close();
	          }
	
	// server side validation for blank approval
	try {
		driver.findElement(By.xpath("//*[@id=\"submit_invoice___fields\"]/div/button[2]/span")).click();
	}
	catch(Exception e)
	{
		
	System.out.println("Approva Button is disabled or not present");
	}
	 
	 
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

  // server side validation for blank reject
 	try {
 		driver.findElement(By.xpath("//*[@id=\"submit_invoice___fields\"]/div/button[3]/span")).click();
 	}
 	catch(Exception e)
 	{
 		
 	System.out.println("Reject Button is disabled or not present");
 	}
 	 
 	 
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

   // server side validation for blank On Hold
   	try {
   		driver.findElement(By.xpath("//*[@id=\"submit_invoice___fields\"]/div/button[4]/span")).click();
   	}
   	catch(Exception e)
   	{
   		
   	System.out.println("On Hold Button is disabled or not present");
   	}
   	 
   	 
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

        
        // server side validation for blank Estimate Rejected
       	try {
       		driver.findElement(By.xpath("//*[@id=\"submit_invoice___fields\"]/div/button[5]/span")).click();
       	}
       	catch(Exception e)
       	{
       		
       	System.out.println("Estimate Rejected Button is disabled or not present");
       	}
       	 
       	 
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
	
	}
	
	*/
	@Test (priority=2)
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
	          
	 // Invoice approval quick link
	 try {
		 
		 driver.findElement(By.xpath("//*[@id=\"fieldRightSidebarContainer\"]/div/section[1]/div[2]/a/span[2]")).click();
	          }
	          catch (Exception e)
	          {
	          	System.out.println("Test Failed: Invoice Approval button is disabled or not present");
	          	driver.close();
	          }
	 // get the Session id of the Parent
	 String parentGUID = driver.getWindowHandle();
	 Thread.sleep(2000);
	 
	// click the button to open new window
	 // Download button
	 try { driver.findElement(By.xpath("//div[2]/div/button/span")).click();
	 Thread.sleep(5000);

	 }
	 catch (Exception e)
     {
     	System.out.println("Test Failed:Download button is disabled or not present");
     	driver.close();
     }
	// get the All the session id of the browsers
	 Set<String> allGUID = driver.getWindowHandles();
	 
	
	// iterate the values in the set
	 for(String guid : allGUID){
	 	// one enter into if block if the GUID is not equal to parent window's GUID
	 	if(! guid.equals(parentGUID)){
	 		String NewPageTitle= driver.getTitle();
	 		System.out.println("NewPageTitle is :"+ NewPageTitle);
	 	}
	 }
	 
	/*
	 for (String windowHandle : driver.getWindowHandles()) {

		 driver.switchTo().window(windowHandle);

		 System.out.println(driver.getTitle());
		 
		 */
	}
	
	@Test (priority=3)
	 public void ValidApproval() throws InterruptedException {
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
	          
	 // Invoice approval quick link
	 try {
		 
		 driver.findElement(By.xpath("//*[@id=\"fieldRightSidebarContainer\"]/div/section[1]/div[2]/a/span[2]")).click();
	          }
	          catch (Exception e)
	          {
	          	System.out.println("Test Failed: Invoice Approval button is disabled or not present");
	          	driver.close();
	          }
	 // Download button:
	 // Approve Button ://*[@id="submit_invoice___fields"]/div/button[2]/span
	 // Reject Button: //*[@id="submit_invoice___fields"]/div/button[3]/span
	 // On Hold Button://*[@id="submit_invoice___fields"]/div/button[4]/span
	 // Estimate Rejected Button: //*[@id="submit_invoice___fields"]/div/button[5]/span
	 
	 try { driver.findElement(By.xpath("//*[@id=\"submit_invoice___fields\"]/div/button[3]/span")).click();
	 Thread.sleep(5000);

	 }
	 catch (Exception e)
    {
    	System.out.println("Test Failed:  button is disabled or not present");
    	driver.close();
    }
	//  Success message  check
	 try {
		 Thread.sleep(2000);
		 driver.switchTo().activeElement();
		String SuccessMsg2 = driver.findElement(By.xpath("//*[@id=\"modal-body\"]/p")).getText();

      	System.out.println("Success Message: "+SuccessMsg2);
      	
	 }
      		          catch (Exception e)
	          {
	          	System.out.println("Test Failed: Success message not present for invoice Approval");
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