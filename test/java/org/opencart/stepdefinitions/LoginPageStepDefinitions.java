package org.opencart.stepdefinitions;

import io.cucumber.java.Before;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.java.en_scouse.An;
import org.opencart.pages.LoginPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginPageStepDefinitions {

    private WebDriver driver;
    private LoginPage loginPage;

    @Before
    public void setup(){
        driver = new ChromeDriver();
    }

    @Given("I am on the OpenCart login page")
    public void i_am_on_the_open_cart_login_page(){
        driver.get("https://naveenautomationlabs.com/opencart/index.php");
        loginPage = new LoginPage(driver);
    }

    @Given("I am click on the My Account dropdown")
    public void i_am_click_on_the_my_account(){
        loginPage.clickMyAccount();

    }

    @Given("I have clicked on Login")
    public void i_have_clicked_on_the_login(){
        loginPage.clickOnLogin();
    }

    @When("I enter email address")
    public void i_entered_email_and_password(){
        loginPage.enterEmailAddress();
    }
    @And("password")
    public void i_entered_password(){
        loginPage.enterPassword();
    }
   @Then("I click on the Login button")
    public void i_clicked_on_the_login_button(){
        loginPage.clickOnLoginBtn();
   }

}


