package tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.*;

import java.util.concurrent.TimeUnit;

public class TestBase {

    public static WebDriver driver;


    @BeforeSuite
    @Parameters({"browser"})
    public void setUp(@Optional("chrome") String browserName){
        if (browserName.equalsIgnoreCase("chrome") ) {

            driver = new ChromeDriver();
        } else if (browserName.equalsIgnoreCase("firefox")) {
            driver = new FirefoxDriver();

        }
        else if (browserName.equalsIgnoreCase("edge")) {
            driver = new EdgeDriver();

        }

        driver.manage().window().maximize();
        driver.get("https://subscribe.stctv.com/sa-ar");


    }


    @AfterSuite
    public void tearDown(){
        driver.quit();
    }

}
