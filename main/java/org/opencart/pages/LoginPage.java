package org.opencart.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;



import java.util.List;
import java.util.concurrent.TimeUnit;

public class LoginPage {

    private WebDriver driver;

    private By myAccDropdown = By.xpath("//i[@class='fa fa-user']");
    private By loginOption = By.xpath("//ul[@class='dropdown-menu dropdown-menu-right']");
    private By emailInputLocator = By.xpath("//input[@id='input-email']");
    private By passwordInputLocator = By.xpath("//input[@id='input-password']");
    private By loginButtonLocator = By.xpath("//input[@value='Login']");


    //    Constructor
    public LoginPage(WebDriver driver) {
        this.driver = driver;
    }
//    page methods/Actions

    public void clickMyAccount() {
        WebElement myAccount = driver.findElement(myAccDropdown);
        myAccount.click();
    }

    public void clickOnLogin() {
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        List<WebElement> allOptions = driver.findElements(loginOption);
        String option = "Login";

// Iterate the list using for loop

        for (int i = 0; i < allOptions.size(); i++) {

            if (allOptions.get(i).getText().contains(option)) {

                allOptions.get(i).click();

                System.out.println("clicked");

                break;
            }
        }
    }
    public void enterEmailAddress(){
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
            WebElement emailCredendtials = driver.findElement(emailInputLocator);
            emailCredendtials.sendKeys("johnson@test.gmail.com");
        }
    public void enterPassword(){
        WebElement passwordCredentials = driver.findElement(passwordInputLocator);
        passwordCredentials.sendKeys("Password123");
    }

    public void clickOnLoginBtn(){
        WebElement loginBtn = driver.findElement(loginButtonLocator);
        loginBtn.click();
    }

    }



