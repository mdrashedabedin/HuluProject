@smoke @hulu-04 @regression
Feature: Hulu Fail Sign In Functionality

	Scenario: Hulu Fail Sign In Functionality
		Given Hulu Homepage is open
		When Click on Log In
		And Enter E-mail
		And Enter Wrong Password
		Then Click Log In