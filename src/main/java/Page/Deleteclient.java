package Page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Utility.PageUtility;

public class Deleteclient {
	
WebDriver driver;
	
@FindBy(name="user_name") 	
private WebElement username; 

@FindBy(name="password") 	
private WebElement password;

@FindBy(xpath="//button[@type='submit']")
private WebElement submitbutton;


@FindBy(xpath="//a[@title='Client']")
private WebElement client;

	@FindBy(xpath="//a[@class='btn btn-danger btn-xs']") 	
	private WebElement delete; 
	
	@FindBy(xpath="//button[@name='submit']") 	
	private WebElement proceedanyway; 
	
	@FindBy(xpath="//table[@id='DataTables']//tbody//tr[1]//td[10]")	
	private WebElement getrow; 
	
	
	
	public Deleteclient(WebDriver driver) 
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
	public void clickdelete() {
		  PageUtility.clickOnElement(delete);
	}
		  
		  public void proceed() {
			  
		  PageUtility.clickOnElement(proceedanyway);
		  
		  
		  
	  }
	public String getdata() {
		  return PageUtility.getElementText(getrow);
	}  
	public String gettitle() 
	{
		return PageUtility.getPageTitle(driver);
	}
}
	
	


