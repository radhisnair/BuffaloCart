package Page;


import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;



import org.openqa.selenium.support.FindBy;

import org.openqa.selenium.support.PageFactory;

import Utility.PageUtility;
import Utility.WaitUtility;



public class Loginpage {

	
	WebDriver driver;
	@FindBy(xpath = "//input[@name='user_name']")	
	private WebElement username; 
	
	@FindBy(xpath = "//input[@name='password']")
	private WebElement password;
  
	@FindBy(xpath="//button[@type='submit']")
	private WebElement submitbutton;
	
	
	@FindBy(xpath="//div[@class='alert alert-danger']")
	private WebElement invalidLoginMessage;
	
	@FindBy(xpath="//span[@class=\"fa fa-check\"]")
	private WebElement Remebermessage;
	
	@FindBy(xpath="//a[@href=\"https://erp.buffalocart.com/login/forgot_password\"]")
    private WebElement forgotpassword;
	
	public Loginpage(WebDriver driver) {
		this.driver=driver;		
		PageFactory.initElements(driver,this); 	
		
		

	}


	public void set(String n, String s) {
		username.sendKeys(n);
		password.sendKeys(s);
		submitbutton.click();
		
		
	}


	public String invalidCredentials() {
		
		return PageUtility.getElementText(invalidLoginMessage);
		
		
	}
	
	
	public void ClickCheckbox()
	{
		PageUtility.clickOnElement(Remebermessage);
		
		
	}
	public Boolean Remembermecheckbox() {
		return PageUtility.isElementDisplayed(Remebermessage);
		
}
	
	
	
}
	
	





	



	
	


