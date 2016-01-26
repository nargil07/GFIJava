/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gfitest.service;

import gfitest.entity.Medecin;
import gfitest.metier.MetierPatientMedecin;

/**
 *
 * @author Antony
 */
public class ServiceMedecin extends AbstractService<Medecin>{
    protected MetierPatientMedecin metierPatientMedecin = null;

    public ServiceMedecin(Medecin entity) {
        super(entity);
        metierPatientMedecin = new MetierPatientMedecin(entity);
    }

    public MetierPatientMedecin getMetierPatientMedecin() {
        return metierPatientMedecin;
    }

    public void setMetierPatientMedecin(MetierPatientMedecin metierPatientMedecin) {
        this.metierPatientMedecin = metierPatientMedecin;
    }
}
