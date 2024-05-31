package AutomationTestCases;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import BasePKG.BaseClass;
import PageObjectsOfAutomation.ContactUsPage;

public class ContactUsForm_TestCasespage_ValidateProductsPage extends BaseClass{

	ContactUsPage cup;
	RegisterUser hm;

	@BeforeClass
	public void StartUp()
	{
		MainRun();
		hm=new RegisterUser();

	}

	@Test(priority=1)
	public void ValidateContact()
	{
		cup=new ContactUsPage();
		cup.ClickOnContactsUsPage();
		cup.ValidateContactUsPage("Get In Touch");
		cup.EnterName("Rahul");
		cup.EnterEmail("ramagirirahul12@gmail.com");
		cup.EnterSubject("Testing");
		cup.EnterMessage("Test purpose");
		cup.UploadFile("C:\\Users\\Rahul\\Desktop\\1716920815227.png");
		cup.ClickOnSubmitButton();
		cup.AcceptPopNotification();
		cup.ValidateContactUsSubmission("Success! Your details have been submitted successfully.");
		cup.ClickOnHome();
		cup.ValidateBackToHome("https://automationexercise.com/");

	}

	@Test(priority=2)
	public void ValidateTestCasePage()
	{
		cup.ClickOnTestCase();
		cup.ValidateTestCasesPage("https://automationexercise.com/test_cases");
	}

	@Test(priority=3)
	public void ValidateProductsPage()
	{
		cup.ClickOnProducts();
		cup.ClickOnProduct_1();
		cup.ValidateProductInfo();
	}

	@Test(priority=4)
	public void AddProductToCart()
	{
		driver.navigate().back();
		cup.HoverToElement();
		cup.ValidateAddedtoCart("Added!");
		cup.ClickOnContinueShopping();
		cup.HoverToElement2();
		cup.ClickOnViewCart();
		cup.ValidateItemsAddedToCart(1);
		cup.ValidateProductInfo();

	}

	@Test(priority=5)
	public void ValidateSearchedPrductFution()
	{
		cup.ClickOnProducts();
		cup.EnterProductNameForSearch("dress");
		cup.ClickOnSearchPrdt();
		cup.ValidateSearchedPrudctItems("Searched Products");	
	}

	@Test(priority=6)
	public void AddMoreItemsToCart()
	{
		cup.ClickONHomeButton();
		cup.ClickOnProduct_1();
		cup.EnterQuantity("4");
		cup.ClickOnAddtoCartButton();
		cup.ClickOnViewCart();
		cup.VerifyAddedQunatity("4");
	}

	@Test(priority=7)
	public void ValidateCheckOutItems()
	{
		cup.ClickONHomeButton();
		cup.HoverToElement();
		cup.HoverToElement2();
		cup.ClickOnViewCart();
		cup.ClickProceedToCheckout();
		cup.ClickOnReg_signinButton();
		hm.SignUp();
		cup.ClickOnCartButton();
		cup.ClickProceedToCheckout();
		cup.ClickOnCartButton();
		cup.VerifyAddressDetailstext("Address Details");
		cup.VerifyReviewYourOrdertxt("Review Your Order");
		cup.EnterComment("Testing purpose");
		cup.ClickONPlaceOrder();
		cup.ClickONPlaceOrder();
		cup.EnterCardName("RamagiriRahul");
	}

	@AfterClass
	public void TearDown()
	{
		Closedriver();
	}


}
