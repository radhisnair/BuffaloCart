package Page;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Utility.PageUtility;

public class StockPage {
	
WebDriver driver;
	
	
	@FindBy(name="user_name") 	
	private WebElement username; 
	
	@FindBy(name="password") 	
	private WebElement password;
  
	@FindBy(xpath="//button[@type='submit']")
	private WebElement submitbutton;
	
	@FindBy(xpath="//a[@href=\"#stock\"]")
	private WebElement stockimg;
	
	private final String _Stock = "//ul[@id=\"stock\"]";
    @FindBy(xpath = _Stock)
    
    private List<WebElement> Stock;
	
	public StockPage(WebDriver driver) 
	{
		this.driver=driver;		
		PageFactory.initElements(driver,this); 	
}
	public void logindata() {

		PageUtility.enterText(username, "admin");
		PageUtility.enterText(password, "123456");
		PageUtility.clickOnElement(submitbutton);
	}
	public List<String> getActualUserManagementTabValues()
    {
		PageUtility.clickOnElement(stockimg);
        List<String> listActual = new ArrayList<String>();
        for (int i = 0;i< Stock.size();i++)
        {
            listActual.add(Stock.get(i).getText());
        }
        return listActual;
    }
	public List<String> getExpectedValue() {
		List<String> listExpected=new ArrayList<String>();
		listExpected.add("Items ");
		listExpected.add("Supplier");
		listExpected.add("Purchase");
		listExpected.add("Return Stock");
		listExpected.add("Purchase Payment");
		
		return listExpected;
	}	

}
