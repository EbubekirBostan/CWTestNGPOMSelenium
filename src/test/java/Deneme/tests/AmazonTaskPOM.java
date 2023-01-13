package Deneme.tests;

import Deneme.pages.*;
import Deneme.utilities.Driver;
import org.testng.Assert;
import org.testng.annotations.Test;
        /*

        Amazon Senaryosu
        o https://www.amazon.com.tr/ sitesi açılır.
        o Ana sayfanın açıldığı kontrol edilir.
        o  Çerez tercihlerinden Çerezleri kabul et seçilir.
        o  Siteye login olunur.
        o Login işlemi kontrol edilir.
        o Arama butonu yanındaki kategoriler tabından bilgisayar seçilir.
        o Bilgisayar kategorisi seçildiği kontrol edilir.
        o Arama alanına MSI yazılır ve arama yapılır.
        o Arama yapıldığı kontrol edilir.
        o Arama sonuçları sayfasından 2. sayfa açılır.
        o 2. sayfanın açıldığı kontrol edilir.
        o Sayfadaki 2. ürün favorilere eklenir.
        o 2. Ürünün favorilere eklendiği kontrol edilir.
        o Hesabım > Favori Listem sayfasına gidilir.
        o “Favori Listem” sayfası açıldığı kontrol edilir.
        o Eklenen ürün favorilerden silinir.
        o Silme işleminin gerçekleştiği kontrol edilir.
        o Üye çıkış işlemi yapılır.
        o Çıkış işleminin yapıldığı kontrol edilir.

         */

public class AmazonTaskPOM {
    @Test
    public void testName() {
        Driver.getDriver().get("https://www.amazon.com.tr/");
        Assert.assertTrue(Driver.getDriver().getTitle().toLowerCase().contains("amazon"));
        AmazonTaskPOMPage atp = new AmazonTaskPOMPage(Driver.getDriver());
        atp.CerezKabul();
        atp.girisYap();
        AmazonTaskLoginPage lp = new AmazonTaskLoginPage(Driver.getDriver());
        lp.login();
        AmazonHomePage hp = new AmazonHomePage(Driver.getDriver());
        hp.verifyHesapLoginControl();
        hp.drpDownSecim();
        hp.txtSendKeysMSI();
        AmazonProductOnePage op= new AmazonProductOnePage(Driver.getDriver());
        op.verifyMSI();
        op.jseTwoGo();
        AmazonProductTwoPage tp = new AmazonProductTwoPage(Driver.getDriver());
        tp.sayfaTwoVerify();
        tp.twoProductClick();
        AmazonTaskTwoProductPage ttp= new AmazonTaskTwoProductPage(Driver.getDriver());
        ttp.twoProductAddFavorite();
        ttp.favoriListClick();
        AmazonTaskFavorListPage fl=new AmazonTaskFavorListPage(Driver.getDriver());
        fl.verifyAlisVeris();
        fl.urunKaldir();
        fl.verifySilindi();
        fl.logOutAccount();
        AmazonTaskCikisPage cp = new AmazonTaskCikisPage(Driver.getDriver());
        cp.verifyCikis();

        

    }
}
