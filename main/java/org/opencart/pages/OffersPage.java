package org.opencart.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.concurrent.TimeUnit;

public class OffersPage  {

    private WebDriver driver;

    private By shoppBasketMbook = By.xpath("//div[@id='content']//div[1]//div[1]//div[3]//button[1]//i[1]");
    private  By shopBasketIphone = By.xpath("//body//div[@id='common-home']//div[@class='row']//div[@class='row']//div[2]//div[1]//div[3]//button[1]//i[1]");
    private  By itemOnCart = By.xpath("//span[@id='cart-total']//i[@class='fa fa-shopping-cart']");

    public OffersPage(WebDriver driver) {
        this.driver = driver;
    }

    public void clickOnShoppBasket(){

        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        WebElement shoppBas = driver.findElement(shoppBasketMbook);
        shoppBas.click();

        WebElement iPhoneShopB = driver.findElement(shopBasketIphone);
        iPhoneShopB.click();

    }

    public void clickOniPhoneShopB(){
        JavascriptExecutor js = (JavascriptExecutor) driver;
       js.executeScript("window.scrollBy(0,350)", "");

        WebElement iPhoneShopB = driver.findElement(shopBasketIphone);
        iPhoneShopB.click();

    }

    public void clickOnItemsButton(){

        WebElement itemsButton = driver.findElement(itemOnCart);
        itemsButton.click();

//      Validation of items on cart

        String iPhoneText = driver.findElement(By.xpath("//td[@class='text-left']//a[contains(text(),'iPhone')]")).getText();
        System.out.println(iPhoneText);

        String  priceOfIphone = driver.findElement(By.xpath("//td[normalize-space()='$123.20']")).getText();
        System.out.println(priceOfIphone);

        String macBookText = driver.findElement(By.xpath("//td[@class='text-left']//a[contains(text(),'MacBook')]")).getText();
        System.out.println(macBookText);

        String priceOfMac = driver.findElement(By.xpath("//td[normalize-space()='$602.00']")).getText();
        System.out.println(priceOfMac);
    }

}
