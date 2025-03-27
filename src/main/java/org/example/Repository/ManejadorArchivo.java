package org.example.Repository;

import java.io.FileWriter;
import java.io.IOException;

public class ManejadorArchivo {

    public ManejadorArchivo() {
    }

    public boolean escribirArchivo(String linea, String nombreArchivo) {
        try{
           FileWriter archivo = new FileWriter(nombreArchivo);
           archivo.write(linea);
           archivo.close();
           return true;
        }catch (IOException e){
            e.printStackTrace();
        }
        return false;
    }
    public boolean limpiarArchivo(String linea,String nombreArchivo){
        try{
            FileWriter archivo = new FileWriter(nombreArchivo);
            archivo.write("");
            archivo.close();
            return true;
        }catch (IOException e){
            e.printStackTrace();
        }
        return false;
    }
}
