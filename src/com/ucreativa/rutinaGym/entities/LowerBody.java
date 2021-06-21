package com.ucreativa.rutinaGym.entities;

public class LowerBody extends Persona {

    public boolean isCore() {

        return core;
    }
    public boolean isPiernas() {

        return piernas;
    }
    public boolean isCardio() {

        return cardio;
    }

    public void setCore(boolean core) {

        this.core = core;
    }
    public void setPiernas(boolean piernas) {
        this.piernas = piernas;
    }
    public void setCardio(boolean cardio) {
        this.cardio = cardio;
    }

    private boolean core;
    private boolean piernas;
    private boolean cardio;

    public LowerBody(String name, String cedula, int age, boolean core, boolean piernas, boolean cardio ) {
        super(name, cedula, age);
        this.core = core;
        this.piernas = piernas;
        this.cardio = cardio;
    }
}
