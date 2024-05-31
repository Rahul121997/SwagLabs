package AutomationTestCases;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import BasePKG.BaseClass;
import PageObjectsOfAutomation.HomePageObjects;

public class LoginTestCase extends BaseClass{
	HomePageObjects hm;

	@BeforeClass(alwaysRun=true)
	public void Start() 
	{
		MainRun();
	}
	
	@Test(priority=1)
	public void LoginAutomationFuntion()
	{
		 hm=new HomePageObjects();
		 hm.clickOnSignUp();
		 hm.EnterEmailAddress("ramagirirahul12@gmail.com");
		 hm.EnterPasswordLogin("abc@1234");
		 hm.ClickOnLoginButton();
		 hm.ValidateLoginFuntion("Rahul Ramagiri");
	}
	
	@Test(priority=2)
	public void ValidateLogoutFuntion()
	{
		hm.ClickOnLogoutButton();
		hm.ValidateLogoutFuntion("Login to your account");
	}
	
	@Test(priority=3)
	public void ValidateLoginWithInvalidaCreds()
	{
		 hm.clickOnSignUp();
		 hm.EnterEmailAddress("ramagirirahul2@gmail.com");
		 hm.EnterPasswordLogin("abc@1234");
		 hm.ClickOnLoginButton();
		 hm.ValidateLoginWithInvalidCred("Your email or password is incorrect!");
		 
	}
	@Test(priority=4)
	public void ValidateSubscrition()
	{
		JS("window.scrollTo(0, document.body.scrollHeight);");
		hm.EnterEmailForSub("ramagirirahul12@gmail.com");
		hm.ClickOnSubScribe();
		hm.ValidateSubScribe("You have been successfully subscribed!");
	}
	@Test(priority=5)
	public void ValidateSubscitionFromCart()
	{
		hm.ClickOnCart();
		JS("window.scrollTo(0, document.body.scrollHeight);");
		hm.EnterEmailForSub("ramagirirahul12@gmail.com");
		hm.ClickOnSubScribe();
		hm.ValidateSubScribe("You have been successfully subscribed!");
	}

	@AfterClass
	public void TearDown()
	{
		Closedriver();
	}

}
