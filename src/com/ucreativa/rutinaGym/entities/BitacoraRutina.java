package com.ucreativa.rutinaGym.entities;

import java.util.Date;

public class BitacoraRutina {
    private Persona persona;
    private boolean UpperBody;
    private boolean LowerBody;
    private Date fecha;

    public BitacoraRutina(Persona persona, boolean UpperBody, boolean LowerBody, Date fecha) {
        this.persona = persona;
        this.UpperBody = UpperBody;
        this.LowerBody = LowerBody;
    }

    public Persona getPersona() {
        return persona;
    }

    public boolean isUpperBody() {
        return UpperBody;
    }

    public boolean isLowerBody() { return LowerBody; }

    public Date getFecha() {
        return fecha;
    }


}

