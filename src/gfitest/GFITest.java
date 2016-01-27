/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gfitest;

import com.sun.xml.internal.ws.spi.db.BindingContextFactory;
import gfitest.entity.Patient;
import gfitest.facade.PatientFacade;
import gfitest.frame.LoginFrame;
import gfitest.metier.MetierMedecin;
import gfitest.service.ServiceMedecin;
import gfitest.service.ServicePatient;
import java.util.Arrays;
import java.util.List;
import javax.swing.JFrame;

/**
 *
 * 
 * @author antony
 */
public class GFITest {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        JFrame frame = new LoginFrame();
        frame.setVisible(true);
        
    }
    
}