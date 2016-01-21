/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gfitest.service;

import gfitest.entity.Patient;

/**
 *
 * @author antony
 */
public class ServicePatient extends AbstractService<Patient>{

    
    public ServicePatient(Patient entity) {
        super(entity);
    }
    
}
