/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gfitest.facade;


import gfitest.entity.Patient;
import gfitest.jdbc.JDBConnection;
import java.sql.Connection;
import java.util.List;

/**
 *
 * @author antony
 * @param <T>
 */
public abstract class AbstractFacade<T> {

    protected final Connection connection;
    
    public AbstractFacade() {
        connection = JDBConnection.getInstance().getConn();
    }
    
    
    public abstract List<T> findAll();
    public abstract T findById(int id);
}
