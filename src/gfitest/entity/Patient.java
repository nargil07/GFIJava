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
    private String adresse;
    private String ville;
    private String codePostal;
    private String telephoneFixe;
    private String telephoneMobile;
    private SituationFamilleEnum situationFamilleEnum;
    private String numSejour;
    private int secu;
    private int communeNaissance;
    private String nationalite;
    private Timestamp dateDeces;
    private String email;
    private Medecin medecinGeneraliste;
    private String nomAyantDroit;
    private String prenomAyantDroit;
    private String telephoneAyantDroit;
    private String mailAyantDroit;

    public Patient(int num_dossier,String nom, String prenom, Timestamp dateNaissance, SexeEnum sexe, String adresse, String ville, String codePostal, String telephoneFixe, String telephoneMobile, SituationFamilleEnum situationFamilleEnum, String numSejour, int secu, int communeNaissance, String nationalite, Timestamp dateDeces, String email, Medecin medecinGeneraliste, String nomAyantDroit, String prenomAyantDroit, String telephoneAyantDroit, String mailAyantDroit) {
        this.num_dossier = num_dossier;
        this.nom = nom;
        this.prenom = prenom;
        this.dateNaissance = dateNaissance;
        this.sexe = sexe;
        this.adresse = adresse;
        this.ville = ville;
        this.codePostal = codePostal;
        this.telephoneFixe = telephoneFixe;
        this.telephoneMobile = telephoneMobile;
        this.situationFamilleEnum = situationFamilleEnum;
        this.numSejour = numSejour;
        this.secu = secu;
        this.communeNaissance = communeNaissance;
        this.nationalite = nationalite;
        this.dateDeces = dateDeces;
        this.email = email;
        this.medecinGeneraliste = medecinGeneraliste;
        this.nomAyantDroit = nomAyantDroit;
        this.prenomAyantDroit = prenomAyantDroit;
        this.telephoneAyantDroit = telephoneAyantDroit;
        this.mailAyantDroit = mailAyantDroit;
    }

    public int getNum_dossier() {
        return num_dossier;
    }

    public void setNum_dossier(int num_dossier) {
        this.num_dossier = num_dossier;
    }
    
    public String getTelephoneFixe() {
        return telephoneFixe;
    }

    public void setTelephoneFixe(String telephoneFixe) {
        this.telephoneFixe = telephoneFixe;
    }

    public String getTelephoneMobile() {
        return telephoneMobile;
    }

    public void setTelephoneMobile(String telephoneMobile) {
        this.telephoneMobile = telephoneMobile;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Medecin getMedecinGeneraliste() {
        return medecinGeneraliste;
    }

    public void setMedecinGeneraliste(Medecin medecinGeneraliste) {
        this.medecinGeneraliste = medecinGeneraliste;
    }

    public String getNomAyantDroit() {
        return nomAyantDroit;
    }

    public void setNomAyantDroit(String nomAyantDroit) {
        this.nomAyantDroit = nomAyantDroit;
    }

    public String getPrenomAyantDroit() {
        return prenomAyantDroit;
    }

    public void setPrenomAyantDroit(String prenomAyantDroit) {
        this.prenomAyantDroit = prenomAyantDroit;
    }

    public String getTelephoneAyantDroit() {
        return telephoneAyantDroit;
    }

    public void setTelephoneAyantDroit(String telephoneAyantDroit) {
        this.telephoneAyantDroit = telephoneAyantDroit;
    }

    public String getMailAyantDroit() {
        return mailAyantDroit;
    }

    public void setMailAyantDroit(String mailAyantDroit) {
        this.mailAyantDroit = mailAyantDroit;
    }

    public Patient() {
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

    public String getAdresse() {
        return adresse;
    }

    public void setAdresse(String adresse) {
        this.adresse = adresse;
    }

    public String getVille() {
        return ville;
    }

    public void setVille(String ville) {
        this.ville = ville;
    }

    public String getCodePostal() {
        return codePostal;
    }

    public void setCodePostal(String codePostal) {
        this.codePostal = codePostal;
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
        return "Patient{" + "num_dossier=" + num_dossier + ", nom=" + nom + ", prenom=" + prenom + ", dateNaissance=" + dateNaissance + ", sexe=" + sexe + ", adresse=" + adresse + ", ville=" + ville + ", codePostal=" + codePostal + ", telephoneFixe=" + telephoneFixe + ", telephoneMobile=" + telephoneMobile + ", situationFamilleEnum=" + situationFamilleEnum + ", numSejour=" + numSejour + ", secu=" + secu + ", communeNaissance=" + communeNaissance + ", nationalite=" + nationalite + ", dateDeces=" + dateDeces + ", email=" + email + ", medecinGeneraliste=" + medecinGeneraliste + ", nomAyantDroit=" + nomAyantDroit + ", prenomAyantDroit=" + prenomAyantDroit + ", telephoneAyantDroit=" + telephoneAyantDroit + ", mailAyantDroit=" + mailAyantDroit + '}';
    }
    
    
}
