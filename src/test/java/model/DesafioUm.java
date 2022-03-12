package model;

public class DesafioUm {

    private String name = "Teste Sicredi";
    private String lastName = "Teste";
    private String contactFirstName = "Lucas";
    private String phone = "51 9999-9999";
    private String addressLine1 = "Av Assis Brasil, 3970";
    private String addressLine2 = "Torre D";
    private String city = "Porto Alegre";
    private String state = "RS";
    private String postalCode = "91000-000";
    private String country = "Brasil";
    private String creditLimit = "200";

    private String idName = "field-customerName";
    private String idLastname = "field-contactLastName";
    private String idContactFirstName = "field-contactFirstName";
    private String idPhone = "field-phone";
    private String idAddressLine1 = "field-addressLine1";
    private String idAddressLine2 = "field-addressLine2";
    private String idCity = "field-city";
    private String idState = "field-state";
    private String idPostalCode = "field-postalCode";
    private String idCountry = "field-country";
    private String idFromEmployeer = "field_salesRepEmployeeNumber_chosen";
    private String xpathFromEmployeer = "//*[@id=\"field_salesRepEmployeeNumber_chosen\"]/div/ul/li[8]";
    private String idCreditLimit = "field-creditLimit";
    private String idBtnSave = "form-button-save";
    private String xpathSuccessMsg = "//*[@id=\"report-success\"]/p";
    private String msgSuccess = "Your data has been successfully stored into the database. Edit Customer or Go back to list";

    public String getName(){return name;}
    public String getLastName(){return lastName;}
    public String getContactFirstName(){return contactFirstName;}
    public String getPhone(){return phone;}
    public String getAddressLine1(){return addressLine1;}
    public String getAddressLine2(){return addressLine2;}
    public String getCity(){return city;}
    public String getState(){return state;}
    public String getPostalCode(){return postalCode;}
    public String getCountry(){return country;}
    public String getCreditLimit(){return creditLimit;}
    public String getIdBtnSave(){return idBtnSave;}
    public String getXpathSuccessMsg(){return xpathSuccessMsg;}
    public String getMsgSuccess(){return msgSuccess;}

    public String getIdName(){return idName;}
    public String getIdLastname(){return idLastname;}
    public String getIdContactFirstName(){return idContactFirstName;}
    public String getIdPhone(){return idPhone;}
    public String getIdAddressLine1(){return idAddressLine1;}
    public String getIdAddressLine2(){return idAddressLine2;}
    public String getIdCity(){return idCity;}
    public String getIdState(){return idState;}
    public String getIdPostalCode(){return idPostalCode;}
    public String getIdCountry(){return idCountry;}
    public String getIdFromEmployeer(){return idFromEmployeer;}
    public String getXpathFromEmployeer(){return xpathFromEmployeer;}
    public String getIdCreditLimit(){return idCreditLimit;}

}
