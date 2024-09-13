package tests;

import manager.AplicationManager;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.HomePage;

public class LoginTest extends AplicationManager {

    @Test
    public void loginPositiveTest() {
        Assert.assertTrue(new HomePage(getDriver())
            .clickBtnLogin()
            .typeLoginForm("bnataliya13@gmail.com", "Marta123!")
            .clickBtnYalla()
            .isTextInElementPresent_LoginSuccess())
            ;
        }
}
