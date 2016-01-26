/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gfitest.facade;

import gfitest.entity.Intervention;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Antony
 */
public class InterventionFacade extends AbstractFacade<Intervention>{

    @Override
    public List<Intervention> findAll() {
        List<Intervention>list = new ArrayList<>();
        try {
            PreparedStatement preparedStatement = connection.prepareStatement("SELECT `id`, `dateIntervention`, `coût`, `resultat`, `description` FROM `intervention`");
            ResultSet resultSet = preparedStatement.executeQuery();
            while (resultSet.next()){                
                list.add(convertResultSet(resultSet));
            }
            resultSet.close();
        } catch (SQLException ex) {
            Logger.getLogger(InterventionFacade.class.getName()).log(Level.SEVERE, null, ex);
        }
        return list;
    }

    @Override
    public Intervention findById(int id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    protected Intervention convertResultSet(ResultSet resultSet) {
        Intervention intervention = new Intervention();
        try {
            intervention.setId(resultSet.getInt("id"));
            intervention.setCout(resultSet.getInt("coût"));
            intervention.setDescription(resultSet.getString("description"));
            intervention.setResultat(resultSet.getString("resultat"));
            intervention.setDateIntervention(resultSet.getTimestamp("dateIntervention"));
        } catch (SQLException ex) {
            Logger.getLogger(InterventionFacade.class.getName()).log(Level.SEVERE, null, ex);
        }
        return intervention;
    }
    
}
