package Tests;


import model.DesafioDois;
import model.DesafioUm;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import pageObject.Page;
import util.Browser;

import java.sql.Time;
import java.util.concurrent.TimeUnit;

public class TesteSicredi {

    DesafioUm desafioUm = new DesafioUm();
    DesafioDois desafioDois = new DesafioDois();
    ChromeDriver navegator;

    WebDriverWait wait;
    Browser browse = new Browser();
    Page page = new Page();



    @Test
    public void testDesafioUmHappyWay() {

        // CHAMA O MÉTODO PARA ABRIR A PÁGINA NO CHROME
        page.openBrowser(browse);

        // INICIA DRIVES DO CHROME
        page.inicarChromeDrive(navegator);

        // MAPEIA COMBOBOX DO SELECT VERSION PARA SELECIONAR O ITEM DESEJADO DENTRO
        page.selectVersion(navegator);

        // MAPEIA O TEXTO LINK PARA ADICIONAR UM CLIENTE E CLICA NESSE TEXTO
        page.clickAdd(navegator);

        // OS METODOS A SEGUIR MAPEIAM OS CAMPOS E JA PREENCHEM COM O TEXTO SOLICITADO
        //
        page.getDados(navegator);


        // AQUI É MAPEADO O MOTÃO SAVE PELO ID E LOGO É CLICADO NO MESMO
        //
        page.clickButtonSave(navegator);


        // ESPERAR O ELEMENTO APARECER EM TELA PARA UTILIZA-LO
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath(desafioUm.getXpathSuccessMsg())));


        // É PEGO O TEXTO INFORMADO EM TELA DE SOCESSO NO CADASTRO PARA SER VALIDADO
        //
        String getMsg = navegator.findElement(By.xpath(desafioUm.getXpathSuccessMsg())).getText();
        Assert.assertEquals(desafioUm.getMsgSuccess(), getMsg);

        // NAVEGADOR É FECHADO
        // COMENTAR A LINHA DEBAIXO e EXECUTAR O DESAFIO 2
        navegator.quit();


    }


    // ANTES DE EXECUTAR ESSE TESTE DEVE SER COMENTADO
    // O ULTIMO METODO DO TestDesafioUmHappWay() >> "navegator.quit();"
    @Test
    public void testDesafioDoisHappyWay() throws InterruptedException {

        // CHAMA O MÉTODO PARA ABRIR A PÁGINA NO CHROME
        page.openBrowser(browse);

        // INICIA DRIVES DO CHROME
        page.inicarChromeDrive(navegator);

        // MAPEIA COMBOBOX DO SELECT VERSION PARA SELECIONAR O ITEM DESEJADO DENTRO
        page.selectVersion(navegator);

        // MAPEIA O TEXTO LINK PARA ADICIONAR UM CLIENTE E CLICA NESSE TEXTO
        page.clickAdd(navegator);

        // OS METODOS A SEGUIR MAPEIAM OS CAMPOS E JA PREENCHEM COM O TEXTO SOLICITADO
        //
        page.getDados(navegator);


        // AQUI É MAPEADO O MOTÃO SAVE PELO ID E LOGO É CLICADO NO MESMO
        //
        page.clickButtonSave(navegator);

        // ESPERAR O ELEMENTO APARECER EM TELA PARA UTILIZA-LO
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath(desafioUm.getXpathSuccessMsg())));

        // CLICA NO LINK, VOLTA PARA INICIAL
        navegator.findElement(By.linkText(desafioDois.getTxtSaveAndBack())).click();

        // PEGA O XPACH DO LABEL PARA PESQUISAR PELO NOME DO CADASTRO
        navegator.findElement(By.xpath(desafioDois.getXpathSearchName()))
                .sendKeys(desafioDois.getTxtTestSicredi());

        // VERIFICAR SE JA ENCONTROU O RESULTADO NA PESQUISA ANTERIOR, CASO NÃO ESPERA 2 SEGUNDOS (DELAY PAGINA)
        if (!navegator.findElement(By.xpath(desafioDois.getXpathResultSearchname())).getText().equals(desafioDois.getTxtTestSicredi())) {
            Thread.sleep(2000);


            // CLICA NO CHECKBOX E LOGO APÓS ESPERA 2,5 SEGUNDOS, PELO DELAY DE ATUALIZAR PAGINA
            navegator.findElement(By.xpath(desafioDois.getXpathActionCheckBox())).click();
            Thread.sleep(2500);

            // APÓS ESPERA VERIFICA NOVAMENTE SE O CHECKBOX ESTÁ SELECIONADO
            // CASO NÃO, ELE SELECIONA NOVAMENTE (PAGINA ESTA DANDO UMA ATUALIZADA
            // NO FORM E DESMARCADO CHECKBOX
            if (!navegator.findElement(By.xpath(desafioDois.getXpathActionCheckBox())).isSelected())
                navegator.findElement(By.xpath(desafioDois.getXpathActionCheckBox())).click();

            // CLICA NO BOTÃO (LINK) DE DELETE
            navegator.findElement(By.linkText(desafioDois.getBtnLinkDelete())).click();

            // PEGA MSG DO ALERT
            String alertSing = navegator.findElement(By.xpath(desafioDois.getXpathAlertSing())).getText();
            String alertPlu = navegator.findElement(By.xpath(desafioDois.getXpathAlertPlu())).getText();

            // PEGA QUANTIDADE DE ITENS SELECIONADOS PARA SER DELETADO
            String qtdDel = navegator.findElement(By.xpath(desafioDois.getXpathQtdItensDelete())).getText();

            // COMPARA SE A MSG DO ALERT ESTÁ CORRETA
            // PARA VERIFICAR SE VAI SER DELETADO 1 OU MAIS ITENS
            if (alertSing.equals(desafioDois.getTxtAlertSing1())) {
                Assert.assertEquals(desafioDois.getTxtAlertSing1(), alertSing);
            } else {
                Assert.assertEquals(desafioDois.getTxtAlertPlural1() + qtdDel + desafioDois.getTxtAlertPlural2(), alertPlu);
            }

            // CASO MSG CORRETA CLICA NO BOTÃO DELETE DO ALERT
            navegator.findElement(By.xpath(desafioDois.getXpathBtnDeleteAlert())).click();

            // ESPERA O ELEMENTO APARECER EM TELA PARA VALIDA-LO
            wait.until(ExpectedConditions.elementToBeClickable(By.xpath(desafioDois.getXpathMsgConfirmDelete())));

            // PEGA TEXTO DA MSG DE CONFIRMAÇÃO EXCLUSÃO
            String text = navegator.findElement(By.xpath(desafioDois.getXpathMsgConfirmDelete())).getText();

            // COMPARA SE A MSG DA CONFIRMAÇÃO ESTÁ CORRETA
            Assert.assertEquals(desafioDois.getMSGCONFIRMADELETE(), text);

            // FECHA NAVEGADOR
            navegator.quit();

        }
    }

}