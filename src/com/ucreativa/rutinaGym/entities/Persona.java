package com.ucreativa.rutinaGym.entities;

public class Persona {

    public String getName() {
        return name;
    }
    public String getCedula() {
        return cedula;
    }
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }

    private String name;
    private String cedula;
    private int age;

    public Persona(String name, String cedula, int age) {
        this.name = name;
        this.cedula = cedula;
        this.age = age;
    }

}