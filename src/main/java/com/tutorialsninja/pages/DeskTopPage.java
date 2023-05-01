package com.tutorialsninja.pages;

import com.tutorialsninja.utilities.Utilities;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;

public class DeskTopPage extends Utilities
{

    By verifyDesktop = By.xpath("//h2[contains(text(),'Desktops')]");
    By sortByPositionAtoZ = By.xpath("//select[@id='input-sort']");
    By productHPLP3065 = By.xpath("//a[contains(text(),'HP LP3065')]");
    By verifyProductHPLP3065 = By.xpath("//h1[contains(text(),'HP LP3065')]");
    By deliveryDate = By.xpath("//div[@class = 'input-group date']//button");
    By enterQty = By.xpath("//input[@id='input-quantity']");
    By addToCartButton = By.xpath("//button[@id='button-cart']");
    By verifyMessageSuccess = By.xpath("//div[@class='alert alert-success alert-dismissible']");
    By clickOnShoppingLink = By.xpath("//a[contains(text(),'shopping cart')]");
    By verifyTextShoppingCart = By.xpath("//div[@id='content']//h1");
    By verifyHPLP3065 = By.xpath("//div[@class = 'table-responsive']/table/tbody/tr/td[2]/a");
    By verifyDeliveryDate = By.xpath("//div[@class = 'table-responsive']/table/tbody/tr/td[2]/small[1]");
    By verifyProduct21 = By.xpath("//div[@class = 'table-responsive']/table/tbody/tr/td[3]");
    By verifyTotal = By.xpath("//div[@class = 'table-responsive']/table/tbody/tr/td[6]");


   //Verify the text ‘Desktops’
    public void verifyDesktopText()
    {
        verifyText(driver,verifyDesktop,"Desktops");
    }

    // Select Sort By position "Name: A to Z"
    public void sortByPositionAtoZOrder()
    {
        selectByVisibleTextFromDropDown(sortByPositionAtoZ,"Name (A - Z)");
    }

    // Select product “HP LP3065”
    public void selectProductHPLP3065()
    {
        clickOnElement(productHPLP3065);
    }


    //Verify the Text "HP LP3065"
    public void verifyTextHPLP3065()
    {
        verifyText(driver,verifyProductHPLP3065,"HP LP3065");
    }

    // Select Delivery Date "2022-11-30"
    public void selectDeliveryDate()
    {
        String year = "2022";
        String month = "November";
        String date = "30";

        clickOnElement(deliveryDate);
        while (true) {
            String monthYear = driver.findElement(By.xpath("(//th[@class='picker-switch'])[1]")).getText();
            //System.out.println(monthYear); // November 2022
            String[] a = monthYear.split(" ");
            String mon = a[0];
            String yer = a[1];
            if (mon.equalsIgnoreCase(month) && yer.equalsIgnoreCase(year)) {
                break;
            } else {
                clickOnElement(By.xpath("//div[@class = 'datepicker']/div[1]//th[@class='next']"));

            }
        }
        List<WebElement> allDates = getListOfElements(By.xpath("//div[@class = 'datepicker']/div[1]//tbody/tr/td[@class = 'day']"));

        for (WebElement dt : allDates) {
            if (dt.getText().equalsIgnoreCase(date)) {
                dt.click();
                break;
            }
        }
    }

    //Enter Qty "1” using Select class
    public void enterQty1(){
        clearTextFromField(enterQty);
        sendTextToElement(enterQty,"1");
    }

    // Click on “Add to Cart” button
    public void addToCart()
    {
        clickOnElement(addToCartButton);

    }

    //Verify the Message “Success: You have added HP LP3065 to your shopping cart!”
    public void verifyTextMessageSuccess()
    {
        verifyText(driver,verifyMessageSuccess,"Success: You have added HP LP3065 to your shopping cart!\\n×");
    }

    // Click on link “shopping cart” display into success message
    public void clickOnShoppingCart()
    {
        clickOnElement(clickOnShoppingLink);

    }

    // Verify the text "Shopping Cart"
    public void verifyTextShoppingCart()
    {
        verifyText(driver,verifyTextShoppingCart,"Shopping Cart");
    }

    // Verify the Product name "HP LP3065"
    public void verifyProductHPLP()
    {
        verifyText(driver,verifyHPLP3065,"HP LP3065");

    }

    // Verify the Delivery Date "2022-11-30"
    public void verifyDeliveryDate()
    {
        verifyText(driver,verifyDeliveryDate,"2023-11-30");
    }

    // Verify the Model "Product21"
    public void verifyModelProduct21()
    {
        verifyText(driver,verifyProduct21,"Product 21");
    }

    // Verify the Totat "£74.73"
    public void verifyTotal£74()
    {
        verifyText(driver,verifyProduct21,"£74.73");

    }










}



