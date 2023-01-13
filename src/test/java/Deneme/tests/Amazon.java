package Deneme.tests;

import Deneme.pages.AmazonPage;
import Deneme.utilities.ConfigReader;
import Deneme.utilities.Driver;
import org.openqa.selenium.Keys;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Amazon {
    @Test
    public void testAmazon() {
        Driver.getDriver().get(ConfigReader.getProperty("amazon_url"));
        AmazonPage amazonElements = new AmazonPage();
        amazonElements.aramaKutusu.sendKeys("fairy"+ Keys.ENTER);
        Assert.assertTrue(amazonElements.aramaSonucu.getText().contains("fairy"));
        Driver.closeDriver();
    }

    @Test
    public void testName() {
        Driver.getDriver().get(ConfigReader.getProperty("amazon_url"));
        AmazonPage amazonElements = new AmazonPage();
        amazonElements.aramaKutusu.sendKeys("laptop"+Keys.ENTER);
        Assert.assertTrue(amazonElements.aramaSonucu.getText().toLowerCase().contains("laptop"));
        Driver.closeDriver();
    }

}
