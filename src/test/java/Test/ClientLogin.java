package Test;

import org.testng.annotations.Test;

import Page.Loginpage;
import Utility.ExcellData;
import Utility.PageUtility;
import Utility.WaitUtility;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.openqa.selenium.By;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.DataProvider;

public class ClientLogin extends Base
{
	
  @Test(priority=5,dataProvider = "dp",description = "TC_005_Verify user login with valid user credentials")
  public void Login(String n,  String s) 
  {
	  Loginpage lp=new Loginpage(driver);
	  lp.set(n,s);
	 
	  
  }

  @DataProvider
  public Object[][] dp() throws EncryptedDocumentException, InvalidFormatException, IOException {
	  
		  Object[][] data= ExcellData.getDataFromSheet("D:\\xcels\\buffalocart.xlsx");   
		  return data;
    };
    
    
    @Test(priority=1,description ="TC_001_Verify login page title")
	 public void verifyloginpagetitle()
	{

    	Loginpage lp=new Loginpage(driver);
    	
		String ActualTitle=driver.getTitle();
		System.out.println(ActualTitle);
		String ExcpectedTitle="Welcome to Codecarrots";
		if(ExcpectedTitle.equals(ActualTitle))
		{
			System.out.println("verification succesfull");
		}
		else
		{
			System.out.println("verification not succesfull");
		}
		
	}
    
    @Test(priority=2,description ="TC_002_Verify forgotpassword url")
	 public void verifyforgotpasswordurl()
	{

    	Loginpage lp=new Loginpage(driver);
    	
		String ActualURL=driver.getCurrentUrl();

		System.out.println(ActualURL);
		String ExcpectedURL="https://erp.buffalocart.com/login";
		Assert.assertEquals(ActualURL, ExcpectedURL,"invalid URL");
	}

    @Test(priority=6,description ="TC_006_Check popupwindow")
	 public void checkpopup()
	 {
    	
	try
	{
		
		driver.switchTo().alert();
		
	}
	
	catch(NoAlertPresentException e)
	{
		System.out.println("NoAlertPresentException is handled");
	}
	 }
    @Test(priority=3,dataProvider = "dp2",description ="TC_003_Verify login with invalid credentials")
    public void loginwithinvalidcredentials(String n,  String s) throws IOException
    {
    	Loginpage lp=new Loginpage(driver);
    	 	lp.set(n,s);
    	 
    	 	String actualmessage = lp.invalidCredentials();
    	 	System.out.println(actualmessage);
    		String expectedMessage = "username or password information doesn't exist!";
    		PageUtility.takescreenShot(driver, "Invalid Credentials");
    		
    		Assert.assertEquals(actualmessage, expectedMessage, "invalid login credentials..Login failed");
    		 
    	 
    	 
    }
    @DataProvider
   public Object[][] dp2() throws EncryptedDocumentException, InvalidFormatException, IOException {
  	  
  		  Object[][] data= ExcellData.getDataFromSheet("D:\\xcels\\buffalocartinvalid.xlsx");   
  		 return data;
}
  @Test(priority=4,description ="TC_004_Verify whetehr the user is able to click on 'Remember me' checkbox")
    public void Remembermecheckbox() 
    {
    	Loginpage lp=new Loginpage(driver);
    	 lp.ClickCheckbox();
    	boolean checkboxstatus=lp.Remembermecheckbox();
    	Assert.assertTrue(checkboxstatus,"unable to click checkbox");
    	
    }
  
  
}

  

