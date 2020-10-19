package automationFramework;

import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;


public class RepairOnly {
	public WebDriver driver;
 String driverPath = "D:\\jitendra\\Selenium drivers\\latestchromedriver\\chromedriver.exe";
 public String  baseUrl;
 
 
 
 
 @Test (priority=1)
 public void BlankInspection() throws InterruptedException {
 	 System.setProperty("webdriver.chrome.driver", driverPath);
 	   driver = new ChromeDriver();
 	   driver.manage().window().maximize();
 	  driver.manage().deleteAllCookies();
 	   driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
 	 
 driver.get("https://devreassure.innov.co.in/complaints/view/3");
 driver.findElement(By.xpath("//input[@type='text']")).click();
 driver.findElement(By.xpath("//input[@type='text']")).clear();
 driver.findElement(By.xpath("//input[@type='text']")).sendKeys("IND068");
 driver.findElement(By.xpath("//input[@type='password']")).clear();
 driver.findElement(By.xpath("//input[@type='password']")).sendKeys("Test@123456");
 driver.findElement(By.xpath("//button[@type='submit']")).click();

          driver.findElement(By.xpath("//span[contains(.,'Add Inspection')]")).click();
               Thread.sleep(5000); 
               // for Repair Completion Check Box
            	 try {
                    	driver.findElement(By.xpath("//mat-checkbox/label/div")).click();
                    	Thread.sleep(5000);
                    }

                    catch (Exception e)
                    {
                    	System.out.println("Test Failed:Repair Completion Check Box  is disabled or not present");
                    	driver.close();	
                    }
            	 
            	 try {
            		JavascriptExecutor js = ((JavascriptExecutor) driver);
            		js.executeScript("window.scrollTo(0,1798.75)");
            		Thread.sleep(5000);
            	 }
            	 
            	catch (Exception e)
               {
               	System.out.println("Test Failed:Scroll down failed");
               	driver.close();	
               }

            	// for submit button
             	
               	 try {
               		 
                      	driver.findElement(By.xpath("//div[2]/div/button")).click();
                      }

                      catch (Exception e)
                      {
                      	System.out.println("Test Failed:Submit button is disabled or not present");
                      	driver.close();
                      }
            

          
       // Server side Validation check for error/blank field   
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
  
        	                                
                	 
          	 //Validation check for Resolution of Issue  field
             try {
            	 Thread.sleep(5000);
             	driver.findElement(By.xpath("//mat-error[contains(.,'Resolution of Issue is Required')]")).click();
             	 try {
                  	String VisitMessage=driver.findElement(By.xpath("//mat-error[contains(.,'Resolution of Issue is Required')]")).getText();
                  	if (VisitMessage.contentEquals("Resolution of Issue is Required")) {
                  		System.out.println("Message for leaving Resolution of Issue  blank is :"+VisitMessage);
                  		}
                  	else {
                  		System.out.println("Test Failed: Wrong error Message");
                  	}
                  }

                  catch (Exception e)
                  {
                  	System.out.println("Test Failed:Error Message for Resolution of Issue element not found");
                  	driver.close();
                  }
             }

             catch (Exception e)
             {
             	System.out.println("Test Failed:No error Message found");
             	driver.close();
             }
             // Validation check for Repair Completion date      
             try {
             	driver.findElement(By.cssSelector("mat-datepicker-toggle.ng-tns-c72-52 > button:nth-child(1) > span:nth-child(1) > svg:nth-child(1)")).click();
             }

             catch (Exception e)
             {
             	System.out.println("Test Failed:Datepicker icon is disabled or not present");
             	driver.close();
             }
             try {
             	driver.findElement(By.xpath("//tr[3]/td[4]/div")).click();
             	driver.findElement(By.xpath("//mat-expansion-panel/div/div/div[2]/div")).click();
             }

             catch (Exception e)
             {
             	System.out.println("Invalid date or date is disabled or element not found");
             	driver.close();
             }

             
           //Validation check for Repair Product Photos field
             try {
            	 Thread.sleep(5000);
             	driver.findElement(By.xpath("//mat-error[contains(.,'Repair Product Photos is Required')]")).click();
             	 try {
                  	String VisitMessage=driver.findElement(By.xpath("//mat-error[contains(.,'Repair Product Photos is Required')]")).getText();
                  	if (VisitMessage.contentEquals("Repair Product Photos is Required")) {
                  		System.out.println("Message for leaving Repair Product Photos blank is :"+VisitMessage);
                  		}
                  	else {
                  		System.out.println("Test Failed: Wrong error Message");
                  	}
                  }

                  catch (Exception e)
                  {
                  	System.out.println("Test Failed:Error Message for Repair Product Photos element not found");
                  	driver.close();
                  }
             }

             catch (Exception e)
             {
             	System.out.println("Test Failed:No error Message found");
             	driver.close();
             }
           //Validation check for Final Job Sheet field
             try {
            	 Thread.sleep(5000);
             	driver.findElement(By.xpath("//mat-error[contains(.,'Final Job Sheet is Required')]")).click();
             	 try {
                  	String VisitMessage=driver.findElement(By.xpath("//mat-error[contains(.,'Final Job Sheet is Required')]")).getText();
                  	if (VisitMessage.contentEquals("Final Job Sheet is Required")) {
                  		System.out.println("Message for leaving Final Job Sheet blank is :"+VisitMessage);
                  		}
                  	else {
                  		System.out.println("Test Failed: Wrong error Message");
                  	}
                  }

                  catch (Exception e)
                  {
                  	System.out.println("Test Failed:Error Message for Final Job Sheet element not found");
                  	driver.close();
                  }
             }

             catch (Exception e)
             {
             	System.out.println("Test Failed:No error Message found");
             	driver.close();
             }
           //Validation check for Defective Part Photos  field
             try {
            	 Thread.sleep(5000);
             	driver.findElement(By.xpath("//mat-error[contains(.,'Defective Part Photos is Required')]")).click();
             	 try {
                  	String VisitMessage=driver.findElement(By.xpath("//mat-error[contains(.,'Defective Part Photos is Required')]")).getText();
                  	if (VisitMessage.contentEquals("Defective Part Photos is Required")) {
                  		System.out.println("Message for leaving Defective Part Photos blank is :"+VisitMessage);
                  		}
                  	else {
                  		System.out.println("Test Failed: Wrong error Message");
                  	}
                  }

                  catch (Exception e)
                  {
                  	System.out.println("Test Failed:Error Message for Defective Part Photos element not found");
                  	driver.close();
                  }
             }

             catch (Exception e)
             {
             	System.out.println("Test Failed:No error Message found");
             	driver.close();
             }

driver.close();
 }
 
 
 
 
 
 @Test (priority=2)
 public void InvalidInspection() {
 	 System.setProperty("webdriver.chrome.driver", driverPath);
 	   driver = new ChromeDriver();
 	   driver.manage().window().maximize();
 	  driver.manage().deleteAllCookies();
 	   driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
 	 
 driver.get("https://devreassure.innov.co.in/complaints/view/3");
 driver.findElement(By.xpath("//input[@type='text']")).click();
 driver.findElement(By.xpath("//input[@type='text']")).clear();
 driver.findElement(By.xpath("//input[@type='text']")).sendKeys("IND068");
 driver.findElement(By.xpath("//input[@type='password']")).clear();
 driver.findElement(By.xpath("//input[@type='password']")).sendKeys("Test@123456");
 driver.findElement(By.xpath("//button[@type='submit']")).click();

          
          try {
        	  driver.findElement(By.xpath("//span[contains(.,'Add Inspection')]")).click();
        	  Thread.sleep(5000);
          }

          catch (Exception e)
          {
          	System.out.println("Test Failed:Add Inspection link is disabled or not present");
          	driver.close();
          }
          
          //Script for scroll down 
          try {
        		JavascriptExecutor js = ((JavascriptExecutor) driver);
        		js.executeScript("window.scrollTo(0,1221.25)");
        		Thread.sleep(5000);
        	 }
        	 
        	catch (Exception e)
           {
           	System.out.println("Test Failed:Scroll down failed");
           	driver.close();	
           }
   	 // for Repair Completion Check Box
 	 try {
         	driver.findElement(By.xpath("//mat-checkbox/label/div")).click();
         	Thread.sleep(5000);
         }

         catch (Exception e)
         {
         	System.out.println("Test Failed:Repair Completion Check Box  is disabled or not present");
         	driver.close();	
         }
 	 
 	 try {
 		JavascriptExecutor js = ((JavascriptExecutor) driver);
 		js.executeScript("window.scrollTo(0,1798.75)");
 		Thread.sleep(5000);
 	 }
 	 
 	catch (Exception e)
    {
    	System.out.println("Test Failed:Scroll down failed");
    	driver.close();	
    }

  	     // For Resolution of issue 	
 	 try {
   		driver.findElement(By.xpath("//app-select[6]/mat-form-field/div/div/div[3]/mat-select/div/div[2]")).click();
   	}

   	catch (Exception e)
   	{
   		System.out.println("Resolution of issue dropdown  is disabled or not present");
   		driver.close();
   	}

  	 
   	try {
         WebElement select1 = driver.findElement(By.xpath("//mat-option[3]/span"));
         WebElement select2 = driver.findElement(By.xpath("//mat-option[4]/span"));

         Actions action = new Actions(driver);
         action.keyDown(Keys.CONTROL).click(select1).click(select2).build().perform();	
         Thread.sleep(5000);
   	}
        
   	catch (Exception e)
   	{
   		System.out.println("resolution issue could not be selected due to an error");
   		driver.close();
   	}
   	try { 
   		Robot r = new Robot(); r.keyPress(KeyEvent.VK_ESCAPE); 
   			r.keyRelease(KeyEvent.VK_ESCAPE);
   		} catch (Exception e) { 

       		System.out.println("Escape error");
   		}
 // Validation check for Repair Completion date      
    try {
    	driver.findElement(By.cssSelector("mat-datepicker-toggle.ng-tns-c72-52 > button:nth-child(1) > span:nth-child(1) > svg:nth-child(1)")).click();
    }

    catch (Exception e)
    {
    	System.out.println("Test Failed:Datepicker icon is disabled or not present");
    	driver.close();
    }
    try {
    	driver.findElement(By.xpath("//tr[4]/td[2]/div")).click();
    	driver.findElement(By.xpath("//mat-expansion-panel/div/div/div[2]/div")).click();
    }

    catch (Exception e)
    {
    	System.out.println("Invalid date or date is disabled or element not found");
    	driver.close();
    }

  //Pop Up Operations form valid file one upload in Repair Product Photos
   	try {
   		driver.findElement(By.xpath("//app-file[6]/div/button")).click();
   	}

   	catch (Exception e)
   	{
   		System.out.println("Repair Product Photos form  Upload Button is disabled or not Present");
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
      		System.out.println("1st Photo could not be uploaded in Repair Product Photos");
   	} 
   	}
   	catch (Exception e)
   	{
   		System.out.println("Could not switch to Repair Product Photos upload pop up");
   		//driver.close();
   	
   	
   	}

   	
   	//Pop Up Operations form valid file two upload in Repair Product Photos
   	 try {
    		driver.findElement(By.xpath("//app-file[6]/div/button")).click();
    	}

    	catch (Exception e)
    	{
    		System.out.println("Repair Product Photos  Upload Button is disabled or not Present");
    		driver.close();

    	}
    	
    	try {
    		 driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
            driver.switchTo().activeElement();
            Thread.sleep(5000);
    	// first photo in Repair Product Photos
          try {  driver.findElement(By.xpath("//input[@type='file']")).sendKeys("C:\\Users\\TECHFOUR\\Downloads\\dummy.pdf");
          Thread.sleep(5000);
            String a= driver.findElement(By.xpath("//h4/a/span")).getText();
            System.out.println("file path after upload is: "+ a);
  			driver.findElement(By.xpath("//button[contains(.,'Finish')]")).click();
          }
       	catch (Exception e)
       	{
       		System.out.println("2nd Photo could not be uploaded Repair Product Photos");
    	} 
    	}
    	catch (Exception e)
    	{
    		System.out.println("Could not switch to Repair Product Photos form upload pop up");
    		//driver.close();
    	}
    	
    

   	   	
   	   	
   	try {
   		driver.findElement(By.xpath("//app-file[6]/div/button")).click();
   	}

   	catch (Exception e)
   	{
   		System.out.println("Repair Product Photos  Upload Button is disabled or not Present");
   		driver.close();

   	}
   	
   	try {
   		 driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
           driver.switchTo().activeElement();
           Thread.sleep(5000);
   	// second photo in Repair Product Photos
         try {  driver.findElement(By.xpath("//input[@type='file']")).sendKeys("C:\\Users\\TECHFOUR\\Downloads\\SampleJPGImage_50kbmb.jpg");
         Thread.sleep(5000);
           String a= driver.findElement(By.xpath("//h4/a/span")).getText();
           System.out.println("file path after upload is: "+ a);
 			driver.findElement(By.xpath("//button[contains(.,'Finish')]")).click();
         }
      	catch (Exception e)
      	{
      		System.out.println("2nd Photo could not be uploaded Repair Product Photos");
   	} 
   	}
   	catch (Exception e)
   	{
   		System.out.println("Could not switch to Repair Product Photos form upload pop up");
   		//driver.close();
   	}
   	
   
   	
 //Photo deletion operation in Repair Product Photos
   	
   	try {
   		driver.findElement(By.xpath("//div[@id='repair_details___fields']/app-file[6]/div/button[2]/span")).click();
   	}

   	catch (Exception e)
   	{
   		System.out.println("View Files Button is disabled or not Present in Repair Product Photos");
   		driver.close();

   	}
   	try {
   		driver.findElement(By.xpath("//mat-icon[contains(.,'delete')]")).click();
   	}

   	catch (Exception e)
   	{
   		System.out.println("Delete Button is disabled or not Present in Repair Product Photos");
   		driver.close();

   	}

   	try {
   		String b= driver.switchTo().alert().getText();
   		System.out.println(b);
   		driver.switchTo().alert().dismiss();
   	}

   	catch (Exception e)
   	{
   		System.out.println("Cancel Button is disabled or not Present in Repair Product Photos");
   		driver.close();

   	}
   	try {
   		driver.findElement(By.xpath("//mat-icon[contains(.,'delete')]")).click();
   	}

   	catch (Exception e)
   	{
   		System.out.println("Delete Button is disabled or not Present in Repair Product Photos");
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
   		System.out.println("OK Button is disabled or not Present in Repair Product Photos");
   		driver.close();

   	}
 //Photo upload cancel button in Repair Product Photos
   	try {
   		driver.findElement(By.xpath("//app-file[6]/div/button")).click();
   	}

   	catch (Exception e)
   	{
   		System.out.println("Repair Product Photos Button is disabled or not Present in Repair Product Photos");
   		driver.close();

   	}
   	
   	try {
   		 driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
           driver.switchTo().activeElement();
           Thread.sleep(5000);
   	}
   	catch (Exception e)
   	{
   		System.out.println("Photo upload pop up not found in Repair Product Photos");
   		driver.close();

   	}
   	try {
   		driver.findElement(By.xpath("//span[contains(.,'Cancel')]")).click();
  	}
  	catch (Exception e)
  	{
  		System.out.println("Cancel button not found in Repair Product Photos");
  		driver.close();

  	}

  //Pop Up Operations form valid file one upload in Final Job Sheet
   	try {
   		driver.findElement(By.xpath("//app-file[7]/div/button")).click();
   	}

   	catch (Exception e)
   	{
   		System.out.println("Final Job Sheet form  Upload Button is disabled or not Present");
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
      		System.out.println("1st Photo could not be uploaded in Final Job Sheet");
   	} 
   	}
   	catch (Exception e)
   	{
   		System.out.println("Could not switch to Final Job Sheet upload pop up");
   		//driver.close();
   	
   	
   	}

   	
   	//Pop Up Operations form valid file two upload in Final Job Sheet
   	try {
   		driver.findElement(By.xpath("//app-file[7]/div/button")).click();
   	}

   	catch (Exception e)
   	{
   		System.out.println("Final Job Sheet  Upload Button is disabled or not Present");
   		driver.close();

   	}
   	try {
  		 driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
          driver.switchTo().activeElement();
          Thread.sleep(5000);
  	// first photo in Final Job Sheet
        try {  driver.findElement(By.xpath("//input[@type='file']")).sendKeys("C:\\Users\\TECHFOUR\\Downloads\\dummy.pdf");
        Thread.sleep(5000);
          String a= driver.findElement(By.xpath("//h4/a/span")).getText();
          System.out.println("file path after upload is: "+ a);
			driver.findElement(By.xpath("//button[contains(.,'Finish')]")).click();
        }
     	catch (Exception e)
     	{
     		System.out.println("2nd Photo could not be uploaded Final Job Sheet");
  	} 
  	}
  	catch (Exception e)
  	{
  		System.out.println("Could not switch to Final Job Sheet form upload pop up");
  		//driver.close();
  	}
  	
   	try {
   		driver.findElement(By.xpath("//app-file[7]/div/button")).click();
   	}

   	catch (Exception e)
   	{
   		System.out.println("Final Job Sheet  Upload Button is disabled or not Present");
   		driver.close();

   	}
   	
   	
   	try {
   		 driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
           driver.switchTo().activeElement();
           Thread.sleep(5000);
   	// second photo in Final Job Sheet
         try {  driver.findElement(By.xpath("//input[@type='file']")).sendKeys("C:\\Users\\TECHFOUR\\Downloads\\SampleJPGImage_50kbmb.jpg");
         Thread.sleep(5000);
           String a= driver.findElement(By.xpath("//h4/a/span")).getText();
           System.out.println("file path after upload is: "+ a);
 			driver.findElement(By.xpath("//button[contains(.,'Finish')]")).click();
         }
      	catch (Exception e)
      	{
      		System.out.println("2nd Photo could not be uploaded Final Job Sheet");
   	} 
   	}
   	catch (Exception e)
   	{
   		System.out.println("Could not switch to Final Job Sheet form upload pop up");
   		//driver.close();
   	}
   	
   
   	
 //Photo deletion operation in Final Job Sheet
   	
   	try {
   		driver.findElement(By.xpath("//div[@id='repair_details___fields']/app-file[7]/div/button[2]/span")).click();
   	}

   	catch (Exception e)
   	{
   		System.out.println("View Files Button is disabled or not Present in Final Job Sheet");
   		driver.close();

   	}
   	try {
   		driver.findElement(By.xpath("//mat-icon[contains(.,'delete')]")).click();
   	}

   	catch (Exception e)
   	{
   		System.out.println("Delete Button is disabled or not Present in Final Job Sheet");
   		driver.close();

   	}

   	try {
   		String b= driver.switchTo().alert().getText();
   		System.out.println(b);
   		driver.switchTo().alert().dismiss();
   	}

   	catch (Exception e)
   	{
   		System.out.println("Cancel Button is disabled or not Present in Final Job Sheet");
   		driver.close();

   	}
   	try {
   		driver.findElement(By.xpath("//mat-icon[contains(.,'delete')]")).click();
   	}

   	catch (Exception e)
   	{
   		System.out.println("Delete Button is disabled or not Present in Final Job Sheet");
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
   		System.out.println("OK Button is disabled or not Present in Final Job Sheet");
   		driver.close();

   	}
 //Photo upload cancel button in Final Job Sheet
   	try {
   		driver.findElement(By.xpath("//app-file[7]/div/button")).click();
   	}

   	catch (Exception e)
   	{
   		System.out.println("Final Job Sheet Button is disabled or not Present in Final Job Sheet");
   		driver.close();

   	}
   	
   	try {
   		 driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
           driver.switchTo().activeElement();
           Thread.sleep(5000);
   	}
   	catch (Exception e)
   	{
   		System.out.println("Photo upload pop up not found in Final Job Sheet");
   		driver.close();

   	}
   	try {
   		driver.findElement(By.xpath("//span[contains(.,'Cancel')]")).click();
  	}
  	catch (Exception e)
  	{
  		System.out.println("Cancel button not found in Final Job Sheet");
  		driver.close();

  	}

  //Pop Up Operations form valid file one upload in Defective Part Photos
   	try {
   		driver.findElement(By.xpath("//app-file[8]/div/button")).click();
   	}

   	catch (Exception e)
   	{
   		System.out.println("Defective Part Photos form  Upload Button is disabled or not Present");
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
      		System.out.println("1st Photo could not be uploaded in Defective Part Photos");
   	} 
   	}
   	catch (Exception e)
   	{
   		System.out.println("Could not switch to Defective Part Photos upload pop up");
   		//driver.close();
   	
   	
   	}

   	
   	//Pop Up Operations form valid file two upload in Defective Part Photos
   	   	try {
   	   		driver.findElement(By.xpath("//app-file[8]/div/button")).click();
   	   	}

   	   	catch (Exception e)
   	   	{
   	   		System.out.println("Defective Part Photos  Upload Button is disabled or not Present");
   	   		driver.close();

   	   	}
   	   	
   	   	try {
   	   		 driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
   	           driver.switchTo().activeElement();
   	           Thread.sleep(5000);
   	   	// First photo in Defective Part Photos
   	         try {  driver.findElement(By.xpath("//input[@type='file']")).sendKeys("C:\\Users\\TECHFOUR\\Downloads\\dummy.pdf");
   	         Thread.sleep(5000);
   	           String a= driver.findElement(By.xpath("//h4/a/span")).getText();
   	           System.out.println("file path after upload is: "+ a);
   	 			driver.findElement(By.xpath("//button[contains(.,'Finish')]")).click();
   	         }
   	      	catch (Exception e)
   	      	{
   	      		System.out.println("2nd Photo could not be uploaded Defective Part Photos");
   	   	} 
   	   	}
   	   	catch (Exception e)
   	   	{
   	   		System.out.println("Could not switch to Defective Part Photos form upload pop up");
   	   		//driver.close();
   	   	}
   	   	
   	   	
   	   	
   	try {
   		driver.findElement(By.xpath("//app-file[8]/div/button")).click();
   	}

   	catch (Exception e)
   	{
   		System.out.println("Defective Part Photos  Upload Button is disabled or not Present");
   		driver.close();

   	}
   	
   	try {
   		 driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
           driver.switchTo().activeElement();
           Thread.sleep(5000);
   	// second photo in Defective Part Photos
         try {  driver.findElement(By.xpath("//input[@type='file']")).sendKeys("C:\\Users\\TECHFOUR\\Downloads\\SampleJPGImage_50kbmb.jpg");
         Thread.sleep(5000);
           String a= driver.findElement(By.xpath("//h4/a/span")).getText();
           System.out.println("file path after upload is: "+ a);
 			driver.findElement(By.xpath("//button[contains(.,'Finish')]")).click();
         }
      	catch (Exception e)
      	{
      		System.out.println("2nd Photo could not be uploaded Defective Part Photos");
   	} 
   	}
   	catch (Exception e)
   	{
   		System.out.println("Could not switch to Defective Part Photos form upload pop up");
   		//driver.close();
   	}
   	
   
   	
 //Photo deletion operation in Defective Part Photos
   	
   	try {
   		driver.findElement(By.xpath("//div[@id='repair_details___fields']/app-file[8]/div/button[2]/span")).click();
   	}

   	catch (Exception e)
   	{
   		System.out.println("View Files Button is disabled or not Present in Defective Part Photos");
   		driver.close();

   	}
   	try {
   		driver.findElement(By.xpath("//mat-icon[contains(.,'delete')]")).click();
   	}

   	catch (Exception e)
   	{
   		System.out.println("Delete Button is disabled or not Present in Defective Part Photos");
   		driver.close();

   	}

   	try {
   		String b= driver.switchTo().alert().getText();
   		System.out.println(b);
   		driver.switchTo().alert().dismiss();
   	}

   	catch (Exception e)
   	{
   		System.out.println("Cancel Button is disabled or not Present in Defective Part Photos");
   		driver.close();

   	}
   	try {
   		driver.findElement(By.xpath("//mat-icon[contains(.,'delete')]")).click();
   	}

   	catch (Exception e)
   	{
   		System.out.println("Delete Button is disabled or not Present in Defective Part Photos");
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
   		System.out.println("OK Button is disabled or not Present in Defective Part Photos");
   		driver.close();

   	}
 //Photo upload cancel button in Defective Part Photos
   	try {
   		driver.findElement(By.xpath("//app-file[8]/div/button")).click();
   	}

   	catch (Exception e)
   	{
   		System.out.println("Defective Part Photos Button is disabled or not Present in Defective Part Photos");
   		driver.close();

   	}
   	
   	try {
   		 driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
           driver.switchTo().activeElement();
           Thread.sleep(5000);
   	}
   	catch (Exception e)
   	{
   		System.out.println("Photo upload pop up not found in Defective Part Photos");
   		driver.close();

   	}
   	try {
   		driver.findElement(By.xpath("//span[contains(.,'Cancel')]")).click();
  	}
  	catch (Exception e)
  	{
  		System.out.println("Cancel button not found in Defective Part Photos");
  		driver.close();

  	}
   	
   	
   	//Submit button
    try {
      	driver.findElement(By.xpath("//div[2]/div/button")).click();
      }

      catch (Exception e)
      {
      	System.out.println("Test Failed:Submit button is disabled or not present");
      	driver.close();
      }

 // For success Message
    driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
    String TitleW= driver.switchTo().activeElement().getText();
	System.out.println("Model Box title is:" +TitleW);
WebDriverWait wait = new WebDriverWait(driver, 120);
String Successmsg = driver.findElement(By.xpath("//p[contains(.,'Inspection has been updated successfully.')]")).getText();
 wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//p[contains(.,'Inspection has been updated successfully.')]")));
driver.findElement(By.xpath("//button[@id='modal-action-button']")).click();
                             
 if (Successmsg.contentEquals("Inspection has been updated successfully."))
  {
 	 
 	 System.out.println(Successmsg);

  }
  else {
	  System.out.println("Inspection success message is incorrect");

  }
 
driver.close();

    
 }
}
