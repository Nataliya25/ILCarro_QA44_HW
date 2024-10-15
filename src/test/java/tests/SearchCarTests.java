package tests;

import manager.AplicationManager;
import org.testng.annotations.Test;
import pages.HomePage;

public class SearchCarTests extends AplicationManager {

    HomePage homePage;
    @Test
    public void searchCarPositiveTest(){
        homePage = new HomePage(getDriver());
        homePage.fillSearchCarFormCalendar("Haifa", "18 DEC 2024", "22 JUN 2025");
    }
}

