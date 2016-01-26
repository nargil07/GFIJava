/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gfitest.facade;

import gfitest.entity.Adresse;
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
public class AdresseFacade extends AbstractFacade<Adresse>{

    @Override
    public List<Adresse> findAll() {
        List<Adresse>list = new ArrayList<>();
        try {
            PreparedStatement preparedStatement = connection.prepareStatement(""
                    + "SELECT `id`, `adresse`, `codepostal`, `ville`, `pays`, `tel_mobile`, `tel_fixe`, `email` "
                    + "FROM `adresse`");
            ResultSet resultSet = preparedStatement.executeQuery();
            while (resultSet.next()) {
                list.add(convertResultSet(resultSet));
            }
            resultSet.close();
        } catch (SQLException ex) {
            Logger.getLogger(AdresseFacade.class.getName()).log(Level.SEVERE, null, ex);
        }
        return list;
    }

    @Override
    public Adresse findById(int id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    protected Adresse convertResultSet(ResultSet resultSet) {
        Adresse adresse = new Adresse();
        try {
            adresse.setId_adresse(resultSet.getInt("id"));
            adresse.setAdresse(resultSet.getString("adresse"));
            adresse.setCodePostal(resultSet.getString("codepostal"));
            adresse.setVille(resultSet.getString("ville"));
            adresse.setPays(resultSet.getString("pays"));
            adresse.setTel_mobile(resultSet.getString("tel_mobile"));
            adresse.setTel_fixe(resultSet.getString("tel_fixe"));
            adresse.setEmail(resultSet.getString("email"));
        } catch (SQLException ex) {
            Logger.getLogger(AdresseFacade.class.getName()).log(Level.SEVERE, null, ex);
        }
        return adresse;
    }
    
}
