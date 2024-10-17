package UserStory_06_;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import UserStory_06_.utility.BaseDriverParameter;
import java.time.Duration;

public class LogoToHomepageTest extends BaseDriverParameter {
    HomePageElements elements;

    @BeforeMethod
    public void setUp() {
        elements = new HomePageElements(driver);
    }

    @Test(groups = "smoke")
    public void testTechnoStudyLogo() {
        // TechnoStudy ana sayfasına gitme
        driver.get("https://techno.study/tr");

        // Logo elementinin görünür olmasını beklemek için WebDriverWait kullanma
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.visibilityOf(elements.logo));

        // Logo elementinin sayfada görüntülendiğini doğrulama
        wait.until(ExpectedConditions.visibilityOf(elements.logo));
    }

    @Test(groups = "smoke")
    public void testLogoRedirectsToHomepage() {
        // TechnoStudy ana sayfasına gitme
        driver.get("https://techno.study/tr");

        // Logo elementine tıklama
        elements.logo.click();

        // Mevcut URL'yi alma
        String currentUrl = driver.getCurrentUrl();

        // Logo tıklandığında ana sayfaya yönlendirdiğini doğrulama
        Assert.assertEquals(currentUrl, "https://techno.study/tr", "Logo ana sayfaya yönlendirmiyor.");
    }

    @Test(groups = "regression")
    public void testLogoDisplayedOnAllPages() {
        // TechnoStudy ana sayfasına gitme
        driver.get("https://techno.study/tr");

        // "BAŞVUR" butonuna tıklama
        elements.basvurButton.click();

        // Logo elementinin görünür olmasını bekleme
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.visibilityOf(elements.logo));

        // Logo elementinin görünür olduğunu doğrulama
        Assert.assertTrue(elements.logo.isDisplayed(), "Başvur sayfasında logo görüntülenmiyor.");
    }

}


