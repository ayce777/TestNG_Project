package UserStory_06_;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.WebElement;
public class HomePageElements {
    // Constructor
    public HomePageElements(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }
        @FindBy(xpath = "//img[@alt='TechnoStudy']")
        public WebElement logo;

        @FindBy(linkText = "BAŞVUR")
        public WebElement basvurButton;


    }


