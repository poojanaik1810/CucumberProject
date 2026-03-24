package stepDefinitions;

import java.util.List;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class MainSteps {

    @Given("User is on NetBanking landing page")
    public void user_is_on_net_banking_landing_page() {
        System.out.println("User landed on NetBanking page");
    }
    @Given("User is on Mortage landing page")
    public void user_is_on_mortage_landing_page() {
        System.out.println("User landed on Mortage page");
    }
    
    @Given("User is on Practice landing page")
    public void user_is_on_practice_landing_page() {
    	System.out.println("User is on Practice landing page");
    }
    
    @When("User SignUp into application")
    public void user_sign_up_into_application(List<String> data) {
        System.out.println(data.get(1));
        System.out.println(data.get(2));
        System.out.println(data.get(3));
    }

    @When("User login into application with {string} and password {string}") // Step Definition by Cucumber Expression
    public void user_login_into_application_with_and_password(String username, String password) {

        System.out.println("Username: " + username);
        System.out.println("Password: " + password);

    }

    @When("^User login into application with (.+) and password (.+) combination$") //Step Definition by Regex 
    public void user_login_into_application_with_and_password_combination(String Username, String Password) {
    	System.out.println("Username: " + Username);
        System.out.println("Password: " + Password);
    }

    @Then("Home Page is displayed")
    public void home_page_is_displayed() {
        System.out.println("Home page displayed");
    }

    @Then("Cards are displayed")
    public void cards_are_displayed() {
        System.out.println("Cards displayed");
    }
    
    @Given("Background - givenFF1")
    public void background_given_ff1() {
    	System.out.println("Backgroud Tag - Given - FF1");
    }
    
    @When("Background - whenFF1")
    public void background_when_ff1() {
    	System.out.println("Backgroud Tag - When - FF1");
    }
    @When("Background - thenFF1")
    public void background_then_ff1() {
    	System.out.println("Backgroud Tag - Then - FF1");
    }
    
    
    @Given("Background - givenFF2")
    public void background_given_ff2() {
    	System.out.println("Backgroud Tag - Given - FF2");
    }
    @When("Background - whenFF2")
    public void background_when_ff2() {
    	System.out.println("Backgroud Tag - When - FF2");
    }
    @When("Background - thenFF2")
    public void background_then_ff2() {
    	System.out.println("Backgroud Tag - Then - FF2");
    }
    
}