package pages;

import dto.AutoDTOLombok;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.AjaxElementLocatorFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class LetTheCarWorkPage extends BasePage {

    public LetTheCarWorkPage(WebDriver driver) {
        setDriver(driver);
        PageFactory.initElements(new AjaxElementLocatorFactory
                (driver, 10), this);
    }

    @FindBy(id = "pickUpPlace")
    WebElement inputLocation;
    @FindBy(id = "make")
    WebElement inputManufacture;
    @FindBy(id = "model")
    WebElement inputModel;
    @FindBy(id = "year")
    WebElement inputYear;
    @FindBy(id = "fuel")
    WebElement inputFuel;
    @FindBy(id = "seats")
    WebElement inputSeats;
    @FindBy(id = "class")
    WebElement inputCarClass;
    @FindBy(id = "serialNumber")
    WebElement inputSerialNumber;
    @FindBy(id = "price")
    WebElement inputPrice;
    @FindBy(id = "about")
    WebElement inputAbout;

    public void typeAddNewCarForm(AutoDTOLombok auto) {

        inputLocation.sendKeys(auto.getCity());
        inputManufacture.sendKeys(auto.getManufacture());
        inputModel.sendKeys(auto.getModel());
        inputYear.sendKeys(auto.getYear());
        inputFuel.sendKeys(auto.getFuel());
        inputSeats.sendKeys(auto.);
        inputClass.sendKeys(auto.);
        inputRegNum.sendKeys(auto.);
        inputPrice.sendKeys(auto.);

        pause(2);
        driver.findElement(By.xpath("//div[@class='pac-item']")).click();
    }
}






