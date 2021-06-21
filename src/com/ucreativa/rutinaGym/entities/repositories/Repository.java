package com.ucreativa.rutinaGym.entities.repositories;

import com.ucreativa.rutinaGym.entities.Persona;

import java.util.Date;
import java.util.List;

public interface Repository {
    void save(Persona persona, boolean upperBody, boolean lowerBody, Date fecha);
    List<String> get ();
}