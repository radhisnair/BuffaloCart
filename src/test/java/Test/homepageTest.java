package Test;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import Page.homepage;
import Utility.DateUtility;
import Utility.PageUtility;

public class homepageTest extends Base
{
	SoftAssert sa=new SoftAssert();
	@Test(priority=8,description ="TC_008_Verify loginpage title")

	public void Login() {
		
		
		 homepage hp=new homepage(driver);
		 hp.logindata();
		 
		 driver.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS); 
		 
		 String Actualtitle=hp.titleverify();
		 System.out.println(Actualtitle);
			String expectedtitle="Codecarrots";
			sa.assertEquals(Actualtitle, expectedtitle,"mismatching");
			sa.assertAll();
	}
	@Test(priority=9,description ="TC_009_Check box search")
	  
	  public void Checkboxsearch() {
		  
		homepage hp=new homepage(driver);
		 hp.Menusearchbox();
		  
	}
	
	
	 @Test(priority=10,description ="TC_0010_Verify date displeyed in home page")	 
	  
	  public void verifyDateDisplayedInHomePage() throws IOException {
		  
		 homepage hp=new homepage(driver);
		  String actualDate=hp.getDateDisplayed();
		  System.out.println(actualDate);
			String expectedDate=DateUtility.getCurrentDate();
			 System.out.println(expectedDate);
			 sa.assertEquals(actualDate, expectedDate, "date didnt match");
			
				
			} 
			
			
	 
	 
	 @Test(priority=11,description ="TC_0011_Verify Logo display")
	  
	  public void verifylogo() throws IOException {
		 homepage hp=new homepage(driver);
		 
		  hp.logodisplay();
		  boolean logostatus=hp.logodisplay();
		  PageUtility.takescreenShot(driver, "logodisplayed");
		  Assert.assertTrue(logostatus,"logo not displayed");	  
		  
		  
}
	 @Test(priority=12,description ="TC_0012_Verify currenturl")
	  
	  public void currenturl()  {
		 homepage hp=new homepage(driver);
		 
		 String Actualurl=driver.getCurrentUrl();
			System.out.println(Actualurl);
			String expectedurl="https://erp.buffalocart.com/admin/dashboard";
			if(expectedurl.equals(Actualurl))
			{
				System.out.println("verification succesfull");
			}
			else
			{
				System.out.println("verification not succesfull");
			}
			
}
}