package Utility;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.time.Duration;

public class WaitUtility {
	
public static WebElement  waitforElementToBeVsisible(WebDriver driver,WebElement elementToBeLoaded,int time) {
		
		WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(time));
		WebElement element=wait.until(ExpectedConditions.visibilityOf(elementToBeLoaded));
		return element;
		
	}
	public static WebElement waitForElementToBeClickable(WebDriver driver,WebElement elementToBeLoaded,int time) {
		
		WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(time));
		WebElement element=wait.until(ExpectedConditions.elementToBeClickable(elementToBeLoaded));
		return element;
	}
	
	public static WebElement waitForAnElement(WebDriver driver,WebElement element,int time) {
		
		WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(time));
		WebElement element1=wait.until(ExpectedConditions.presenceOfElementLocated ((By) element));
		return element1;
		
	}
	
public static void  waitforElementToBeSelected(WebDriver driver,WebElement elementToBeLoaded,int time) {
		
		WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(time));
		wait.until(ExpectedConditions.elementToBeSelected(elementToBeLoaded));
	
	}

public static void waitForTextToBePresentInElement(WebDriver driver,WebElement elementToBeLoaded,int time,String text) {
	
	WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(time));
	wait.until(ExpectedConditions.textToBePresentInElement(elementToBeLoaded,text));
	
}

public static void waitImplicit(WebDriver driver,int sec) {
	
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(sec));
}




	
	public void sleep(int sec) {
		try {
		Thread.sleep(sec);
		}
		catch(InterruptedException e) {
			e.printStackTrace();
		}
		
	}

	
}


