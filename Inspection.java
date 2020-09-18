package automationFramework;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import org.testng.annotations.Test;


public class Inspection {
	public WebDriver driver;
 String driverPath = "D:\\jitendra\\Selenium drivers\\latestchromedriver\\chromedriver.exe";
 public String  baseUrl;
 /*
 //Blank Data validation check
 @BeforeTest(alwaysRun = true)
 public void BrowserLaunch() throws Exception {
     System.setProperty("webdriver.chrome.driver", driverPath);
   driver = new ChromeDriver();
   driver.manage().window().maximize();
   driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
 }*/
@Test (priority=1)
public void BlankInspection() {
	 System.setProperty("webdriver.chrome.driver", driverPath);
	   driver = new ChromeDriver();
	   driver.manage().window().maximize();
	   driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	 
driver.get("http://devreassure.innov.co.in/complaints/view/658");
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
         	driver.findElement(By.xpath("//tr[4]/td[5]/div")).click();
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
         driver.close();
}
      /*  	 
@AfterTest (alwaysRun = true)
public void BlankInspectionClose () throws Exception {
	
					 driver.close();

}*/

 
 /*
 //Cancelled
 @BeforeTest(alwaysRun = true)
 public void setUp() throws Exception {
     System.setProperty("webdriver.chrome.driver", driverPath);
   driver = new ChromeDriver();
   driver.manage().window().maximize();
     baseUrl = "http://devreassure.innov.co.in";
   driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
 }*/

@Test (priority=2)
public void VisitCancelled() {
	 System.setProperty("webdriver.chrome.driver", driverPath);
	   driver = new ChromeDriver();
	   driver.manage().window().maximize();
	     baseUrl = "http://devreassure.innov.co.in";
	   driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	 
driver.get("http://devreassure.innov.co.in/complaints/view/659");
driver.findElement(By.xpath("//input[@type='text']")).click();
driver.findElement(By.xpath("//input[@type='text']")).clear();
driver.findElement(By.xpath("//input[@type='text']")).sendKeys("san001");
driver.findElement(By.xpath("//input[@type='password']")).clear();
driver.findElement(By.xpath("//input[@type='password']")).sendKeys("san001");
driver.findElement(By.xpath("//button[@type='submit']")).click();

try {
	driver.findElement(By.xpath("//div[3]/a/span[2]")).click();
}

catch (Exception e)
{
	System.out.println("Add Inspection button is disabled or not present");
	driver.close();
}

try {
	driver.findElement(By.cssSelector("mat-datepicker-toggle.ng-tns-c72-36 > button:nth-child(1) > span:nth-child(1) > svg:nth-child(1)")).click();
}

catch (Exception e)
{
	System.out.println("Datepicker icon is disabled or not present");
	driver.close();
}
try {
	driver.findElement(By.xpath("//tr[4]/td[5]/div")).click();
}

catch (Exception e)
{
	System.out.println("Invalid date or date is disabled or element not found");
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
	driver.findElement(By.xpath("//mat-option[3]/span")).click();
}

catch (Exception e)
{
	System.out.println("Visit Sub status dropdown value is disabled or not present");
	driver.close();
}

try {
	driver.findElement(By.xpath("//div[2]/div/button")).click();
}

catch (Exception e)
{
	System.out.println("Submit button is disabled or not present");
	driver.close();
}

try {
driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
 driver.switchTo().activeElement().getText();
 WebDriverWait wait = new WebDriverWait(driver, 120);
	String Successmsg = driver.findElement(By.xpath("//*[@id=\"modal-body\"]/p")).getText();
	 wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"modal-action-button\"]")));
	driver.findElement(By.xpath("//*[@id=\"modal-action-button\"]")).click();
	
	
	if (Successmsg.contentEquals("Data has been saved Successfully."))
   {
  	 
  	 System.out.println(Successmsg);
   }
	  else {
		  System.out.println("Test Failed as success message is wrong");
	  }
     }
	  
	  catch (Exception e) {
	      System.out.println("Test Failed");
	    }
try {
	Thread.sleep(5000);
	 String SubStatus=driver.findElement(By.xpath("//span[contains(.,'Cancelled')]")).getText();
System.out.println("Substatus value is "+SubStatus);
				if (SubStatus.contentEquals("Cancelled"))
			   {
			  	 
			  	 System.out.println("Visit sub status is :"+SubStatus);
			   }
				  else {
					  System.out.println("Visit Sub status is wrong");
				  }
			     }
				  
				  catch (Exception e) {
				      System.out.println("Test Failed");
						 driver.close();
				    }
				 driver.close();
	 

 
}
/*
 @AfterTest (alwaysRun = true)
 public void Close() throws Exception {
	 try {
		 String SubStatus=driver.findElement(By.xpath("//span[contains(.,'Cancelled')]")).getText();
System.out.println("Substatus value is "+SubStatus);
					if (SubStatus.contentEquals("Cancelled"))
				   {
				  	 
				  	 System.out.println("Visit sub status is :"+SubStatus);
				   }
					  else {
						  System.out.println("Visit Sub status is wrong");
					  }
				     }
					  
					  catch (Exception e) {
					      System.out.println("Test Failed");
					    }
					 driver.close();
				 	 
	 }
	 */
//Customer Not Available
/*
 @BeforeTest(alwaysRun = true)
 public void launch() throws Exception {
     System.setProperty("webdriver.chrome.driver", driverPath);
   driver = new ChromeDriver();
   driver.manage().window().maximize();
     baseUrl = "http://devreassure.innov.co.in";
   driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
 }*/
@Test (priority=3)
public void CustomerNotAvailable() {
	 System.setProperty("webdriver.chrome.driver", driverPath);
	   driver = new ChromeDriver();
	   driver.manage().window().maximize();
	     baseUrl = "http://devreassure.innov.co.in";
	   driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

driver.get("http://devreassure.innov.co.in/complaints/view/660");
driver.findElement(By.xpath("//input[@type='text']")).click();
driver.findElement(By.xpath("//input[@type='text']")).clear();
driver.findElement(By.xpath("//input[@type='text']")).sendKeys("san001");
driver.findElement(By.xpath("//input[@type='password']")).clear();
driver.findElement(By.xpath("//input[@type='password']")).sendKeys("san001");
driver.findElement(By.xpath("//button[@type='submit']")).click();

try {
	driver.findElement(By.xpath("//div[3]/a/span[2]")).click();
}

catch (Exception e)
{
	System.out.println("Add Inspection button is disabled or not present");
	driver.close();
}

try {
	driver.findElement(By.cssSelector("mat-datepicker-toggle.ng-tns-c72-36 > button:nth-child(1) > span:nth-child(1) > svg:nth-child(1)")).click();
}

catch (Exception e)
{
	System.out.println("Datepicker icon is disabled or not present");
	driver.close();
}
try {
	driver.findElement(By.xpath("//tr[4]/td[5]/div")).click();
}

catch (Exception e)
{
	System.out.println("Invalid date or date is disabled or element not found");
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
	driver.findElement(By.xpath("//mat-option[4]/span")).click();
}

catch (Exception e)
{
	System.out.println("Visit Sub status dropdown value is disabled or not present");
	driver.close();
}

try {
	driver.findElement(By.xpath("//div[2]/div/button")).click();
}

catch (Exception e)
{
	System.out.println("Submit button is disabled or not present");
	driver.close();
}

try {
driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
 driver.switchTo().activeElement().getText();
 WebDriverWait wait = new WebDriverWait(driver, 120);
	String Successmsg = driver.findElement(By.xpath("//*[@id=\"modal-body\"]/p")).getText();
	 wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"modal-action-button\"]")));
	driver.findElement(By.xpath("//*[@id=\"modal-action-button\"]")).click();
	
	
	if (Successmsg.contentEquals("Data has been saved Successfully."))
   {
  	 
  	 System.out.println(Successmsg);
   }
	  else {
		  System.out.println("Test Failed as success message is wrong");
	  }
     }
	  
	  catch (Exception e) {
	      System.out.println("Test Failed");
	    }
	 
try {
	Thread.sleep(5000);
	 String SubStatus=driver.findElement(By.xpath("//div[@id='undefined']/div/div[6]/span[2]")).getText();
System.out.println("Substatus value is "+SubStatus);
				if (SubStatus.contentEquals("Customer Not Available"))
			   {
			  	 
			  	 System.out.println("Visit sub status is :"+SubStatus);
			   }
				  else {
					  System.out.println("Visit Sub status is wrong");
				  }
			     }
				  
				  catch (Exception e) {
				      System.out.println("Test Failed");

						 driver.close();
				    }
				 driver.close();
}
/*
 @AfterTest (alwaysRun = true)
 public void CloseCustomerNotAvailable() throws Exception {
	 try {
		 String SubStatus=driver.findElement(By.xpath("//div[@id='undefined']/div/div[6]/span[2]")).getText();
System.out.println("Substatus value is "+SubStatus);
					if (SubStatus.contentEquals("Customer Not Available"))
				   {
				  	 
				  	 System.out.println("Visit sub status is :"+SubStatus);
				   }
					  else {
						  System.out.println("Visit Sub status is wrong");
					  }
				     }
					  
					  catch (Exception e) {
					      System.out.println("Test Failed");
					    }
					 driver.close();
 }*/
 
 //Customer Rescheduled
 /*
 @BeforeTest(alwaysRun = true)
 public void LaunchCustomerReschedule() throws Exception {
     System.setProperty("webdriver.chrome.driver", driverPath);
   driver = new ChromeDriver();
   driver.manage().window().maximize();
     baseUrl = "http://devreassure.innov.co.in";
   driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
 }*/
@Test (priority=4)
public void CustomerReschedule() {
	  System.setProperty("webdriver.chrome.driver", driverPath);
	   driver = new ChromeDriver();
	   driver.manage().window().maximize();
	     baseUrl = "http://devreassure.innov.co.in";
	   driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	 
driver.get("http://devreassure.innov.co.in/complaints/view/661");
driver.findElement(By.xpath("//input[@type='text']")).click();
driver.findElement(By.xpath("//input[@type='text']")).clear();
driver.findElement(By.xpath("//input[@type='text']")).sendKeys("san001");
driver.findElement(By.xpath("//input[@type='password']")).clear();
driver.findElement(By.xpath("//input[@type='password']")).sendKeys("san001");
driver.findElement(By.xpath("//button[@type='submit']")).click();

try {
	driver.findElement(By.xpath("//div[3]/a/span[2]")).click();
}

catch (Exception e)
{
	System.out.println("Add Inspection button is disabled or not present");
	driver.close();
}

try {
	driver.findElement(By.cssSelector("mat-datepicker-toggle.ng-tns-c72-36 > button:nth-child(1) > span:nth-child(1) > svg:nth-child(1)")).click();
}

catch (Exception e)
{
	System.out.println("Datepicker icon is disabled or not present");
	driver.close();
}
try {
	driver.findElement(By.xpath("//tr[4]/td[5]/div")).click();
}

catch (Exception e)
{
	System.out.println("Invalid date or date is disabled or element not found");
	driver.close();
}
try {
	driver.findElement(By.xpath("//div[8]/mat-expansion-panel/div/div/div[2]/app-select/mat-form-field/div/div/div[3]/mat-select/div/div[2]/div")).click();
}

catch (Exception e)
{
	System.out.println("Visit Sub status dropdown icon is disabled or not present");
	driver.close();
}
try {
	driver.findElement(By.xpath("//mat-option[5]/span")).click();
}

catch (Exception e)
{
	System.out.println("Visit Sub status dropdown value is disabled or not present");
	driver.close();
}

try {
	driver.findElement(By.xpath("//div[2]/div/button")).click();
}

catch (Exception e)
{
	System.out.println("Submit button is disabled or not present");
	driver.close();
}

try {
driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
 driver.switchTo().activeElement().getText();
 WebDriverWait wait = new WebDriverWait(driver, 120);
	String Successmsg = driver.findElement(By.xpath("//*[@id=\"modal-body\"]/p")).getText();
	 wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"modal-action-button\"]")));
	driver.findElement(By.xpath("//*[@id=\"modal-action-button\"]")).click();
	
	
	if (Successmsg.contentEquals("Data has been saved Successfully."))
   {
  	 
  	 System.out.println(Successmsg);
   }
	  else {
		  System.out.println("Test Failed as success message is wrong");
	  }
     }
	  
	  catch (Exception e) {
	      System.out.println("Test Failed");
	    }
try {
	Thread.sleep(5000);
	 String SubStatus=driver.findElement(By.xpath("//div[@id='undefined']/div/div[6]/span[2]")).getText();
System.out.println("Substatus value is "+SubStatus);
				if (SubStatus.contentEquals("Customer Rescheduled"))
			   {
			  	 
			  	 System.out.println("Visit sub status is :"+SubStatus);
			   }
				  else {
					  System.out.println("Visit Sub status is wrong");
				  }
			     }
				  
				  catch (Exception e) {
				      System.out.println("Test Failed");
				      driver.close();
				    }
				 driver.close();

	 
 
}
/*
 @AfterTest (alwaysRun = true)
 public void CloseCustomerReschedule() throws Exception {
	 try {
		 String SubStatus=driver.findElement(By.xpath("//div[@id='undefined']/div/div[6]/span[2]")).getText();
System.out.println("Substatus value is "+SubStatus);
					if (SubStatus.contentEquals("Customer Rescheduled"))
				   {
				  	 
				  	 System.out.println("Visit sub status is :"+SubStatus);
				   }
					  else {
						  System.out.println("Visit Sub status is wrong");
					  }
				     }
					  
					  catch (Exception e) {
					      System.out.println("Test Failed");
					    }
					 driver.close();
 }
 */
 
 //Engineer Reschedule
 
 /*
 @BeforeTest(alwaysRun = true)
 public void LaunchEngineerReschedule() throws Exception {
     System.setProperty("webdriver.chrome.driver", driverPath);
   driver = new ChromeDriver();
   driver.manage().window().maximize();
     baseUrl = "http://devreassure.innov.co.in";
   driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
 }*/
@Test (priority=5)
public void EngineerReschedule() {
	     System.setProperty("webdriver.chrome.driver", driverPath);
	   driver = new ChromeDriver();
	   driver.manage().window().maximize();
	     baseUrl = "http://devreassure.innov.co.in";
	   driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	 
driver.get("http://devreassure.innov.co.in/complaints/view/662");
driver.findElement(By.xpath("//input[@type='text']")).click();
driver.findElement(By.xpath("//input[@type='text']")).clear();
driver.findElement(By.xpath("//input[@type='text']")).sendKeys("san001");
driver.findElement(By.xpath("//input[@type='password']")).clear();
driver.findElement(By.xpath("//input[@type='password']")).sendKeys("san001");
driver.findElement(By.xpath("//button[@type='submit']")).click();

try {
	driver.findElement(By.xpath("//div[3]/a/span[2]")).click();
}

catch (Exception e)
{
	System.out.println("Add Inspection button is disabled or not present");
	driver.close();
}

try {
	driver.findElement(By.cssSelector("mat-datepicker-toggle.ng-tns-c72-36 > button:nth-child(1) > span:nth-child(1) > svg:nth-child(1)")).click();
}

catch (Exception e)
{
	System.out.println("Datepicker icon is disabled or not present");
	driver.close();
}
try {
	driver.findElement(By.xpath("//tr[4]/td[5]/div")).click();
}

catch (Exception e)
{
	System.out.println("Invalid date or date is disabled or element not found");
	driver.close();
}
try {
	driver.findElement(By.xpath("//div[8]/mat-expansion-panel/div/div/div[2]/app-select/mat-form-field/div/div/div[3]/mat-select/div/div[2]/div")).click();
}

catch (Exception e)
{
	System.out.println("Visit Sub status dropdown icon is disabled or not present");
	driver.close();
}
try {
	driver.findElement(By.xpath("//mat-option[6]/span")).click();
}

catch (Exception e)
{
	System.out.println("Visit Sub status dropdown value is disabled or not present");
	driver.close();
}

try {
	driver.findElement(By.xpath("//div[2]/div/button")).click();
}

catch (Exception e)
{
	System.out.println("Submit button is disabled or not present");
	driver.close();
}

try {
driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
 driver.switchTo().activeElement().getText();
 WebDriverWait wait = new WebDriverWait(driver, 120);
	String Successmsg = driver.findElement(By.xpath("//*[@id=\"modal-body\"]/p")).getText();
	 wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"modal-action-button\"]")));
	driver.findElement(By.xpath("//*[@id=\"modal-action-button\"]")).click();
	
	
	if (Successmsg.contentEquals("Data has been saved Successfully."))
   {
  	 
  	 System.out.println(Successmsg);
   }
	  else {
		  System.out.println("Test Failed as success message is wrong");
	  }
     }
	  
	  catch (Exception e) {
	      System.out.println("Test Failed");
	    }
try {
	Thread.sleep(5000);
	 String SubStatus=driver.findElement(By.xpath("//div[@id='undefined']/div/div[6]/span[2]")).getText();
System.out.println("Substatus value is "+SubStatus);
				if (SubStatus.contentEquals("Engineer Rescheduled"))
			   {
			  	 
			  	 System.out.println("Visit sub status is :"+SubStatus);
			   }
				  else {
					  System.out.println("Visit Sub status is wrong");
				  }
			     }
				  
				  catch (Exception e) {
				      System.out.println("Test Failed");

						 driver.close();
				    }

				 driver.close();

 
}
/*
 @AfterTest (alwaysRun = true)
 public void CloseEngineerReschedule() throws Exception {
	 try {
		 String SubStatus=driver.findElement(By.xpath("//div[@id='undefined']/div/div[6]/span[2]")).getText();
System.out.println("Substatus value is "+SubStatus);
					if (SubStatus.contentEquals("Engineer Rescheduled"))
				   {
				  	 
				  	 System.out.println("Visit sub status is :"+SubStatus);
				   }
					  else {
						  System.out.println("Visit Sub status is wrong");
					  }
				     }
					  
					  catch (Exception e) {
					      System.out.println("Test Failed");
					    }

					 driver.close();
 }
*/
 
}