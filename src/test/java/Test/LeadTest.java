package Test;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import Page.LeadPage;

public class LeadTest extends Base {
	SoftAssert sa=new SoftAssert();
	@Test(priority=27,description ="TC_0027_Verify leadpage title")
  public void leadpagetitle() {
		LeadPage lp=new LeadPage(driver);
		lp.logindata();
		
		String ActualTitle=driver.getTitle();
		System.out.println(ActualTitle);
		String ExcpectedTitle="All Leads";
		if(ExcpectedTitle.equals(ActualTitle))
		{
			System.out.println("verification succesfull");
		}
		else
		{
			System.out.println("verification not succesfull");
		}
		
		
  }
	
	@Test(priority=28,description ="TC_0028_Verify leadpage url")
	  public void leadpageurl() {
			LeadPage lp=new LeadPage(driver);
			
			String Actualurl=driver.getCurrentUrl();
			System.out.println(Actualurl);
			String Excpectedurl="https://erp.buffalocart.com/admin/leads";
			if(Excpectedurl.equals(Actualurl))
			{
				System.out.println("verification succesfull");
			}
			else
			{
				System.out.println("verification not succesfull");
			}
	}	
			@Test(priority=30,description ="TC_0030_Verify user can delete")	
			public void deletedata() {
				LeadPage lp=new LeadPage(driver);
				lp.deletefullrowdata();
				lp.acceptAlert(driver);
				sa.assertAll();
	  }
			
			@Test(priority=29,description ="TC_0029_Verify user can edit data")	
			public void editdatae() {
				LeadPage lp=new LeadPage(driver);
				lp.leadedit();
				sa.assertAll();
	  }
}
