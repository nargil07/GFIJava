/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gfitest.entity;

/**
 *
 * @author antony
 */
public class Medecin {
    private int id_medecin;
    private String nom;
    private String prenom;
    private String typeMedecin;

    public Medecin() {}

    public Medecin(int id_medecin, String nom, String prenom, String typeMedecin) {
        this.id_medecin = id_medecin;
        this.nom = nom;
        this.prenom = prenom;
        this.typeMedecin = typeMedecin;
    }

    public int getId_medecin() {
        return id_medecin;
    }

    public void setId_medecin(int id_medecin) {
        this.id_medecin = id_medecin;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public String getTypeMedecin() {
        return typeMedecin;
    }

    public void setTypeMedecin(String typeMedecin) {
        this.typeMedecin = typeMedecin;
    }

    @Override
    public String toString() {
        return "Medecin{" + "id_medecin=" + id_medecin + ", nom=" + nom + ", prenom=" + prenom + ", typeMedecin=" + typeMedecin + '}';
    }
    
    
    
    
}
