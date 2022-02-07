package Page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Utility.PageUtility;

public class EditclientPage {
	
	WebDriver driver;
	@FindBy(name="user_name") 	
	private WebElement username; 

	@FindBy(name="password") 	
	private WebElement password;

	@FindBy(xpath="//button[@type='submit']")
	private WebElement submitbutton;


	@FindBy(xpath="//a[@title='Client']")
	private WebElement client;
	
	@FindBy(xpath="//table[@id='DataTables']//tbody//tr[2]//td[10]/a[1]")	
	private WebElement getrow; 
	
	@FindBy(xpath="//input[@name='name']")
	private WebElement companyname;
	
	@FindBy(xpath="//input[@type='email']")
	private WebElement email;
	
	
	@FindBy(xpath="//input[@name='vat']")
	private WebElement vat;
	
	@FindBy(xpath="//button[@class='btn btn-sm btn-primary']")
	private WebElement submit;
	
	public EditclientPage(WebDriver driver) {
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
	
	public void Editdata() {
		PageUtility.clickOnElement(getrow);
		
	}
	public void neweditdata() {
		PageUtility.clickOnElement(companyname);
		PageUtility.clearText(companyname);
		PageUtility.enterText(companyname, "abcde");
		
		PageUtility.clickOnElement(email);
		PageUtility.clearText(email);
		PageUtility.enterText(email, "abcde@gmail.com");
		
		PageUtility.clickOnElement(vat);
		PageUtility.clearText(vat);
		PageUtility.enterText(vat, "U12345678");
		PageUtility.ScrollBy(driver);
		
		PageUtility.clickOnElement(submit);
		
		
	}
	
}
