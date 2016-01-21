/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gfitest.metier;

import gfitest.entity.Patient;

/**
 *
 * @author antony
 */
public class MetierPatient extends AbstractMetier<Patient>{

    @Override
    public String getId(Patient entity) {
        return String.valueOf(entity.getNum_dossier());
    }
    
}
