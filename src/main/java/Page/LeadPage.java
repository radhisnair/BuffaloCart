package Page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Utility.PageUtility;

public class LeadPage {
	
WebDriver driver;
	
	
	@FindBy(name="user_name") 	
	private WebElement username; 
	
	@FindBy(name="password") 	
	private WebElement password;
  
	@FindBy(xpath="//button[@type='submit']")
	private WebElement submitbutton;
	
	@FindBy(xpath="//a[@title='Leads']")
	private WebElement leadtbutton;
	
	@FindBy(xpath="//table[@id='DataTables']//tbody//tr[1]//td[8]/strong")	
	private WebElement deletebutton;
	
	@FindBy(xpath="//a[@class='btn btn-primary btn-xs']")
	
	
	//@FindBy(xpath="//i[@class='DataTables']//tbody//tr[1]//td[8]/a")

	private WebElement edits;
	
	@FindBy(xpath="//input[@class='form-control']")	
	private WebElement organization;
	
	@FindBy(xpath="//button[@class='btn btn-sm btn-primary']")	
	private WebElement submit;
//	<button type="submit" class="btn btn-sm btn-primary">Updates</button>
	
	
	public LeadPage(WebDriver driver) 
	{
		this.driver=driver;		
		PageFactory.initElements(driver,this); 	
}
	public void logindata() {

		PageUtility.enterText(username, "admin");
		PageUtility.enterText(password, "123456");
		PageUtility.clickOnElement(submitbutton);
		PageUtility.clickOnElement(leadtbutton);
	}
	
	public String titleverify() 
	{
		return PageUtility.getPageTitle(driver);
		
	}
	
	public void deletefullrowdata() {
		PageUtility.clickOnElement(deletebutton);
		
	}
	
	public void acceptAlert(WebDriver driver) {
		driver.switchTo().alert().accept();
	}
	
	
	public void leadedit()
	{
		PageUtility.clickOnElement(edits);
		PageUtility.enterText(organization, "testb");
		PageUtility.clickOnElement(submit);
	}
}
