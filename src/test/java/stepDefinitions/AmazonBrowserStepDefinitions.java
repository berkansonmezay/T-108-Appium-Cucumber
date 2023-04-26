package stepDefinitions;

import io.cucumber.java.en.Given;
import org.openqa.selenium.DeviceRotation;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import pages.BrowserPage.AmazonPage;
import utils.BrowserDriver;

public class AmazonBrowserStepDefinitions {
    AmazonPage amazonPage=new AmazonPage();
    @Given("Kullanici {string} adresine")
    public void kullanici_adresine(String url) {
        BrowserDriver.getBrowserDriver().get(url);
    }
    @Given("Kullanici arama kutusunda {string} aratir")
    public void kullanici_arama_kutusunda_aratir(String aranacakKelime) {
      amazonPage.amazonAramaKutusu.sendKeys(aranacakKelime);
        Actions actions=new Actions(BrowserDriver.getBrowserDriver());
        actions.sendKeys(Keys.PAGE_DOWN).perform();
       // BrowserDriver.getBrowserDriver().rotate(new DeviceRotation(270,270,270));
    }
}
