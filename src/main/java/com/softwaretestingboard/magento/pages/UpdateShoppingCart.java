package com.softwaretestingboard.magento.pages;

import com.aventstack.extentreports.Status;
import com.softwaretestingboard.magento.customlisteners.CustomListeners;
import com.softwaretestingboard.magento.utility.Utility;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

public class UpdateShoppingCart extends Utility
{
    @CacheLookup
    @FindBy(xpath = "//td[@class='col item']//a[normalize-space()='Overnight Duffle']")
    WebElement productName;

    @CacheLookup
    @FindBy(xpath = "//input[@title='Qty']")
    WebElement productQty;


    // @CacheLookup
    @FindBy(xpath = "(//span[@class='cart-price']//span)[2]")
    WebElement totalPrice ;

    @CacheLookup
    @FindBy(xpath = "//span[normalize-space()='Update Shopping Cart']")
    WebElement updateShoppingCart ;


    public WebElement getProductName() {
        return productName;
    }

    public WebElement getTotalPrice() {
        return totalPrice;
    }

    public WebElement getProductQty() {
        return productQty;
    }

    public void clickOnProductName(){

        clickOnElement(productName);
        CustomListeners.test.log(Status.PASS,"clickOnProductName");

    }

}
