/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gfitest.metier;

import gfitest.entity.Medecin;

/**
 *
 * @author Antony
 */
public class MetierPatientMedecin extends MetierPatient{
    private final Medecin medecin;

    public MetierPatientMedecin(Medecin medecin) {
        this.medecin = medecin;
        this.setListEntities(patientFacade.findAll());
    }
}