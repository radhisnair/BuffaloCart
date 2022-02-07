package Test;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import Page.Clientpage;
import Page.Loginpage;
import Utility.ExcellData;


public class ClientTest extends Base 
{
	
	SoftAssert sa = new SoftAssert();
	@Test(priority=13,description ="TC_0013_Verify search box")

	public void search() {
		
		
		Clientpage cp=new Clientpage(driver);
		cp.logindata();
		cp.searchbox();
		String Actualerror=cp.serachboxerror();
		  System.out.println(Actualerror);
		 String expectederror="No matching records found" ;
		sa.assertEquals(Actualerror, expectederror,"search error message not working");
		
		
	}
	@Test(priority=14,description ="TC_0014_Verify valid value in a search box")

	public void validsearchbox() {
		
		
		Clientpage cp=new Clientpage(driver);
		cp.validsearchbox();
		
		String actualvalue=cp.serachgetvalue();
		System.out.println(actualvalue);
		
		  String expectedvalue="abcde";
		 Assert.assertEquals(actualvalue, expectedvalue,"invalid");  
		 driver.manage().timeouts().implicitlyWait(1000, TimeUnit.SECONDS);
			
	}
	@Test(priority=15,description ="TC_0015_check newclientclick")
	
	public void clientclicks() {
		
		 
		Clientpage cp=new Clientpage(driver);
		cp.newclientlink();
		
		 sa.assertAll();
	} 
		 @Test(priority=16,dataProvider = "dp",description ="TC_0016_Verify  user can add new client details") 
		 public void newclientdetails(String n,  String s, String m) 
		 {
			 
			 Clientpage cp=new Clientpage(driver);
			 
			 cp.set(n,s,m);
			 
		 }
		 @DataProvider
		  public Object[][] dp() throws EncryptedDocumentException, InvalidFormatException, IOException {
			  
				  Object[][] data= ExcellData.getDataFromSheet("D:\\xcels\\buffalocartnewclient.xlsx");   
				  return data;
				  
				 

				
			}
		/* @Test(priority=17,description ="TC_0017_verify dropdownlist")
			
			public void droplists() {
				
				 
				Clientpage cp=new Clientpage(driver);
				cp.droplist();
				sa.assertTrue(true);
				  
		 }*/
		 
		 @Test(priority=17,description ="TC_0018_verify savebuttonclick")
		 public void savebutton() 
		 {
			 
				Clientpage cp=new Clientpage(driver);
				
				cp.savebutton();
				sa.assertAll();
		 }
		 @Test(priority=18,description ="TC_0019_verify Without mandatoryfieldfill") 
		 public void mandatoryfield() 
		 {
			 Clientpage cp=new Clientpage(driver);
			 cp.mandatoryfill();

			 String actualerrormessage=cp.mandatoryfielderrormessage();
			 System.out.println(actualerrormessage);
			 String Expectederrormessage="This value is required.";
			 Assert.assertEquals(actualerrormessage, Expectederrormessage,"invalid message");
			
	    	 	
		 }
		 
		 }

		 
		 
		 

		  
	
		
