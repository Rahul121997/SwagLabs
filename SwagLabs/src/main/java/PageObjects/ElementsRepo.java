package PageObjects;

import static org.testng.Assert.*;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;

import com.aventstack.extentreports.util.Assert;

import PageBase.BasePageClass;

public class ElementsRepo extends BasePageClass {
	

	@FindBy(id="user-name")
	WebElement Username;
	
	
	@FindBy(id="password")
	WebElement Password;
	
	@FindBy(id="login-button")
	WebElement LoginButton;
	
	public ElementsRepo()
	{
		PageFactory.initElements(driver, this);
	}
	
	public void ValidateLandedPage(String Expected)
	{
		String actualString=driver.getCurrentUrl();
		assertEquals(actualString, Expected);
	}

	
	public void EnterUsername(String username)
	{
		BasePageClass.wait.until(ExpectedConditions.visibilityOf(Username));
		Username.sendKeys(username);
	}
	
	
	public void EnterPassword(String password)
	{
		WebElement pwd=wait.until(ExpectedConditions.visibilityOf(Password));
		pwd.sendKeys(password);
	}
	
	
	public void ClickOnLoginButton()
	{
		WebElement LoginButton1=wait.until(ExpectedConditions.elementToBeClickable(LoginButton));
		LoginButton1.click();
	}
	public void ValidateLoginUser(String Expected)
	{
		String Acutal=driver.getCurrentUrl();
		assertEquals(Acutal,Expected);
		
	}
	
	

}
