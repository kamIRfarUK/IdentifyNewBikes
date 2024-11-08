package stepDefinitions;

import org.openqa.selenium.WebDriver;

import factory.BaseClass;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObjects.LoginPage;

public class LoginSteps {
	WebDriver driver;
	LoginPage lg;
	
	
	//Try to 'Login' with google, give invalid account details & capture the error message	
	
	@Given("the user has the car sales website open in their browser")
	public void the_user_has_the_car_sales_website_open_in_their_browser() {
		BaseClass.getLogger().info("Goto website --> Login with Invalid Google Account..Displays error message ");
		lg=new LoginPage(BaseClass.getDriver());
	
	}
	
	@When("the user clicks on the login icon")
	public void the_user_clicks_on_the_login_icon() {
		BaseClass.getLogger().info("User --> Clicks on Login Icon.. ");
		lg.clickLogInButton();
		
	}

	@When("the user clicks on the Google button")
	public void the_user_clicks_on_the_google_button() {
		BaseClass.getLogger().info("User --> Clicks on Google.. ");
		lg.clickGoogleBtn();
	}

	@When("the user switches to the new window")
	public void the_user_switches_to_the_new_window() {
		BaseClass.getLogger().info("User --> Switches to Login Frame.. ");
		lg.switchTowindow();
	}

	@When("the user enters the emailId and clicks on the Next button")
	public void the_user_enters_the_email_id_and_clicks_on_the_next_button() {
		BaseClass.getLogger().info("User --> Providing email credentials...");
		try {
			lg.setEmail();
			BaseClass.getLogger().info("User --> Sets Email Successfully.. ");
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			BaseClass.getLogger().error("Setting Email failed: " + e.getMessage());
			e.printStackTrace();
		}
	}

	@Then("the system should display an error message and print it in the console")
	public void the_system_should_display_an_error_message_and_print_it_in_the_console() {
		lg.errorMessage();
		BaseClass.getLogger().info("User --> Displays error message.. ");
	}

}
