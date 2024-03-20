package org.opencart.stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.opencart.pages.OffersPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class OffersPageStepDefinitions {
    private OffersPage offersPage;

    WebDriver driver = new ChromeDriver();
    @Given("I'm on the offers page")
    public void offers_page(){
        driver.get("https://naveenautomationlabs.com/opencart/index.php?route=common/home");

        offersPage = new OffersPage(driver);
    }

    @When("I am click on the MacBook shopping basket to add item to cart")
    public void i_am_click_on_the_shopp_basket_icon(){

        offersPage.clickOnShoppBasket();

    }

    @And("I'm clicking on Iphone shop basket")
        public void i_am_clicking_on_iphone_shop_basket(){

        offersPage.clickOniPhoneShopB();

    }

    @Then("I click on the item cart button to see product")
        public void i_am_click_on_the_add_items_button(){

        offersPage.clickOnItemsButton();

    }

    @And("Click on swiper button")
        public void i_am_clicking_on_swiper_button(){

        offersPage.clickOnSwiperButton();
    }




}
