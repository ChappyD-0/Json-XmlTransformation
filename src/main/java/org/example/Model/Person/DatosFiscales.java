package org.example.Model.Person;

public class DatosFiscales {


    private String rfc;
    private String email;
    private String phone;
    private String domicilioFiscal;


    public DatosFiscales(String rfc, String email, String phone, String domicilioFiscal) {
        this.rfc = rfc;
        this.email = email;
        this.phone = phone;
        this.domicilioFiscal = domicilioFiscal;
    }

    public DatosFiscales() {

    }

    public String getRfc() {
        return rfc;
    }

    public void setRfc(String rfc) {
        this.rfc = rfc;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    @Override
    public String toString() {
        return "DatosFiscales{" +
                ", rfc='" + rfc + '\'' +
                ", email='" + email + '\'' +
                ", phone='" + phone + '\'' +
                ", domicilioFiscal='" + domicilioFiscal + '\'' +
                '}';
    }
}
