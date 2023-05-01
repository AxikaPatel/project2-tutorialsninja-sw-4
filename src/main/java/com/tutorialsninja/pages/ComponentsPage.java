package com.tutorialsninja.pages;

import com.tutorialsninja.utilities.Utilities;
import org.openqa.selenium.By;

public class ComponentsPage extends Utilities
{

    By verifyComponents = By.xpath("//h2[contains(text(),'Components')]");

    // Verify the text ‘Laptops & Notebooks’
    public void verifyComponentsText()
    {
        verifyText(driver,verifyComponents,"Components");
    }


}
