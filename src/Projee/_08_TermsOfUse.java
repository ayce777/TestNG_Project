package Projee;

import Utility.BaseDriverGenel;
import org.openqa.selenium.JavascriptExecutor;
import org.testng.annotations.Test;

public class _08_TermsOfUse extends BaseDriverGenel {

    @Test(groups = {"Regression Test"})
    public void TermsOfUse(){
        Elements elements = new Elements();

        driver.get("https://techno.study/tr/");
        elements.kullanimSartları.click();
    }
}
