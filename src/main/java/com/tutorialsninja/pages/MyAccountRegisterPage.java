package com.tutorialsninja.pages;

import com.tutorialsninja.utilities.Utilities;
import org.openqa.selenium.By;

public class MyAccountRegisterPage extends Utilities
{
    By firstName = By.id("input-firstname");
    By lastName = By.id("input-lastname");
    By email = By.id("input-email");
    By telephone = By.id("input-telephone");
    By password = By.id("input-password");
    By passwordConfirm = By.id("input-confirm");
    By subscribe = By.xpath("//label[normalize-space()='Yes']");
    By privacyPolicy = By.xpath("//input[@name='agree']");
    By continueButton = By.xpath("//input[@value='Continue']");
    By yourAccountCreatedText = By.xpath("//h1[contains(text(),'Your Account Has Been Created!')]");
    By continueButton2 = By.xpath("//a[contains(text(),'Continue')]");
    By logoutText = By.xpath("//h1[normalize-space()='Account Logout']");
    By login = By.xpath("//input[@value='Login']");
    By verifyAccountLogOut = By.xpath("//h1[normalize-space()='Account Logout']");






    public void typeFirstName() {
        sendTextToElement(firstName, "Prime");
    }
    public void typeLastName() {
        sendTextToElement(lastName, "Testing");
    }
    public void typeEmail() {
        sendTextToElement(email, "prime323@gmail.com");
    }
    public void typeTelephone(){
        sendTextToElement(telephone,"01547895656");
    }
    public void typePassword() {
        sendTextToElement(password, "Prime123");
    }
    public void typeConfirmPassword(){
        sendTextToElement(passwordConfirm,"Prime123");
    }
    public void clickSubscribe(){
        clickOnElement(subscribe);
    }
    public void clickOnPrivacy(){
        clickOnElement(privacyPolicy);
    }
    public void clickOnContinue(){
        clickOnElement(continueButton);
    }

    // Verify the message “Your Account Has Been Created!”
    public void verifyMessageAccountCreated()
    {
        verifyText(driver,yourAccountCreatedText, "Your Account Has Been Created!");
    }

    public void clickOnContinue2(){
        clickOnElement(continueButton2);
    }
    public By getYourAccountCreatedText(){
        getTextFromElement(yourAccountCreatedText);
        return null;
    }
    public By getLogoutText(){
        getTextFromElement(logoutText);
        return null;
    }
    public void clickOnLoginButton(){
        clickOnElement(login);
    }
    public void verifyAccountLogout()
    {
        verifyText(driver,verifyAccountLogOut,"Account Logout");
    }


}
