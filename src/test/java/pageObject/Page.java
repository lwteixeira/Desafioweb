package pageObject;

import model.DesafioUm;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import util.Browser;

import java.util.concurrent.TimeUnit;

public class Page {

    DesafioUm desafioUm = new DesafioUm();
    WebDriverWait wait;
    Browser browse = new Browser();


    // ESSE METODO ABRE A PÁGINA NO CHROME
    public void openBrowser(Browser browse) {
        System.setProperty(browse.WEBCHROMEDRIVE, browse.PATHCHROME);
    }

    public void getDados(ChromeDriver navegator){
        navegator.findElement(By.id(desafioUm.getIdName())).sendKeys(desafioUm.getName());
        navegator.findElement(By.id(desafioUm.getIdLastname())).sendKeys(desafioUm.getLastName());
        navegator.findElement(By.id(desafioUm.getIdContactFirstName())).sendKeys(desafioUm.getContactFirstName());
        navegator.findElement(By.id(desafioUm.getIdPhone())).sendKeys(desafioUm.getPhone());
        navegator.findElement(By.id(desafioUm.getIdAddressLine1())).sendKeys(desafioUm.getAddressLine1());
        navegator.findElement(By.id(desafioUm.getIdAddressLine2())).sendKeys(desafioUm.getAddressLine2());
        navegator.findElement(By.id(desafioUm.getIdCity())).sendKeys(desafioUm.getCity());
        navegator.findElement(By.id(desafioUm.getIdState())).sendKeys(desafioUm.getState());
        navegator.findElement(By.id(desafioUm.getIdPostalCode())).sendKeys(desafioUm.getPostalCode());
        navegator.findElement(By.id(desafioUm.getIdCountry())).sendKeys(desafioUm.getCountry());
        navegator.findElement(By.id(desafioUm.getIdFromEmployeer())).click();
        navegator.findElement(By.xpath(desafioUm.getXpathFromEmployeer())).click();
        navegator.findElement(By.id(desafioUm.getIdCreditLimit())).sendKeys(desafioUm.getCreditLimit());
    }

    public void clickButtonSave(ChromeDriver navegator){
        navegator.findElement(By.id(desafioUm.getIdBtnSave())).click();
    }
    public void clickAdd(ChromeDriver navegator){
        navegator.findElement(By.linkText("Add Customer")).click();
    }

    public void selectVersion(ChromeDriver navegator){
        WebElement selectVersion = navegator.findElement(By.id("switch-version-select"));
        Select select = new Select(selectVersion);
        select.selectByVisibleText("Bootstrap V4 Theme");
    }

    public void inicarChromeDrive(ChromeDriver navegator){
        // CRIA O DRIVER DO CHROME WEB DRIVER
        navegator = new ChromeDriver();
        wait = new WebDriverWait(navegator, 5);

        // CHAMA A CONSTANTE COM URL DA PÁGINA QUE DEVE ACESSAR
        navegator.get(browse.URLPAGE);

        // DETERMINAR QUE IRÁ ESPERAR POR 5 SEGUNDO ABRIR UM MENU OU PAGE ANTES DE DAR TIMEOUT
        navegator.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
    }

}
