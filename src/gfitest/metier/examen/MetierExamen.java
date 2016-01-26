/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gfitest.metier.examen;

import gfitest.entity.Examen;
import gfitest.metier.AbstractMetier;

/**
 *
 * @author Antony
 */
public class MetierExamen extends AbstractMetier<Examen>{

    @Override
    protected String getId(Examen entity) {
        return String.valueOf(entity.getId());
    }
    
}
