package com.ucreativa.rutinaGym.entities.services;

import com.ucreativa.rutinaGym.entities.LowerBody;
import com.ucreativa.rutinaGym.entities.Persona;
import com.ucreativa.rutinaGym.entities.UpperBody;
import com.ucreativa.rutinaGym.entities.repositories.Repository;
import com.ucreativa.rutinaGym.entities.ui.ErrorEnEdadException;

import java.util.Date;
import java.util.List;

public class BitacoraService {

    private Repository repository;

    public BitacoraService(Repository repository){
        this.repository = repository;
    }
    public void save(String nombre, String cedula, String txtEdad,
                     boolean isLowerBody, boolean isUpperBody, boolean pecho, boolean hombros, boolean espalda, boolean brazos,
                     boolean core, boolean piernas, boolean cardio)
                throws ErrorEnEdadException {

        int edad;
        try {
            edad = Integer.parseInt(txtEdad);
        } catch (NumberFormatException x ){
            throw new ErrorEnEdadException(txtEdad);
        }
        Persona persona = null;
        if (isLowerBody){
            persona = new LowerBody(nombre, cedula, edad,core, piernas, cardio);
        } else {
            if (isUpperBody) {
                persona = new UpperBody(nombre, cedula, edad, pecho, hombros, espalda, brazos );
            }
        }
        this.repository.save(persona, isUpperBody,isLowerBody, new Date());
    }
    public List<String> get(){
        return this.repository.get();
    }
}
