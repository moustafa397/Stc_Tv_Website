package tests;

import Pages.BahrainPage;
import Pages.KuwaitPage;
import Pages.PageBase;
import Pages.SaudiPage;
import org.testng.Assert;
import org.testng.annotations.Test;
import static org.testng.Assert.assertEquals;

public class PackageArTest extends TestBase{

    SaudiPage saudi;
    BahrainPage bahrain;
    KuwaitPage kuwait;






    @Test
    public void validateSaudiPackages(){
        saudi = new SaudiPage(driver);
        saudi.setCountrySaudi();

        assertEquals(saudi.getLitePrice(),"15","Lite price not correct");
        Assert.assertTrue(saudi.getLiteCurrency().contains("ريال سعودي"),"Lite currency not correct");

        assertEquals(saudi.getBasicPrice(),"25","Basic price not correct");
        Assert.assertTrue(saudi.getBasicCurrency().contains("ريال سعودي"),"Basic currency not correct");

        assertEquals(saudi.getPremiumPrice(),"60","Premium price not correct");
        Assert.assertTrue(saudi.getPremiumCurrency().contains("ريال سعودي"),"Premium currency not correct");


    }

    @Test
    public void validateBahrainPackages(){
        kuwait = new KuwaitPage(driver);
        kuwait.setCountryKuwait();

        assertEquals(kuwait.getLitePrice(),"1.2","Lite price not correct");
        Assert.assertTrue(kuwait.getLiteCurrency().contains("دينار كويتي"),"Lite currency not correct");

        assertEquals(kuwait.getBasicPrice(),"2.5","Basic price not correct");
        Assert.assertTrue(kuwait.getBasicCurrency().contains("دينار كويتي"),"Basic currency not correct");

        assertEquals(kuwait.getPremiumPrice(),"4.8","Premium price not correct");
        Assert.assertTrue(kuwait.getPremiumCurrency().contains("دينار كويتي"),"Premium currency not correct");


    }

    @Test
    public void validateKuwaitPackages(){
        bahrain = new BahrainPage(driver);
        bahrain.setCountryBahrain();

        assertEquals(bahrain.getLitePrice(),"2","Lite price not correct");
        Assert.assertTrue(bahrain.getLiteCurrency().contains("دينار بحريني"),"Lite currency not correct");

        assertEquals(bahrain.getBasicPrice(),"3","Basic price not correct");
        Assert.assertTrue(bahrain.getBasicCurrency().contains("دينار بحريني"),"Basic currency not correct");

        assertEquals(bahrain.getPremiumPrice(),"6","Premium price not correct");
        Assert.assertTrue(bahrain.getPremiumCurrency().contains("دينار بحريني"),"Premium currency not correct");


    }

}
