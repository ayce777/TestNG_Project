package Projee;

import Utility.BaseDriverGenel;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Elements {

    public Elements() {
        PageFactory.initElements(BaseDriverGenel.driver, this);
    }

    @FindBy(xpath = "(//a[text()='Kurslar'])[1]")
    public WebElement kurslar;

    @FindBy(xpath = "//span[text()='SDET-Yazılım Test Uzmanı']")
    public WebElement sdet;

    @FindBy(xpath = "//span[text()='Android Uygulama Geliştirme']")
    public WebElement aug;

    @FindBy(xpath = "//span[text()='Veri Bilimi']")
    public WebElement vb;

    @FindBy(xpath = "//span[text()='Job Center & Arbeitsamt']")
    public WebElement jb_a;

    @FindBy(xpath = "//a[text()='Bilgi Alın']")
    public WebElement bilgiAlın;

    @FindBy(xpath = "//strong[text()='Bize ulaşın!']")
    public WebElement bizeUlaşın;

    @FindBy(xpath = "//a[text()='Campus Login']")
    public WebElement campusLogin;

    @FindBy(xpath = "//a[text()='BAŞVUR']")
    public WebElement basvur;

    @FindBy(css = "[placeholder='Adı Soyadı']")
    public WebElement adSoyadBasvuru;

    @FindBy(css = "[placeholder='Email']")
    public WebElement EmailBasvuru;

    @FindBy(css = "[placeholder='(999) 999-9999']")
    public WebElement telefonBasvuru;

    @FindBy(css = "[placeholder='Yaşınız']")
    public WebElement yaşınızBasvuru;

    @FindBy(css = "[placeholder='Mesleğiniz']")
    public WebElement mesleğinizBasvuru;

    @FindBy(css = "[name='country']")
    public WebElement eğitimBasvuru;

    @FindBy(css = "[name='country_2']")
    public WebElement ulkeBasvuru;

    @FindBy(css = "[name='course']")
    public WebElement kursBasvuru;

    @FindBy(css = "[name='survey']")
    public WebElement biziNerdenDuydunuzBasvuru;

    @FindBy(css = "[class='t-checkbox__indicator']")
    public WebElement kullanimSartlarıBasvuru;

    @FindBy(css = "[type='submit']")
    public WebElement gonderBasvuru;

    @FindBy(xpath = "(//span[text()='Başvurunuz alınmıştır. Bilgilendirme emailinize gönderilmiştir.'])[2]")
    public WebElement onayMesajıBaşvuru;

    @FindBy(xpath = "(//div[@class='t396']/div/div/div)[1]")
    public WebElement sdetAcıklama;

    @FindBy(xpath = "(//div[@id='allrecords']//div[@class='t503']//li)[2]")
    public WebElement augAcıklama;

    @FindBy(xpath = "(//div[@id='allrecords']//div[@class='t503']//li)[2]")
    public WebElement vbAcıklama;

    @FindBy(xpath = "(//div[@id='allrecords']//div//div/table//div//div)[3]")
    public WebElement jb_aAcıklama;

    // Sosyal medya
    @FindBy(xpath = "(//a[@class='tn-atom'])[4]")
    public WebElement facebook;

    @FindBy(xpath = "(//a[@class='tn-atom'])[5]")
    public WebElement instagram;

    @FindBy(xpath = "(//a[@class='tn-atom'])[6]")
    public WebElement youtube;

    @FindBy(xpath = "(//a[@class='tn-atom'])[7]")
    public WebElement linkedin;

    @FindBy(xpath = "//a[@href='/tr']//img")
    public WebElement logo;

    @FindBy(xpath = "(//a[text()='Detaylı bilgi'])[2]")
    public WebElement detaylıBilgiSdet;

    @FindBy(xpath = "(//a[text()='Detaylı bilgi'])[3]")
    public WebElement detaylıBilgiAog;

    @FindBy(xpath = "(//a[text()='Detaylı bilgi'])[1]")
    public WebElement detaylıBilgiVb;

    @FindBy(xpath = "//span[@class='t-checkbox__labeltext']/a")
    public WebElement kullanimSartları;

    @FindBy(xpath = "//*[text()=' About Campus ']")
    public WebElement aboutCampus;
}