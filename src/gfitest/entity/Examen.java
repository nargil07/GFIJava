/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gfitest.entity;

import gfitest.enums.TypeExamenEnum;
import java.sql.Timestamp;

/**
 *
 * @author Antony
 */
public class Examen {
    private int id;
    private TypeExamenEnum typeExamenEnum;
    private String resultat;
    private Timestamp dateExamen;

    public Examen(int id, TypeExamenEnum typeExamenEnum, String resultat, Timestamp dateExamen) {
        this.id = id;
        this.typeExamenEnum = typeExamenEnum;
        this.resultat = resultat;
        this.dateExamen = dateExamen;
    }

    public Examen() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public TypeExamenEnum getTypeExamenEnum() {
        return typeExamenEnum;
    }

    public void setTypeExamenEnum(TypeExamenEnum typeExamenEnum) {
        this.typeExamenEnum = typeExamenEnum;
    }

    public String getResultat() {
        return resultat;
    }

    public void setResultat(String resultat) {
        this.resultat = resultat;
    }

    public Timestamp getDateExamen() {
        return dateExamen;
    }

    public void setDateExamen(Timestamp dateExamen) {
        this.dateExamen = dateExamen;
    }

    @Override
    public String toString() {
        return "Examen{" + "id=" + id + ", typeExamenEnum=" + typeExamenEnum + ", resultat=" + resultat + ", dateExamen=" + dateExamen + '}';
    }
    
    
}
