package stepDefinitions;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import stepImplementations.JourneysStepImplementations;

import java.io.IOException;

public class JourneysStepDefs {

JourneysStepImplementations implementations = new JourneysStepImplementations();


    @When("^I click emergency button$")
    public void i_click_emergency_button()  {implementations.i_click_emergency_button(); }

    @When("^I click breakdown option in the popup$")
    public void i_click_breakdown_option_in_the_popup() {
        implementations.i_click_breakdown_option_in_the_popup();
    }

   @When("^I click accident button$")
    public void i_click_accident_button()  {
        implementations.i_click_accident_button();
    }

    @When("^I click CALL NOW button$")
    public void i_click_CALL_NOW_button()  {
        implementations.when_I_click_CALL_NOW_button();
    }

    @Then("^I should be able to get a pop up with a validation message$")
    public void i_should_be_able_to_get_a_pop_up_with_a_validation_message() throws IOException {
        implementations.i_should_be_able_to_see_validation_message();
    }

    @When("^I choose journeys option$")
    public void i_choose_journeys_option()  {
        implementations.i_choose_journeys_option();
    }

    @Then("^I should see recorded data$")
    public void i_should_see_recorded_data()  {
        implementations.i_should_see_recorded_data();
    }

    @Given("^I'm on Journeys screen$")
    public void i_m_on_Journeys_screen() throws Throwable {
        implementations.i_m_on_Journeys_screen();
    }

    @When("^I get the existing record$")
    public void i_get_the_existing_record()  {
        implementations.i_get_the_existing_record();
    }

    @When("^I unistall the app$")
    public void i_unistall_the_app()  {
        implementations.i_unistall_the_app();
    }

    @When("^I re-install the app$")
    public void i_re_install_the_app() throws Exception  {
        implementations.i_re_install_the_app();
    }

    @When("^I provide the valid username$")
    public void i_provide_the_valid_username() throws Exception {
        implementations.i_enter_valid_username();
    }

    @When("^I provide the valid password$")
    public void i_provide_the_valid_password() throws Exception  {
        implementations.i_enter_password();
    }

    @When("^I navigate to the journeys screen$")
    public void i_navigate_to_the_journeys_screen() {
        implementations.i_navigate_to_the_journeys_screen();
    }

    @Then("^I should see the previously recorded data$")
    public void i_should_see_the_previously_recorded_data() {
        implementations.i_should_see_the_previously_recorded_data();
    }
}
