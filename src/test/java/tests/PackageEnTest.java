package tests;

import Pages.BahrainPage;
import Pages.KuwaitPage;
import Pages.PageBase;
import Pages.SaudiPage;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class PackageEnTest extends TestBase{

    SaudiPage saudi;
    BahrainPage bahrain;
    KuwaitPage kuwait;
    PageBase home;

    @BeforeClass
    public void goToEnglish(){
        home = new PageBase(driver);
        home.EnglishPage();
    }

    @Test
    public void validateSaudiPackages(){
        saudi = new SaudiPage(driver);
        saudi.setCountrySaudi();

        assertEquals(saudi.getLitePrice(),"15","Lite price not correct");
        Assert.assertTrue(saudi.getLiteCurrency().contains("SAR"),"Lite currency not correct");

        assertEquals(saudi.getBasicPrice(),"25","Basic price not correct");
        Assert.assertTrue(saudi.getBasicCurrency().contains("SAR"),"Basic currency not correct");

        assertEquals(saudi.getPremiumPrice(),"60","Premium price not correct");
        Assert.assertTrue(saudi.getPremiumCurrency().contains("SAR"),"Premium currency not correct");


    }

    @Test
    public void validateBahrainPackages(){
        kuwait = new KuwaitPage(driver);
        kuwait.setCountryKuwait();

        assertEquals(kuwait.getLitePrice(),"1.2","Lite price not correct");
        Assert.assertTrue(kuwait.getLiteCurrency().contains("KWD"),"Lite currency not correct");

        assertEquals(kuwait.getBasicPrice(),"2.5","Basic price not correct");
        Assert.assertTrue(kuwait.getBasicCurrency().contains("KWD"),"Basic currency not correct");

        assertEquals(kuwait.getPremiumPrice(),"4.8","Premium price not correct");
        Assert.assertTrue(kuwait.getPremiumCurrency().contains("KWD"),"Premium currency not correct");


    }

    @Test
    public void validateKuwaitPackages(){
        bahrain = new BahrainPage(driver);
        bahrain.setCountryBahrain();

        assertEquals(bahrain.getLitePrice(),"2","Lite price not correct");
        Assert.assertTrue(bahrain.getLiteCurrency().contains("BHD"),"Lite currency not correct");

        assertEquals(bahrain.getBasicPrice(),"3","Basic price not correct");
        Assert.assertTrue(bahrain.getBasicCurrency().contains("BHD"),"Basic currency not correct");

        assertEquals(bahrain.getPremiumPrice(),"6","Premium price not correct");
        Assert.assertTrue(bahrain.getPremiumCurrency().contains("BHD"),"Premium currency not correct");


    }

}
