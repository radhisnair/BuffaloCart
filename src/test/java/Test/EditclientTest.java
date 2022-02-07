package Test;

import java.util.concurrent.TimeUnit;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import Page.EditclientPage;

public class EditclientTest extends Base {
	
	SoftAssert sa = new SoftAssert();
	  @Test(priority=21,description ="TC_0021_Verify edit page url")
	  
  public void editurl() {
		  EditclientPage ep=new EditclientPage(driver);
		  ep.logindata();
		  ep.clientlink();
		  ep.Editdata();
		  String actualurl=driver.getCurrentUrl();
		  System.out.println(actualurl);
		  
		  String expectedurl="https://erp.buffalocart.com/admin/client/manage_client/535";
		  Assert.assertEquals(actualurl, expectedurl);
		  
		  driver.manage().timeouts().implicitlyWait(1000, TimeUnit.SECONDS);
		  
				  	  
  }
	  @Test(priority=22,description ="TC_0022_Verify user can edit clientdetails")
	  
		  public void editdatas() {
			  EditclientPage ep=new EditclientPage(driver);
			  
			  ep.neweditdata();
			
			
			  driver.manage().timeouts().implicitlyWait(1000, TimeUnit.SECONDS);
			  
	  }
}
