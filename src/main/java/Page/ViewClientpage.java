package Page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Utility.PageUtility;

public class ViewClientpage {
	
	WebDriver driver;
	
	@FindBy(name="user_name") 	
	private WebElement username; 

	@FindBy(name="password") 	
	private WebElement password;

	@FindBy(xpath="//button[@type='submit']")
	private WebElement submitbutton;


	@FindBy(xpath="//a[@title='Client']")
	private WebElement client;
	
	//@FindBy(xpath="//a[@href='https://erp.buffalocart.com/admin/client/client_details/499']")	
	//private WebElement view; 
	
	@FindBy(xpath="//table[@id='DataTables']//tbody//tr[2]//td[10]/a[3]")	
	private WebElement getrow; 
	
	
	
	public ViewClientpage(WebDriver driver) 
	{
		this.driver=driver;		
		PageFactory.initElements(driver,this); 	
		
		
}
	public void logindata() {

		PageUtility.enterText(username, "admin");
		PageUtility.enterText(password, "123456");
		PageUtility.clickOnElement(submitbutton);
		PageUtility.ScrollBy(driver);
		
	}
	public void clientlink() {
		PageUtility.clickOnElement(client);
	}
	
	public void viewclient()
	{
		PageUtility.clickOnElement(getrow);
		//PageUtility.clickOnElement(view);
	}
	public String pagetitle()
	{
		return PageUtility.getPageTitle(driver);
}
}
