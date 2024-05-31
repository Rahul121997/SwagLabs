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

import AutomationTestCases.RegisterUser;
import BasePKG.BaseClass;
import PageObjectsOfAutomation.ContactUsPage;
import PageObjectsOfAutomation.HomePageObjects;

public class TestCase extends BaseClass {

	ContactUsPage cup;
	RegisterUser hm;
	HomePageObjects hmp;


	@BeforeClass
	public void Start() 
	{
		MainRun();
		cup = new ContactUsPage();
		hm = new RegisterUser();
		hmp=new HomePageObjects();
	}

	@Test
	public  void SssignUp()
	{
		

	}

	@AfterClass
	public void TearDown()
	{
		Closedriver();
	}

}
