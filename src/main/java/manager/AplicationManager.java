package manager;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class AplicationManager {

    private WebDriver driver;

    public Logger logger = LoggerFactory.getLogger(AplicationManager.class);

    public WebDriver getDriver(){
        return driver;
    }

    @BeforeMethod
    public void setUp(){
        logger.info("Start method --> setup" );
        driver = new ChromeDriver();
        driver.manage().window().maximize();
    }

    @AfterMethod
    public void tearDown(){
        logger.info("Start method --> tearDown");
        //   if(driver != null)
        //   driver.quit();
    }
}
