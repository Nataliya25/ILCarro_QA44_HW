package tests;

import manager.AplicationManager;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.HomePage;

import java.util.Random;

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

        @Test
        public void loginNegativeTest_wrongEmail() {
            int i = new Random().nextInt(1000);
            String email =  i + "@gmail.com";

            Assert.assertTrue(new HomePage(getDriver())
                    .clickBtnLogin()
                    .typeLoginForm(email, "Marta123!")
                    .clickBtnYalla()
                    .isTextInElementPresent_LoginFailed())
            ;
        }
}
