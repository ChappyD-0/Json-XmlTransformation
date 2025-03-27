package org.example.Model.Producto;

public class Producto {
    private String cantidad; //numero de unidades
    private String nombreProoducto;
    private String descripcionProoducto;
    private double precioProoducto;
    private double descuentoProoducto; //(si aplica)
    private double subtotalProoducto; // antes de impuestos

    public Producto() {
    }

    public Producto(String cantidad, String nombreProoducto, String descripcionProoducto, double precioProoducto, double descuentoProoducto, double subtotalProoducto) {
        this.cantidad = cantidad;
        this.nombreProoducto = nombreProoducto;
        this.descripcionProoducto = descripcionProoducto;
        this.precioProoducto = precioProoducto;
        this.descuentoProoducto = descuentoProoducto;
        this.subtotalProoducto = subtotalProoducto;
    }

    public String getCantidad() {
        return cantidad;
    }

    public void setCantidad(String cantidad) {
        this.cantidad = cantidad;
    }

    public String getNombreProoducto() {
        return nombreProoducto;
    }

    public void setNombreProoducto(String nombreProoducto) {
        this.nombreProoducto = nombreProoducto;
    }

    public String getDescripcionProoducto() {
        return descripcionProoducto;
    }

    public void setDescripcionProoducto(String descripcionProoducto) {
        this.descripcionProoducto = descripcionProoducto;
    }

    public double getPrecioProoducto() {
        return precioProoducto;
    }

    public void setPrecioProoducto(double precioProoducto) {
        this.precioProoducto = precioProoducto;
    }

    public double getDescuentoProoducto() {
        return descuentoProoducto;
    }

    public void setDescuentoProoducto(double descuentoProoducto) {
        this.descuentoProoducto = descuentoProoducto;
    }

    public double getSubtotalProoducto() {
        return subtotalProoducto;
    }

    public void setSubtotalProoducto(double subtotalProoducto) {
        this.subtotalProoducto = subtotalProoducto;
    }
}
