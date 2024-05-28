Feature: Register User

Scenario: Signup with valiad credentails

Given Launch browser and Goto URL 

Then  Verify that home page is visible successfully

When Click on Signup / Login button

Then Verify New User Signup! is visible

And Enter name and email address

When Click on SignupButton

Then Verify that ENTER ACCOUNT INFORMATION is visible

Then Fill details: Title, Name, Email, Password, Date of birth

And Select checkbox Sign up for our newsletter!

And  Select checkbox Receive special offers from our partners!

And Fill details: First name, Last name, Company, Address, Address2, Country, State, City, Zipcode, Mobile Number

And  Click Create Account button

Then Verify that ACCOUNT CREATED! is visible


Scenario: 

Given  Click Continue button

When  Verify that Logged in as username is visible

Then Click Delete Account button

And Verify that ACCOUNT DELETED! is visible and click Continue button








