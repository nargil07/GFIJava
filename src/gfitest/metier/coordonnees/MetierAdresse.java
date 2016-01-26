/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gfitest.metier.coordonnees;

import gfitest.entity.Adresse;
import gfitest.metier.AbstractMetier;

/**
 *
 * @author antony
 */
public class MetierAdresse extends AbstractMetier<Adresse>{

    @Override
    protected String getId(Adresse entity) {
        return String.valueOf(entity.getId_adresse());
    }
    
}
