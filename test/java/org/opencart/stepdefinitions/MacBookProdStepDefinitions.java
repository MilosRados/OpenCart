package org.opencart.stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.opencart.pages.MacBookPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class MacBookProdStepDefinitions {

    private MacBookPage macPage;

    WebDriver driver = new ChromeDriver();
    @Given("I'm on the offers Mac page")
    public void offers_page_mac(){
        driver.get("https://naveenautomationlabs.com/opencart/index.php?route=common/home");

        macPage = new MacBookPage(driver);
    }
    @When("I am click on the MacBook to go on Macbook product page")
    public void i_am_clicking_on_mac_img(){
        macPage.clickOnMacImg();

    }
    @Then("I click on the MacBook image to see product")
    public void i_am_clicking_on_mac_to_see_prod(){
        macPage.clickOnMacProd();
    }

    @And("I click 5 times on right arrow to see all images of the product")
    public void i_am_clicking_on_right_arrow(){
        macPage.clickOnRightArrow();
    }

    @Then("I click 5 times on left arrow")
    public void i_am_clicking_on_left_arrow(){
        macPage.clickOnLeftArrow();
    }

    @And("I click on the close button to close image window")
    public void i_am_clicking_on_close_button(){
        macPage.clickOnCloseButton();
    }

    @Then("Enter number of products in Qty input field")
    public void i_am_entering_num_of_prod(){
        macPage.enterNumberOfProducts();
    }

    @And("I am click on Add to cart button")
    public void i_am_clicking_on_add_to_cart(){
        macPage.clickOnAddToCrtBtn();
    }

    @When("I am clicking on the Reviews tab")
    public void i_am_clicking_on_the_reviews_tab() {macPage.clickOnReviewsTab();}

    @Then("I write my name in Your Name field")
    public void i_am_writing_my_name_in_your_name_field(){macPage.enterYourName();}

    @And("I write my review in Your Review field")
    public void i_am_writing_my_review(){macPage.enterYourReview();}

    @Then("I click on the Rating radio button")
    public  void i_am_clicking_on_the_radio_button(){macPage.clickOnRatingRadio();}

    @And("I click on the Continue button")
    public void i_am_clicking_on_continue_button(){macPage.clickOnTheContinueBtn();}

}
