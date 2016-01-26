/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gfitest.facade;

import gfitest.entity.Medecin;
import gfitest.entity.Patient;
import gfitest.enums.SexeEnum;
import gfitest.enums.SituationFamilleEnum;
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
public class MedecinFacade extends AbstractFacade<Medecin>{

    @Override
    public List<Medecin> findAll() {
        List<Medecin>list = new ArrayList<>();
        try {
            PreparedStatement preparedStatement = connection.prepareStatement(""
                    + "SELECT `id_medecin`,`nom`,`prenom`,`typeMedecin` FROM `medecin`");
            ResultSet resultSet = preparedStatement.executeQuery();
            while (resultSet.next()) {                
                list.add(convertResultSet(resultSet));
            }
            resultSet.close();
        } catch (SQLException ex) {
            Logger.getLogger(MedecinFacade.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return list;
    }

    @Override
    public Medecin findById(int id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    protected Medecin convertResultSet(ResultSet resultSet) {
        try {
            Medecin medecin = new Medecin();
            medecin.setId_medecin(resultSet.getInt("id_medecin"));
            medecin.setNom(resultSet.getString("nom"));
            medecin.setPrenom(resultSet.getString("prenom"));
            medecin.setTypeMedecin(resultSet.getString("typeMedecin"));
            return medecin;
        } catch (SQLException ex) {
            Logger.getLogger(PatientFacade.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }
    }
    
}
