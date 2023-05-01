package com.tutorialsninja.testsuite;

import com.tutorialsninja.pages.ComponentsPage;
import com.tutorialsninja.pages.HomePage;
import com.tutorialsninja.testbase.BaseTest;
import org.testng.annotations.Test;

public class ComponentsTest extends BaseTest
{
    HomePage homePage = new HomePage();
    ComponentsPage componentsPage = new ComponentsPage();

    @Test
    public void verifyUserShouldNavigateToComponentsPageSuccessfully()
    {
        homePage.mouseHooverComponents();
        homePage.showAllComponent();
        componentsPage.verifyComponentsText();
    }


}
