package stepDefinitions;

import org.openqa.selenium.WebDriver;

import factory.BaseClass;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObjects.UsedCarsPage;

public class UsedCars {
	WebDriver driver;
	UsedCarsPage up=new UsedCarsPage(BaseClass.getDriver());

	
	// For Used cars in Chennai, extract all the popular models in a List; Display the same
	
	
	@Given("the user has the car sales website open in the browser")
	public void the_user_has_the_car_sales_website_open_in_their_browser() {
		BaseClass.getLogger().info("Goto 'Used Cars' Page --> Displays popular models in a List... ");
		BaseClass.getDriver();
	}


	@When("the user hovers over the Used Cars link")
	public void the_user_hovers_over_the_used_cars_link() {
		up.navigateToUsedCars();
		BaseClass.getLogger().info("User --> Mouse Hovers over the 'Used Cars' link Icon.. ");
	} 

	@When("the user selects Chennai from the dropdown")
	public void the_user_selects_chennai_from_the_dropdown() {
		up.navigateToChennai();
		BaseClass.getLogger().info("User --> Selects 'Chennai' from the dropdown... ");
	}

	@When("the user scrolls down to the list of popular models")
	public void the_user_scrolls_down_to_the_list_of_popular_models() {
		up.scrollToPopularModels();
		BaseClass.getLogger().info("User --> Scroll-down to the list of 'Popular' Car Models... ");
	}

	@Then("the user should extract all the popular models in a List")
	public void the_user_should_extract_all_the_popular_models_in_a_list(){
		up.popularModelsList();
		BaseClass.getLogger().info("User --> Extract all the popular Car Models in a List... ");
	}

	@Then("the user displays the same in the console")
	public void the_user_displays_the_same_in_the_console() {
		up.displaypopularModelsList();
		BaseClass.getLogger().info("User --> Displays the list of all the popular Car Models... ");
	}
	

}
