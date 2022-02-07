package Test;

import java.util.List;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import Page.StockPage;



public class StockTest extends Base {
	SoftAssert s=new SoftAssert();
  @Test(priority=26,description ="TC_0026_Verify stocktabs")
  
  public void verifystockpage() {
	  
	  StockPage  sp=new StockPage(driver);
		 sp.logindata();
		 
		 List<String> listExp=sp.getExpectedValue();
		  List<String> listAct=sp.getActualUserManagementTabValues();
		 
		  s.assertEquals(listAct, listExp, "tabs didnt exist");
  }
  
  
  
}
