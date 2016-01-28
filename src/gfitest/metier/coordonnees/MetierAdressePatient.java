/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gfitest.metier.coordonnees;

import gfitest.entity.Patient;
import gfitest.facade.AdresseFacade;

/**
 *
 * @author Antony
 */
public class MetierAdressePatient extends MetierAdresse{
    private final Patient patient;
    private final AdresseFacade adresseFacade = new AdresseFacade();
    
    public MetierAdressePatient(Patient patient) {
        this.patient = patient;
        setListEntities(adresseFacade.findByIdPatient(patient.getNum_dossier()));
    }
}
