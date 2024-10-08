package pages;

import dto.UserDTO;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.AjaxElementLocatorFactory;

public class LoginPage extends BasePage {

    public LoginPage (WebDriver driver){
        setDriver(driver);
        PageFactory.initElements(new AjaxElementLocatorFactory
                (driver, 10), this);
    }


    @FindBy(id = "email")
    WebElement inputEmail;

    @FindBy(id = "password")
    WebElement inputPassword;

    @FindBy(xpath = "//button[@type='submit']")
    WebElement btnYalla;

    @FindBy(xpath = "//h2[@class='message']")
    WebElement textPopUp_LoginSuccess;

    @FindBy(xpath = "//h1[@class='title']")
    WebElement textPopUp_LoginFailed;

    @FindBy(xpath = "//input[@id='email']/..//div[@class='error']/div")
    WebElement errorMessageInputEmail;

    public LoginPage typeLoginForm (String email, String password){
        inputEmail.sendKeys(email);
        inputPassword.sendKeys(password);
        return this;
    }

    public LoginPage typeLoginForm (UserDTO user){
        inputEmail.sendKeys(user.getEmail());
        inputPassword.sendKeys(user.getPassword());
        return this;
    }

    public LoginPage clickBtnYalla() {
       // pause(5);
       // btnYalla.click();
        clickWait(btnYalla, 3);
        return this;
    }
    public boolean isTextInElementPresent_LoginSuccess(){
        return isTextInElementPresent(textPopUp_LoginSuccess, "Logged in success");
    }

    public boolean isTextInElementPresent_LoginFailed(){
        return isTextInElementPresent(textPopUp_LoginFailed, "Login failed");
    }

    public boolean isTextInElementPresent_ErrorEmail(String text){
        return isTextInElementPresent(errorMessageInputEmail, text);
    }
}
