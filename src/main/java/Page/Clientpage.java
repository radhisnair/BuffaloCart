package Page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Test.Base;
import Utility.PageUtility;
import Utility.WaitUtility;

public class Clientpage  {
	
	
WebDriver driver;
	
	
	@FindBy(name="user_name") 	
	private WebElement username; 
	
	@FindBy(name="password") 	
	private WebElement password;
  
	@FindBy(xpath="//button[@type='submit']")
	private WebElement submitbutton;
	
	
	@FindBy(xpath="//a[@title='Client']")
	private WebElement client;
	
	@FindBy(xpath="//a[@href='#new_client']")
	private WebElement newclient;
	
	@FindBy(name="name") 	
	private WebElement companyname;
	
	
	@FindBy(name="email") 	
	private WebElement  email ;
	
	@FindBy(name="vat") 	
	private WebElement companyvat;
	
	@FindBy(xpath="//input[@class='form-control input-sm']")
	private WebElement allsearchbox;
	
	@FindBy(xpath="//span[@title='Indian Rupee']") 	
	private WebElement droplistrupee;
	
	//@FindBy(name="save_and_create_contact") 	
	@FindBy(xpath="//button[@class='btn btn-sm btn-primary']") 	
	private WebElement save;
	
	@FindBy(xpath="//li[@class='parsley-required']") 	
	private WebElement mandatoryfield;
	
	@FindBy(xpath="//a[@class='text-info']")
	private WebElement validdata;
	
     @FindBy(xpath="//td[@class='dataTables_empty']") 
	
	private WebElement Noelementfound;
	
	
	public Clientpage(WebDriver driver) 
	{
		this.driver=driver;		
		PageFactory.initElements(driver,this); 	
}
	
	public void logindata() {

		PageUtility.enterText(username, "admin");
		PageUtility.enterText(password, "123456");
		PageUtility.clickOnElement(submitbutton);
		PageUtility.ScrollBy(driver);
		PageUtility.clickOnElement(client);
	}
	
	
		public void newclientlink() {	
		PageUtility.clickOnElement(newclient);
	}
		
		public void set(String n, String s,String m) {
			companyname.sendKeys(n);
			email.sendKeys(s);
			companyvat.sendKeys(m);
	}
		
		
		public void droplist() {
			PageUtility.selectDropdownbyText(droplistrupee, "Euro");
		}
		public void savebutton() {
			PageUtility.clickOnElement(save);
}
		
		public void mandatoryfill() 
		{
			
			PageUtility.clickOnElement(newclient);
			PageUtility.enterText(companyname, "  ");
			PageUtility.enterText(email, "   ");
			PageUtility.moveToWebElement(save, driver);
			PageUtility.clickOnElement(save);
		}	
			public String mandatoryfielderrormessage()
			{
			return PageUtility.getElementText(mandatoryfield);
		}
			public void searchbox()
			{
				PageUtility.moveToWebElement(allsearchbox,driver);
				
				PageUtility.enterText(allsearchbox,"@mngh");
				
				 PageUtility.clickOnElement(allsearchbox);
				 
				 
				 
			}	
			public String serachboxerror()
			{
			return PageUtility.getElementText(Noelementfound);
			}
			
			public void  validsearchbox()
			{
				PageUtility.clearText(allsearchbox);
				PageUtility.moveToWebElement(allsearchbox,driver);
				PageUtility.enterText(allsearchbox,"abcde");
				PageUtility.clickOnElement(allsearchbox);
			}
				
				public String serachgetvalue()
				{
					WaitUtility.waitforElementToBeVsisible(driver, allsearchbox, 100);
				return PageUtility.getElementText(validdata);
				
				}	 
				 
				
		public void back()
		{
			PageUtility.navigateToBack(driver);
		}
		
}
