package Test;

import java.util.concurrent.TimeUnit;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;


import Page.ViewClientpage;

public class ViewclientTest  extends Base{
	SoftAssert sa = new SoftAssert();
	  @Test(priority=23,description ="TC_0023_Verify view pagetitle")
	  
	  public void Login() {
			
			
		  ViewClientpage vc=new  ViewClientpage(driver);
			 vc.logindata();
			 vc.clientlink();
			 vc.viewclient();
			 String actualtitle=vc.pagetitle();
			 System.out.println(actualtitle);
			 driver.manage().timeouts().implicitlyWait(1000, TimeUnit.SECONDS);
	  }
			 @Test(priority=24,description ="TC_0024_Verify  the details displayed on view client page")
			  public void viewdetails() {
				 
				 ViewClientpage vc=new  ViewClientpage(driver);
				 
				 sa.assertAll();
				 
			 }
				  
				 
}
