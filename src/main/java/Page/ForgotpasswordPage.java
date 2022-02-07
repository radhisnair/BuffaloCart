package Page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Utility.PageUtility;

public class ForgotpasswordPage {
	
	

	WebDriver driver;
	
	@FindBy(xpath = "//a[@class='text-muted']")
	private WebElement forgotpasswordbutton;
	
	
	@FindBy(xpath = "//input[@name='email_or_username']")
	private WebElement emailorusername;
	
	@FindBy(xpath = "//button[@name='flag']")
	private WebElement submit;
	
	@FindBy(xpath = "//div[@class='alert alert-danger']")
	private WebElement alertmessage;
	
	
	
	public ForgotpasswordPage(WebDriver driver) {
		this.driver=driver;		
		PageFactory.initElements(driver,this); 	
	}
	
	
	public void forgotclick()
	{
		PageUtility.clickOnElement(forgotpasswordbutton);
		PageUtility.clickOnElement(emailorusername);
		PageUtility.enterText(emailorusername, "admins");
		PageUtility.clickOnElement(submit);

	}
   public String getInvalidUserEmailMessage() {
	   return PageUtility.getElementText(alertmessage);
	   
	   
	   
	   
   }
}
