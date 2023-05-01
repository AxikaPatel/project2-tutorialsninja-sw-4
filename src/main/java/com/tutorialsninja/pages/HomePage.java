package com.tutorialsninja.pages;

import com.tutorialsninja.utilities.Utilities;
import org.openqa.selenium.By;

public class HomePage extends Utilities
{

    //======================DESKTOP==============================

    By desktop = By.xpath("//a[normalize-space()='Desktops']");
    By showAllDesktops = By.xpath("//a[contains(text(),'Show AllDesktops')]");

    // Mouse hover on “Desktops” Tab and click
    public void mouseHooverDesktop()
    {
        mouseHoverToElementAndClick(desktop);
    }

    //Mouse hover on  “Show All Desktops”
    public void showAllDesktop()
    {
        mouseHoverToElementAndClick(showAllDesktops);
    }


    //========================LAPTOPANDNOTBOOK======================

    By laptopAndNoteBook = By.xpath("//a[normalize-space()='Laptops & Notebooks']");
    By showAllLaptop = By.xpath("//a[contains(text(),'Show AllLaptops & Notebooks')]");

    // Mouse hover on “Laptops & Notebooks” Tab and click
    public void mouseHooverLaptop()
    {
        mouseHoverToElementAndClick(laptopAndNoteBook);
    }

    // Mouse hover on “Show All Laptops & Notebooks”
    public void showAllLaptop()
    {
        mouseHoverToElementAndClick(showAllLaptop);
    }

    //================COMPONENTS===========================

    By componets = By.xpath("//a[normalize-space()='Components']");
    By showAllComponents = By.xpath("//a[contains(text(),'Show AllComponents')]");

    // Mouse hover on “Components” Tab and click
    public void mouseHooverComponents()
    {
        mouseHoverToElementAndClick(componets);
    }

    // Mouse hover on  “Show All Components”
    public void showAllComponent()
    {
        mouseHoverToElementAndClick(showAllComponents);
    }

    //========MyAccountLink===============================

    By myAccount = By.xpath("//span[normalize-space()='My Account']");
    By loginLink = By.linkText("Login");
    By registerLink = By.linkText("Register");

    public void clickOnMyAccount(){
        clickOnElement(myAccount);
    }


    public void clickOnLoginLink(){
        clickOnElement(loginLink);
    }

    //
    public void registerLink(){
        clickOnElement(registerLink);
    }



}
