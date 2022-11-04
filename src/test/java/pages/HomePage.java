package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class HomePage {

    public HomePage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "(//li[@class='js-navigation-item '])[4]")
    public WebElement anaKategori;

    @FindBy(linkText = "Dizaltı Çorap")
    public WebElement kategori;

    @FindBy(id = "attributes_integration_colourSİYAH")
    public WebElement siyahçorap;

    @FindBy(xpath = "//h3[contains(text(),'Penti Kadın 50 Denye Pantolon Çorabı Siyah')]")
    public WebElement ürünüseç;

    @FindBy(xpath = "//span[.=\"SİYAH \"]")
    public WebElement renk;

    @FindBy(className = "icon-sepetekle")
    public WebElement sepeteekle;

    @FindBy(partialLinkText = "Sepeti Görüntüle")
    public WebElement sepetiGörüntüle;

    @FindBy(partialLinkText = "Sepeti Onayla")
    public WebElement sepetiOnayla;

    @FindBy(partialLinkText = "ÜYE OLMADAN DEVAM ET")
    public WebElement üyeOlmadanDevamEt;

    @FindBy(name = "user_email")
    public WebElement email;

    @FindBy(xpath = "//button[contains(text(),'DEVAM ET')]")
    public WebElement devamEtButton;




    @FindBy(partialLinkText = "Yeni adres oluştur")
    public WebElement yeniAdresOluştur;

    @FindBy(xpath = "//input[@name='title']")
    public WebElement adresBaşlığı;

    @FindBy(name = "first_name")
    public WebElement ad;

    @FindBy(name = "last_name")
    public WebElement soyad;

    @FindBy(name = "phone_number")
    public WebElement cepTelefonu;

    @FindBy(name = "city")
    public WebElement il;

    @FindBy(name = "township")
    public WebElement ilçe;

    @FindBy(name = "district")
    public WebElement mahalle;

    @FindBy(name = "line")
    public WebElement adres;

    @FindBy(xpath = "//button[contains(text(),'KAYDET')]")
    public WebElement kaydet;

    @FindBy(xpath = "//button[@data-index='1']")
    public WebElement kaydetVeDevamEt;

    @FindBy(xpath = "//div[@class='masterpass-pay-another-card']")
    public WebElement ödemeSayfası;

    @FindBy(xpath = "//button[@id='CybotCookiebotDialogBodyLevelButtonLevelOptinAllowAll']")
    public WebElement çerez;








}
