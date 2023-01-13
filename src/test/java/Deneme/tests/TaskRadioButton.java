package Deneme.tests;

import Deneme.pages.TaskRadioPage;
import Deneme.utilities.Driver;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class TaskRadioButton  {
    // Go to URL:  https://www.facebook.com/
    // Click on Create an Account button.
    //  Then click on the radio buttons.
    // Click 'Kadın'
    // Click 'Erkek'

    @Test
    public void test() {
        WebDriver driver = Driver.getDriver();
        driver.get("https://www.facebook.com/");
       TaskRadioPage taskRadioPage = new TaskRadioPage();
        taskRadioPage.hesapOlustur.click();
        taskRadioPage.name.sendKeys("ali");
        taskRadioPage.lastname.sendKeys("veli");
        String email = "aliveli@4950.com";
        taskRadioPage.email.sendKeys(email);
        taskRadioPage.emailAgain.sendKeys(email);
        taskRadioPage.password.sendKeys("123456789");
        taskRadioPage.secim(taskRadioPage.dayText,"16");
        taskRadioPage.secim(taskRadioPage.monthText,"3");
        taskRadioPage.secim(taskRadioPage.yearText,"2000");
        taskRadioPage.kadin.click();
        taskRadioPage.erkek.click();
        taskRadioPage.kaydol.click();
        driver.close();









    }
}
