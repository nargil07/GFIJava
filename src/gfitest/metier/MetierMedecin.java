/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gfitest.metier;

import gfitest.entity.Medecin;
import gfitest.entity.Patient;
import gfitest.facade.MedecinFacade;
import java.util.List;

/**
 *
 * @author Antony
 */
public class MetierMedecin extends AbstractMetier<Medecin>{

    protected final MedecinFacade medecinFacade = new MedecinFacade();
    @Override
    protected String getId(Medecin entity) {
        return String.valueOf(entity.getId_medecin());
    }
    
    public List<Medecin> getAll(){
        setListEntities(medecinFacade.findAll());
        return getList();
    }
    
}
