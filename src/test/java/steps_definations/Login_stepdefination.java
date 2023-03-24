package steps_definations;

import org.openqa.selenium.WebDriver;

import Utilities.UtilsManger;
import Utilities.configReader;
import io.cucumber.java.en.*;
import vwoapplication_Pages.LoginPage;

public class Login_stepdefination {
	
	private UtilsManger utilsManger;
	private LoginPage loginPage;
	
	
	public Login_stepdefination(UtilsManger utilsManger) {
		
		this.utilsManger = utilsManger;
		new LoginPage(utilsManger.seleniumUtilites.driver,utilsManger);
	}
	

	
	@Given("User has launched applicaton {string} dashboard")
	public void user_has_launched_applicaton_dashboard(String string) {
	  
		utilsManger.seleniumUtilites.NavigateTo(utilsManger.configReader.get_DEV_LoginUrl());
		String currentUrl = utilsManger.seleniumUtilites.driver.getCurrentUrl();
		System.out.println(currentUrl);
	}

	@When("user enter valid {string}")
	public void user_enter_valid(String string) {
		
	  
	}

	@When("user click on sign button")
	public void user_click_on_sign_button() {
	    
		System.out.println("user has launched application");
	}

	@Then("user should succesfull login to application")
	public void user_should_succesfull_login_to_application() {
	    // Write code here that turns the phrase above into concrete actions
	   
	}

	

}
