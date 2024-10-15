package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.AjaxElementLocatorFactory;

public class HomePage extends BasePage{

    public HomePage (WebDriver driver){
        setDriver(driver);
        driver.get("https://ilcarro.web.app/search");
        PageFactory.initElements(new AjaxElementLocatorFactory
                (driver, 10), this);
    }

    @FindBy(xpath = "//a[text()=' Log in ']")
    WebElement btnLogin;

    @FindBy(xpath = "//a[text()=' Sign up ']")
    WebElement btnSingUp;

    @FindBy(id = "city")
    WebElement inputCity;

    @FindBy(id = "dates")
    WebElement inputDates;

    @FindBy(xpath = "//button[@aria-label='Choose month and year']")
    WebElement btnChooseMonthYear;

    public LoginPage clickBtnLogin() {
        btnLogin.click();
        return new LoginPage(driver);
    }

    public RegistrationPage clickBtnRegistration() {
        btnSingUp.click();
        return new RegistrationPage(driver);
    }

    public void fillSearchCarFormCalendar(String city, String startDate, String endDate){
        fillInputCity(city);
        fillInputDateCalendar(startDate, endDate);

    }

    public void fillInputCity(String city){
        inputCity.click();
        inputCity.sendKeys(city);
        Actions actions = new Actions(driver);
        actions.moveToElement(inputCity,0,40).pause(3000).click().perform();
    };
    public void fillInputDateCalendar(String startDate, String endDate){
        inputDates.click();
        String[] startDateArray = startDate.split(" ");
        String[] endDateArray = endDate.split(" ");
        typeYearMonthDay(startDateArray[2],startDateArray[1],startDateArray[0]);
        typeYearMonthDay(endDateArray[2],endDateArray[1],endDateArray[0]);
    }

    public void typeYearMonthDay(String year,String month, String day){
        btnChooseMonthYear.click();
        driver.findElement(By.xpath("//div[contains(text(),'" + year + "')]")).click();
        driver.findElement(By.xpath("//div[contains(text(),'" + month.toUpperCase() + "')]")).click();
        driver.findElement(By.xpath("//div[contains(text(),'" + day + "')]")).click();
    };
}
