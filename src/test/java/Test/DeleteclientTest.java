package Test;

import java.util.concurrent.TimeUnit;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;


import Page.Deleteclient;


public class DeleteclientTest extends Base{
	SoftAssert sa = new SoftAssert();
 
  
  
  @Test(priority=19,description ="TC_0020_Verify delete page title")
  public void deleteclients() {
	  
	 Deleteclient dc=new Deleteclient(driver);
	 dc.logindata();
	 dc.clientlink();
	 dc.clickdelete();
	 String actualtitle=dc.gettitle();
	 System.out.println(actualtitle);
	 String expectedltitle="Delete Client";
	 
	 sa.assertEquals(actualtitle, expectedltitle, "invalid");
	 dc.proceed();
	 
	 driver.manage().timeouts().implicitlyWait(1000, TimeUnit.SECONDS);
  }
  @Test(priority=20,description ="TC_002_Verify  user can delete a clientList from table")
  public void deletebutton() {
	  
	 Deleteclient dc=new Deleteclient(driver);
      String vc= dc.getdata();
	System.out.println(vc);
	 dc.getdata();
	 dc.clickdelete();
	 dc.proceed();
	 
	sa.assertAll();
}
}
