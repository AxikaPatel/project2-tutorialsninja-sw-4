package com.tutorialsninja.testsuite;

import com.tutorialsninja.pages.DeskTopPage;
import com.tutorialsninja.pages.HomePage;
import com.tutorialsninja.testbase.BaseTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class DeskTopTest extends BaseTest
{
    HomePage homePage = new HomePage();
    DeskTopPage deskTopPage = new DeskTopPage();

    @Test
    public void verifyUserShouldNavigateToDesktopsPageSuccessfully()
    {
        homePage.mouseHooverDesktop();
        homePage.showAllDesktop();
        deskTopPage.verifyDesktopText();
    }

    @Test
    public void verifyProductArrangeInAlphaBaticalOrder() {
        homePage.mouseHooverDesktop();
        homePage.showAllDesktop();

        // Select Sort By position "Name: Z to A"
        List<WebElement> beforeFilterNameZtoAList = getListOfElements(By.xpath("//h4"));
        List<String> beforeFileNameZtoAList = new ArrayList<>();
        for (WebElement nameZtoA : beforeFilterNameZtoAList) {
            beforeFileNameZtoAList.add(nameZtoA.getText());
        }
        selectByVisibleTextFromDropDown(By.id("input-sort"),"Name (Z - A)");

        List<WebElement> afterFilterNameZtoAList = driver.findElements(By.xpath("//h4"));
        List<String> afterFileNameZtoAList = new ArrayList<>();
        for (WebElement nameZtoA : afterFilterNameZtoAList) {
            afterFileNameZtoAList.add(nameZtoA.getText());
        }

        // Verify the Product will arrange in Descending order
        Collections.reverse(beforeFileNameZtoAList);
        System.out.println("Before :-" + beforeFileNameZtoAList);
        System.out.println("After :-" + afterFileNameZtoAList);
        Assert.assertEquals(beforeFileNameZtoAList, afterFileNameZtoAList);
    }

    @Test
    public void verifyProductAddedToShoppingCartSuccessFully ()
    {
        homePage.mouseHooverDesktop();
        homePage.showAllDesktop();
        deskTopPage.sortByPositionAtoZOrder();
        deskTopPage.selectProductHPLP3065();
        deskTopPage.verifyTextHPLP3065();
        deskTopPage.selectDeliveryDate();
        deskTopPage.enterQty1();
        deskTopPage.addToCart();
        deskTopPage.verifyTextMessageSuccess();
        deskTopPage.clickOnShoppingCart();
        deskTopPage.verifyTextShoppingCart();
        deskTopPage.verifyProductHPLP();
        deskTopPage.verifyDeliveryDate();
        deskTopPage.verifyModelProduct21();
        deskTopPage.verifyTotal£74();
    }

}
