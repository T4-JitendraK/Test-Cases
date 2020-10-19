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

public class InspectionOnly {

	public WebDriver driver;
	 String driverPath = "D:\\jitendra\\Selenium drivers\\latestchromedriver\\chromedriver.exe";
	 public String  baseUrl;
	 
	 
	 
	 
	 @Test (priority=1)
	 public void BlankInspection() {
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

	       // Validation check for Visit Completion date      
	          try {
	          	driver.findElement(By.cssSelector("mat-datepicker-toggle.ng-tns-c72-36 > button:nth-child(1) > span:nth-child(1) > svg:nth-child(1)")).click();
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
	     
	 //Validation check for visit sub status field
	          try {
	         	 Thread.sleep(5000);
	          	driver.findElement(By.xpath("//mat-error[contains(.,'Visit Sub Status Required')]")).click();
	          	 try {
	               	String VisitMessage=driver.findElement(By.xpath("//mat-error[contains(.,'Visit Sub Status Required')]")).getText();
	               	if (VisitMessage.contentEquals("Visit Sub Status Required")) {
	               		System.out.println("Message for leaving Visit Sub status blank is :"+VisitMessage);
	               		}
	               	else {
	               		System.out.println("Test Failed: Wrong error Message");
	               	}
	               }

	               catch (Exception e)
	               {
	               	System.out.println("Test Failed:Error Message for visit sub status element not found");
	               	driver.close();
	               }
	          }

	          catch (Exception e)
	          {
	          	System.out.println("Test Failed:No error Message found");
	          	driver.close();
	          }
	          
	          try {
	        		driver.findElement(By.xpath("//div[8]/mat-expansion-panel/div/div/div[2]/app-select/mat-form-field/div/div/div[3]/mat-select/div/div[2]/div")).click();
	        	}

	        	catch (Exception e)
	        	{
	        		System.out.println("Visit Sub status dropdown is disabled or not present");
	        		driver.close();
	        	}
	        	try {
	        		driver.findElement(By.xpath("//mat-option[2]/span")).click();
	        		Thread.sleep(5000);
	        	}

	        	catch (Exception e)
	        	{
	        		System.out.println("Visit Sub status dropdown value is disabled or not present");
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
	               
	             //Validation check for blank Problem Diagnosed by Engineer field
	               try {
	              	 Thread.sleep(5000);
	               	driver.findElement(By.xpath("//mat-error[contains(.,'Problem Diagnosed by Engineer is Required')]")).click();
	               	 try {
	                    	String VisitMessage=driver.findElement(By.xpath("//mat-error[contains(.,'Problem Diagnosed by Engineer is Required')]")).getText();
	                    	if (VisitMessage.contentEquals("Problem Diagnosed by Engineer is Required")) {
	                    		System.out.println("Message for leaving Problem Diagnosed by Engineer blank is :"+VisitMessage);
	                    		}
	                    	else {
	                    		System.out.println("Test Failed: Wrong error Message");
	                    	}
	                    }

	                    catch (Exception e)
	                    {
	                    	System.out.println("Test Failed:Error Message for Problem Diagnosed by Engineer element not found");
	                    	driver.close();
	                    }
	               }

	               catch (Exception e)
	               {
	               	System.out.println("Test Failed:No error Message found");
	               	driver.close();
	               }
	             //Validation check for blank Problem Sub Category field
	               try {
	              	 Thread.sleep(5000);
	               	driver.findElement(By.xpath("//mat-error[contains(.,'Problem Sub Category is Required')]")).click();
	               	 try {
	                    	String VisitMessage=driver.findElement(By.xpath("//mat-error[contains(.,'Problem Sub Category is Required')]")).getText();
	                    	if (VisitMessage.contentEquals("Problem Sub Category is Required")) {
	                    		System.out.println("Message for leaving Problem Sub Category blank is :"+VisitMessage);
	                    		}
	                    	else {
	                    		System.out.println("Test Failed: Wrong error Message");
	                    	}
	                    }

	                    catch (Exception e)
	                    {
	                    	System.out.println("Test Failed:Error Message for Problem Sub Category element not found");
	                    	driver.close();
	                    }
	               }

	               catch (Exception e)
	               {
	               	System.out.println("Test Failed:No error Message found");
	               	driver.close();
	               }

	               
	               //Validation check for blank Defect Type  field
	               try {
	              	 Thread.sleep(5000);
	               	driver.findElement(By.xpath("//mat-error[contains(.,'Defect Type is Required')]")).click();
	               	 try {
	                    	String VisitMessage=driver.findElement(By.xpath("//mat-error[contains(.,'Defect Type is Required')]")).getText();
	                    	if (VisitMessage.contentEquals("Defect Type is Required")) {
	                    		System.out.println("Message for leaving Defect Type blank is :"+VisitMessage);
	                    		}
	                    	else {
	                    		System.out.println("Test Failed: Wrong error Message");
	                    	}
	                    }

	                    catch (Exception e)
	                    {
	                    	System.out.println("Test Failed:Error Message for Defect Type element not found");
	                    	driver.close();
	                    }
	               }

	               catch (Exception e)
	               {
	               	System.out.println("Test Failed:No error Message found");
	               	driver.close();
	               }

	               //Validation check for blank Part Selection  field
	               try {
	              	 Thread.sleep(5000);
	               	driver.findElement(By.xpath("//mat-error[contains(.,'Part Selection Required')]")).click();
	               	 try {
	                    	String VisitMessage=driver.findElement(By.xpath("//mat-error[contains(.,'Part Selection Required')]")).getText();
	                    	if (VisitMessage.contentEquals("Part Selection Required")) {
	                    		System.out.println("Message for leaving Part Selection blank is :"+VisitMessage);
	                    		}
	                    	else {
	                    		System.out.println("Test Failed: Wrong error Message");
	                    	}
	                    }

	                    catch (Exception e)
	                    {
	                    	System.out.println("Test Failed:Error Message for Part Selection element not found");
	                    	driver.close();
	                    }
	               }

	               catch (Exception e)
	               {
	               	System.out.println("Test Failed:No error Message found");
	               	driver.close();
	               }
	               //Validation check for blank Remarks   field
	               try {
	              	 Thread.sleep(5000);
	               	driver.findElement(By.xpath("//mat-error[contains(.,'Remarks Required')]")).click();
	               	 try {
	                    	String VisitMessage=driver.findElement(By.xpath("//mat-error[contains(.,'Remarks Required')]")).getText();
	                    	if (VisitMessage.contentEquals("Remarks Required")) {
	                    		System.out.println("Message for leaving Remarks blank is :"+VisitMessage);
	                    		}
	                    	else {
	                    		System.out.println("Test Failed: Wrong error Message");
	                    	}
	                    }

	                    catch (Exception e)
	                    {
	                    	System.out.println("Test Failed:Error Message for Remarks element not found");
	                    	driver.close();
	                    }
	               }

	               catch (Exception e)
	               {
	               	System.out.println("Test Failed:No error Message found");
	               	driver.close();
	               }
	               //Validation check for blank Defect Photos   field
	               try {
	              	 Thread.sleep(5000);
	               	driver.findElement(By.xpath("//mat-error[contains(.,'Defect Photos Required')]")).click();
	               	 try {
	                    	String VisitMessage=driver.findElement(By.xpath("//mat-error[contains(.,'Defect Photos Required')]")).getText();
	                    	if (VisitMessage.contentEquals("Defect Photos Required")) {
	                    		System.out.println("Message for leaving Defect Photos blank is :"+VisitMessage);
	                    		}
	                    	else {
	                    		System.out.println("Test Failed: Wrong error Message");
	                    	}
	                    }

	                    catch (Exception e)
	                    {
	                    	System.out.println("Test Failed:Error Message for Defect Photos element not found");
	                    	driver.close();
	                    }
	               }

	               catch (Exception e)
	               {
	               	System.out.println("Test Failed:No error Message found");
	               	driver.close();
	               }
	             //Validation check for blank Claim Form   field
	               try {
	              	 Thread.sleep(5000);
	               	driver.findElement(By.xpath("//mat-error[contains(.,'Claim Form Required')]")).click();
	               	 try {
	                    	String VisitMessage=driver.findElement(By.xpath("//mat-error[contains(.,'Claim Form Required')]")).getText();
	                    	if (VisitMessage.contentEquals("Claim Form Required")) {
	                    		System.out.println("Message for leaving Claim Form  blank is :"+VisitMessage);
	                    		}
	                    	else {
	                    		System.out.println("Test Failed: Wrong error Message");
	                    	}
	                    }

	                    catch (Exception e)
	                    {
	                    	System.out.println("Test Failed:Error Message for Claim Form element not found");
	                    	driver.close();
	                    }
	               }

	               catch (Exception e)
	               {
	               	System.out.println("Test Failed:No error Message found");
	               	driver.close();
	               }
	               //Validation check for blank Product No.   field
	               try {
	              	 Thread.sleep(5000);
	               	driver.findElement(By.xpath("//mat-error[contains(.,'Product No. Upload Required')]")).click();
	               	 try {
	                    	String VisitMessage=driver.findElement(By.xpath("//mat-error[contains(.,'Product No. Upload Required')]")).getText();
	                    	if (VisitMessage.contentEquals("Product No. Upload Required")) {
	                    		System.out.println("Message for leaving Product No. Upload   blank is :"+VisitMessage);
	                    		}
	                    	else {
	                    		System.out.println("Test Failed: Wrong error Message");
	                    	}
	                    }

	                    catch (Exception e)
	                    {
	                    	System.out.println("Test Failed:Error Message for Product No. Upload  element not found");
	                    	driver.close();
	                    }
	               }

	               catch (Exception e)
	               {
	               	System.out.println("Test Failed:No error Message found");
	               	driver.close();
	               }
	            	//Submit button
	               try {
	                 	driver.findElement(By.xpath("//div[2]/div/button  jnn")).click();
	                 }

	                 catch (Exception e)
	                 {
	                 	System.out.println("Test Failed:Submit button is disabled or not present");
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
	   	 // Visit sub status dropdown
	          try {
	      		driver.findElement(By.xpath("//div[8]/mat-expansion-panel/div/div/div[2]/app-select/mat-form-field/div/div/div[3]/mat-select/div/div[2]/div")).click();
	      	}

	      	catch (Exception e)
	      	{
	      		System.out.println("Visit Sub status dropdown is disabled or not present");
	      		driver.close();
	      	}
	      	try {
	      		driver.findElement(By.xpath("//mat-option[2]/span")).click();
	      		Thread.sleep(5000);
	      	}

	      	catch (Exception e)
	      	{
	      		System.out.println("Visit Sub status dropdown value is disabled or not present");
	      		driver.close();
	      	}
	      	//for remarks
	     	     	try {	 
	     				driver.findElement(By.xpath("//div[@id='repair_details___fields']/app-textarea/mat-form-field/div/div/div[3]/textarea")).clear();
	     	    Thread.sleep(5000);
	     	    driver.findElement(By.xpath("//div[@id='repair_details___fields']/app-textarea/mat-form-field/div/div/div[3]/textarea")).sendKeys("this is a dummy text");
	     		
	      	}

	      	catch (Exception e)
	      	{
	      		System.out.println("Remarks field is not present");
	      		driver.close();
	      	}

	      	
	      	
	      	
	      	
	      	 // for problem category by engineer dropdown icon
	     	 try {
	      		driver.findElement(By.xpath("//app-select[2]/mat-form-field/div/div/div[3]/mat-select/div/div[2]")).click();
	      	}

	      	catch (Exception e)
	      	{
	      		System.out.println("Problem category dropdown  is disabled or not present");
	      		driver.close();
	      	}

	     	 
	      	try {
	            WebElement select1 = driver.findElement(By.xpath("//mat-option[2]/span"));
	            WebElement select2 = driver.findElement(By.xpath("//mat-option[3]/span"));

	            Actions action = new Actions(driver);
	            action.keyDown(Keys.CONTROL).click(select1).click(select2).build().perform();	
	            Thread.sleep(5000);
	      	}
	           
	      	catch (Exception e)
	      	{
	      		System.out.println("error");
	      		driver.close();
	      	}
	      	try { 
	      		Robot r = new Robot(); r.keyPress(KeyEvent.VK_ESCAPE); 
	      			r.keyRelease(KeyEvent.VK_ESCAPE);
	      		} catch (Exception e) { 

	          		System.out.println("Escape error");
	      		}
	     // for Defect Type
	    	 try {
	     		driver.findElement(By.xpath("//app-select[3]/mat-form-field/div/div/div[3]/mat-select/div/div[2]/div")).click();
	     	}

	     	catch (Exception e)
	     	{
	     		System.out.println("Defect Type dropdown  is disabled or not present");
	     		driver.close();
	     	}

	    	 
	     	try {

	     		driver.findElement(By.xpath("//span[contains(.,'Non Manufacturing Defect')]")).click();	
	           Thread.sleep(5000);
	     	}
	          
	     	catch (Exception e)
	     	{
	     		System.out.println("Defect Type Dropdown value is not present");
	     		driver.close();
	     	}
	     	
	      	 // for problem Sub category by engineer dropdown icon
	    	 try {
	     		driver.findElement(By.xpath("//app-select[4]/mat-form-field/div/div/div[3]/mat-select/div/div[2]")).click();
	     	}

	     	catch (Exception e)
	     	{
	     		System.out.println("Problem Sub category dropdown  is disabled or not present");
	     		driver.close();
	     	}

	    	 
	     	try {
	            WebElement select7 = driver.findElement(By.xpath("//mat-option[1]/span"));
	            WebElement select8 = driver.findElement(By.xpath("//mat-option[3]/span"));

	           Actions action = new Actions(driver);
	           action.keyDown(Keys.CONTROL).click(select7).click(select8).build().perform();	
	           Thread.sleep(5000);
	     	}
	          
	     	catch (Exception e)
	     	{
	     		System.out.println("Problem Sub category values not found");
	     		driver.close();
	     	}
	     	try { 
	     		Robot r = new Robot(); r.keyPress(KeyEvent.VK_ESCAPE); 
	     			r.keyRelease(KeyEvent.VK_ESCAPE);
	     		} catch (Exception e) { 

	         		System.out.println("Escape error");
	     		}
	     	
	     // for Part Selection dropdown icon
	   	 try {
	   		 Thread.sleep(5000);
	    		driver.findElement(By.xpath("//app-select[5]/mat-form-field/div/div/div[3]/mat-select/div/div[2]/div")).click();
	    	}

	    	catch (Exception e)
	    	{
	    		System.out.println("Part Selection dropdown  is disabled or not present");
	    		driver.close();
	    	}

	   	 
	    	try {
	    		
	    		

	            driver.findElement(By.xpath("//mat-option[2]/span")).click();
	           driver.findElement(By.xpath("//mat-option[5]/span")).click();
	                                               	
	          Thread.sleep(5000);
	    	}
	         
	    	catch (Exception e)
	    	{
	    		System.out.println("Parts not found");
	    		driver.close();
	    	}
	    	try { 
	    		Robot r = new Robot(); r.keyPress(KeyEvent.VK_ESCAPE); 
	    			r.keyRelease(KeyEvent.VK_ESCAPE);
	    			
	    			Thread.sleep(5000);
	    		} catch (Exception e) { 

	        		System.out.println("Escape error");
	    		}
	    	
	  // Defect Type photo 
	  	try {
	  		
	  		
	  		try {
	  		WebElement element = driver.findElement(By.xpath("//app-file/div/button/span"));

	  		Actions actions = new Actions(driver);

	  		actions.moveToElement(element);

	  		actions.perform();
	  		}
	  		catch (Exception e)
	      	{
	      		System.out.println("Scroll upto Defect Upload Button is not working");
	      		driver.close();
	      	}
	      	
	  		
	  		
	  		driver.findElement(By.xpath("//app-file/div/button/span")).click();
	  	}

	  	catch (Exception e)
	  	{
	  		System.out.println("Defect Upload Button is disabled or not Present in Defect Photos");
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
	     		System.out.println("Photo could not be uploaded in Defect Photos");
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
				  System.out.println("Test Failed as invalid file got uploaded in Defect Photos");

			  }

	        
	        
	  	}
	  	catch (Exception e)
	  	{
	  		System.out.println("Could not switch to upload pop up in Defect Photos");
	  		//driver.close();
	  	
	  	
	  	}
	  	
	  	//Pop Up Operations form valid file one upload in Defect Photos
	  	try {
	  		driver.findElement(By.xpath("//app-file/div/button/span")).click();
	  	}

	  	catch (Exception e)
	  	{
	  		System.out.println("Defect Upload Button is disabled or not Present in Defect Photos");
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
	     		System.out.println("1st Photo could not be uploaded in Defect Photos");
	  	} 
	  	}
	  	catch (Exception e)
	  	{
	  		System.out.println("Could not switch to upload pop up in Defect Photos");
	  		//driver.close();
	  	
	  	
	  	}

	  	
	  	//Pop Up Operations form valid file two upload in Defect Photos
	  	try {
	  		driver.findElement(By.xpath("//app-file/div/button/span")).click();
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
	  	// First photo
	        try {  driver.findElement(By.xpath("//input[@type='file']")).sendKeys("C:\\Users\\TECHFOUR\\Downloads\\SampleJPGImage_50kbmb.jpg");
	        Thread.sleep(5000);
	          String a= driver.findElement(By.xpath("//h4/a/span")).getText();
	          System.out.println("file path after upload is: "+ a);
				driver.findElement(By.xpath("//button[contains(.,'Finish')]")).click();
	        }
	     	catch (Exception e)
	     	{
	     		System.out.println("2nd Photo could not be uploaded in Defect Photos");
	  	} 
	  	}
	  	catch (Exception e)
	  	{
	  		System.out.println("Could not switch to upload pop up in Defect Photos");
	  		//driver.close();
	  	}
	  	
	  
	  	
	//Photo deletion operation in Defect Photos
	  	
	  	try {
	  		driver.findElement(By.xpath("//div[@id='repair_details___fields']/app-file/div/button[2]")).click();
	  	}

	  	catch (Exception e)
	  	{
	  		System.out.println("View Files Button is disabled or not Present in Defect Photos");
	  		driver.close();

	  	}
	  	try {
	  		driver.findElement(By.xpath("//mat-icon[contains(.,'delete')]")).click();
	  	}

	  	catch (Exception e)
	  	{
	  		System.out.println("Delete Button is disabled or not Present in Defect Photos");
	  		driver.close();

	  	}

	  	try {
	  		String b= driver.switchTo().alert().getText();
	  		System.out.println(b);
	  		driver.switchTo().alert().dismiss();
	  	}

	  	catch (Exception e)
	  	{
	  		System.out.println("Cancel Button is disabled or not Present in Defect Photos");
	  		driver.close();

	  	}
	  	try {
	  		driver.findElement(By.xpath("//mat-icon[contains(.,'delete')]")).click();
	  	}

	  	catch (Exception e)
	  	{
	  		System.out.println("Delete Button is disabled or not Present in Defect Photos");
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
	  		System.out.println("OK Button is disabled or not Present in Defect Photos");
	  		driver.close();

	  	}
	//Photo upload cancel button in Defect Photos
	  	try {
	  		driver.findElement(By.xpath("//app-file/div/button/span")).click();
	  	}

	  	catch (Exception e)
	  	{
	  		System.out.println("Defect Upload Button is disabled or not Present i Defect Photos");
	  		driver.close();

	  	}
	  	
	  	try {
	  		 driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	          driver.switchTo().activeElement();
	          Thread.sleep(5000);
	  	}
	  	catch (Exception e)
	  	{
	  		System.out.println("Photo upload pop up not found in Defect Photos");
	  		driver.close();

	  	}
	  	try {
	  		driver.findElement(By.xpath("//span[contains(.,'Cancel')]")).click();
	 	}
	 	catch (Exception e)
	 	{
	 		System.out.println("Cancel button not found in Defect Photos");
	 		driver.close();

	 	}
	  	
	  	// Claim form doc 
	 
		try {
			   
	   		driver.findElement(By.xpath("//app-file[2]/div/button")).click();
	   	}

	   	catch (Exception e)
	   	{
	   		System.out.println("Claim form Upload Button is disabled or not Present in claim form");
	   		driver.close();
	   	}
	 	
	 	
	 	
	   	//Pop Up Operations form invalid file upload in claim form
	   	try {
	   		 driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	           driver.switchTo().activeElement();
	   	
	         try {  driver.findElement(By.xpath("//input[@type='file']")).sendKeys("C:\\Users\\TECHFOUR\\Desktop\\invalid.exe");
	         Thread.sleep(5000);
	         }

	      	catch (Exception e)
	      	{
	      		System.out.println("claim Photo could not be uploaded");
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
	 			  System.out.println("Test Failed as invalid file got uploaded n claim form");

	 		  }

	         
	         
	   	}
	   	catch (Exception e)
	   	{
	   		System.out.println("Could not switch to claim form upload pop up");
	   		//driver.close();
	   	
	   	
	   	}
		
	   	//Pop Up Operations form valid file one upload
	   	try {
	   		driver.findElement(By.xpath("//app-file[2]/div/button")).click();
	   	}

	   	catch (Exception e)
	   	{
	   		System.out.println("claim form  Upload Button is disabled or not Present");
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
	      		System.out.println("1st Photo could not be uploaded in claim form");
	   	} 
	   	}
	   	catch (Exception e)
	   	{
	   		System.out.println("Could not switch to claim form upload pop up");
	   		//driver.close();
	   	
	   	
	   	}

	   	
	   	//Pop Up Operations form valid file two upload in claim form
	   	try {
	   		driver.findElement(By.xpath("//app-file[2]/div/button")).click();
	   	}

	   	catch (Exception e)
	   	{
	   		System.out.println("claim form Upload Button is disabled or not Present");
	   		driver.close();

	   	}
	   	
	   	try {
	   		 driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	           driver.switchTo().activeElement();
	           Thread.sleep(5000);
	   	// First photo
	         try {  driver.findElement(By.xpath("//input[@type='file']")).sendKeys("C:\\Users\\TECHFOUR\\Downloads\\SampleJPGImage_50kbmb.jpg");
	         Thread.sleep(5000);
	           String a= driver.findElement(By.xpath("//h4/a/span")).getText();
	           System.out.println("file path after upload is: "+ a);
	 			driver.findElement(By.xpath("//button[contains(.,'Finish')]")).click();
	         }
	      	catch (Exception e)
	      	{
	      		System.out.println("2nd Photo could not be uploaded claim form");
	   	} 
	   	}
	   	catch (Exception e)
	   	{
	   		System.out.println("Could not switch to claim form upload pop up");
	   		//driver.close();
	   	}
	   	
	   
	   	
	 //Photo deletion operation in claim form
	   	
	   	try {
	   		driver.findElement(By.xpath("//div[@id='repair_details___fields']/app-file[2]/div/button[2]/span")).click();
	   	}

	   	catch (Exception e)
	   	{
	   		System.out.println("View Files Button is disabled or not Present in claim form");
	   		driver.close();

	   	}
	   	try {
	   		driver.findElement(By.xpath("//mat-icon[contains(.,'delete')]")).click();
	   	}

	   	catch (Exception e)
	   	{
	   		System.out.println("Delete Button is disabled or not Present in claim form");
	   		driver.close();

	   	}

	   	try {
	   		String b= driver.switchTo().alert().getText();
	   		System.out.println(b);
	   		driver.switchTo().alert().dismiss();
	   	}

	   	catch (Exception e)
	   	{
	   		System.out.println("Cancel Button is disabled or not Present in claim form");
	   		driver.close();

	   	}
	   	try {
	   		driver.findElement(By.xpath("//mat-icon[contains(.,'delete')]")).click();
	   	}

	   	catch (Exception e)
	   	{
	   		System.out.println("Delete Button is disabled or not Present in claim form");
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
	   		System.out.println("OK Button is disabled or not Present in claim form");
	   		driver.close();

	   	}
	 //Photo upload cancel button.
	   	try {
	   		driver.findElement(By.xpath("//app-file[2]/div/button")).click();
	   	}

	   	catch (Exception e)
	   	{
	   		System.out.println("Defect Upload Button is disabled or not Present in claim form");
	   		driver.close();

	   	}
	   	
	   	try {
	   		 driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	           driver.switchTo().activeElement();
	           Thread.sleep(5000);
	   	}
	   	catch (Exception e)
	   	{
	   		System.out.println("Photo upload pop up not found in claim form");
	   		driver.close();

	   	}
	   	try {
	   		driver.findElement(By.xpath("//span[contains(.,'Cancel')]")).click();
	  	}
	  	catch (Exception e)
	  	{
	  		System.out.println("Cancel button not found in claim form");
	  		driver.close();

	  	}

	 	
	 	

	   	
	// Product Number Doc
	 

	 	try {
	   		
	   		
	   		try {
	   		WebElement element = driver.findElement(By.xpath("//app-file[3]/div/button"));

	   		Actions actions = new Actions(driver);

	   		actions.moveToElement(element);

	   		actions.perform();
	   		}
	   		catch (Exception e)
	       	{
	       		System.out.println("Scroll upto Defect Upload Button is not working");
	       		driver.close();
	       	}
	       	
	   		
	   		
	   		driver.findElement(By.xpath("//app-file[3]/div/button")).click();
	   	}

	   	catch (Exception e)
	   	{
	   		System.out.println("Defect Upload Button is disabled or not Present in Product Number");
	   		driver.close();
	   	}
	   	//Pop Up Operations form invalid file upload in Product Number
	   	try {
	   		 driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	           driver.switchTo().activeElement();
	   	
	         try {  driver.findElement(By.xpath("//input[@type='file']")).sendKeys("C:\\Users\\TECHFOUR\\Desktop\\invalid.exe");
	         Thread.sleep(5000);
	         }

	      	catch (Exception e)
	      	{
	      		System.out.println("Product Number Photo could not be uploaded");
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
	 			  System.out.println("Test Failed as invalid file got uploaded in Product Number");

	 		  }

	         
	         
	   	}
	   	catch (Exception e)
	   	{
	   		System.out.println("Could not switch to claim form upload pop up in Product Number");
	   		//driver.close();
	   	
	   	
	   	}
	   	
	   	//Pop Up Operations form valid file one upload in Product Number
	   	try {
	   		driver.findElement(By.xpath("//app-file[3]/div/button")).click();
	   	}

	   	catch (Exception e)
	   	{
	   		System.out.println("Product Number form  Upload Button is disabled or not Present");
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
	      		System.out.println("1st Photo could not be uploaded in Product Number");
	   	} 
	   	}
	   	catch (Exception e)
	   	{
	   		System.out.println("Could not switch to Product Number upload pop up");
	   		//driver.close();
	   	
	   	
	   	}

	   	
	   	//Pop Up Operations form valid file two upload in Product Number
	   	try {
	   		driver.findElement(By.xpath("//app-file[3]/div/button")).click();
	   	}

	   	catch (Exception e)
	   	{
	   		System.out.println("Product Number form Upload Button is disabled or not Present");
	   		driver.close();

	   	}
	   	
	   	try {
	   		 driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	           driver.switchTo().activeElement();
	           Thread.sleep(5000);
	   	// second photo in Product Number
	         try {  driver.findElement(By.xpath("//input[@type='file']")).sendKeys("C:\\Users\\TECHFOUR\\Downloads\\SampleJPGImage_50kbmb.jpg");
	         Thread.sleep(5000);
	           String a= driver.findElement(By.xpath("//h4/a/span")).getText();
	           System.out.println("file path after upload is: "+ a);
	 			driver.findElement(By.xpath("//button[contains(.,'Finish')]")).click();
	         }
	      	catch (Exception e)
	      	{
	      		System.out.println("2nd Photo could not be uploaded Product Number");
	   	} 
	   	}
	   	catch (Exception e)
	   	{
	   		System.out.println("Could not switch to Product Number form upload pop up");
	   		//driver.close();
	   	}
	   	
	   
	   	
	 //Photo deletion operation in Product Number
	   	
	   	try {
	   		driver.findElement(By.xpath("//div[@id='repair_details___fields']/app-file[3]/div/button[2]/span")).click();
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
	 //Photo upload cancel button in Product Number
	   	try {
	   		driver.findElement(By.xpath("//app-file[3]/div/button")).click();
	   	}

	   	catch (Exception e)
	   	{
	   		System.out.println("Defect Upload Button is disabled or not Present in Product Number");
	   		driver.close();

	   	}
	   	
	   	try {
	   		 driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	           driver.switchTo().activeElement();
	           Thread.sleep(5000);
	   	}
	   	catch (Exception e)
	   	{
	   		System.out.println("Photo upload pop up not found in Product Number");
	   		driver.close();

	   	}
	   	try {
	   		driver.findElement(By.xpath("//span[contains(.,'Cancel')]")).click();
	  	}
	  	catch (Exception e)
	  	{
	  		System.out.println("Cancel button not found in Product Number");
	  		driver.close();

	  	}
	 	// Job Sheet Doc
	 
	    
	 	try {
	   		
	   		
	   		try {
	   		WebElement element = driver.findElement(By.xpath("//app-file[5]/div/button"));

	   		Actions actions = new Actions(driver);

	   		actions.moveToElement(element);

	   		actions.perform();
	   		}
	   		catch (Exception e)
	       	{
	       		System.out.println("Scroll upto Defect Upload Button is not working");
	       		driver.close();
	       	}
	       	
	   		
	   		
	   		driver.findElement(By.xpath("//app-file[5]/div/button")).click();
	   	}

	   	catch (Exception e)
	   	{
	   		System.out.println("Defect Upload Button is disabled or not Present in Job Sheet");
	   		driver.close();
	   	}
	   	//Pop Up Operations form invalid file upload in Job Sheet
	   	try {
	   		 driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	           driver.switchTo().activeElement();
	   	
	         try {  driver.findElement(By.xpath("//input[@type='file']")).sendKeys("C:\\Users\\TECHFOUR\\Desktop\\invalid.exe");
	         Thread.sleep(5000);
	         }

	      	catch (Exception e)
	      	{
	      		System.out.println("Job Sheet Photo could not be uploaded");
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
	 			  System.out.println("Test Failed as invalid file got uploaded in Job Sheet");

	 		  }

	         
	         
	   	}
	   	catch (Exception e)
	   	{
	   		System.out.println("Could not switch to Job Sheet upload pop up in Product Number");
	   		//driver.close();
	   	
	   	
	   	}
	   	
	   	//Pop Up Operations form valid file one upload in Job Sheet
	   	try {
	   		driver.findElement(By.xpath("//app-file[5]/div/button")).click();
	   	}

	   	catch (Exception e)
	   	{
	   		System.out.println("Job Sheet form  Upload Button is disabled or not Present");
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
	      		System.out.println("1st Photo could not be uploaded in Job Sheet");
	   	} 
	   	}
	   	catch (Exception e)
	   	{
	   		System.out.println("Could not switch to Job Sheet upload pop up");
	   		//driver.close();
	   	
	   	
	   	}

	   	
	   	//Pop Up Operations form valid file two upload in Job Sheet
	   	try {
	   		driver.findElement(By.xpath("//app-file[5]/div/button")).click();
	   	}

	   	catch (Exception e)
	   	{
	   		System.out.println("Job Sheet  Upload Button is disabled or not Present");
	   		driver.close();

	   	}
	   	
	   	try {
	   		 driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	           driver.switchTo().activeElement();
	           Thread.sleep(5000);
	   	// second photo in Job Sheet
	         try {  driver.findElement(By.xpath("//input[@type='file']")).sendKeys("C:\\Users\\TECHFOUR\\Downloads\\SampleJPGImage_50kbmb.jpg");
	         Thread.sleep(5000);
	           String a= driver.findElement(By.xpath("//h4/a/span")).getText();
	           System.out.println("file path after upload is: "+ a);
	 			driver.findElement(By.xpath("//button[contains(.,'Finish')]")).click();
	         }
	      	catch (Exception e)
	      	{
	      		System.out.println("2nd Photo could not be uploaded Job Sheet");
	   	} 
	   	}
	   	catch (Exception e)
	   	{
	   		System.out.println("Could not switch to Job Sheet form upload pop up");
	   		//driver.close();
	   	}
	   	
	   
	   	
	 //Photo deletion operation in Job Sheet
	   	
	   	try {
	   		driver.findElement(By.xpath("//div[@id='repair_details___fields']/app-file[5]/div/button[2]/span")).click();
	   	}

	   	catch (Exception e)
	   	{
	   		System.out.println("View Files Button is disabled or not Present in Job Sheet");
	   		driver.close();

	   	}
	   	try {
	   		driver.findElement(By.xpath("//mat-icon[contains(.,'delete')]")).click();
	   	}

	   	catch (Exception e)
	   	{
	   		System.out.println("Delete Button is disabled or not Present in Job Sheet");
	   		driver.close();

	   	}

	   	try {
	   		String b= driver.switchTo().alert().getText();
	   		System.out.println(b);
	   		driver.switchTo().alert().dismiss();
	   	}

	   	catch (Exception e)
	   	{
	   		System.out.println("Cancel Button is disabled or not Present in Job Sheet");
	   		driver.close();

	   	}
	   	try {
	   		driver.findElement(By.xpath("//mat-icon[contains(.,'delete')]")).click();
	   	}

	   	catch (Exception e)
	   	{
	   		System.out.println("Delete Button is disabled or not Present in Job Sheet");
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
	   		System.out.println("OK Button is disabled or not Present in Job Sheet");
	   		driver.close();

	   	}
	 //Photo upload cancel button in Job Sheet
	   	try {
	   		driver.findElement(By.xpath("//app-file[5]/div/button")).click();
	   	}

	   	catch (Exception e)
	   	{
	   		System.out.println("Defect Upload Button is disabled or not Present in Job Sheet");
	   		driver.close();

	   	}
	   	
	   	try {
	   		 driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	           driver.switchTo().activeElement();
	           Thread.sleep(5000);
	   	}
	   	catch (Exception e)
	   	{
	   		System.out.println("Photo upload pop up not found in Job Sheet");
	   		driver.close();

	   	}
	   	try {
	   		driver.findElement(By.xpath("//span[contains(.,'Cancel')]")).click();
	  	}
	  	catch (Exception e)
	  	{
	  		System.out.println("Cancel button not found in Job Sheet");
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
	String Successmsg = driver.findElement(By.xpath("//p[contains(.,'Inspection has been created successfully.')]")).getText();
	 wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//p[contains(.,'Inspection has been created successfully.')]")));
	driver.findElement(By.xpath("//button[@id='modal-action-button']")).click();
	                             
	 if (Successmsg.contentEquals("Inspection has been created successfully."))
	  {
	 	 
	 	 System.out.println(Successmsg);

	  }
	  else {
		  System.out.println("Inspection success message is incorrect");

	  }
	 
	driver.close();

	 }
}
