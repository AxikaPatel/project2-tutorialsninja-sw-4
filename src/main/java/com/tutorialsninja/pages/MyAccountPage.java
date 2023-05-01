package com.tutorialsninja.pages;

import com.tutorialsninja.utilities.Utilities;
import org.openqa.selenium.By;

public class MyAccountPage extends Utilities
{
    By verifyTextRegisterAccount = By.xpath("//h1[contains(text(),'Register Account')]");
    By verifyTextReturningCustomer = By.xpath("//h2[contains(text(),'Returning Customer')]");
    By verifyMyAccount = By.xpath("//h2[contains(text(),'My Account')]");
    By verifyAccountLogOut  = By.xpath("//h1[contains(text(),'Account Logout')]");

    // Verify the text “Register Account”.
    public void verifyTextRegisterAccount()
    {
        verifyText(driver,verifyTextRegisterAccount,"Register Account");
    }

    public void verifyTextReturningCustomer()
    {
        verifyText(driver,verifyTextReturningCustomer,"Returning Customer");
    }

    public void verifyMyAccount()
    {
        verifyText(driver,verifyMyAccount,"My Account");
    }

    public void verifyAccountLogout()
    {
        verifyText(driver,verifyAccountLogOut,"//h1[contains(text(),'Account Logout')]");
    }




}
