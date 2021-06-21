package com.ucreativa.rutinaGym.entities;

public class UpperBody extends Persona {


    public boolean isPecho() {

        return pecho;
    }
    public boolean isHombros() {

        return hombros;
    }
    public boolean isEspalda() {

        return espalda;
    }
    public boolean isBrazos() {

        return brazos;
    }

    public void setPecho(boolean pecho) {

        this.pecho = pecho;
    }
    public void setHombros(boolean hombros) {
        this.hombros = hombros;
    }
    public void setEspalda(boolean espalda) {
        this.espalda = espalda;
    }
    public void setBrazos(boolean brazos) {
        this.brazos = brazos;
    }

    private boolean pecho;
    private boolean hombros;
    private boolean espalda;
    private boolean brazos;

    public UpperBody(String name, String cedula, int age, boolean pecho, boolean hombros, boolean espalda, boolean brazos) {
        super(name, cedula, age);
        this.pecho = pecho;
        this.hombros = hombros;
        this.espalda = espalda;
        this.brazos = brazos;
    }

}