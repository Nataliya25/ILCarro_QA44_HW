package tests;

import manager.AplicationManager;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.HomePage;

import java.util.Random;

public class RegistrationTest extends AplicationManager {

    @Test
    public void registrationPositiveTest(){
        int i = new Random().nextInt(1000);
        String email = "frodo_aggins" + i + "@gmail.com";
        Assert.assertTrue(
        new HomePage(getDriver())
                .clickBtnRegistration()
                .typeRegistrationForm("Nata", "Bez", email, "Anna124!!")
                .clickCheckBox()
                .clickBtnYalla()
                .IsTextInElementPresent_regSuccess());
    }
}
