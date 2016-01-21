/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gfitest.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author antony
 */
public class JDBConnection {

    private static JDBConnection instance = null;
    private Connection conn = null;

    private JDBConnection() {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            conn = DriverManager.getConnection("jdbc:mysql://hostname:port/dbname", "username", "password");
        } catch (ClassNotFoundException e) {
            System.out.println("Where is your MySQL JDBC Driver?");
        } catch (SQLException ex) {
            Logger.getLogger(JDBConnection.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public static JDBConnection getInstance() {
        if (instance == null) {
            instance = new JDBConnection();
        }
        return instance;
    }
}
