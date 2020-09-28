package automationFramework;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import org.testng.annotations.Test;


public class InspectionComplete {
	public WebDriver driver;
 String driverPath = "D:\\jitendra\\Selenium drivers\\latestchromedriver\\chromedriver.exe";
 public String  baseUrl;
 
 /*
 
 
 @Test (priority=1)
 public void BlankInspection() {
 	 System.setProperty("webdriver.chrome.driver", driverPath);
 	   driver = new ChromeDriver();
 	   driver.manage().window().maximize();
 	   driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
 	 
 driver.get("http://devreassure.innov.co.in/complaints/view/664");
 driver.findElement(By.xpath("//input[@type='text']")).click();
 driver.findElement(By.xpath("//input[@type='text']")).clear();
 driver.findElement(By.xpath("//input[@type='text']")).sendKeys("san001");
 driver.findElement(By.xpath("//input[@type='password']")).clear();
 driver.findElement(By.xpath("//input[@type='password']")).sendKeys("san001");
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
          	driver.findElement(By.xpath("//tr[6]/td[1]/div")).click();
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
             	driver.findElement(By.xpath("//tr[6]/td[1]/div")).click();
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
 
 
 
 
 */
 @Test (priority=2)
 public void InvalidInspection() {
 	 System.setProperty("webdriver.chrome.driver", driverPath);
 	   driver = new ChromeDriver();
 	   driver.manage().window().maximize();
 	   driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
 	 
 driver.get("http://devreassure.innov.co.in/complaints/view/664");
 driver.findElement(By.xpath("//input[@type='text']")).click();
 driver.findElement(By.xpath("//input[@type='text']")).clear();
 driver.findElement(By.xpath("//input[@type='text']")).sendKeys("san001");
 driver.findElement(By.xpath("//input[@type='password']")).clear();
 driver.findElement(By.xpath("//input[@type='password']")).sendKeys("san001");
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
       		driver.findElement(By.xpath("//span[contains(.,'Auto Restart')]")).click();
       		Thread.sleep(5000);
       	}

       	catch (Exception e)
       	{
       		System.out.println("Problem category dropdown  value 1is disabled or not present");
       		driver.close();
       	}

       	try {
       		driver.findElement(By.xpath("//span[contains(.,'Tripping')]")).click();
       		Thread.sleep(5000);
       		driver.findElement(By.xpath("//*[@id=\"repair_details___fields\"]/app-input[2]/mat-form-field/div")).click();
       		Thread.sleep(5000);
       		
       	}

       	catch (Exception e)
       	{
       		System.out.println("Problem category dropdown value 2 is disabled or not present");
       		driver.close();
       	}


driver.close();    
 }
}
