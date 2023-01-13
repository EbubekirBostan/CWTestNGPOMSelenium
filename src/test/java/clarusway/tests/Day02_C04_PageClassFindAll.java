package clarusway.tests;

import clarusway.pages.SauceDemoLoginPage;
import clarusway.utilities.Driver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Day02_C04_PageClassFindAll {
    @Test
    public void test() {
        Driver.getDriver().get("https://www.saucedemo.com/");
        SauceDemoLoginPage loginPage = new SauceDemoLoginPage();
        Assert.assertEquals(3,loginPage.inputElements.size());
        Driver.closeDriver();
    }
}
