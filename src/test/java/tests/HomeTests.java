package tests;

import manager.AplicationManager;
import org.testng.annotations.Test;
import pages.HomePage;

public class HomeTests extends AplicationManager {

    @Test
    public void firstTest () {
        HomePage homePage = new HomePage(getDriver());
    }
}
