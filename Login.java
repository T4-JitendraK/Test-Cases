// Login Script for Serve-Insure Web Portal
//Scenarios Handled:
/*
1) Login script for valid credentials
2) Login script for invalid User credentials
3) Login script for invalid Password
4) Script for submitting blank login form
5) Script for deactivated user login
*/
package automationFramework;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Login {
	
	//Login script for valid credentials

	@Test (priority=4)	

		public void loginBrowser() {

		/*System.setProperty("webdriver.firefox.marionette","D:\\jitendra\\Selenium drivers\\geckodriver.exe");

		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();*/
			
			System.setProperty("webdriver.chrome.driver", "D:\\jitendra\\Selenium drivers\\latestchromedriver\\chromedriver.exe");
	        WebDriver driver=new ChromeDriver();
	        driver.manage().window().maximize();
	        driver.get("http://reassure.innov.co.in");

		driver.manage().deleteAllCookies();

		driver.manage().timeouts().pageLoadTimeout(15,TimeUnit.SECONDS);

		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);

		
//Username
		driver.findElement(By.xpath("//*[@id=\"login-form\"]/div/form/div[1]/div/input")).sendKeys("claimedu");
//Password
		driver.findElement(By.xpath("//*[@id=\"login-form\"]/div/form/div[2]/div/input")).sendKeys("claimedu");

		driver.findElement(By.xpath("//*[@id=\"login-form\"]/div/form/button")).click();
		/*String expectedUrl= driver.getCurrentUrl();
		String actualUrl="http://devreassure.innov.co.in/dashboard";
         Assert.assertEquals(expectedUrl,actualUrl);*/
        
        String Title= driver.getTitle();
        String ExpectedTitle= "ReAssure";
		System.out.println("Title of the home page is: " + Title);
	
		Assert.assertEquals(ExpectedTitle,Title);
		
		if (ExpectedTitle.equals(Title))
		{ 
         System.out.println("Test Passed as Login is successfull");
		}
		else 
		{
			System.out.println("Test Failed as user is not able to login with valid data");
		}
 		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
         driver.close();
		
		

		}
	
	//Login script for invalidUser credentials
	
	@Test (priority=3)	

	public void invalidUser() {

	/*System.setProperty("webdriver.firefox.marionette","D:\\jitendra\\Selenium drivers\\geckodriver.exe");

	WebDriver driver = new FirefoxDriver();
	driver.get("http://www.facebook.com");
	driver.manage().window().maximize();*/
		
		System.setProperty("webdriver.chrome.driver", "D:\\jitendra\\Selenium drivers\\latestchromedriver\\chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("http://reassure.innov.co.in");

	driver.manage().deleteAllCookies();

	driver.manage().timeouts().pageLoadTimeout(15,TimeUnit.SECONDS);

	driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);

	//Username

	driver.findElement(By.xpath("//*[@id=\"login-form\"]/div/form/div[1]/div/input")).sendKeys("username");
	//Password
	driver.findElement(By.xpath("//*[@id=\"login-form\"]/div/form/div[2]/div/input")).sendKeys("san001");

	driver.findElement(By.xpath("//*[@id=\"login-form\"]/div/form/button")).click();
	/*String expectedUrl= driver.getCurrentUrl();
	String actualUrl="http://devreassure.innov.co.in/dashboard";
     Assert.assertEquals(expectedUrl,actualUrl);*/
    
	String  errmsg= driver.findElement(By.xpath("//*[@id=\"login-form\"]/div/alert/div")).getText();
	System.out.println("Error Msg for invalid User is: " + errmsg);
	
    String Expectederrmsg= "No user found";
    Assert.assertEquals(Expectederrmsg,errmsg);
    
    if (errmsg.equals(Expectederrmsg))
	{ 
     System.out.println("Test Passed as Login is Unsuccessfull with invalid username");
	}
	else 
	{
		System.out.println("Test Failed as Login is successfull with invalid username");
	}
		
    
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
     driver.close();
	
	

	}
	
	//Login script for invalid Password

	@Test (priority=2)	

	public void invalidPassword() {

	/*System.setProperty("webdriver.firefox.marionette","D:\\jitendra\\Selenium drivers\\geckodriver.exe");

	WebDriver driver = new FirefoxDriver();
	driver.get("http://www.facebook.com");
	driver.manage().window().maximize();*/
		
		System.setProperty("webdriver.chrome.driver", "D:\\jitendra\\Selenium drivers\\latestchromedriver\\chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("http://reassure.innov.co.in");

	driver.manage().deleteAllCookies();

	driver.manage().timeouts().pageLoadTimeout(15,TimeUnit.SECONDS);

	driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);

	
	//Username
	driver.findElement(By.xpath("//*[@id=\"login-form\"]/div/form/div[1]/div/input")).sendKeys("san001");
	//Password
	driver.findElement(By.xpath("//*[@id=\"login-form\"]/div/form/div[2]/div/input")).sendKeys("username");

	driver.findElement(By.xpath("//*[@id=\"login-form\"]/div/form/button")).click();
	/*String expectedUrl= driver.getCurrentUrl();
	String actualUrl="http://devreassure.innov.co.in/dashboard";
     Assert.assertEquals(expectedUrl,actualUrl);*/
    
	String  errmsg= driver.findElement(By.xpath("//*[@id=\"login-form\"]/div/alert/div")).getText();
	System.out.println("Error Msg for invalid Password is: " + errmsg);
	
    String Expectederrmsg= "Wrong password.";
    Assert.assertEquals(Expectederrmsg,errmsg);
    
    if (errmsg.equals(Expectederrmsg))
	{ 
    	 System.out.println("Test Passed as Login is Unsuccessfull with invalid password");
    		}
    		else 
    		{
    			System.out.println("Test Failed as Login is successfull with invalid password");
    		}
	
    
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
     driver.close();
	
	

	}

	
	//Script for submitting blank login form
	
	@Test (priority=1)	
	
	public void BlankData() {

	/*System.setProperty("webdriver.firefox.marionette","D:\\jitendra\\Selenium drivers\\geckodriver.exe");

	WebDriver driver = new FirefoxDriver();
	driver.get("http://www.facebook.com");
	driver.manage().window().maximize();*/
		
		System.setProperty("webdriver.chrome.driver", "D:\\jitendra\\Selenium drivers\\latestchromedriver\\chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("http://reassure.innov.co.in");

	driver.manage().deleteAllCookies();

	driver.manage().timeouts().pageLoadTimeout(15,TimeUnit.SECONDS);

	driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);

	
	//Username
	driver.findElement(By.xpath("//*[@id=\"login-form\"]/div/form/div[1]/div/input")).sendKeys("");
	//Password
	driver.findElement(By.xpath("//*[@id=\"login-form\"]/div/form/div[2]/div/input")).sendKeys("");

	driver.findElement(By.xpath("//*[@id=\"login-form\"]/div/form/button")).click();
	/*String expectedUrl= driver.getCurrentUrl();
	String actualUrl="http://devreassure.innov.co.in/dashboard";
     Assert.assertEquals(expectedUrl,actualUrl);*/
    
	String  errmsg= driver.findElement(By.xpath("//*[@id=\"login-form\"]/div/alert/div")).getText();
	System.out.println("Error Msg for blank data is: " + errmsg);
	
    String Expectederrmsg= "Please enter username & password";
    Assert.assertEquals(Expectederrmsg,errmsg);
    
    
    if (errmsg.equals(Expectederrmsg))
	{ 
   	 System.out.println("Test Passed as Login is Unsuccessfull with blank data");
   		}
   		else 
   		{
   			System.out.println("Test Failed as Login is successfull with blank data");
   		}
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
     driver.close();
	
	}
	
	
	//Script for deactivated user login
     @Test (priority=5)	
 	
 	public void InactiveUser() {

 	/*System.setProperty("webdriver.firefox.marionette","D:\\jitendra\\Selenium drivers\\geckodriver.exe");

 	WebDriver driver = new FirefoxDriver();
 	driver.get("http://www.facebook.com");
 	driver.manage().window().maximize();*/
 		
 		System.setProperty("webdriver.chrome.driver", "D:\\jitendra\\Selenium drivers\\latestchromedriver\\chromedriver.exe");
         WebDriver driver=new ChromeDriver();
         driver.manage().window().maximize();
         driver.get("http://reassure.innov.co.in");

 	driver.manage().deleteAllCookies();

 	driver.manage().timeouts().pageLoadTimeout(15,TimeUnit.SECONDS);

 	driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);

 	
 	//Username
 	driver.findElement(By.xpath("//*[@id=\"login-form\"]/div/form/div[1]/div/input")).sendKeys("ajay100");
//Password
 	driver.findElement(By.xpath("//*[@id=\"login-form\"]/div/form/div[2]/div/input")).sendKeys("Welcome@123");

 	driver.findElement(By.xpath("//*[@id=\"login-form\"]/div/form/button")).click();
 	/*String expectedUrl= driver.getCurrentUrl();
 	String actualUrl="http://devreassure.innov.co.in/dashboard";
      Assert.assertEquals(expectedUrl,actualUrl);*/
     
 	String  errmsg= driver.findElement(By.xpath("//*[@id=\"login-form\"]/div/alert/div")).getText();
 	System.out.println("Error Msg for deactivated account is: " + errmsg);
 	
     String Expectederrmsg= "Account is deactivated please contact to Administrator.";
     Assert.assertEquals(Expectederrmsg,errmsg);
     
     
     if (errmsg.equals(Expectederrmsg))
 	{ 
      System.out.println("Test Passed as Account is deactivated");
 	}
 	else 
 	{
 		System.out.println("Test Failed as deactivated user is able to login");
 	}
 	
 		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
      driver.close();

	}


		}