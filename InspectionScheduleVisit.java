package automationFramework;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class InspectionScheduleVisit {

	// To check blank remarks validation
	@Test (priority=1)	
public void BlankData() {
		
		System.setProperty("webdriver.chrome.driver", "D:\\jitendra\\Selenium drivers\\latestchromedriver\\chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("http://reassure.innov.co.in/complaints/view/809");

	driver.manage().deleteAllCookies();

	driver.manage().timeouts().pageLoadTimeout(15,TimeUnit.SECONDS);

	driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	
	//Username
			driver.findElement(By.xpath("//*[@id=\"login-form\"]/div/form/div[1]/div/input")).sendKeys("san001");
	//Password
			driver.findElement(By.xpath("//*[@id=\"login-form\"]/div/form/div[2]/div/input")).sendKeys("Test@123");

			driver.findElement(By.xpath("//*[@id=\"login-form\"]/div/form/button")).click();
            driver.findElement(By.xpath("//*[@id=\"fieldRightSidebarContainer\"]/div/section[1]/div[2]/a/span[2]")).click();
            
            driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
            //Time-slot
            String TimeError=  driver.findElement(By.xpath("/html/body/app-root/div/mat-sidenav-container/mat-sidenav-content/main/app-complaint/app-layouts/div/div/app-field-builder/div/section[2]/div[1]/form/mat-accordion/div[6]/mat-expansion-panel/div/div/div[2]/app-timeslot/div/mat-error")).getText();
            
            if (TimeError.contentEquals("Appointment Time Slot is Required"))
            {
           	 
           	 System.out.println("Test Passes as error is for unselected timeslot is coming");
            }
  		  else {
  			  System.out.println("Test Failed");
  		  }

           
            //Remarks

            driver.findElement(By.xpath("//*[@id=\"mat-input-2\"]")).sendKeys("");
            driver.findElement(By.xpath("//*[@id=\"fieldRightSidebarContainer\"]/div/section[1]/div[2]/a/span[2]")).click();
          String Remarks=  driver.findElement(By.xpath("/html/body/app-root/div/mat-sidenav-container/mat-sidenav-content/main/app-complaint/app-layouts/div/div/app-field-builder/div/section[2]/div[1]/form/mat-accordion/div[6]/mat-expansion-panel/div/div/div[2]/app-textarea/mat-form-field/div/div[2]/div/mat-error")).getText();
          
          if (Remarks.contentEquals("Remark is Required"))
          {
         	 
         	 System.out.println("Test Passes as error is coming for empty remarks");
          }
		  else {
			  System.out.println("Test Failed");
		  }
		  
          
          driver.close();
          
            }
		  
		  
		
	
            
            

	
	
//First Slot
	@Test (priority=2)	
	public void FirstSlot() {
		
		System.setProperty("webdriver.chrome.driver", "D:\\jitendra\\Selenium drivers\\latestchromedriver\\chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("http://reassure.innov.co.in/complaints/view/807");

	driver.manage().deleteAllCookies();

	driver.manage().timeouts().pageLoadTimeout(15,TimeUnit.SECONDS);

	driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	
	//Username
			driver.findElement(By.xpath("//*[@id=\"login-form\"]/div/form/div[1]/div/input")).sendKeys("san001");
	//Password
			driver.findElement(By.xpath("//*[@id=\"login-form\"]/div/form/div[2]/div/input")).sendKeys("Test@123");

			driver.findElement(By.xpath("//*[@id=\"login-form\"]/div/form/button")).click();
            driver.findElement(By.xpath("//*[@id=\"fieldRightSidebarContainer\"]/div/section[1]/div[2]/a/span[2]")).click();
            
            driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
// //*[@id="2__1__enabled"]/label/div[2]/mat-icon
            try {
            driver.findElement(By.xpath("//*[@id=\"0__1__enabled\"]/label/div[2]/mat-icon")).click();
            driver.findElement(By.xpath("//*[@id=\"mat-input-2\"]")).sendKeys("this is a dummy text");
            driver.findElement(By.xpath("//*[@id=\"repair_schedule___fields\"]/div/button/span")).click();
            driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
            String TitleW= driver.switchTo().activeElement().getText();
			System.out.println("Model Box title is:" +TitleW);
		WebDriverWait wait = new WebDriverWait(driver, 120);
		String Successmsg = driver.findElement(By.xpath("//*[@id=\"modal-body\"]/p")).getText();
		 wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"modal-action-button\"]/span")));
		driver.findElement(By.xpath("//*[@id=\"modal-action-button\"]/span")).click();
		
		 if (Successmsg.contentEquals("Schedule Visit has been created successfully."))
          {
         	 
         	 System.out.println(Successmsg);
          }
		  else {
			  System.out.println(" Time-Slot is not available");
		  }
            }
		  
		  catch (Exception e) {
		      System.out.println("Time-Slot is already occupied or Time-Slot is not available");
		    }
		 driver.close();
            }
		  // Second slot
	@Test (priority=3)	
	public void SecondSlot() {
		
		System.setProperty("webdriver.chrome.driver", "D:\\jitendra\\Selenium drivers\\latestchromedriver\\chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("http://reassure.innov.co.in/complaints/view/807");

	driver.manage().deleteAllCookies();

	driver.manage().timeouts().pageLoadTimeout(15,TimeUnit.SECONDS);

	driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	
	//Username
			driver.findElement(By.xpath("//*[@id=\"login-form\"]/div/form/div[1]/div/input")).sendKeys("san001");
	//Password
			driver.findElement(By.xpath("//*[@id=\"login-form\"]/div/form/div[2]/div/input")).sendKeys("Test@123");

			driver.findElement(By.xpath("//*[@id=\"login-form\"]/div/form/button")).click();
            driver.findElement(By.xpath("//*[@id=\"fieldRightSidebarContainer\"]/div/section[1]/div[2]/a/span[2]")).click();
            
            driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
// //*[@id="2__1__enabled"]/label/div[2]/mat-icon
            try {
            driver.findElement(By.xpath("//*[@id=\"0__2__enabled\"]/label/div[2]/mat-icon")).click();
            driver.findElement(By.xpath("//*[@id=\"mat-input-2\"]")).sendKeys("this is a dummy text");
            driver.findElement(By.xpath("//*[@id=\"repair_schedule___fields\"]/div/button/span")).click();
            driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
            String TitleW= driver.switchTo().activeElement().getText();
			System.out.println("Model Box title is:" +TitleW);
		WebDriverWait wait = new WebDriverWait(driver, 120);
		String Successmsg = driver.findElement(By.xpath("//*[@id=\"modal-body\"]/p")).getText();
		 wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"modal-action-button\"]/span")));
		driver.findElement(By.xpath("//*[@id=\"modal-action-button\"]/span")).click();
		
		 if (Successmsg.contentEquals("Schedule Visit has been created successfully."))
          {
         	 
         	 System.out.println(Successmsg);
          }
		  else {
			  System.out.println(" Time-Slot is not available");
		  }
            }
		  
		  catch (Exception e) {
		      System.out.println("Time-Slot is already occupied or Time-Slot is not available");
		    }
		 driver.close();
            }
		//Third Slot
	@Test (priority=4)	
	public void ThirdSlot() {
		
		System.setProperty("webdriver.chrome.driver", "D:\\jitendra\\Selenium drivers\\latestchromedriver\\chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("http://reassure.innov.co.in/complaints/view/807");

	driver.manage().deleteAllCookies();

	driver.manage().timeouts().pageLoadTimeout(15,TimeUnit.SECONDS);

	driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	
	//Username
			driver.findElement(By.xpath("//*[@id=\"login-form\"]/div/form/div[1]/div/input")).sendKeys("san001");
	//Password
			driver.findElement(By.xpath("//*[@id=\"login-form\"]/div/form/div[2]/div/input")).sendKeys("Test@123");

			driver.findElement(By.xpath("//*[@id=\"login-form\"]/div/form/button")).click();
            driver.findElement(By.xpath("//*[@id=\"fieldRightSidebarContainer\"]/div/section[1]/div[2]/a/span[2]")).click();
            
            driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);

            try {
            driver.findElement(By.xpath("//*[@id=\"0__3__enabled\"]/label/div[2]/mat-icon")).click();
            driver.findElement(By.xpath("//*[@id=\"mat-input-2\"]")).sendKeys("this is a dummy text");
            driver.findElement(By.xpath("//*[@id=\"repair_schedule___fields\"]/div/button/span")).click();
            driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
            String TitleW= driver.switchTo().activeElement().getText();
			System.out.println("Model Box title is:" +TitleW);
		WebDriverWait wait = new WebDriverWait(driver, 120);
		String Successmsg = driver.findElement(By.xpath("//*[@id=\"modal-body\"]/p")).getText();
		 wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"modal-action-button\"]/span")));
		driver.findElement(By.xpath("//*[@id=\"modal-action-button\"]/span")).click();
		
		 if (Successmsg.contentEquals("Schedule Visit has been created successfully."))
          {
         	 
         	 System.out.println(Successmsg);
          }
		  else {
			  System.out.println(" Time-Slot is not available");
		  }
            }
		  
		  catch (Exception e) {
		      System.out.println("Time-Slot is already occupied or Time-Slot is not available");
		    }
		 driver.close();
            }
	//Fourth Slot
	@Test (priority=5)	
	public void FourthSlot() {
		
		System.setProperty("webdriver.chrome.driver", "D:\\jitendra\\Selenium drivers\\latestchromedriver\\chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("http://reassure.innov.co.in/complaints/view/807");

	driver.manage().deleteAllCookies();

	driver.manage().timeouts().pageLoadTimeout(15,TimeUnit.SECONDS);

	driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	
	//Username
			driver.findElement(By.xpath("//*[@id=\"login-form\"]/div/form/div[1]/div/input")).sendKeys("san001");
	//Password
			driver.findElement(By.xpath("//*[@id=\"login-form\"]/div/form/div[2]/div/input")).sendKeys("Test@123");

			driver.findElement(By.xpath("//*[@id=\"login-form\"]/div/form/button")).click();
            driver.findElement(By.xpath("//*[@id=\"fieldRightSidebarContainer\"]/div/section[1]/div[2]/a/span[2]")).click();
            
            driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);

            try {
            driver.findElement(By.xpath("//*[@id=\"0__4__enabled\"]/label/div[2]/mat-icon")).click();
            driver.findElement(By.xpath("//*[@id=\"mat-input-2\"]")).sendKeys("this is a dummy text");
            driver.findElement(By.xpath("//*[@id=\"repair_schedule___fields\"]/div/button/span")).click();
            driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
            String TitleW= driver.switchTo().activeElement().getText();
			System.out.println("Model Box title is:" +TitleW);
		WebDriverWait wait = new WebDriverWait(driver, 120);
		String Successmsg = driver.findElement(By.xpath("//*[@id=\"modal-body\"]/p")).getText();
		 wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"modal-action-button\"]/span")));
		driver.findElement(By.xpath("//*[@id=\"modal-action-button\"]/span")).click();
		
		 if (Successmsg.contentEquals("Schedule Visit has been created successfully."))
          {
         	 
         	 System.out.println(Successmsg);
          }
		  else {
			  System.out.println(" Time-Slot is not available");
		  }
            }
		  
		  catch (Exception e) {
		      System.out.println("Time-Slot is already occupied or Time-Slot is not available");
		    }
		 driver.close();
            }
		
		//Fifth Slot
	@Test (priority=6)	
	public void FifthSlot() {
		
		System.setProperty("webdriver.chrome.driver", "D:\\jitendra\\Selenium drivers\\latestchromedriver\\chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("http://reassure.innov.co.in/complaints/view/807");

	driver.manage().deleteAllCookies();

	driver.manage().timeouts().pageLoadTimeout(15,TimeUnit.SECONDS);

	driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	
	//Username
			driver.findElement(By.xpath("//*[@id=\"login-form\"]/div/form/div[1]/div/input")).sendKeys("san001");
	//Password
			driver.findElement(By.xpath("//*[@id=\"login-form\"]/div/form/div[2]/div/input")).sendKeys("Test@123");

			driver.findElement(By.xpath("//*[@id=\"login-form\"]/div/form/button")).click();
            driver.findElement(By.xpath("//*[@id=\"fieldRightSidebarContainer\"]/div/section[1]/div[2]/a/span[2]")).click();
            
            driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);

            try {
            driver.findElement(By.xpath("//*[@id=\"0__5__enabled\"]/label/div[2]/mat-icon")).click();
            driver.findElement(By.xpath("//*[@id=\"mat-input-2\"]")).sendKeys("this is a dummy text");
            driver.findElement(By.xpath("//*[@id=\"repair_schedule___fields\"]/div/button/span")).click();
            driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
            String TitleW= driver.switchTo().activeElement().getText();
			System.out.println("Model Box title is:" +TitleW);
		WebDriverWait wait = new WebDriverWait(driver, 120);
		String Successmsg = driver.findElement(By.xpath("//*[@id=\"modal-body\"]/p")).getText();
		 wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"modal-action-button\"]/span")));
		driver.findElement(By.xpath("//*[@id=\"modal-action-button\"]/span")).click();
		
		 if (Successmsg.contentEquals("Schedule Visit has been created successfully."))
          {
         	 
         	 System.out.println(Successmsg);
          }
		  else {
			  System.out.println(" Time-Slot is not available");
		  }
            }
		  
		  catch (Exception e) {
		      System.out.println("Time-Slot is already occupied or Time-Slot is not available");
		    }
		 driver.close();
            }
		//Sixth Slot
	@Test (priority=7)	
	public void SixthSlot() {
		
		System.setProperty("webdriver.chrome.driver", "D:\\jitendra\\Selenium drivers\\latestchromedriver\\chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("http://reassure.innov.co.in/complaints/view/807");

	driver.manage().deleteAllCookies();

	driver.manage().timeouts().pageLoadTimeout(15,TimeUnit.SECONDS);

	driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	
	//Username
			driver.findElement(By.xpath("//*[@id=\"login-form\"]/div/form/div[1]/div/input")).sendKeys("san001");
	//Password
			driver.findElement(By.xpath("//*[@id=\"login-form\"]/div/form/div[2]/div/input")).sendKeys("Test@123");

			driver.findElement(By.xpath("//*[@id=\"login-form\"]/div/form/button")).click();
            driver.findElement(By.xpath("//*[@id=\"fieldRightSidebarContainer\"]/div/section[1]/div[2]/a/span[2]")).click();
            
            driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);

            try {
            driver.findElement(By.xpath("//*[@id=\"0__6__enabled\"]/label/div[2]/mat-icon")).click();
            driver.findElement(By.xpath("//*[@id=\"mat-input-2\"]")).sendKeys("this is a dummy text");
            driver.findElement(By.xpath("//*[@id=\"repair_schedule___fields\"]/div/button/span")).click();
            driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
            String TitleW= driver.switchTo().activeElement().getText();
			System.out.println("Model Box title is:" +TitleW);
		WebDriverWait wait = new WebDriverWait(driver, 120);
		String Successmsg = driver.findElement(By.xpath("//*[@id=\"modal-body\"]/p")).getText();
		 wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"modal-action-button\"]/span")));
		driver.findElement(By.xpath("//*[@id=\"modal-action-button\"]/span")).click();
		
		 if (Successmsg.contentEquals("Schedule Visit has been created successfully."))
          {
         	 
         	 System.out.println(Successmsg);
          }
		  else {
			  System.out.println(" Time-Slot is not available");
		  }
            }
		  
		  catch (Exception e) {
		      System.out.println("Time-Slot is already occupied or Time-Slot is not available");
		    }
		 driver.close();
            }
		
	//Seventh Slot
	@Test (priority=8)	
	public void SeventhSlot() {
		
		System.setProperty("webdriver.chrome.driver", "D:\\jitendra\\Selenium drivers\\latestchromedriver\\chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("http://reassure.innov.co.in/complaints/view/807");

	driver.manage().deleteAllCookies();

	driver.manage().timeouts().pageLoadTimeout(15,TimeUnit.SECONDS);

	driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	
	//Username
			driver.findElement(By.xpath("//*[@id=\"login-form\"]/div/form/div[1]/div/input")).sendKeys("san001");
	//Password
			driver.findElement(By.xpath("//*[@id=\"login-form\"]/div/form/div[2]/div/input")).sendKeys("Test@123");

			driver.findElement(By.xpath("//*[@id=\"login-form\"]/div/form/button")).click();
            driver.findElement(By.xpath("//*[@id=\"fieldRightSidebarContainer\"]/div/section[1]/div[2]/a/span[2]")).click();
            
            driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);

            try {
            driver.findElement(By.xpath("//*[@id=\"0__7__enabled\"]/label/div[2]/mat-icon")).click();
            driver.findElement(By.xpath("//*[@id=\"mat-input-2\"]")).sendKeys("this is a dummy text");
            driver.findElement(By.xpath("//*[@id=\"repair_schedule___fields\"]/div/button/span")).click();
            driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
            String TitleW= driver.switchTo().activeElement().getText();
			System.out.println("Model Box title is:" +TitleW);
		WebDriverWait wait = new WebDriverWait(driver, 120);
		String Successmsg = driver.findElement(By.xpath("//*[@id=\"modal-body\"]/p")).getText();
		 wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"modal-action-button\"]/span")));
		driver.findElement(By.xpath("//*[@id=\"modal-action-button\"]/span")).click();
		
		 if (Successmsg.contentEquals("Schedule Visit has been created successfully."))
          {
         	 
         	 System.out.println(Successmsg);
          }
		  else {
			  System.out.println(" Time-Slot is not available");
		  }
            }
		  
		  catch (Exception e) {
		      System.out.println("Time-Slot is already occupied or Time-Slot is not available");
		    }
		 driver.close();
            }
		
	// Eighth Slot
	
	@Test (priority=9)	
	public void EighthSlot() {
		
		System.setProperty("webdriver.chrome.driver", "D:\\jitendra\\Selenium drivers\\latestchromedriver\\chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("http://reassure.innov.co.in/complaints/view/807");

	driver.manage().deleteAllCookies();

	driver.manage().timeouts().pageLoadTimeout(15,TimeUnit.SECONDS);

	driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	
	//Username
			driver.findElement(By.xpath("//*[@id=\"login-form\"]/div/form/div[1]/div/input")).sendKeys("san001");
	//Password
			driver.findElement(By.xpath("//*[@id=\"login-form\"]/div/form/div[2]/div/input")).sendKeys("Test@123");

			driver.findElement(By.xpath("//*[@id=\"login-form\"]/div/form/button")).click();
            driver.findElement(By.xpath("//*[@id=\"fieldRightSidebarContainer\"]/div/section[1]/div[2]/a/span[2]")).click();
            
            driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);

            try {
            driver.findElement(By.xpath("//*[@id=\"0__8__enabled\"]/label/div[2]/mat-icon")).click();
            driver.findElement(By.xpath("//*[@id=\"mat-input-2\"]")).sendKeys("this is a dummy text");
            driver.findElement(By.xpath("//*[@id=\"repair_schedule___fields\"]/div/button/span")).click();
            driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
            String TitleW= driver.switchTo().activeElement().getText();
			System.out.println("Model Box title is:" +TitleW);
		WebDriverWait wait = new WebDriverWait(driver, 120);
		String Successmsg = driver.findElement(By.xpath("//*[@id=\"modal-body\"]/p")).getText();
		 wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"modal-action-button\"]/span")));
		driver.findElement(By.xpath("//*[@id=\"modal-action-button\"]/span")).click();
		
		 if (Successmsg.contentEquals("Schedule Visit has been created successfully."))
          {
         	 
         	 System.out.println(Successmsg);
          }
		  else {
			  System.out.println(" Time-Slot is not available");
		  }
            }
		  
		  catch (Exception e) {
		      System.out.println("Time-Slot is already occupied or Time-Slot is not available");
		    }
		 driver.close();
            }
		
	//9th Slot
	@Test (priority=10)	
	public void NinthSlot() {
		
		System.setProperty("webdriver.chrome.driver", "D:\\jitendra\\Selenium drivers\\latestchromedriver\\chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("http://reassure.innov.co.in/complaints/view/807");

	driver.manage().deleteAllCookies();

	driver.manage().timeouts().pageLoadTimeout(15,TimeUnit.SECONDS);

	driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	
	//Username
			driver.findElement(By.xpath("//*[@id=\"login-form\"]/div/form/div[1]/div/input")).sendKeys("san001");
	//Password
			driver.findElement(By.xpath("//*[@id=\"login-form\"]/div/form/div[2]/div/input")).sendKeys("Test@123");

			driver.findElement(By.xpath("//*[@id=\"login-form\"]/div/form/button")).click();
            driver.findElement(By.xpath("//*[@id=\"fieldRightSidebarContainer\"]/div/section[1]/div[2]/a/span[2]")).click();
            
            driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);

            try {
            driver.findElement(By.xpath("//*[@id=\"0__9__enabled\"]/label/div[2]/mat-icon")).click();
            driver.findElement(By.xpath("//*[@id=\"mat-input-2\"]")).sendKeys("this is a dummy text");
            driver.findElement(By.xpath("//*[@id=\"repair_schedule___fields\"]/div/button/span")).click();
            driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
            String TitleW= driver.switchTo().activeElement().getText();
			System.out.println("Model Box title is:" +TitleW);
		WebDriverWait wait = new WebDriverWait(driver, 120);
		String Successmsg = driver.findElement(By.xpath("//*[@id=\"modal-body\"]/p")).getText();
		 wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"modal-action-button\"]/span")));
		driver.findElement(By.xpath("//*[@id=\"modal-action-button\"]/span")).click();
		
		 if (Successmsg.contentEquals("Schedule Visit has been created successfully."))
          {
         	 
         	 System.out.println(Successmsg);
          }
		  else {
			  System.out.println(" Time-Slot is not available");
		  }
            }
		  
		  catch (Exception e) {
		      System.out.println("Time-Slot is already occupied or Time-Slot is not available");
		    }
		 driver.close();
            }
		//Tenth Slot
	@Test (priority=11)	
	public void TenthSlot() {
		
		System.setProperty("webdriver.chrome.driver", "D:\\jitendra\\Selenium drivers\\latestchromedriver\\chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("http://reassure.innov.co.in/complaints/view/807");

	driver.manage().deleteAllCookies();

	driver.manage().timeouts().pageLoadTimeout(15,TimeUnit.SECONDS);

	driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	
	//Username
			driver.findElement(By.xpath("//*[@id=\"login-form\"]/div/form/div[1]/div/input")).sendKeys("san001");
	//Password
			driver.findElement(By.xpath("//*[@id=\"login-form\"]/div/form/div[2]/div/input")).sendKeys("Test@123");

			driver.findElement(By.xpath("//*[@id=\"login-form\"]/div/form/button")).click();
            driver.findElement(By.xpath("//*[@id=\"fieldRightSidebarContainer\"]/div/section[1]/div[2]/a/span[2]")).click();
            
            driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);

            try {
            driver.findElement(By.xpath("//*[@id=\"0__10__enabled\"]/label/div[2]/mat-icon")).click();
            driver.findElement(By.xpath("//*[@id=\"mat-input-2\"]")).sendKeys("this is a dummy text");
            driver.findElement(By.xpath("//*[@id=\"repair_schedule___fields\"]/div/button/span")).click();
            driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
            String TitleW= driver.switchTo().activeElement().getText();
			System.out.println("Model Box title is:" +TitleW);
		WebDriverWait wait = new WebDriverWait(driver, 120);
		String Successmsg = driver.findElement(By.xpath("//*[@id=\"modal-body\"]/p")).getText();
		 wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"modal-action-button\"]/span")));
		driver.findElement(By.xpath("//*[@id=\"modal-action-button\"]/span")).click();
		
		 if (Successmsg.contentEquals("Schedule Visit has been created successfully."))
          {
         	 
         	 System.out.println(Successmsg);
          }
		  else {
			  System.out.println(" Time-Slot is not available");
		  }
            }
		  
		  catch (Exception e) {
		      System.out.println("Time-Slot is already occupied or Time-Slot is not available");
		    }
		 driver.close();
            }
	
	
		//When appointment date gets changed
	@Test (priority=12)	
public void Datechange() {
		
		System.setProperty("webdriver.chrome.driver", "D:\\jitendra\\Selenium drivers\\latestchromedriver\\chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("http://reassure.innov.co.in/complaints/view/809");

	driver.manage().deleteAllCookies();

	driver.manage().timeouts().pageLoadTimeout(15,TimeUnit.SECONDS);

	driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	
	//Username
			driver.findElement(By.xpath("//*[@id=\"login-form\"]/div/form/div[1]/div/input")).sendKeys("san001");
	//Password
			driver.findElement(By.xpath("//*[@id=\"login-form\"]/div/form/div[2]/div/input")).sendKeys("Test@123");

			driver.findElement(By.xpath("//*[@id=\"login-form\"]/div/form/button")).click();
            driver.findElement(By.xpath("//*[@id=\"fieldRightSidebarContainer\"]/div/section[1]/div[2]/a/span[2]")).click();
            
            driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
            try {
            driver.findElement(By.cssSelector("svg.mat-datepicker-toggle-default-icon.ng-star-inserted")).click();
            driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);

            driver.findElement(By.xpath("//tr[4]/td[3]/div")).click();

            driver.findElement(By.xpath("//*[@id=\"mat-select-10\"]/div/div[1]")).click();

            driver.findElement(By.xpath("//mat-option[3]/span")).click();
            


            driver.findElement(By.xpath("//*[@id=\"0__1__enabled\"]/label/div[2]/mat-icon")).click();
            driver.findElement(By.xpath("//*[@id=\"mat-input-2\"]")).sendKeys("this is a dummy text");
            driver.findElement(By.xpath("//*[@id=\"repair_schedule___fields\"]/div/button/span")).click();
            driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
            String TitleW= driver.switchTo().activeElement().getText();
			System.out.println("Model Box title is:" +TitleW);
		WebDriverWait wait = new WebDriverWait(driver, 120);
		String Successmsg = driver.findElement(By.xpath("//*[@id=\"modal-body\"]/p")).getText();
		 wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"modal-action-button\"]/span")));
		driver.findElement(By.xpath("//*[@id=\"modal-action-button\"]/span")).click();
		
		 if (Successmsg.contentEquals("Schedule Visit has been created successfully."))
          {
         	 
         	 System.out.println(Successmsg);

          }
		  else {
			  System.out.println(" Time-Slot is not available");

		  }
		 
	}
            catch (Exception e) {
  		      System.out.println("Time-Slot is already occupied or Time-Slot is not available");
  		    }
  		 
            driver.close();
            }
		  
            

		  }
            
	