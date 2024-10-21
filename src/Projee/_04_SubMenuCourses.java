package Projee;

import Utility.BaseDriverGenel;
import Utility.Tools;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.annotations.Test;

public class _04_SubMenuCourses extends BaseDriverGenel {

    @Test(groups = {"Smoke Test"})
    public void SubmenuCourses(){
        Elements elements = new Elements();
        driver.get("https://techno.study/tr/");
        Actions aksiyonlar = new Actions(driver);
        Tools.Bekle(2);

        new Actions(driver).moveToElement(elements.kurslar).build().perform();
        elements.sdet.click();
        wait.until(ExpectedConditions.visibilityOf(elements.sdetAcıklama));
        System.out.println("Sdet açıklama = " + elements.sdetAcıklama.getText());

        new Actions(driver).moveToElement(elements.kurslar).build().perform();
        elements.aug.click();
        wait.until(ExpectedConditions.visibilityOf(elements.augAcıklama));
        System.out.println("Android Oyun Geliştirme açıklama  = " + elements.augAcıklama.getText());

        new Actions(driver).moveToElement(elements.kurslar).build().perform();
        elements.vb.click();
        wait.until(ExpectedConditions.visibilityOf(elements.vbAcıklama));
        System.out.println("Veri Bilimi açıklama  = " + elements.vbAcıklama.getText());

        new Actions(driver).moveToElement(elements.kurslar).build().perform();
        elements.jb_a.click();
        wait.until(ExpectedConditions.visibilityOf(elements.jb_aAcıklama));
        System.out.println("Jobcenter açıklama  = " + elements.jb_aAcıklama.getText());
    }
}
