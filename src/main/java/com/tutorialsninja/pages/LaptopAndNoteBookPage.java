package com.tutorialsninja.pages;

import com.tutorialsninja.utilities.Utilities;
import org.openqa.selenium.By;

public class LaptopAndNoteBookPage extends Utilities
{
    By verifyLaptopAndNotBook = By.xpath("//h2[contains(text(),'Laptops & Notebooks')]");
    By sortPriceHighToLow = By.xpath("//select[@id='input-sort']");
    By productMacBook = By.linkText("MacBook");
    By verifyMacBook = By.xpath("//h1[contains(text(),'MacBook')]");
    By addToCartButton = By.xpath("//button[@id='button-cart']");
    By verifySuccessMessage = By.cssSelector("body:nth-child(2) div.container:nth-child(4) > div.alert.alert-success.alert-dismissible");
    By clickShoppingCart = By.xpath("//a[contains(text(),'shopping cart')]");
    By verifyTextShoppingCart = By.xpath("//div[@id='content']//h1");
    By verifyProductMacBook = By.xpath("//div[@class = 'table-responsive']/table/tbody/tr/td[2]/a");
    By changeQty2 = By.xpath("//input[contains(@name, 'quantity')]");
    By clickUpdateTab = By.xpath("//button[contains(@data-original-title, 'Update')]");
    By verifyMessageModified = By.xpath("//div[@id='checkout-cart']/div[1]");
    By verifyTotal£73745 = By.xpath("//div[@class = 'table-responsive']/table/tbody/tr/td[6]");
    By clickOnCheckOut = By.xpath("//a[contains(text(),'Checkout')]");








    // Verify the text ‘Laptops & Notebooks’
    public void verifyLaptopAndBookText()
    {
        verifyText(driver,verifyLaptopAndNotBook,"Laptops & Notebooks");
    }

    //Select Sort By "Price (High > Low)"
    public void sortByPriceHighToLow()
    {
        selectByVisibleTextFromDropDown(sortPriceHighToLow,"Price (High > Low)");
    }

    // Select Product “MacBook”
    public void productMacBook()
    {
        clickOnElement(productMacBook);
    }

    // Verify the text “MacBook”
    public void verifyTextMacBook()
    {
        verifyText(driver,verifyMacBook,"MacBook");
    }

    // Click on ‘Add To Cart’ button
    public void addToCart()
    {
        clickOnElement(addToCartButton);
    }

    //Verify the message “Success: You have added MacBook to your shopping cart!”
    public void verifyMessageSuccess()
    {
        verifyText(driver,verifySuccessMessage,"Success: You have added MacBook to your shopping cart!");
    }

    // Click on link “shopping cart” display into success message
    public void clickOnShoppingCart()
    {
        clickOnElement(clickShoppingCart);
    }

    // Verify the text "Shopping Cart"
    public void verifyShoppingCartText()
    {
        verifyText(driver,verifyTextShoppingCart,"Shopping Cart");
    }

    // Verify the Product name "MacBook"
    public void verifyProductMacBookText()
    {
        verifyText(driver,verifyProductMacBook,"MacBook");
    }

    //Change Quantity "2"
    public void changeQty2()
    {
        clearTextFromField(changeQty2);
        sendTextToElement(changeQty2,"2");
    }

    // Click on “Update” Tab
    public void clickUpdateTab()
    {
        clickOnElement(clickUpdateTab);
    }

    // Verify the message “Success: You have modified your shopping cart!”
    public void verifyMessageSuccessModified()
    {
        verifyText(driver,verifyMessageModified,"Success: You have modified your shopping cart!");
    }

    // Verify the Total £737.45
    public void verifyTotal£737()
    {
        verifyText(driver,verifyTotal£73745,"£737.45");
    }

    // Click on “Checkout” button
    public void clickOnCheckOut()
    {
        clickOnElement(clickOnCheckOut);
    }










}
