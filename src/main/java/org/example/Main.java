package org.example;

import com.fasterxml.jackson.core.JsonProcessingException;
import org.example.Repository.CreadorPDF;
import org.example.Repository.manejadorObjectos.JsonManegador;
import org.example.Repository.manejadorObjectos.XmlManegador;
import org.example.Model.Person.DatosFiscales;

public class Main {
    public static void main(String[] args) {
        System.out.println("<---------------------------Object toString toString---------------------------------------->");
        //Create object
        DatosFiscales person = new DatosFiscales("Noa", "sss", "noa@c.com","0129871356");
        System.out.println(person.toString());
        System.out.println("<---------------------------Serialization---------------------------------------->");
        //Serialization
        JsonManegador jm = new JsonManegador();
        String jsonPerson = (String) jm.serialize(person);
        System.out.println(jsonPerson);

        System.out.println("<--------------------------Deserialization toString--------------------------------------->");
        //Deserialization
        DatosFiscales person2 = (DatosFiscales) jm.deserialize(jsonPerson, DatosFiscales.class);
        System.out.println(person2.toString());

        XmlManegador xmanager = new XmlManegador();

        try {
            System.out.println("<---------------------------Serialization XML---------------------------------------->");
            String xml = (String) xmanager.serialize(person);
            System.out.println(xml);
            System.out.println("<--------------------------Deserialization XML toString--------------------------------------->");
            DatosFiscales person3 = (DatosFiscales) xmanager.deserialize(xml, DatosFiscales.class);
            System.out.println(person3.toString());
        } catch (JsonProcessingException e) {
            throw new RuntimeException(e);
        }


        CreadorPDF mgpdf = new CreadorPDF();

        mgpdf.crearNuevoArchivo("oscar.pdf","Hola Mundo");
        String valor = System.getenv("CORREOEMAIL");
        System.out.println(valor);

    }
}