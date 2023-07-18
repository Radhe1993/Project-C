package com.softwaretestingboard.magento.pages;

import com.aventstack.extentreports.Status;
import com.softwaretestingboard.magento.customlisteners.CustomListeners;
import com.softwaretestingboard.magento.utility.Utility;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

public class MenTest  extends Utility
{

    @CacheLookup
    @FindBy(xpath = "//ul[@id='ui-id-2']//span[text()='Men']")
    WebElement men;

    @CacheLookup
    @FindBy(xpath = "//a[@id='ui-id-18']")
    WebElement bottom;

    @CacheLookup
    @FindBy(xpath = "//a[@id='ui-id-23']//span[contains(text(),'Pants')]")
    WebElement pants;

    @CacheLookup
    @FindBy(xpath = "//body/div[1]/main[1]/div[3]/div[1]/div[3]/ol[1]/li[1]/div[1]/a[1]/span[1]/span[1]/img[1]")
    WebElement yogaPant;

    @CacheLookup
    @FindBy(xpath = "//div[@id='option-label-size-143-item-175']")
    WebElement size;

    @CacheLookup
    @FindBy(xpath = "//div[@id='option-label-color-93-item-49']")
    WebElement blackColour;

    @CacheLookup
    @FindBy(xpath = "//span[contains(text(),'Add to Cart')]")
    WebElement addToCart;

    @CacheLookup
    @FindBy(xpath = "//div[@data-bind='html: $parent.prepareMessageForHtml(message.text)']")
    WebElement message;

    @CacheLookup
    @FindBy(xpath = "//a[normalize-space()='shopping cart']")
    WebElement shoppingCart;

    @CacheLookup
    @FindBy(xpath = "//span[@class='base']")
    WebElement message1;

    @CacheLookup
    @FindBy(xpath = "//td[@class='col item']//a[normalize-space()='Cronus Yoga Pant']")
    WebElement productName;

    @CacheLookup
    @FindBy(xpath = "//dd[contains(text(),'32')]")
    WebElement productSize;

    @CacheLookup
    @FindBy(xpath = "//dd[contains(text(),'Black')]")
    WebElement productColour;


    //By men = By.xpath("//ul[@id='ui-id-2']//span[text()='Men']");
    //By bottom = By.xpath("//a[@id='ui-id-18']");
   // By pants = By.xpath("//a[@id='ui-id-23']//span[contains(text(),'Pants')]");
   // By yogaPant = By.xpath("//body/div[1]/main[1]/div[3]/div[1]/div[3]/ol[1]/li[1]/div[1]/a[1]/span[1]/span[1]/img[1]");
    //By size = By.cssSelector("#option-label-size-143-item-175");
   // By blackColour = By.xpath("//div[@id='option-label-color-93-item-49']");
  //  By addToCart = By.xpath("//span[contains(text(),'Add to Cart')]");
  //  By message = By.xpath("//div[@data-bind='html: $parent.prepareMessageForHtml(message.text)']");
   // By shoppingCart = By.xpath("//a[normalize-space()='shopping cart']");
    //By message1 = By.xpath("//span[@class='base']");
   // By productName = By.xpath("//td[@class='col item']//a[normalize-space()='Cronus Yoga Pant']");
    //By productSize = By.xpath("//dd[contains(text(),'32')]");
    //By productColour = By.xpath("//dd[contains(text(),'Black')]");


    public void setMen()
    {
        mouseHoverToElement(men);
        CustomListeners.test.log(Status.PASS,"mouseHower");
    }
    public void setBottom()
    {
        mouseHoverToElement(bottom);
        CustomListeners.test.log(Status.PASS,"mouseHower");
    }
    public void setPants()
    {
        clickOnElement(pants);
        CustomListeners.test.log(Status.PASS,"click on button");
    }
    public void setYogaPant()
    {
        mouseHoverToElementAndClick(yogaPant);
    }
    public void setSize()
    {
        clickOnElement(size);
        CustomListeners.test.log(Status.PASS,"click on button");
    }

    public void setBlackColour()
    {
        clickOnElement(blackColour);
        CustomListeners.test.log(Status.PASS,"click on button");
    }

    public void clickOnAddToCart()
    {
        clickOnElement(addToCart);
        CustomListeners.test.log(Status.PASS,"click on button");
    }
    public void verifyMessage()
    {
        getTextFromElement(message);
    }
    public void clickOnShoppingCart()
    {
        clickOnElement(shoppingCart);
        CustomListeners.test.log(Status.PASS,"click on button");
    }
    public void verifyMessage1()
    {
        getTextFromElement(message1);
    }
    public void verifyMessage2()
    {
        getTextFromElement(productName);
    }
    public void verifyMessage3()
    {
        getTextFromElement(productSize);
    }
    public void verifyMessage4()
    {
        getTextFromElement(productColour);
    }


}
