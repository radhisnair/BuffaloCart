package Test;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import Page.LogoutPage;

public class LogoutTest  extends Base {
	SoftAssert sa=new SoftAssert();
	@Test(priority=25,description ="TC_0025_Verify logoutpage")
  public void verifylogo() {
		LogoutPage lp=new LogoutPage(driver);
		lp.logindata();
		lp.logobutton();
		sa.assertAll();
		
		
		
	  
  }
}
