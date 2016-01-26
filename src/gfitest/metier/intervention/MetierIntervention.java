/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gfitest.metier.intervention;

import gfitest.entity.Intervention;
import gfitest.metier.AbstractMetier;

/**
 *
 * @author Antony
 */
public class MetierIntervention extends AbstractMetier<Intervention>{

    @Override
    protected String getId(Intervention entity) {
        return String.valueOf(entity.getId());
    }
    
}
