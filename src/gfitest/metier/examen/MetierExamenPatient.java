/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gfitest.metier.examen;

import gfitest.entity.Patient;
import gfitest.facade.ExamenFacade;

/**
 *
 * @author Antony
 */
public class MetierExamenPatient extends MetierExamen{
    private final Patient patient;
    private final ExamenFacade examenFacade = new ExamenFacade();
    public MetierExamenPatient(Patient patient) {
        this.patient = patient;
        setListEntities(examenFacade.findAll());
    }
}
