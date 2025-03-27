package org.example.Model;

import java.util.Date;

public class Factura {

    private String numeroFactura; //unico
    private Date fechaHoraEmision;
    private String tipoFactura; //factura de venta, nota de credito
    private String moneda; //Peso Mexicano o Dolares EUA
    private String tipoDeCambio; // No aplica / o conversion (Llamar a auna api para los cambios)
    private String formaDePago; // efectivo, tranferencia, tarjeta
    private String metodoDePago;// pago en una sola exibicion  o en parciales

    //Datos de autentificaccion
    private String folio; //numero unico
    private String selloDigital; //Firma electronica del emisor
    private String codigoQR; //para verificar en la pagina del sat
    private String certificadoSelloDigital; // editificacion del emisor

    public Factura(){
    }

    public Factura(String numeroFactura, Date fechaHoraEmision, String tipoFactura, String moneda, String tipoDeCambio, String formaDePago,
                   String metodoDePago, String folio, String selloDigital, String codigoQR, String certificadoSelloDigital) {
        this.numeroFactura = numeroFactura;
        this.fechaHoraEmision = fechaHoraEmision;
        this.tipoFactura = tipoFactura;
        this.moneda = moneda;
        this.tipoDeCambio = tipoDeCambio;
        this.formaDePago = formaDePago;
        this.metodoDePago = metodoDePago;
        this.folio = folio;
        this.selloDigital = selloDigital;
        this.codigoQR = codigoQR;
        this.certificadoSelloDigital = certificadoSelloDigital;
    }

    public String getNumeroFactura() {
        return numeroFactura;
    }

    public void setNumeroFactura(String numeroFactura) {
        this.numeroFactura = numeroFactura;
    }

    public Date getFechaHoraEmision() {
        return fechaHoraEmision;
    }

    public void setFechaHoraEmision(Date fechaHoraEmision) {
        this.fechaHoraEmision = fechaHoraEmision;
    }

    public String getTipoFactura() {
        return tipoFactura;
    }

    public void setTipoFactura(String tipoFactura) {
        this.tipoFactura = tipoFactura;
    }

    public String getMoneda() {
        return moneda;
    }

    public void setMoneda(String moneda) {
        this.moneda = moneda;
    }

    public String getTipoDeCambio() {
        return tipoDeCambio;
    }

    public void setTipoDeCambio(String tipoDeCambio) {
        this.tipoDeCambio = tipoDeCambio;
    }

    public String getFormaDePago() {
        return formaDePago;
    }

    public void setFormaDePago(String formaDePago) {
        this.formaDePago = formaDePago;
    }

    public String getMetodoDePago() {
        return metodoDePago;
    }

    public void setMetodoDePago(String metodoDePago) {
        this.metodoDePago = metodoDePago;
    }

    public String getFolio() {
        return folio;
    }

    public void setFolio(String folio) {
        this.folio = folio;
    }

    public String getSelloDigital() {
        return selloDigital;
    }

    public void setSelloDigital(String selloDigital) {
        this.selloDigital = selloDigital;
    }

    public String getCodigoQR() {
        return codigoQR;
    }

    public void setCodigoQR(String codigoQR) {
        this.codigoQR = codigoQR;
    }

    public String getCertificadoSelloDigital() {
        return certificadoSelloDigital;
    }

    public void setCertificadoSelloDigital(String certificadoSelloDigital) {
        this.certificadoSelloDigital = certificadoSelloDigital;
    }
}
