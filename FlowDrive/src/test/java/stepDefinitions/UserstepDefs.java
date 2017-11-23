package stepDefinitions;

import cucumber.api.DataTable;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import stepImplementations.UserStepImplementations;

public class UserstepDefs {

    UserStepImplementations implmns = new UserStepImplementations();

    @Given("^I launch app$")
    public void i_launch_app()  {
        implmns.i_launch_app();
    }

    @When("^I click Signup$")
    public void i_click_Signup()  {
        implmns.i_click_Signup();
    }

    @When("^I provide data$")
    public void i_provide_data(DataTable userData) { implmns.i_provide_data(userData); }

    @Then("^I should register$")
    public void i_should_register()  {
        implmns.i_should_register();
    }

    @Then("^gets redirected to login page$")
    public void gets_redirected_to_login_page()  {
        implmns.gets_redirected_to_login_page();
    }

    @Given("^I'm in login screen$")
    public void i_m_in_login_screen() {
        implmns.i_m_in_login_screen();
    }

    @When("^I enter valid username$")
    public void i_enter_valid_username() throws Exception  {
        implmns.i_enter_valid_username();
    }

    @When("^I enter password$")
    public void i_enter_password()throws Exception  {
        implmns.i_enter_password();
    }

    @Then("^I should login$")
    public void i_should_login()  {
        implmns.i_should_login();
    }

    @Then("^I gets redirected to home screen$")
    public void i_gets_redirected_to_home_screen()  {
        implmns.i_gets_redirected_to_home_screen();
    }

    @When("^I click social tab$")
    public void i_click_social_tab() { implmns.i_click_social(); }

    @When("^I provide name$")
    public void i_provide_name()  {
        implmns.i_provide_name();
    }

    @When("^I click next$")
    public void i_click_next() {
        implmns.i_click_next();
    }

    @When("^I enter description$")
    public void i_enter_description() {
        implmns.i_enter_description();
    }

    @When("^I click done$")
    public void i_click_done()  {
        implmns.i_click_done();
    }

    @Then("^I should've created my profile$")
    public void i_should_ve_created_my_profile()  {
        implmns.i_should_ve_created_my_profile();
    }
}
