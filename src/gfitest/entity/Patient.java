/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gfitest.entity;

import gfitest.enums.SexeEnum;
import gfitest.enums.SituationFamilleEnum;
import java.sql.Timestamp;

/**
 *
 * @author antony
 */
public class Patient{

    private int num_dossier;
    private String nom;
    private String prenom;
    private Timestamp dateNaissance;
    private SexeEnum sexe;
    private SituationFamilleEnum situationFamilleEnum;
    private String numSejour;
    private int secu;
    private int communeNaissance;
    private String nationalite;
    private Timestamp dateDeces;

    public Patient() {
    }

    public Patient(int num_dossier, String nom, String prenom, Timestamp dateNaissance, SexeEnum sexe, SituationFamilleEnum situationFamilleEnum, String numSejour, int secu, int communeNaissance, String nationalite, Timestamp dateDeces) {
        this.num_dossier = num_dossier;
        this.nom = nom;
        this.prenom = prenom;
        this.dateNaissance = dateNaissance;
        this.sexe = sexe;
        this.situationFamilleEnum = situationFamilleEnum;
        this.numSejour = numSejour;
        this.secu = secu;
        this.communeNaissance = communeNaissance;
        this.nationalite = nationalite;
        this.dateDeces = dateDeces;
    }

    public int getNum_dossier() {
        return num_dossier;
    }

    public void setNum_dossier(int num_dossier) {
        this.num_dossier = num_dossier;
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

    public Timestamp getDateNaissance() {
        return dateNaissance;
    }

    public void setDateNaissance(Timestamp dateNaissance) {
        this.dateNaissance = dateNaissance;
    }

    public SexeEnum getSexe() {
        return sexe;
    }

    public void setSexe(SexeEnum sexe) {
        this.sexe = sexe;
    }

    public SituationFamilleEnum getSituationFamilleEnum() {
        return situationFamilleEnum;
    }

    public void setSituationFamilleEnum(SituationFamilleEnum situationFamilleEnum) {
        this.situationFamilleEnum = situationFamilleEnum;
    }

    public String getNumSejour() {
        return numSejour;
    }

    public void setNumSejour(String numSejour) {
        this.numSejour = numSejour;
    }

    public int getSecu() {
        return secu;
    }

    public void setSecu(int secu) {
        this.secu = secu;
    }

    public int getCommuneNaissance() {
        return communeNaissance;
    }

    public void setCommuneNaissance(int communeNaissance) {
        this.communeNaissance = communeNaissance;
    }

    public String getNationalite() {
        return nationalite;
    }

    public void setNationalite(String nationalite) {
        this.nationalite = nationalite;
    }

    public Timestamp getDateDeces() {
        return dateDeces;
    }

    public void setDateDeces(Timestamp dateDeces) {
        this.dateDeces = dateDeces;
    }

    @Override
    public String toString() {
        return "Patient{" + "num_dossier=" + num_dossier + ", nom=" + nom + ", prenom=" + prenom + ", dateNaissance=" + dateNaissance + ", sexe=" + sexe + ", situationFamilleEnum=" + situationFamilleEnum + ", numSejour=" + numSejour + ", secu=" + secu + ", communeNaissance=" + communeNaissance + ", nationalite=" + nationalite + ", dateDeces=" + dateDeces + '}';
    }
}
