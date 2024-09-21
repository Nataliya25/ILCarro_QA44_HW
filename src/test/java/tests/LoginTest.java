package tests;

import dto.UserDTO;
import manager.AplicationManager;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.HomePage;
import pages.LoginPage;
import utils.HeaderMenuItem;

import static pages.BasePage.clickButtonsOnHeader;
import static utils.RandomUtils.*;
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
        public void loginNegativeTest_wrongEmailWOAt() {
            UserDTO user = new UserDTO(generateString(5),generateString(4),
                    generateString(10), "Rana555!");
            Assert.assertTrue(new HomePage(getDriver())
                    .clickBtnLogin()
                    .typeLoginForm(user)
                    .clickBtnYalla()
                    .isTextInElementPresent_ErrorEmail("It'snot look like email")
            );
            ;
        }

    @Test
    public void loginNegativeTest_wrongEmailWOAt_Enum() {
        UserDTO user = new UserDTO(generateString(5), generateString(7),
                generateString(10), "Qwerty123!");
        new HomePage(getDriver());
        LoginPage loginPage = clickButtonsOnHeader(HeaderMenuItem.LOGIN);
        loginPage.typeLoginForm(user)
                .clickBtnYalla()
                .isTextInElementPresent_ErrorEmail("It'snot look like email")
        ;
    }


    //HW
    //  @Test
    // public void loginNegativeTest_wrongEmail() {
    //    int i = new Random().nextInt(1000);
    //   String email =  i + "@gmail.com";

    //  Assert.assertTrue(new HomePage(getDriver())
    //         .clickBtnLogin()
    //          .typeLoginForm(email, "Marta123!")
    //          .clickBtnYalla()
    //          .isTextInElementPresent_LoginFailed())
    //  ;
    //}
}
