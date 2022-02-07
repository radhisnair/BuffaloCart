package Page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Utility.PageUtility;

public class LogoutPage {

WebDriver driver;
	
	
	@FindBy(name="user_name") 	
	private WebElement username; 
	
	@FindBy(name="password") 	
	private WebElement password;
  
	@FindBy(xpath="//button[@type='submit']")
	private WebElement submitbutton;
	
	@FindBy(xpath="//img[@src='https://erp.buffalocart.com/uploads/logo1.jpg']")
	private WebElement image;
	
	@FindBy(xpath="//button[@class='btn btn-default btn-flat']")
	private WebElement logoutbutton;
	
	
public LogoutPage(WebDriver driver) {
	this.driver=driver;	
	PageFactory.initElements(driver,this); 	
	}

public void logindata() {

	PageUtility.enterText(username, "admin");
	PageUtility.enterText(password, "123456");
	PageUtility.clickOnElement(submitbutton);
}
public void logobutton() {

	PageUtility.clickOnElement(image);
	PageUtility.clickOnElement(logoutbutton);
}
}
