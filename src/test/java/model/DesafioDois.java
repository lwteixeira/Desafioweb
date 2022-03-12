package model;

public class DesafioDois {

    private String txtSaveAndBack = "Go back to list";
    private String xpathSearchName = "//*[@id=\"gcrud-search-form\"]/div[2]/table/thead/tr[2]/td[3]/input";
    private String txtTestSicredi = "Teste Sicredi";
    private String xpathActionCheckBox = "//*[@id=\"gcrud-search-form\"]/div[2]/table/thead/tr[2]/td[1]/div/input";
    private String txtAlertSing1 = "Are you sure that you want to delete this 1 item?";
    private String txtAlertPlural1 = "Are you sure that you want to delete those ";
    private String txtAlertPlural2 = " items?";
    private String xpathAlertSing = "/html/body/div[2]/div[2]/div[3]/div/div/div[2]/p[2]";
    private String xpathAlertPlu = "/html/body/div[2]/div[2]/div[3]/div/div/div[2]/p[1]";
    private String xpathResultSearchname = "//*[@id=\"gcrud-search-form\"]/div[2]/table/tbody/tr[1]/td[3]";
    private String btnLinkDelete = "Delete";
    private String xpathBtnDeleteAlert = "/html/body/div[2]/div[2]/div[3]/div/div/div[3]/button[2]";
    private String xpathMsgConfirmDelete = "/html/body/div[3]/span[3]";
    private String MSGCONFIRMADELETE = "Your data has been successfully deleted from the database.";
    private String xpathQtdItensDelete = "/html/body/div[2]/div[2]/div[3]/div/div/div[2]/p[1]/span";

    public String getTxtSaveAndBack(){return txtSaveAndBack;}
    public String getXpathSearchName(){return xpathSearchName;}
    public String getTxtTestSicredi(){return txtTestSicredi;}
    public String getXpathActionCheckBox(){return xpathActionCheckBox;}
    public String getTxtAlertSing1(){return txtAlertSing1;}
    public String getTxtAlertPlural1(){return txtAlertPlural1;}
    public String getTxtAlertPlural2(){return txtAlertPlural2;}
    public String getXpathQtdItensDelete(){return xpathQtdItensDelete;}
    public String getXpathAlertSing(){return xpathAlertSing;}
    public String getXpathAlertPlu(){return xpathAlertPlu;}
    public String getXpathResultSearchname(){return xpathResultSearchname;}
    public String getBtnLinkDelete(){return btnLinkDelete;}
    public String getXpathBtnDeleteAlert(){return xpathBtnDeleteAlert;}
    public String getXpathMsgConfirmDelete(){return xpathMsgConfirmDelete;}
    public String getMSGCONFIRMADELETE(){return MSGCONFIRMADELETE;}

}
