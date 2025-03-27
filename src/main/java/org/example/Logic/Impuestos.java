package org.example.Logic;

public class Impuestos {
    private Double IVA; //impuesto al valor agregado (si aplica)
    private Double ISR; //impuesto sobre la renta (si aplica)
    private String restricciones; //(encaso de  servicios con retenciones fiscales)
    private Double totalFactura; //monto final depues de impuestos

    public Impuestos(Double IVA, Double ISR, String restricciones) {
        this.IVA = IVA;
        this.ISR = ISR;
        this.restricciones = restricciones;
    }






}
