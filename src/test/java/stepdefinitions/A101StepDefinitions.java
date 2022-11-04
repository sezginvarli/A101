package stepdefinitions;

import com.github.javafaker.Faker;
import io.cucumber.java.en.*;
import org.junit.Assert;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import pages.HomePage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.JSUtils;


public class A101StepDefinitions {

    HomePage homePage = new HomePage();


    @Given("Kullanıcı A101 sayfasına gider")
    public void kullanıcı_a101_sayfasına_gider() {
        Driver.getDriver().get((ConfigReader.getProperty("app_url")));
        homePage.çerez.click();

    }


    @When("Giyim--> Aksesuar--> Kadın İç Giyim-->Dizaltı Çorap ürününü seçer")
    public void giyim_aksesuar_kadın_i̇ç_giyim_dizaltı_çorap_ürününü_seçer() throws InterruptedException {

        Actions actions = new Actions(Driver.getDriver());
        actions.moveToElement(homePage.anaKategori).perform();
        homePage.kategori.click();
        JSUtils.clickElementByJS(homePage.siyahçorap);
        Thread.sleep(1000);


    }

    @Then("Açılan ürünün siyah olduğunu doğrular")
    public void açılan_ürünün_siyah_olduğunu_doğrular() {
        String seçilenürünrenk = homePage.renk.getText();
        String beklenenürünrenk = "SİYAH";
        Assert.assertEquals(beklenenürünrenk, seçilenürünrenk);


    }

    @When("Sepete ekle butonuna tıklar")
    public void sepete_ekle_butonuna_tıklar() {
        JSUtils.clickElementByJS(homePage.ürünüseç);
        homePage.sepeteekle.click();

    }

    @When("Sepeti Görüntüle butonuna tıklar")
    public void sepeti_görüntüle_butonuna_tıklar() {
        homePage.sepetiGörüntüle.click();
    }

    @When("Sepeti Onayla butonuna tıklar")
    public void sepeti_onayla_butonuna_tıklar() {
        homePage.sepetiOnayla.click();
    }

    @When("Üye olmadan devam et butonuna tıklanır")
    public void üye_olmadan_devam_et_butonuna_tıklanır() {
        homePage.üyeOlmadanDevamEt.click();
    }

    @When("Mail ekranı gelir ve mail adresini girerek alışverişine devam eder")
    public void mail_ekranı_gelir_ve_mail_adresini_girerek_alışverişine_devam_eder() {
        homePage.email.sendKeys(Faker.instance().internet().emailAddress());
        homePage.devamEtButton.click();
    }

    @When("Sonrasında adres ekranı gelir. Adres oluştur dedikten sonra ödeme ekranı gelir")
    public void sonrasında_adres_ekranı_gelir_adres_oluştur_dedikten_sonra_ödeme_ekranı_gelir() throws InterruptedException {
        homePage.yeniAdresOluştur.click();
        homePage.adresBaşlığı.sendKeys("İş adresim");
        homePage.ad.sendKeys(Faker.instance().name().firstName());
        homePage.soyad.sendKeys(Faker.instance().name().lastName());
        Thread.sleep(2000);
        JSUtils.clickElementByJS(homePage.cepTelefonu);
        homePage.cepTelefonu.sendKeys(Faker.instance().number().digits(11));
        Select select1 = new Select(homePage.il);
        select1.selectByValue("40");
        Thread.sleep(1000);
        Select select2 = new Select(homePage.ilçe);
        select2.selectByValue("485");
        Thread.sleep(1000);
        Select select3 = new Select(homePage.mahalle);
        select3.selectByValue("36328");
        homePage.adres.sendKeys("Nagehan Sokağı No: 4B D:1");
        homePage.kaydet.click();


    }

    @When("Siparişi tamamla butonuna tıklar")
    public void siparişi_tamamla_butonuna_tıklar() throws InterruptedException {
        Thread.sleep(3000);
        homePage.kaydetVeDevamEt.click();
     }

    @Then("ödeme ekranına gidildiği ,doğru ekrana yönlendiklerini kontrol edecekler.")
    public void ödeme_ekranına_gidildiği_doğru_ekrana_yönlendiklerini_kontrol_edecekler() throws InterruptedException {
        Thread.sleep(2000);
        String beklenenBaşlık = homePage.ödemeSayfası.getText();
        String gerçekBaşlık = "Başka bir kart ile ödemek istiyorum";
        Assert.assertEquals(beklenenBaşlık, gerçekBaşlık);
    }

}
