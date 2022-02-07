package Test;

import org.testng.Assert;
import org.testng.annotations.Test;

import Page.ForgotpasswordPage;

public class ForgotpasswordTest  extends Base{
  
 
	  @Test(priority=7,description ="TC_005_Verify error message displyed on  Reset Password page with invalid email id" )
		 public  void forgotpasswordtest()
		{

	  ForgotpasswordPage fb=new ForgotpasswordPage(driver);
	  fb.forgotclick();
	  String actualMessage = fb.getInvalidUserEmailMessage();
	  System.out.println(actualMessage);
	  String expectedMessage = "Your entered email/username does not match?";
	  
	  Assert.assertEquals(actualMessage, expectedMessage, "user email not registered");
		}
}
