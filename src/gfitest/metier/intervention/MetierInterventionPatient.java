/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gfitest.metier.intervention;

import gfitest.entity.Patient;
import gfitest.facade.InterventionFacade;

/**
 *
 * @author Antony
 */
public class MetierInterventionPatient extends MetierIntervention{

    private final Patient patient;
    private final InterventionFacade interventionFacade = new InterventionFacade();

    public MetierInterventionPatient(Patient patient) {
        this.patient = patient;
        setListEntities(interventionFacade.findAll());
    }
    
}
