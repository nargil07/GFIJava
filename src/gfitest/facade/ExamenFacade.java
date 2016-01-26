/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gfitest.facade;

import gfitest.entity.Examen;
import gfitest.enums.TypeExamenEnum;
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
public class ExamenFacade extends AbstractFacade<Examen>{

    @Override
    public List<Examen> findAll() {
        List<Examen> list = new ArrayList<>();
        try {
            PreparedStatement preparedStatement = connection.prepareStatement("SELECT `idExam`, `resultat`, `dateExam`, `Type` FROM `examen`");
            ResultSet resultSet = preparedStatement.executeQuery();
            while(resultSet.next()){
                list.add(convertResultSet(resultSet));
            }
            resultSet.close();
        } catch (SQLException ex) {
            Logger.getLogger(ExamenFacade.class.getName()).log(Level.SEVERE, null, ex);
        }
        return list;
    }

    @Override
    public Examen findById(int id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    protected Examen convertResultSet(ResultSet resultSet) {
        Examen examen = new Examen();
        try {
            examen.setId(resultSet.getInt("idExam"));
            examen.setResultat(resultSet.getString("resultat"));
            examen.setDateExamen(resultSet.getTimestamp("dateExam"));
            examen.setTypeExamenEnum(TypeExamenEnum.values()[resultSet.getInt("Type")]);
        } catch (SQLException ex) {
            Logger.getLogger(ExamenFacade.class.getName()).log(Level.SEVERE, null, ex);
        }
        return examen;
    }
    
}
