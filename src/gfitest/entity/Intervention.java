/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gfitest.entity;

import java.sql.Timestamp;

/**
 *
 * @author Antony
 */
public class Intervention {
    private int id;
    private Timestamp dateIntervention;
    private int cout;
    private String resultat;
    private String description;

    public Intervention() {
    }

    public Intervention(int id, Timestamp dateIntervention, int cout, String resultat, String description) {
        this.id = id;
        this.dateIntervention = dateIntervention;
        this.cout = cout;
        this.resultat = resultat;
        this.description = description;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Timestamp getDateIntervention() {
        return dateIntervention;
    }

    public void setDateIntervention(Timestamp dateIntervention) {
        this.dateIntervention = dateIntervention;
    }

    public int getCout() {
        return cout;
    }

    public void setCout(int cout) {
        this.cout = cout;
    }

    public String getResultat() {
        return resultat;
    }

    public void setResultat(String resultat) {
        this.resultat = resultat;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public String toString() {
        return "Intervention{" + "id=" + id + ", dateIntervention=" + dateIntervention + ", cout=" + cout + ", resultat=" + resultat + ", description=" + description + '}';
    }
}
