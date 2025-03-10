package org.example.Models;

public class Person {

    private String name;
    private int ege;
    private String email;
    private String phone;

    public Person(String name, int ege, String email, String phone) {
        this.name = name;
        this.ege = ege;
        this.email = email;
        this.phone = phone;
    }
    public Person() {}

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getEge() {
        return ege;
    }

    public void setEge(int ege) {
        this.ege = ege;
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
        return
                "Name='" + name + '\'' +
                ", Ege=" + ege +
                ", Email='" + email + '\'' +
                ", Phone='" + phone + '\''
                ;
    }
}
