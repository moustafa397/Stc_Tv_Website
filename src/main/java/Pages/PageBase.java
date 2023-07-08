package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class PageBase {

    protected WebDriver driver;

    protected By countryChoice = By.className("country-current");
    protected By litePrice = By.cssSelector("div#currency-لايت > b,div#currency-lite > b");
    protected By liteCurrency = By.cssSelector("div#currency-لايت > i,div#currency-lite > i");
    protected By basicPrice = By.cssSelector("div#currency-الأساسية > b,div#currency-classic > b");
    protected By basicCurrency = By.cssSelector("div#currency-الأساسية > i,div#currency-classic > i");

    protected By premiumPrice = By.cssSelector("div#currency-بريميوم > b,div#currency-premium > b");
    protected By premiumCurrency = By.cssSelector("div#currency-بريميوم > i,div#currency-premium > i");
    protected By englishButton = By.id("translation-btn");

    public PageBase (WebDriver driver){
       this.driver = driver;
    }

    public void EnglishPage(){

        driver.findElement(englishButton).click();
    }

}
