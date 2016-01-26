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
public class Adresse {
    private int id_adresse;
    private String adresse;
    private String codePostal;
    private String ville;
    private String pays;
    private String tel_mobile;
    private String tel_fixe;
    private String email;

    public Adresse() {
    }

    public Adresse(int id_adresse, String adresse, String codePostal, String ville, String pays, String tel_mobile, String tel_fixe, String email) {
        this.id_adresse = id_adresse;
        this.adresse = adresse;
        this.codePostal = codePostal;
        this.ville = ville;
        this.pays = pays;
        this.tel_mobile = tel_mobile;
        this.tel_fixe = tel_fixe;
        this.email = email;
    }

    public int getId_adresse() {
        return id_adresse;
    }

    public void setId_adresse(int id_adresse) {
        this.id_adresse = id_adresse;
    }

    public String getAdresse() {
        return adresse;
    }

    public void setAdresse(String adresse) {
        this.adresse = adresse;
    }

    public String getCodePostal() {
        return codePostal;
    }

    public void setCodePostal(String codePostal) {
        this.codePostal = codePostal;
    }

    public String getVille() {
        return ville;
    }

    public void setVille(String ville) {
        this.ville = ville;
    }

    public String getPays() {
        return pays;
    }

    public void setPays(String pays) {
        this.pays = pays;
    }

    public String getTel_mobile() {
        return tel_mobile;
    }

    public void setTel_mobile(String tel_mobile) {
        this.tel_mobile = tel_mobile;
    }

    public String getTel_fixe() {
        return tel_fixe;
    }

    public void setTel_fixe(String tel_fixe) {
        this.tel_fixe = tel_fixe;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "Adresse{" + "id_adresse=" + id_adresse + ", adresse=" + adresse + ", codePostal=" + codePostal + ", ville=" + ville + ", pays=" + pays + ", tel_mobile=" + tel_mobile + ", tel_fixe=" + tel_fixe + ", email=" + email + '}';
    }
    
    
}
