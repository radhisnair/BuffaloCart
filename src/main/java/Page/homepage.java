package Page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


import Utility.PageUtility;

public class homepage  {
	
	
WebDriver driver;
	
	
	@FindBy(name="user_name") 	
	private WebElement username; 
	
	@FindBy(name="password") 	
	private WebElement password;
  
	@FindBy(xpath="//button[@type='submit']")
	private WebElement submitbutton;
	
	
	@FindBy(xpath="//input[@type='search']")
	private WebElement searchbox;
	
	@FindBy(xpath="//input[@class='form-control input-sm']")
	private WebElement allsearchbox;
	
	@FindBy(xpath="//small[@class='text-sm']") 
	private WebElement dates;

	@FindBy(xpath="//img[@src='https://erp.buffalocart.com/uploads/logo1.jpg']")
	private WebElement logo;
	
   @FindBy(xpath="//td[@class='dataTables_empty']") 
	
	private WebElement Noelementfound;
	
	public homepage(WebDriver driver) 
	{
		this.driver=driver;		
		PageFactory.initElements(driver,this); 	
}
	
	public void logindata() {

		PageUtility.enterText(username, "admin");
		PageUtility.enterText(password, "123456");
		PageUtility.clickOnElement(submitbutton);
	}
	
	public String titleverify() 
	{
		return PageUtility.getPageTitle(driver);
	}
	
	public void Menusearchbox()
	{
		PageUtility.moveToWebElement(searchbox,driver);
		PageUtility.enterText(searchbox,"Bugs");
		PageUtility.clickOnElement(searchbox);
	}
	
	//public void searchbox()
	//{
		//PageUtility.moveToWebElement(allsearchbox,driver);
		//PageUtility.enterText(allsearchbox,"@mngh");
		 //PageUtility.clickOnElement(allsearchbox);
		 
		 
	//}
	public String serachboxerror()
	{
	return PageUtility.getElementText(Noelementfound);
}
	
	public String getDateDisplayed() {
		return PageUtility.getElementText(dates);
	}
	
	
	public Boolean logodisplay()
	{
		 return PageUtility.isElementDisplayed(logo);
		
	}
	
		
	
}



	
	