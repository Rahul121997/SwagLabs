package PageObjectsOfAutomation;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

import BasePKG.BaseClass;

public class HomePageObjects extends BaseClass{
	
	
	@FindBy(xpath="//a[@href='/login']")
	WebElement loginSignupButton;
	
	@FindBy(name="name")
	WebElement userName;
	
	@FindBy(xpath="//input[@name='name']/following-sibling::input[@name='email']")
	WebElement Email;
	
	@FindBy(xpath="//button[text()='Signup']")
	WebElement signUp;
	
	@FindBy(xpath="//input[@value='Mr']")
	WebElement salutation;
	
	@FindBy(id="password")
	WebElement enterPassword;
	
	@FindBy(xpath="//select[@name='days']")
	WebElement selectDate;

	@FindBy(xpath="//select[@id='months']")
	WebElement selectMonth;


	@FindBy(xpath="//select[@id='years']")
	WebElement selectYear;
	
	@FindBy(xpath="//label[text()='Sign up for our newsletter!']")
	WebElement selectCheckBoxSignupnewsletter;
	
	@FindBy(xpath="//label[text()='Receive special offers from our partners!']")
	WebElement selectCheckBoxReceiveSpecialOffers;
	
	@FindBy(id="first_name")
	WebElement fristName;
	
	@FindBy(id="last_name")
	WebElement lastName;
	
	@FindBy(id="address1")
	WebElement address1;
	
	@FindBy(id="company")
	WebElement company;
	
	
	@FindBy(id="address2")
	WebElement address2;
	
	
	@FindBy(id="country")
	WebElement country;
	
	@FindBy(id="state")
	WebElement state;
	
	@FindBy(id="city")
	WebElement city;
	
	@FindBy(id="zipcode")
	WebElement zipcode;
	

	@FindBy(id="mobile_number")
	WebElement mobileNumber;
	
	@FindBy(xpath="//button[text()='Create Account']")
	WebElement createAccount;
	
	@FindBy(xpath="//b[text()='Account Created!']")
	WebElement createAccountValidationText;
	
	@FindBy(linkText="Continue")
	WebElement ContinueButton;
	
	
	
	
	public HomePageObjects()
	{
		PageFactory.initElements(driver, this);
	}
	
	public void clickOnSignUp()
	{
		WebElement SignupButn=wait.until(ExpectedConditions.visibilityOf(loginSignupButton));
		SignupButn.click();
	}
	public void EnterName(String name)
	{
		WebElement userName1=wait.until(ExpectedConditions.visibilityOf(userName));
		userName1.sendKeys(name);
	}
	public void EnterGmail(String email)
	{
		WebElement Email1=wait.until(ExpectedConditions.visibilityOf(Email));
		String Unquieemail=RandomEmail(email);
		Email1.sendKeys(Unquieemail);
	}
	
	public void ClcikOnSignUpBtn()
	{
		WebElement signUp1=wait.until(ExpectedConditions.elementToBeClickable(signUp));
		signUp1.click();
	}
	
	public void SelectSaluation()
	{
		WebElement salutation1=wait.until(ExpectedConditions.visibilityOf(salutation));
		salutation1.click();
	}
	
	public void EnterPassword(String password)
	{
		WebElement enterPassword1=wait.until(ExpectedConditions.visibilityOf(enterPassword));
		enterPassword.sendKeys(password);
	}
	
	public void SelectDate(String date)
	{
		WebElement selectDate1=wait.until(ExpectedConditions.visibilityOf(selectDate));
		Select Date=new Select(selectDate1);
		Date.selectByValue(date);
	}
	
	
	public void SelectMonth(String month)
	{
		WebElement selectMonth1=wait.until(ExpectedConditions.visibilityOf(selectMonth));
		Select Month=new Select(selectMonth1);
		Month.selectByVisibleText(month);
	}
	
	public void SelectYear(String year)
	{
		WebElement selectYear1=wait.until(ExpectedConditions.visibilityOf(selectYear));
		Select Year=new Select(selectYear1);
		Year.selectByVisibleText(year);
	}
	public void SelectCheckBoxSignupnewsletter()
	{
		WebElement selectCheckBoxSignupnewsletter1=wait.until(ExpectedConditions.elementToBeClickable(selectCheckBoxSignupnewsletter));
		selectCheckBoxSignupnewsletter1.click();
	}
	
	public void SelectCheckBoxReceiveSpecialOffers11()
	{
		WebElement selectCheckBoxReceiveSpecialOffers1=wait.until(ExpectedConditions.elementToBeClickable(selectCheckBoxReceiveSpecialOffers));
		selectCheckBoxReceiveSpecialOffers1.click();
	}
	
	public void EnterFristName(String fname)
	{
		WebElement fristName1=wait.until(ExpectedConditions.visibilityOf(fristName));
		fristName1.sendKeys(fname);
	}
	
	public void EnterLastame(String lname)
	{
		WebElement lastName1=wait.until(ExpectedConditions.visibilityOf(lastName));
		lastName1.sendKeys(lname);
	}
	
	public void EnterAddress(String address) 
	{
		WebElement address11=wait.until(ExpectedConditions.visibilityOf(address1));
		address11.sendKeys(address);
	}
	
	public void EnterAddress2(String Address2) 
	{
		WebElement address22=wait.until(ExpectedConditions.visibilityOf(address2));
		address22.sendKeys(Address2);
	}
	
	
	public void EnterCompany(String Company) 
	{
		WebElement company1=wait.until(ExpectedConditions.visibilityOf(company));
		company1.sendKeys(Company);
	}
	
	public void SelectCountry(String Country)
	{
		
		WebElement country1=wait.until(ExpectedConditions.visibilityOf(country));
		Select Country1=new Select(country1);
		Country1.selectByVisibleText(Country);
		
	}
	public void EnterState(String State)
	{
		
		WebElement state1=wait.until(ExpectedConditions.visibilityOf(state));
		state1.sendKeys(State);
	}
	public void EnterCity(String City)
	{
		WebElement city1=wait.until(ExpectedConditions.visibilityOf(city));
		city1.sendKeys(City);
		
	}
	
	public void EnterZipcode(String Zipcode)
	{
		WebElement zipcode1=wait.until(ExpectedConditions.visibilityOf(zipcode));
		zipcode1.sendKeys(Zipcode);
	}
	public void EnterMobileNumber(String MobileNumber)
	{
		WebElement mobileNumber1=wait.until(ExpectedConditions.visibilityOf(mobileNumber));
		mobileNumber1.sendKeys(MobileNumber);
	}
	
	public void ClickOnCreateAccount()
	{
		wait.until(ExpectedConditions.elementToBeClickable(createAccount)).click();
	}
	
	public void ValidatecreateAccountValidationText(String ExpectedMSG)
	{
		WebElement createAccountValidationText1=wait.until(ExpectedConditions.visibilityOf(createAccountValidationText));
		String Acutalmsg=createAccountValidationText1.getText();
		Assert.assertEquals(Acutalmsg, ExpectedMSG.toUpperCase());
	}
	public void ClickONContinueButton()
	{
		WebElement ContinueButton1=wait.until(ExpectedConditions.visibilityOf(ContinueButton));
		ContinueButton1.click();
	}

}
