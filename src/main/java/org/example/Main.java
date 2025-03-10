package org.example;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.google.gson.Gson;
import org.example.Data.XmlManager;
import org.example.Models.Person;

public class Main {
    public static void main(String[] args) {
        System.out.println("<---------------------------Object toString---------------------------------------->");
        //Create object
        Person person = new Person("Noa", 19, "noa@c.com","0129871356");
        System.out.println(person.toString());
        System.out.println("<---------------------------Serialization---------------------------------------->");
        //Serialization
        Gson gson = new Gson();
        String jsonPerson = gson.toJson(person);
        System.out.println(jsonPerson);

        System.out.println("<--------------------------Deserialization--------------------------------------->");
        //Deserialization
        Person person2 = gson.fromJson(jsonPerson, Person.class);
        System.out.println(person2.toString());



        XmlManager xmanager = new XmlManager();

        try {
            System.out.println("<---------------------------Serialization XML---------------------------------------->");
            String xml = (String) xmanager.serialize(person);
            System.out.println(xml);
            System.out.println("<--------------------------Deserialization XML--------------------------------------->");
            Person person3 = (Person) xmanager.deserialize(xml,Person.class);
            System.out.println(person3.toString());
        } catch (JsonProcessingException e) {
            throw new RuntimeException(e);
        }

    }
}