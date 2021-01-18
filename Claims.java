package Volvo;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Claims {

	
	//Script for submitting blank form
	
			@Test (priority=1)	
			
			public void BlankData() throws InterruptedException {

			System.setProperty("webdriver.gecko.driver","D:\\jitendra\\Selenium drivers\\geckodriver-v0.29.0-win64\\geckodriver.exe");

			WebDriver driver = new FirefoxDriver();
			driver.manage().deleteAllCookies();
		    driver.manage().window().maximize();
		    
				/*
				System.setProperty("webdriver.chrome.driver", "D:\\jitendra\\Selenium drivers\\chromedriver_win32 version 87\\chromedriver.exe");
		        WebDriver driver=new ChromeDriver();
		        driver.manage().deleteAllCookies();
		        driver.manage().window().maximize();
		        */
		        driver.get("http://13.126.69.89/eicher/index.php?module=PurchaseOrder&view=List");



			driver.manage().timeouts().pageLoadTimeout(15,TimeUnit.SECONDS);

			driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);

			// Verifying successfull login
			
			//Username
			driver.findElement(By.id("username")).sendKeys("demo-dealer");
			//Password
			driver.findElement(By.id("password")).sendKeys("P@ssw0rd");

			driver.findElement(By.xpath("//*[@id=\"loginDiv\"]/input[3]")).click();
			String expectedUrl= driver.getCurrentUrl();
			String actualUrl="http://13.126.69.89/eicher/index.php";
		    // Assert.assertEquals(expectedUrl,actualUrl);
		     if (actualUrl.equals(expectedUrl))
				{ 
			   	 System.out.println("Test Passed-login home screen");
			   		}
			   		else 
			   		{
			   			System.out.println("Test Failed-login home screen");
			   			driver.close();
			   		}
					driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
					
					System.out.println("TC1: To verify if the user is able to submit blank claim form");			
					
				//Service Request Menu button
					
					try {
						driver.findElement(By.id("menubar_item_PurchaseOrder")).click();
					}
					catch(Exception e) {
						System.out.println("Service Request menu button is not clickable/found");
			   		}
//Add Service Request button
					
					try {
						driver.findElement(By.xpath("//*[@id=\"PurchaseOrder_listView_basicAction_LBL_ADD_RECORD\"]/strong")).click();
					}
					catch(Exception e) {
						System.out.println("Add Service Request button is not clickable/found");
			   		}
//	TC1: To verify if the user is able to submit blank claim form		
//  save button top
					
					try {
						driver.findElement(By.xpath("//*[@id=\"EditView\"]/div[1]/div[2]/div/button/strong")).click();
					}
					catch(Exception e) {
						System.out.println("Save button is not clickable/found");
			   		}
// error message for leaving agreement number blank
					String actualagreementblank= "* This field is required";
					String Espectedagreementblank = driver.findElement(By.xpath("//*[@id=\"rowid_852_box_a\"]/div/div/div[1]")).getText();
					if (actualagreementblank.equals(Espectedagreementblank))
					{ 
				   	 System.out.println("Test Passed- error message for leaving agreement field blank is correct");
				   		}
				   		else 
				   		{
				   			System.out.println("Test Failed-error message for leaving agreement field blank is incorrect");
				   			driver.close();
				   		}
					// error message for leaving Aggregate number blank
					String actualAggregateblank= "* This field is required";
					String ExpectedAggregateblank = driver.findElement(By.xpath("//*[@id=\"rowid_1326_box_a\"]/div[1]/div[1]")).getText();
					if (actualAggregateblank.equals(ExpectedAggregateblank))
					{ 
				   	 System.out.println("Test Passed- error message for leaving Aggregate  field blank is correct");
				   		}
				   		else 
				   		{
				   			System.out.println("Test Failed-error message for leaving Aggregate  field blank is incorrect");
				   			driver.close();
				   		}
					// error message for leaving Jobcardnumber blank
					String actualJobcardnumberblank= "* This field is required";
					String ExpectedJobcardnumberblank = driver.findElement(By.xpath("//*[@id=\"rowid_874_box_a\"]/div/div[1]")).getText();
					if (actualJobcardnumberblank.equals(ExpectedJobcardnumberblank))
					{ 
				   	 System.out.println("Test Passed- error message for leaving Jobcardnumber field blank is correct");
				   		}
				   		else 
				   		{
				   			System.out.println("Test Failed-error message for leaving Jobcardnumber field blank is incorrect");
				   			driver.close();
				   		}
					// error message for leaving Jobcard Date blank
					String actualJobcardDateblank= "* This field is required";
					String ExpectedJobcardDateblank = driver.findElement(By.xpath("//*[@id=\"rowid_876_box_a\"]/div/div/div/div[1]")).getText();
					if (actualJobcardDateblank.equals(ExpectedJobcardDateblank))
					{ 
				   	 System.out.println("Test Passed- error message for leaving Jobcard Date field blank is correct");
				   		}
				   		else 
				   		{
				   			System.out.println("Test Failed-error message for leaving Jobcard Date field blank is incorrect");
				   			driver.close();
				   		}
					// error message for leaving Vehicle Date blank
					String actualVehicleDateblank= "* This field is required";
					String ExpectedVehicleDateblank = driver.findElement(By.xpath("//*[@id=\"rowid_880_box_a\"]/div/div/div/div[1]")).getText();
					if (actualVehicleDateblank.equals(ExpectedVehicleDateblank))
					{ 
				   	 System.out.println("Test Passed- error message for leaving Vehicle Date field blank is correct");
				   		}
				   		else 
				   		{
				   			System.out.println("Test Failed-error message for leaving Vehicle Date field blank is incorrect");
				   			driver.close();
				   		}
																
					// error message for leaving  Quotation  blank
					String actualQuotationblank= "* This field is required";
					String ExpectedQuotationblank = driver.findElement(By.xpath("//*[@id=\"rowid_1327_box_a\"]/div/div[1]")).getText();
					if (actualQuotationblank.equals(ExpectedQuotationblank))
					{ 
				   	 System.out.println("Test Passed- error message for leaving Quotation  field blank is correct");
				   		}
				   		else 
				   		{
				   			System.out.println("Test Failed-error message for leaving Quotation  field blank is incorrect");
				   			driver.close();
				   		}
										
					// error message for leaving  Diagnosis   blank
					String actualDiagnosisblank= "* This field is required";
					String ExpectedDiagnosisblank = driver.findElement(By.xpath("//*[@id=\"rowid_1327_box_a\"]/div/div[1]")).getText();
					if (actualDiagnosisblank.equals(ExpectedDiagnosisblank))
					{ 
				   	 System.out.println("Test Passed- error message for leaving Diagnosis field blank is correct");
				   		}
				   		else 
				   		{
				   			System.out.println("Test Failed-error message for leaving Diagnosis field blank is incorrect");
				   			driver.close();
				   		}
					System.out.println("TC1 PASSED");
					
					
						//TC2: To verify if the user is able to submit the claim form by entering invalid job card number
					System.out.println("To verify if the user is able to submit the claim form by entering invalid job card number");
			}   

			@Test (priority=2)	   
	public void validClaims() 
			{
				System.setProperty("webdriver.gecko.driver","D:\\jitendra\\Selenium drivers\\geckodriver-v0.29.0-win64\\geckodriver.exe");

				WebDriver driver = new FirefoxDriver();
				driver.manage().deleteAllCookies();
			    driver.manage().window().maximize();



		   {
		    driver.get("http://13.127.10.134/volvo_dev/index.php");
		    driver.findElement(By.id("username")).click();
		    driver.findElement(By.id("username")).clear();
		    driver.findElement(By.id("username")).sendKeys("2000 - Noida");
		    driver.findElement(By.id("password")).click();
		    driver.findElement(By.id("password")).clear();
		    driver.findElement(By.id("password")).sendKeys("Welcome@1234");
		    driver.findElement(By.xpath("//input[@value='LOG IN']")).click();
		    driver.findElement(By.id("menubar_item_PurchaseOrder")).click();
		    driver.findElement(By.id("PurchaseOrder_listView_basicAction_LBL_ADD_RECORD")).click();
		    driver.findElement(By.id("PurchaseOrder_editView_fieldName_ews_certificate_no_select")).click();
		    // ERROR: Caught exception [ERROR: Unsupported command [selectWindow | win_ser_1 | ]]
		    // ERROR: Caught exception [ERROR: Unsupported command [selectWindow | win_ser_local | ]]
		    // ERROR: Caught exception [ERROR: Unsupported command [selectWindow | win_ser_1 | ]]
		    driver.findElement(By.xpath("//tr[@id='SalesOrder_popUpListView_row_1']/td[3]")).click();
		    // ERROR: Caught exception [ERROR: Unsupported command [selectWindow | win_ser_local | ]]
		    driver.findElement(By.xpath("//div[@id='s2id_PurchaseOrder_Edit_fieldName_agrpartlist']/ul/li")).click();
		    driver.findElement(By.xpath("//div[23]/ul/li[2]/div")).click();
		    driver.findElement(By.id("EditView")).click();
		    driver.findElement(By.id("PurchaseOrder_editView_fieldName_job_card_no")).click();
		    driver.findElement(By.id("PurchaseOrder_editView_fieldName_job_card_no")).clear();
		    driver.findElement(By.id("PurchaseOrder_editView_fieldName_job_card_no")).sendKeys("7896321452");
		    assertEquals(closeAlertAndGetItsText(), "Please Fill ehs hrs first");
		    driver.findElement(By.id("PurchaseOrder_editView_fieldName_ehs_hrs")).click();
		    driver.findElement(By.id("PurchaseOrder_editView_fieldName_ehs_hrs")).clear();
		    driver.findElement(By.id("PurchaseOrder_editView_fieldName_ehs_hrs")).sendKeys("78965");
		    assertEquals(closeAlertAndGetItsText(), "The selected aggregate is not under Extended Warranty period");
		    assertEquals(closeAlertAndGetItsText(), "The selected aggregate is still under Standard Warranty period");
		    driver.findElement(By.id("PurchaseOrder_editView_fieldName_ehs_hrs")).clear();
		    driver.findElement(By.id("PurchaseOrder_editView_fieldName_ehs_hrs")).sendKeys("50");
		    driver.findElement(By.id("PurchaseOrder_editView_fieldName_job_card_no")).clear();
		    driver.findElement(By.id("PurchaseOrder_editView_fieldName_job_card_no")).sendKeys("9878451894");
		    driver.findElement(By.xpath("//td[@id='rowid_876_box_a']/div/div/span/i")).click();
		    driver.findElement(By.xpath("//div[@id='datepicker_158']/div[9]/table/tbody/tr/td/table/tbody[2]/tr[3]/td[6]/a/span")).click();
		    driver.findElement(By.id("EditView")).click();
		    driver.findElement(By.xpath("//td[@id='rowid_876_box_a']/div/div/span/i")).click();
		    driver.findElement(By.xpath("//div[@id='datepicker_158']/div[9]/table/tbody/tr/td/table/tbody[2]/tr[3]/td[7]/a/span")).click();
		    assertEquals(closeAlertAndGetItsText(), "JobCard Date can not Accepts future date.");
		    driver.findElement(By.xpath("//td[@id='rowid_876_box_a']/div/div/span/i")).click();
		    driver.findElement(By.xpath("//div[@id='datepicker_158']/div[9]/table/tbody/tr/td/table/tbody[2]/tr[3]/td[6]/a/span")).click();
		    driver.findElement(By.xpath("//td[@id='rowid_880_box_a']/div/div/span/i")).click();
		    driver.findElement(By.xpath("//div[@id='datepicker_420']/div[9]/table/tbody/tr/td/table/tbody[2]/tr[3]/td[7]/a/span")).click();
		    assertEquals(closeAlertAndGetItsText(), "Failure Date Should be equal to or 2 days before from Jobcard date.");
		    driver.findElement(By.xpath("//td[@id='rowid_880_box_a']/div/div/span/i")).click();
		    driver.findElement(By.xpath("//div[@id='datepicker_420']/div[9]/table/tbody/tr/td/table/tbody[2]/tr[4]/td/a/span")).click();
		    assertEquals(closeAlertAndGetItsText(), "Failure Date Should be equal to or 2 days before from Jobcard date.");
		    driver.findElement(By.xpath("//td[@id='rowid_880_box_a']/div/div/span/i")).click();
		    driver.findElement(By.xpath("//div[@id='datepicker_420']/div[9]/table/tbody/tr/td/table/tbody[2]/tr[3]/td[6]/a/span")).click();
		    assertEquals(closeAlertAndGetItsText(), "The selected aggregate is still under Standard Warranty period");
		    driver.findElement(By.id("PurchaseOrder_editView_fieldName_quotation")).click();
		    driver.findElement(By.id("PurchaseOrder_editView_fieldName_quotation")).clear();
		    driver.findElement(By.id("PurchaseOrder_editView_fieldName_quotation")).sendKeys("864531");
		    driver.findElement(By.xpath("//form[@id='EditView']/div[2]/div/button/strong")).click();
		    driver.findElement(By.id("form-validation-field-0")).click();
		    driver.findElement(By.id("form-validation-field-0")).clear();
		    driver.findElement(By.id("form-validation-field-0")).sendKeys("yes");
		    driver.findElement(By.xpath("//form[@id='EditView']/div[2]/div/button/strong")).click();
		  }

				

		
	}
				
	
	
}
