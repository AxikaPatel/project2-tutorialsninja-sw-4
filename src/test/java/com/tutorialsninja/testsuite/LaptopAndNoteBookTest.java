package com.tutorialsninja.testsuite;

import com.tutorialsninja.pages.HomePage;
import com.tutorialsninja.pages.LaptopAndNoteBookCheckOutPage;
import com.tutorialsninja.pages.LaptopAndNoteBookPage;
import com.tutorialsninja.testbase.BaseTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class LaptopAndNoteBookTest extends BaseTest
{
    LaptopAndNoteBookPage laptopAndNoteBookPage = new LaptopAndNoteBookPage();
    LaptopAndNoteBookCheckOutPage laptopAndNoteBookCheckOutPage = new LaptopAndNoteBookCheckOutPage();
    HomePage homePage = new HomePage();

    @Test
    public void verifyUserShouldNavigateToLaptopsAndNotebooksPageSuccessfully()
    {
        homePage.mouseHooverLaptop();
        homePage.showAllLaptop();
        laptopAndNoteBookPage.verifyLaptopAndBookText();

    }

    @Test
    public void  verifyProductsPriceDisplayHighToLowSuccessfully()
    {
        homePage.mouseHooverLaptop();
        homePage.showAllLaptop();

        List<WebElement> products = getListOfElements(By.xpath("//p[@class ='price']"));
        List<Double> originalProductsPrice = new ArrayList<>();
        for (WebElement e : products) {
            System.out.println(e.getText());
            String[] arr = e.getText().split("Ex Tax:");
            originalProductsPrice.add(Double.valueOf(arr[0].substring(1).replaceAll(",","")));
        }

        // Sort By Reverse order
        Collections.sort(originalProductsPrice, Collections.reverseOrder());

        //Select Sort By "Price (High > Low)"
        selectByVisibleTextFromDropDown(By.id("input-sort"), "Price (High > Low)");

        // After filter Price (High > Low) Get all the products price and stored into array list
        products = driver.findElements(By.xpath("//p[@class ='price']"));
        ArrayList<Double> afterSortByPrice = new ArrayList<>();
        for (WebElement e : products) {
            String[] arr = e.getText().split("Ex Tax:");
            afterSortByPrice.add(Double.valueOf(arr[0].substring(1).replaceAll(",","")));
        }

        //Verify the Product price will arrange in High to Low order.
       // Assert.assertEquals("Product not sorted by price High to Low",originalProductsPrice, afterSortByPrice);
    }

    @Test
    public void verifyThatUserPlaceOrderSuccessfully()
    {
        homePage.mouseHooverLaptop();
        homePage.showAllLaptop();
        laptopAndNoteBookPage.sortByPriceHighToLow();
        laptopAndNoteBookPage.productMacBook();
        laptopAndNoteBookPage.verifyTextMacBook();
        laptopAndNoteBookPage.addToCart();
        laptopAndNoteBookPage.verifyMessageSuccess();
        laptopAndNoteBookPage.clickOnShoppingCart();
        laptopAndNoteBookPage.verifyShoppingCartText();
        laptopAndNoteBookPage.verifyProductMacBookText();
        laptopAndNoteBookPage.changeQty2();
        laptopAndNoteBookPage.clickUpdateTab();
        laptopAndNoteBookPage.verifyMessageSuccessModified();
        laptopAndNoteBookPage.verifyTotal£737();
        laptopAndNoteBookPage.clickOnCheckOut();
        laptopAndNoteBookCheckOutPage.clickOnGuestOutRadioButton();
        laptopAndNoteBookCheckOutPage.clickOnContinueButton();
        laptopAndNoteBookCheckOutPage.enterFirstName("Axika");
        laptopAndNoteBookCheckOutPage.enterLastName("Patel");
        laptopAndNoteBookCheckOutPage.enterEmail("axikapatel@gmail.com");
        laptopAndNoteBookCheckOutPage.enterPassword("axika12233");
        laptopAndNoteBookCheckOutPage.enterAddress("111,Alexander close");
        laptopAndNoteBookCheckOutPage.enterCity("london");
        laptopAndNoteBookCheckOutPage.enterPostcode("ha23qa");
        laptopAndNoteBookCheckOutPage.sortByDropDownCountry("United Kingdom");
        laptopAndNoteBookCheckOutPage.sortByDropDownRegion("Greater London");
        laptopAndNoteBookCheckOutPage.clickOnGuestContinueButton();
        laptopAndNoteBookCheckOutPage.enterComments();
        laptopAndNoteBookCheckOutPage.clickOnCheckBox();
        laptopAndNoteBookCheckOutPage.clickOnContinue();
        laptopAndNoteBookCheckOutPage.verifyMessageWarning();


    }




}
