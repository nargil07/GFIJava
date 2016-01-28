/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gfitest.service;

import gfitest.entity.Patient;
import gfitest.metier.coordonnees.MetierAdressePatient;
import gfitest.metier.examen.MetierExamenPatient;
import gfitest.metier.intervention.MetierInterventionPatient;
import java.util.Arrays;

/**
 *
 * @author antony
 */
public class ServicePatient extends AbstractService<Patient>{

    private final MetierExamenPatient examenPatient;
    private final MetierInterventionPatient interventionPatient;
    private final MetierAdressePatient adressePatient;
    
    public ServicePatient(Patient entity) {
        super(entity);
        examenPatient = new MetierExamenPatient(entity);
        interventionPatient = new MetierInterventionPatient(entity);
        adressePatient = new MetierAdressePatient(entity);
    }

    public MetierExamenPatient getExamenPatient() {
        return examenPatient;
    }

    public MetierInterventionPatient getInterventionPatient() {
        return interventionPatient;
    }

    public MetierAdressePatient getAdressePatient() {
        return adressePatient;
    }

    
    
    @Override
    public String toString() {
        return "ServicePatient{\n"
                + getEntity().toString()+ "\n"
                + Arrays.toString(examenPatient.getList().toArray()) + "\n"
                + Arrays.toString(interventionPatient.getList().toArray()) + "\n"
                + Arrays.toString(adressePatient.getList().toArray()) + "\n"
                + '}';
    }
    
    
}
