package org.opencart.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import java.util.concurrent.TimeUnit;

public class MacBookPage {
    private WebDriver driver;

    public MacBookPage(WebDriver driver) {
        this.driver = driver;
    }

    private By macBookImg = By.xpath("//img[@title='MacBook']");
    private By macProduct = By.xpath("//li[1]//a[1]//img[1]");
    private By rightArrow = By.xpath("//button[@title='Next (Right arrow key)']");
    private By leftArrow = By.xpath("//button[@title='Previous (Left arrow key)']");
    private By closeButton = By.xpath("//button[normalize-space()='×']");
    private By inputQtyField = By.xpath("//input[@id='input-quantity']");
    private By addToCartBtn = By.xpath("//button[@id='button-cart']");
    private By reviews = By.xpath("//a[normalize-space()='Reviews (0)']");
    private By nameInputField = By.xpath("//input[@id='input-name']");
    private By yourReviewInputF = By.xpath("//textarea[@id='input-review']");
    private By ratingRadio = By.xpath("//input[@value='4']");
    private By continueButton = By.xpath("//button[@id='button-review']");

    public void clickOnMacImg() {

        WebElement macBookLink = driver.findElement(macBookImg);
        Assert.assertTrue(macBookLink.isDisplayed());
        macBookLink.click();

    }
    public void clickOnMacProd() {

        WebElement macBookProduct = driver.findElement(macProduct);
        Assert.assertTrue(macBookProduct.isDisplayed());
        macBookProduct.click();
    }
    public void clickOnRightArrow() {

        for (int i = 0; i<4; i++ ){

            WebElement rightArrowNext = driver.findElement(rightArrow);
            rightArrowNext.click();
        }
    }

    public void clickOnLeftArrow() {

        for (int i = 0; i<4; i++ ){

            WebElement leftArrowPrev = driver.findElement(leftArrow);
            leftArrowPrev.click();
        }
    }

    public void clickOnCloseButton(){

        WebElement closeButtonEsc = driver.findElement(closeButton);
        Assert.assertTrue(closeButtonEsc.isEnabled());
        closeButtonEsc.click();

        String priceOfMac = driver.findElement(By.xpath("//h2[normalize-space()='$602.00']")).getText();
        System.out.println(priceOfMac);

    }

    public void enterNumberOfProducts(){

        WebElement inputQtyFieldProd = driver.findElement(inputQtyField);
        Assert.assertTrue(inputQtyFieldProd.isEnabled());
        inputQtyFieldProd.clear();
        inputQtyFieldProd.sendKeys("2");
    }

    public void clickOnAddToCrtBtn(){

        WebElement addToCrt = driver.findElement(addToCartBtn);
        Assert.assertTrue(addToCrt.isEnabled());
        addToCrt.click();

        String itemsPrice = driver.findElement(By.xpath("//span[@id='cart-total']")).getText();
        System.out.println(itemsPrice);

    }

//    Write a review section
        public void clickOnReviewsTab(){

        WebElement reviewsTab = driver.findElement(reviews);
        Assert.assertTrue(reviewsTab.isEnabled());
        reviewsTab.click();

        }

        public void enterYourName(){

        WebElement inputFieldName = driver.findElement(nameInputField);
        Assert.assertTrue(inputFieldName.isEnabled());
        inputFieldName.sendKeys("Don Johnson");

        }

        public void enterYourReview(){

        WebElement inputFYourReview = driver.findElement(yourReviewInputF);
        Assert.assertTrue(inputFYourReview.isEnabled());
        inputFYourReview.sendKeys("This is my review");

        }

        public void clickOnRatingRadio(){

        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,450)", "");
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

        WebElement ratingRadioButton = driver.findElement(ratingRadio);
        ratingRadioButton.click();
        Assert.assertTrue(ratingRadioButton.isSelected());
        System.out.println("Yes");

        }

        public void clickOnTheContinueBtn(){

        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,350)", "");

        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        WebElement continueBtn = driver.findElement(continueButton);
        Assert.assertTrue(continueBtn.isEnabled());
        continueBtn.click();
        }


}
