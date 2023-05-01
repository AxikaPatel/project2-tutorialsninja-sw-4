package com.tutorialsninja.pages;

import com.tutorialsninja.utilities.Utilities;
import org.openqa.selenium.By;

public class LaptopAndNoteBookCheckOutPage extends Utilities
{
    By clickOnGuestCheckOut = By.xpath("//label[normalize-space()='Guest Checkout']");
    By continueTab = By.xpath("//input[@id='button-account']");
    By firstNameField = By.xpath("//input[@id='input-payment-firstname']");
    By lastNameField = By.xpath("//input[@id='input-payment-lastname']");
    By emailField = By.xpath("//input[@id='input-payment-email']");
    By passwordField = By.xpath("//input[@id='input-payment-telephone']");
    By addressField = By.xpath("//input[@id='input-payment-address-1']");
    By cityField = By.xpath("//input[@id='input-payment-city']");
    By postcodeField = By.xpath("//input[@id='input-payment-postcode']");
    By countryField = By.xpath("//select[@id='input-payment-country']");
    By regionField = By.xpath("//select[@name='zone_id']");
    By continueButton = By.xpath("//input[@id='button-account']");
    By comments = By.xpath("//body/div[@id='checkout-checkout']/div[1]/div[1]/div[1]/div[3]/div[2]/div[1]/p[2]/textarea[1]");
    By checkBox = By.xpath("//input[@name='agree']");
    By continueBtn = By.xpath("//input[@id='button-payment-method']");
    By checkoutText = By.xpath("//h1[contains(text(),'Checkout')]");
    By newCustomerText = By.xpath("//h2[contains(text(),'New Customer')]");
    By warningMessage = By.xpath("//body/div[@id='checkout-checkout']/div[1]/div[1]/div[1]/div[3]/div[2]/div[1]/div[1]");
    By guestButton = By.xpath("//input[@id='button-guest']");

    // Click on “Guest Checkout” radio button
    public void clickOnGuestOutRadioButton()
    {
        clickOnElement(clickOnGuestCheckOut);
    }

    //Click on “Continue” tab
    public void clickOnContinueTab() {
        clickOnElement(continueTab);
    }

    //Fill the mandatory fields, enter email into email field
    public void enterFirstName(String firstName) {
        sendTextToElement(firstNameField, firstName);
    }

    public void enterLastName(String lastName) {
        sendTextToElement(lastNameField, lastName);
    }

    public void enterEmail(String email) {
        sendTextToElement(emailField, email);
    }

    public void enterPassword(String password) {
        sendTextToElement(passwordField, password);
    }

    public void enterAddress(String address) {
        sendTextToElement(addressField, address);
    }

    public void enterCity(String city) {
        sendTextToElement(cityField, city);
    }

    public void enterPostcode(String postcode) {
        sendTextToElement(postcodeField, postcode);
    }

    public void sortByDropDownCountry(String country) {
        selectByVisibleTextFromDropDown(countryField, country);
    }

    public void sortByDropDownRegion(String region) {
        selectByVisibleTextFromDropDown(regionField, region);
    }

    //Click on “Continue” Button
    public void clickOnContinueButton()  {
        clickOnElement(continueButton);
    }
    //Add Comments About your order into text area
    public void enterComments()  {
        sendTextToElement(comments, "Hi I am Prime Testing");
    }
    //Check the Terms & Conditions check box
    public void clickOnCheckBox() {
        clickOnElement(checkBox);
    }
    //Click on “Continue” button
    public void clickOnContinue() {
        clickOnElement(continueBtn);
    }
    public String checkoutText(){
        return getTextFromElement(checkoutText);
    }
    public String newCustomerText(){
        return getTextFromElement(newCustomerText);
    }
    public String warningMessageText(){
        return getTextFromElement(warningMessage);
    }
    public void clickOnGuestContinueButton(){
        clickOnElement(guestButton);
    }

    public void verifyMessageWarning()
    {
        verifyText(driver,warningMessage,"Warning: No Payment options are available. Please contact us for assistance!");
    }
}
