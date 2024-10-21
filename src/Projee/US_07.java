package Projee;

import Utility.BaseDriverGenel;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.annotations.Test;

public class US_07  extends BaseDriverGenel {

    @Test(groups = {"Regression Test"})
    public void CourseDetails() {
        Elements elements = new Elements();
        JavascriptExecutor js = (JavascriptExecutor) driver;

        driver.get("https://techno.study/tr/");

        elements.detaylıBilgiSdet.click();
        wait.until(ExpectedConditions.visibilityOf(elements.sdetAcıklama));
        System.out.println("Sdet açıklama = " + elements.sdetAcıklama.getText());

        elements.logo.click();

        elements.detaylıBilgiAog.click();
        wait.until(ExpectedConditions.visibilityOf(elements.augAcıklama));
        System.out.println("\n" + "Android Oyun Geliştirme açıklama  = " + elements.augAcıklama.getText());

        elements.logo.click();

        elements.detaylıBilgiVb.click();
        wait.until(ExpectedConditions.visibilityOf(elements.vbAcıklama));

        System.out.println("\n" + "Veri Bilimi açıklama  = " + elements.vbAcıklama.getText());


    }
}
