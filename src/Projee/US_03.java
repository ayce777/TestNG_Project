package Projee;

import Utility.BaseDriverGenel;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class US_03  extends BaseDriverGenel {

    @Test(groups = {"Smoke Test"})
    public void Booking(){
        Elements elements = new Elements();
        driver.get("https://techno.study/tr/");

        elements.basvur.click();

        elements.adSoyadBasvuru.sendKeys("Test Team Five");
        elements.EmailBasvuru.sendKeys("test_team5@gmail.com");
        elements.telefonBasvuru.sendKeys("5449585555");
        elements.yaşınızBasvuru.sendKeys("20");
        elements.mesleğinizBasvuru.sendKeys("İnşallah tester");

        // Select kısmı
        Select okul=new Select(elements.eğitimBasvuru);
        okul.selectByVisibleText("Lise");
        Select ulke=new Select(elements.ulkeBasvuru);
        ulke.selectByValue("Argentina");
        Select kurs=new Select(elements.kursBasvuru);
        kurs.selectByVisibleText("SDET Türkçe");
        Select nerdenduydun=new Select(elements.biziNerdenDuydunuzBasvuru);
        nerdenduydun.selectByVisibleText("Youtube");

        elements.kullanimSartlarıBasvuru.click();
        elements.gonderBasvuru.click();

        // Bundan sonra robot değilmisin mesajı çıkıyor eğer çıkmıyor sa assertEquals açınca doğruluk kontrölü yapılabilir.

//        Assert.assertEquals(elements.onayMesajıBaşvuru.getText(),
//                "Başvurunuz alınmıştır. Bilgilendirme emailinize gönderilmiştir.");






    }
}
