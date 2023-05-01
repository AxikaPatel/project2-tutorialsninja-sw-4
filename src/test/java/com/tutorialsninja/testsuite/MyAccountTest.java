package com.tutorialsninja.testsuite;

import com.tutorialsninja.pages.HomePage;
import com.tutorialsninja.pages.MyAccountPage;
import com.tutorialsninja.pages.MyAccountRegisterPage;
import com.tutorialsninja.testbase.BaseTest;
import org.testng.annotations.Test;

public class MyAccountTest extends BaseTest
{
    HomePage homePage = new HomePage();
    MyAccountPage myAccountPage = new MyAccountPage();
    MyAccountRegisterPage myAccountRegisterPage = new MyAccountRegisterPage();

    @Test
    public void verifyUserShouldNavigateToRegisterPageSuccessfully()
    {
        homePage.clickOnMyAccount();
        selectMyAccountOptions("Register");
        myAccountPage.verifyTextRegisterAccount();
    }

    @Test
    public void  verifyUserShouldNavigateToLoginPageSuccessfully()
    {
        homePage.clickOnMyAccount();
        selectMyAccountOptions("Login");
        myAccountPage.verifyTextReturningCustomer();
    }

    @Test
    public  void verifyThatUserRegisterAccountSuccessfully()
    {
        homePage.clickOnMyAccount();
        selectMyAccountOptions("Register");
        myAccountRegisterPage.typeFirstName();

        myAccountRegisterPage.typeLastName();

        myAccountRegisterPage.typeEmail();
        myAccountRegisterPage.typeTelephone();
        myAccountRegisterPage.typePassword();

        myAccountRegisterPage.typeConfirmPassword();
        myAccountRegisterPage.clickSubscribe();
        myAccountRegisterPage.clickOnPrivacy();
        myAccountRegisterPage.clickOnContinue();
         myAccountRegisterPage.verifyMessageAccountCreated();
         myAccountRegisterPage.clickOnContinue2();
         homePage.clickOnMyAccount();
         selectMyAccountOptions("Logout");
         myAccountRegisterPage.verifyAccountLogout();
    }

    @Test
    public void  verifyThatUserShouldLoginAndLogoutSuccessfully()
    {
            homePage.clickOnMyAccount();
            selectMyAccountOptions("Login");
            myAccountRegisterPage.typeEmail();
            myAccountRegisterPage.typePassword();
            myAccountRegisterPage.clickOnLoginButton();
            myAccountPage.verifyMyAccount();

            homePage.clickOnMyAccount();
            selectMyAccountOptions("Logout");
            myAccountPage.verifyAccountLogout();

    }



}
