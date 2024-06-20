package Rough;

import java.io.IOException;

import PageBase.BasePageClass;
import PageObjects.ElementsRepo;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When; 

public class TestClass extends BasePageClass {
	
	

	ElementsRepo elo=new ElementsRepo();
	

	@Before
	public void startup()
	{
		setup();
	}
	
	@Given("User should land on SwagLabs Page")
	public void user_should_land_on_swag_labs_page() throws IOException {
		
		OpenPage("https://www.saucedemo.com/v1/");
	}

	@Then("Validate User Landed Page (.+)")
	public void validate_user_land_page_url(String url) {
	   elo.ValidateLandedPage(url);
	}

	@When("User Enters valid (.+)")
	public void user_enters_username(String username) 
	{
		elo.EnterUsername(username);
	}

	@When("User Enter valid (.+)")
	public void user_enter_password(String password) 
	{
		elo.EnterPassword(password);
	}

	@When("Click On LoginButton")
	public void click_on_login_button() 
	{
		elo.ClickOnLoginButton();
	}

	@Then("Validate the User login")
	public void validate_the_user_login() {
	   elo.ValidateLoginUser("https://www.saucedemo.com/v1/inventory.html");
	}
	
	@After
	public void TearDown()
	{
		TearDown();
	}

}
