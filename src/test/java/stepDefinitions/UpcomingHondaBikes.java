package stepDefinitions;

import org.openqa.selenium.WebDriver;

import factory.BaseClass;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObjects.UpcomingHondaBikesPage;

public class UpcomingHondaBikes {
	WebDriver driver;
	UpcomingHondaBikesPage ub=new UpcomingHondaBikesPage(BaseClass.getDriver());
	
	
	//Display "Upcoming" bikes details like bike name, price and expected launch date in India, for manufacturer 'Honda' & Bike price should be less than 4Lac

	
	@Given("the user is on the ZigWheels website")
	public void the_user_is_on_the_zig_wheels_website() {
		BaseClass.getLogger().info("Goto Upcomming Bikes Page --> Displays Details for Honda and price less than 4lac.. ");
		BaseClass.getDriver();
	}

	@When("the user hovers over the New Bikes section")
	public void the_user_hovers_over_the_section() {
		BaseClass.getLogger().info("User --> Mouse hovers on New Bikes Section.. ");
		ub.navigateToNewBikes();
	} 
	

	@When("the user selects Upcoming Bikes from the dropdown")
	public void the_user_selects_upcoming_bikes_from_the_dropdown() {
		ub.navigateToUpcomingBikes();
		ub.navigateToAllUpcommingBikes();
		BaseClass.getLogger().info("User --> Selects Upcoming Bikes from the dropdown.. ");
	}

	@When("the user sets the filter Manufacturer to Honda")
	public void the_user_sets_the_filter_manufacturer_to_honda() {
		ub.selectHonda("Honda");
		BaseClass.getLogger().info("User --> Only Filters the Manufacturer to 'Honda'..");
	}

	@When("the user clicks on the View More button")
	public void the_user_clicks_on_the_view_more_button() {
		ub.viewMore();
		BaseClass.getLogger().info("User --> Clicks on the 'View More' Button..");
	}
	
	@Then("the user should filter out the displayed Honda bikes with a price less than 4Lac")
	public void the_user_should_filter_out_the_displayed_honda_bikes_with_a_price_less_than_4lac() {
		ub.bikesListUnder4Lac();
		BaseClass.getLogger().info("User --> Filters Bikes a price less than 4Lac..");
	}
	
	@Then("for each bike priced under 4Lac should be added to their respective lists")
	public void for_each_bike_priced_under_4lac_should_be_added_to_their_respective_lists() {
		ub.printBikeDetails();
		BaseClass.getLogger().info("User --> Displays The details for Upcomming Bikes..");
	}

}
