package RoughPKG;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import BasePKG.BaseClass;
import PageObjectsOfAutomation.HomePageObjects;

public class TestCase extends BaseClass {
	
 
	@BeforeClass
	public void Start() 
	{
		MainRun();
	}
	
	@Test
	public void SignUp()
	{
		HomePageObjects hm=new 	HomePageObjects();
		hm.clickOnSignUp();
		hm.EnterName("Rahul");
		hm.EnterGmail("ramagiri@gmail.com");
		hm.ClcikOnSignUpBtn();
		hm.SelectSaluation();
		hm.EnterPassword("abc@1234");
		hm.SelectDate("12");
		hm.SelectMonth("December");
		hm.SelectYear("1997");
		hm.SelectCheckBoxSignupnewsletter();
		hm.SelectCheckBoxReceiveSpecialOffers11();
		hm.EnterFristName("Rahul");
		hm.EnterLastame("Rama");
		hm.EnterCompany("pandora");
		hm.EnterAddress("gachibowli");
		hm.EnterAddress2("Hydrabad");
		hm.SelectCountry("India");
		hm.EnterState("TS");
		hm.EnterCity("Hyd");
		hm.EnterZipcode("500032");
		hm.EnterMobileNumber("918289065");
		hm.ClickOnCreateAccount();
		hm.ValidatecreateAccountValidationText("Account Created!");
		hm.ClickONContinueButton();
	}
	
    @AfterClass
    public void TearDown()
    {
    	Closedriver();
    }

}
