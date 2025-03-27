package org.example.Model.Person;

public class PersonaMoral extends DatosFiscales {

    private String razonSocial;

    public PersonaMoral() {
    }

    public PersonaMoral(String rfc, String email, String phone, String domicilioFiscal, String razonSocial) {
        super(rfc, email, phone, domicilioFiscal);
        this.razonSocial = razonSocial;
    }

    public String getRazonSocial() {
        return razonSocial;
    }

    public void setRazonSocial(String razonSocial) {
        this.razonSocial = razonSocial;
    }
}
