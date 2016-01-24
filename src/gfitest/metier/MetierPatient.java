/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gfitest.metier;

import gfitest.entity.Patient;
import gfitest.facade.PatientFacade;
import java.util.List;

/**
 *
 * @author antony
 */
public class MetierPatient extends AbstractMetier<Patient>{

    protected final PatientFacade patientFacade = new PatientFacade();
    
    @Override
    protected String getId(Patient entity) {
        return String.valueOf(entity.getNum_dossier());
    }
    
    public List<Patient> getAll(){
        setListEntities(patientFacade.findAll());
        return getList();
    }
}
