package org.example.Model.Producto;
/*
 * -----------------------------------
 *  Proyecto: JsonTranfer
 *  Autor: chappyd-0
 *  Fecha: 3/20/25
 * -----------------------------------
 */

import java.util.ArrayList;

public class Inventario {
    private ArrayList<Producto> productos;

    public void agregarProducto(Producto producto){
        productos.add(producto);
    }

    public void eliminarProducto(Producto producto){
        productos.remove(producto);
    }

}
