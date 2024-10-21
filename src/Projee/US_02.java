package Projee;

import Utility.BaseDriverGenel;
import org.testng.Assert;
import org.testng.annotations.Test;

public class US_02 extends BaseDriverGenel {
    @Test(groups = {"Smoke Test"})
    public void CrossCampus() {
        Elements elements = new Elements();
        driver.get("https://techno.study/tr/");

        elements.bilgiAlın.click();

        System.out.println("elements.bizeUlaşın.getText() = " + elements.bizeUlaşın.getText());
        Assert.assertEquals(elements.bizeUlaşın.getText(), "Bize ulaşın!");

        elements.compusLogin.click();
        System.out.println("driver.getCurrentUrl() = " + driver.getCurrentUrl());
        Assert.assertEquals(driver.getCurrentUrl(),"https://campus.techno.study/");


    }
}
