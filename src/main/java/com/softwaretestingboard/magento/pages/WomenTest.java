package com.softwaretestingboard.magento.pages;

import com.aventstack.extentreports.Status;
import com.softwaretestingboard.magento.customlisteners.CustomListeners;
import com.softwaretestingboard.magento.utility.Utility;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

import java.util.ArrayList;
import java.util.List;

public class WomenTest extends Utility {


    @CacheLookup
    @FindBy(xpath = "//span[@class='ui-menu-icon ui-icon ui-icon-carat-1-e']")
    WebElement women;

    @CacheLookup
    @FindBy(xpath = "//a[@id='ui-id-9']//span[contains(text(),'Tops')]")
    WebElement top;

    @CacheLookup
    @FindBy(xpath = "//a[@id='ui-id-11']//span[contains(text(),'Jackets')]")
    WebElement jacket;

    @CacheLookup
    @FindBy()
    WebElement jacketsNameListBefore;

    @CacheLookup
    @FindBy(id = "sorter")
    WebElement productName;

    @CacheLookup
    @FindBy()
    WebElement jacketsNameListAfter;

    @CacheLookup
    @FindBy(xpath = "//span[@class='ui-menu-icon ui-icon ui-icon-carat-1-e']")
    WebElement women1;

    @CacheLookup
    @FindBy(xpath = "//a[@id='ui-id-9']//span[contains(text(),'Tops')]")
    WebElement top1;

    @CacheLookup
    @FindBy(xpath = "//a[@id='ui-id-11']//span[contains(text(),'Jackets')]")
    WebElement jacket1;

    @CacheLookup
    @FindBy()
    WebElement beforePrice;

    @CacheLookup
    @FindBy(id = "sorter")
    WebElement price;

    @CacheLookup
    @FindBy()
    WebElement  lowToHigh;





  //  By women = By.xpath("//span[@class='ui-menu-icon ui-icon ui-icon-carat-1-e']");
    //By top = By.xpath("//a[@id='ui-id-9']//span[contains(text(),'Tops')]");
   // By jacket = By.xpath("//a[@id='ui-id-11']//span[contains(text(),'Jackets')]");
  //  ArrayList<String> jacketsNameListBefore = new ArrayList<>();
   // By productName = By.id("sorter");
    //ArrayList<String > jacketsNameListAfter = new ArrayList<>();
  //  By women1 = By.xpath("//span[@class='ui-menu-icon ui-icon ui-icon-carat-1-e']");
   // By top1 = By.xpath("//a[@id='ui-id-9']//span[contains(text(),'Tops')]");
   // By jacket1 = By.xpath("//a[@id='ui-id-11']//span[contains(text(),'Jackets')]");
    //ArrayList<Double> beforePrice = new ArrayList<>();
   // By price = By.id("sorter");
    //ArrayList<Double> lowToHigh = new ArrayList<>();

    // verifyTheSortByProductNameFilter
    public void setWomen () {
        //* Mouse Hover on Women Menu
        mouseHoverToElement(women);
        CustomListeners.test.log(Status.PASS,"mouseHower");
    }

    public void setTop () {
        //* Mouse Hover on Tops
        mouseHoverToElement(top);
        CustomListeners.test.log(Status.PASS,"mouseHower");

    }

    public void clickOnJacket () {
        // * Click on Jackets
        clickOnElement(jacket);
        CustomListeners.test.log(Status.PASS,"click on button");
    }


    public void realProductName ()
    {
        ArrayList<String> jacketsNameListBefore = new ArrayList<>();
        List<WebElement> jacketsElementsList = driver.findElements(By.xpath("//strong[@class='product name product-item-name']//a"));
        System.out.println("Total product = " + jacketsElementsList.size());
        for (WebElement product : jacketsElementsList) {
            jacketsNameListBefore.add(product.getText());
        }
        System.out.println("Total product = " + jacketsNameListBefore);
    }

    public void selectProductName ()
    {
        //* Select Sort By filter “Product Name”
        selectByVisibleTextFromDropDown(productName, "Product Name");
    }

    public void setJacketsNameListAfter () {

        ArrayList<String > jacketsNameListAfter = new ArrayList<>();
        List<WebElement> jacketsElementsList = driver.findElements(By.xpath("//strong[@class='product name product-item-name']//a"));
        System.out.println("Total products = " + jacketsElementsList.size());

        for (WebElement product : jacketsElementsList) {

            jacketsNameListAfter.add(product.getText());


        }
        System.out.println("After Products = " + jacketsNameListAfter);

    }

    //verifyTheSortByPriceFilter

    public void setWomen1 () {
        //* Mouse Hover on Women Menu
        mouseHoverToElement(women1);
        CustomListeners.test.log(Status.PASS,"mouseHower");
    }

    public void setTop1 () {
        //* Mouse Hover on Tops
        mouseHoverToElement(top1);
        CustomListeners.test.log(Status.PASS,"mouseHower");

    }

    public void clickOnJacket1 () {
        // * Click on Jackets
        clickOnElement(jacket1);
        CustomListeners.test.log(Status.PASS,"click on button");
    }
    public void realPrice ()
    {
        ArrayList<Double> beforePrice = new ArrayList<>();
        List<WebElement> jacketPrice = driver.findElements(By.xpath("//span[@class='price-wrapper ']//span"));
        System.out.println("Total product = " + jacketPrice.size());
        for (WebElement price : jacketPrice) {
            beforePrice.add(Double.valueOf(price.getText().replace("$", "")));
        }
        System.out.println("Total product price = " + beforePrice);
    }
    public void selectProductPrice ()
    {
        //* Select Sort By filter “Product Name”
        selectByVisibleTextFromDropDown(price, "Price");
    }
    public void setJacketsPriceListAfter () {

        ArrayList<Double> lowToHigh = new ArrayList<>();
        List<WebElement> afterJacketsPrice = driver.findElements(By.xpath("//span[@class='price-wrapper ']//span"));
        System.out.println("Total products = " + afterJacketsPrice.size());

        for (WebElement price : afterJacketsPrice) {

            lowToHigh.add(Double.valueOf(price.getText().replace("$", "")));


        }
        System.out.println("After Products price = " + lowToHigh);

    }




}



