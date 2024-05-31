package AutomationTestCases;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import BasePKG.BaseClass;
import PageObjectsOfAutomation.HomePageObjects;
import RoughPKG.TestCase;

public class RegisterUser extends BaseClass 
{
	public HomePageObjects hm;

	@BeforeClass(alwaysRun=true)
	public void Start() 
	{
		MainRun();
		
	}
	
	@Test(priority=0)
	public void ClickOnSignuplink()
	{
		hm=new 	HomePageObjects();
		hm.clickOnSignUp();
	}

	@Test(priority=1)
	public void SignUp()
	{
		hm=new 	HomePageObjects();
		hm.EnterName("Rahul");
		hm.EnterGmail("@gmail.com");
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

	@Test(priority=2)
	public void DeleteAccount()
	{
		hm.ClickOnDeleteAccountButton();
		hm.ValidateDeleteAccount("Account Deleted!");
	}
	
	@Test(priority=3)
	public void RegiesterWithSameEamil()
	{
		hm.clickOnSignUp();
		hm.EnterName("Rahul");
		hm.EnterGmail1("ramagirirahul12@gmail.com");
		hm.ClcikOnSignUpBtn();
		hm.ValidateRegisterWithSameEamil("Email Address already exist!");
		
	}
	
	@AfterClass
	public void TearDown()
	{
		Closedriver();
	}

}
