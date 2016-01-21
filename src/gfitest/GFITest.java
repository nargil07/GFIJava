/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gfitest;

import gfitest.jdbc.JDBConnection;
import javax.swing.JFrame;

/**
 *
 * @author antony
 */
public class GFITest {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        JDBConnection jdbc = JDBConnection.getInstance();
        JFrame frame = new PagePrincipale();
        frame.setVisible(true);
        
    }
    
}
