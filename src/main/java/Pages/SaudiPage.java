package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SaudiPage extends PageBase{

    private By saudi = By.id("sa");

    public SaudiPage(WebDriver driver) {
        super(driver);
    }
    public void setCountrySaudi(){

        driver.findElement(countryChoice).click();
        driver.findElement(saudi).click();

    }

    public String getLitePrice(){
        return driver.findElement(litePrice).getText();
    }

    public String getLiteCurrency(){
        return driver.findElement(liteCurrency).getText();
    }

    public String getBasicPrice(){
        return driver.findElement(basicPrice).getText();
    }

    public String getBasicCurrency(){
        return driver.findElement(basicCurrency).getText();
    }

    public String getPremiumPrice(){
        return driver.findElement(premiumPrice).getText();
    }

    public String getPremiumCurrency(){
        return driver.findElement(premiumCurrency).getText();
    }

}
