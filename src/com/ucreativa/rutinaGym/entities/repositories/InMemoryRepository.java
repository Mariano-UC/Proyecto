package com.ucreativa.rutinaGym.entities.repositories;


import com.ucreativa.rutinaGym.entities.BitacoraRutina;
import com.ucreativa.rutinaGym.entities.Persona;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class InMemoryRepository implements Repository {

    private List<BitacoraRutina> db;

    public InMemoryRepository(){
        this.db = new ArrayList<>();
    }

    public void save(Persona persona, boolean isLowerBody, boolean isUpperbody, Date fecha ){
        this.db.add(new BitacoraRutina(persona, isLowerBody,isUpperbody, fecha));
    }
    public List<String> get (){
        List<String> lines = new ArrayList<>();
        SimpleDateFormat format = new SimpleDateFormat("dd-MM-yyyy hh:mm:ss" );
        for(BitacoraRutina item : db){
            lines.add(item.getPersona().getName()
                    +" - " + item.isLowerBody()
                    +" - " + item.isUpperBody()
                    +" - " + format.format(item.getFecha()));
        }
        return lines;
    }

}