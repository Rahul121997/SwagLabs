package PageObjectsOfAutomation;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;

import BasePKG.BaseClass;

public class ContactUsPage extends BaseClass {

	@FindBy(xpath="//a[@href='/contact_us']")
	WebElement ContactUsButton;


	@FindBy(xpath="//h2[text()='Get In Touch']")
	WebElement ContactUsText;

	@FindBy(xpath="//input[@name='name']")
	WebElement Name;


	@FindBy(xpath="//input[@name='email']")
	WebElement emailContactus;

	@FindBy(xpath="//input[@name='subject']")
	WebElement Subject;

	@FindBy(xpath="//textarea[@id='message']")
	WebElement Message;

	@FindBy(xpath="//input[@name='upload_file']")
	WebElement FileUpload;

	@FindBy(xpath="//input[@name='submit']")
	WebElement SubmitButton;

	@FindBy(xpath="//h2/following-sibling::div[contains(text(),'Success!')]")
	WebElement ConatactUsText;


	@FindBy(xpath="//a[@class='btn btn-success']")
	WebElement HomeButton;

	@FindBy(xpath="//li/a[@href='/test_cases']")
	WebElement TestCasesButton;

	@FindBy(xpath="//li/a[@href='/products']")
	WebElement ProductsButton;

	@FindBy(xpath="//a[@href='/product_details/1']")
	WebElement Prdouctinfo_1;

	@FindBy(xpath="//div[@class='product-information']")
	WebElement Product_Info;

	@FindBy(xpath="//input[@name='search']")
	WebElement SearchTextBox;

	@FindBy(xpath="//button[@id='submit_search']")
	WebElement SearchButton;

	@FindBy(xpath="//h2[text()='Searched Products']")
	WebElement Searchprdtext;

	@FindBy(xpath="//img[@src='/get_product_picture/1']/following-sibling::a[text()='Add to cart']")
	WebElement prd1;

	@FindBy(xpath="//img[@src='/get_product_picture/2']/following-sibling::a[text()='Add to cart']")
	WebElement prd2;

	@FindBy(xpath="//h4[text()='Added!']")
	WebElement AddedToCarttext;

	@FindBy(xpath="//button[text()='Continue Shopping']")
	WebElement ContinueShoppingButton;

	@FindBy(xpath="//u[text()='View Cart']")
	WebElement ViewCartButton;

	@FindBy(xpath="//h4/child::a")
	WebElement ProductsAddedInCartCount;


	@FindBy(xpath="//input[@name='quantity']")
	WebElement Quantity;

	@FindBy(xpath="//input[@name='quantity']/following-sibling::button")
	WebElement AddtoCartButton;

	@FindBy(xpath="//td[@class='cart_quantity']/button")
	WebElement VerifyAddedQauntity;

	@FindBy(xpath="//a[text()=' Home']")
	WebElement HomeMainBsutton;


	@FindBy(xpath="//a[text()='Proceed To Checkout']")
	WebElement ProceedToCheckoutButton;

	@FindBy(xpath="//p/a[@href='/login']")
	WebElement Reg_signinButton;

	@FindBy(xpath="//a[text()=' Cart']")
	WebElement CartButton;


	@FindBy(xpath="//h2[text()='Address Details']")
	WebElement AddressDetailstext;


	@FindBy(xpath="//h2[text()='Review Your Order']")
	WebElement ReviewYourOrdertxt;

	@FindBy(xpath="//textarea[@name='message']")
	WebElement Commenttextbox;

	@FindBy(xpath="//a[text()='Place Order']")
	WebElement PlaceOrderButton;

	@FindBy(xpath="//input[@name='name_on_card']")
	WebElement NameOnCard;

	@FindBy(xpath="//input[@name='card_number']")
	WebElement CardNumber;

	@FindBy(xpath="//input[@name='cvc']")
	WebElement cvc;

	@FindBy(xpath="//input[@name='expiry_month']")
	WebElement ExpiryMonth;

	@FindBy(xpath="//input[@name='expiry_year']")
	WebElement ExpiryYear;

	@FindBy(xpath="//button[@id='submit']")
	WebElement PayandConfirmOrder;

	@FindBy(xpath="//b[text()='Order Placed!']")
	WebElement OrderConfrimationMsg;



	public ContactUsPage()
	{
		PageFactory.initElements(driver, this);
	}

	public void ClickOnContactsUsPage()
	{
		WebElement ContactUsButton1=wait.until(ExpectedConditions.elementToBeClickable(ContactUsButton));
		ContactUsButton1.click();
	}
	public void ValidateContactUsPage(String ExpectedMsg)
	{
		WebElement ContactUsText1=wait.until(ExpectedConditions.elementToBeClickable(ContactUsText));
		String Acutalmsg=ContactUsText1.getText();
		System.out.println(Acutalmsg+" : "+ExpectedMsg);

		Assert.assertEquals(Acutalmsg, ExpectedMsg.toUpperCase());
	}

	public void EnterName(String name)
	{		
		WebElement Name1=wait.until(ExpectedConditions.visibilityOf(Name));
		Name1.sendKeys(name);

	}

	public void EnterEmail(String email)
	{		
		WebElement emailContactus1=wait.until(ExpectedConditions.visibilityOf(emailContactus));
		emailContactus1.sendKeys(email);

	}
	public void EnterSubject(String subject)
	{		
		WebElement Subject1=wait.until(ExpectedConditions.visibilityOf(Subject));
		Subject1.sendKeys(subject);
	}
	public void EnterMessage(String message)
	{		
		WebElement Message1=wait.until(ExpectedConditions.visibilityOf(Message));
		Message1.sendKeys(message);
	}
	public void UploadFile(String FilePath)
	{
		WebElement FileUpload1=wait.until(ExpectedConditions.visibilityOf(FileUpload));
		FileUpload1.sendKeys(FilePath);
	}
	public void ClickOnSubmitButton()
	{
		WebElement SubmitButton1=wait.until(ExpectedConditions.elementToBeClickable(SubmitButton));
		SubmitButton1.click();
	}
	public void AcceptPopNotification()
	{
		driver.switchTo().alert().accept();
	}

	public void ValidateContactUsSubmission(String ExpectedMsg)
	{
		WebElement ConatactUsText1=wait.until(ExpectedConditions.visibilityOf(ConatactUsText));
		String AcutalMsg=ConatactUsText1.getText();
		System.out.println(AcutalMsg+" : "+ExpectedMsg);
		Assert.assertEquals(AcutalMsg, ExpectedMsg);
	}

	public void ClickOnHome()
	{
		WebElement HomeButton1=wait.until(ExpectedConditions.elementToBeClickable(HomeButton));
		HomeButton1.click();
	}

	public void ValidateBackToHome(String ExepctedMsg)
	{
		String ActualMsg=driver.getCurrentUrl();
		System.out.println(ActualMsg+" : "+ExepctedMsg);
		Assert.assertEquals(ActualMsg, ExepctedMsg);
	}

	public void ClickOnTestCase()
	{
		WebElement TestCasesButton1=wait.until(ExpectedConditions.elementToBeClickable(TestCasesButton));
		TestCasesButton1.click();
	}
	public void ValidateTestCasesPage(String Expectedmsg)
	{
		String ActualMsg=driver.getCurrentUrl();
		System.out.println(ActualMsg+" : "+Expectedmsg);
		Assert.assertEquals(ActualMsg, Expectedmsg);
	}

	public void ClickOnProducts()
	{
		WebElement ProductsButton1=wait.until(ExpectedConditions.elementToBeClickable(ProductsButton));
		ProductsButton1.click();
	}

	public void ClickOnProduct_1()
	{
		WebElement Prdouctinfo_11=wait.until(ExpectedConditions.elementToBeClickable(Prdouctinfo_1));
		Prdouctinfo_11.click();
	}

	public void ValidateProductInfo()
	{

		boolean Prdname=Product_Info.findElement(By.tagName("h2")).isDisplayed();
		System.out.println(Product_Info.findElement(By.tagName("h2")).getText());
		Assert.assertTrue(Prdname);

		List<WebElement> elements=Product_Info.findElements(By.xpath("//div[@class='product-information']/p"));
		for(WebElement element:elements)
		{
			Assert.assertTrue(element.isDisplayed());
			System.out.println(element.getText());
		}

	}

	public void EnterProductNameForSearch(String productName)
	{
		WebElement SearchTextBox1=wait.until(ExpectedConditions.visibilityOf(SearchTextBox));
		SearchTextBox1.sendKeys(productName);

	}

	public void ClickOnSearchPrdt()
	{
		WebElement SearchButton1=wait.until(ExpectedConditions.elementToBeClickable(SearchButton));
		SearchButton1.click();
	}
	public void ValidateSearchedPrudctItems(String Exepectedmsg)
	{

		WebElement Searchprdtext1=wait.until(ExpectedConditions.visibilityOf(Searchprdtext));
		String acutlamsg=Searchprdtext1.getText();
		System.out.println(acutlamsg+" : "+Exepectedmsg);
		Assert.assertEquals(acutlamsg, Exepectedmsg.toUpperCase());
	}
	public void HoverToElement()
	{
		WebElement prd11=wait.until(ExpectedConditions.visibilityOf(prd1));
		Acts(prd11);
	}
	public void ValidateAddedtoCart(String expectedmsg)
	{
		WebElement AddedToCarttext1=wait.until(ExpectedConditions.visibilityOf(AddedToCarttext));
		String acutalmsg=AddedToCarttext1.getText();
		System.out.println(acutalmsg+" : "+expectedmsg);
		Assert.assertEquals(acutalmsg, expectedmsg);
	}
	public void ClickOnContinueShopping()
	{
		WebElement ContinueShoppingButton1=wait.until(ExpectedConditions.elementToBeClickable(ContinueShoppingButton));
		ContinueShoppingButton1.click();
	}
	public void HoverToElement2()
	{
		WebElement prd12=wait.until(ExpectedConditions.visibilityOf(prd2));
		Acts(prd12);
	}

	public void ClickOnViewCart()
	{
		WebElement ViewCartButton1=wait.until(ExpectedConditions.elementToBeClickable(ViewCartButton));
		ViewCartButton1.click();
	}
	public void ValidateItemsAddedToCart(int numofitems)
	{
		List<WebElement>ls= wait.until(ExpectedConditions.visibilityOfAllElements(ProductsAddedInCartCount));


		System.out.println(ls.size());
		if(ls.size()==numofitems)
		{
			for(WebElement l:ls)
			{
				System.out.println(l.getText());
			}

			Assert.assertTrue(true);
		}
		else
		{
			Assert.assertTrue(false);
		}

	}
	public void EnterQuantity(String quantity)
	{
		WebElement Quantity1=wait.until(ExpectedConditions.visibilityOf(Quantity));
		Quantity1.clear();
		Quantity1.sendKeys(quantity);
	}
	public void ClickOnAddtoCartButton()
	{
		WebElement AddtoCartButton1=wait.until(ExpectedConditions.elementToBeClickable(AddtoCartButton));
		AddtoCartButton1.click();
	}
	public void VerifyAddedQunatity(String expectedmsg)
	{
		WebElement VerifyAddedQauntity1=wait.until(ExpectedConditions.elementToBeClickable(VerifyAddedQauntity));
		String acutal=VerifyAddedQauntity1.getText();
		System.out.println(acutal+" : "+expectedmsg);
		Assert.assertEquals(acutal, expectedmsg);
	}
	public void ClickONHomeButton()
	{
		WebElement HomeMainBsutton1=wait.until(ExpectedConditions.elementToBeClickable(HomeMainBsutton));
		HomeMainBsutton1.click();
	}
	public void ClickProceedToCheckout()
	{
		WebElement ProceedToCheckoutButton1=wait.until(ExpectedConditions.elementToBeClickable(ProceedToCheckoutButton));
		ProceedToCheckoutButton1.click();
	}

	public void ClickOnReg_signinButton()
	{
		WebElement Reg_signinButton1=wait.until(ExpectedConditions.elementToBeClickable(Reg_signinButton));
		Reg_signinButton1.click();
	}
	public void ClickOnCartButton()
	{
		WebElement CartButton1=wait.until(ExpectedConditions.elementToBeClickable(CartButton));
		CartButton1.click();
	}
	public void VerifyAddressDetailstext(String Expectedmsg)
	{
		WebElement AddressDetailstext1=wait.until(ExpectedConditions.visibilityOf(AddressDetailstext));
		String act=AddressDetailstext1.getText();
		Assert.assertEquals(act, Expectedmsg);
	}
	public void VerifyReviewYourOrdertxt(String expectedmsg)
	{
		WebElement ReviewYourOrdertxt1=wait.until(ExpectedConditions.visibilityOf(ReviewYourOrdertxt));
		String act=ReviewYourOrdertxt1.getText();
		Assert.assertEquals(act, expectedmsg);
	}
	public void EnterComment(String comment)
	{
		WebElement Commenttextbox1=wait.until(ExpectedConditions.visibilityOf(Commenttextbox));
		Commenttextbox1.sendKeys(comment);
	}
	public void ClickONPlaceOrder()
	{
		WebElement PlaceOrderButton1=wait.until(ExpectedConditions.elementToBeClickable(PlaceOrderButton));
		PlaceOrderButton1.click();
	}
	public void EnterCardName(String nameonCard)
	{
		WebElement NameOnCard1=wait.until(ExpectedConditions.visibilityOf(NameOnCard));
		NameOnCard1.sendKeys(nameonCard);
	}

	public void EnterCardNumber(String Cardnumber)
	{
		WebElement CardNumber1=wait.until(ExpectedConditions.visibilityOf(CardNumber));
		CardNumber1.sendKeys(Cardnumber);
	}
	public void EnterCardCVC(String cvvc)
	{
		WebElement cvc1=wait.until(ExpectedConditions.visibilityOf(cvc));
		cvc1.sendKeys(cvvc);
	}
	public void EnterCardMonth(String Month)
	{
		WebElement ExpiryMonth1=wait.until(ExpectedConditions.visibilityOf(ExpiryMonth));
		ExpiryMonth1.sendKeys(Month);
	}
	public void EnterExpiryYear(String Year)
	{

		WebElement ExpiryYear1=wait.until(ExpectedConditions.visibilityOf(ExpiryYear));
		ExpiryYear1.sendKeys(Year);
	}

	public void ClickOnPayAndConfrimOrder(String Year)
	{

		WebElement PayandConfirmOrder1=wait.until(ExpectedConditions.visibilityOf(PayandConfirmOrder));
		PayandConfirmOrder1.sendKeys(Year);
	}
	public void VerifyOrderConfrimation(String Expectedmsg)
	{
		
		WebElement OrderConfrimationMsg1=wait.until(ExpectedConditions.visibilityOf(OrderConfrimationMsg));
		String act=OrderConfrimationMsg1.getText();
		Assert.assertEquals(act, Expectedmsg);
	}



}
