package US_01_;

import Projee.Elements;
import Utility.BaseDriverGenel;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;
import org.testng.annotations.Test;

public class _01_US extends BaseDriverGenel {

    @Test(groups = {"Smoke Test"})
    public void DropdownMenu() {

        Elements elements = new Elements();
        Actions aksiyonlar = new Actions(driver);
        driver.get("https://techno.study/tr/");

        new Actions(driver).moveToElement(elements.kurslar).build().perform();
        elements.sdet.click();
        wait.until(ExpectedConditions.titleIs("SDET Yazılım Test Uzmanı"));
        Assert.assertEquals(driver.getTitle(), "SDET Yazılım Test Uzmanı");

        new Actions(driver).moveToElement(elements.kurslar).build().perform();
        elements.aug.click();
        wait.until(ExpectedConditions.titleIs("Android Uygulama Geliştirme"));
        Assert.assertEquals(driver.getTitle(), "Android Uygulama Geliştirme");

        new Actions(driver).moveToElement(elements.kurslar).build().perform();
        elements.vb.click();
        wait.until(ExpectedConditions.titleIs("Veri Bilimi"));
        Assert.assertEquals(driver.getTitle(), "Veri Bilimi");;

        new Actions(driver).moveToElement(elements.kurslar).build().perform();
        elements.jb_a.click();
        wait.until(ExpectedConditions.titleIs("Job Center & Arbeitsamt"));
        Assert.assertEquals(driver.getTitle(), "Job Center & Arbeitsamt");;

    }
}
