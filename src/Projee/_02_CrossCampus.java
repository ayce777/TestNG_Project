package Projee;

import Utility.BaseDriverGenel;
import Utility.Tools;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.rmi.server.ExportException;

//    Test Case 2: Cross Campus
//    1. Anasayfanın üst kısmında, "Campus Girişi" veya "Log in to Campus" gibi bir seçenek
//    bulunmalıdır.
//    2. "Campus Girişi" seçeneğini tıkladığımda, beni Campus platformunun giriş sayfasına
//    yönlendirmelidir.
//    3. Campus'e giriş yapılmasına gerek yoktur (Şifre güvenliği açısından)

public class _02_CrossCampus extends BaseDriverGenel {

@Test
    public void CrossCampus(){

    Elements elements=new Elements();

    driver.get("https://techno.study/tr/");
    Tools.Bekle(2);

    wait.until(ExpectedConditions.visibilityOf(elements.campusLogin));
    elements.campusLogin.getText();
    Assert.assertTrue(elements.campusLogin.getText().equalsIgnoreCase("Campus Login"),"Campus Login bölümü bulunamadı ");

    elements.campusLogin.click();
    Assert.assertTrue(elements.aboutCampus.getText().toLowerCase().contains("about"),"Login sayfasına gidilemedi");










}

}
