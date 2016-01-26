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
        
        MetierMedecin metierMedecin = new MetierMedecin();
        ServiceMedecin serviceMedecin = new ServiceMedecin(metierMedecin.getAll().get(0));
        ServicePatient servicePatient = new ServicePatient(serviceMedecin.getMetierPatientMedecin().getList().get(0));
        System.out.println(serviceMedecin.getEntity());
        System.out.println(Arrays.toString(serviceMedecin.getMetierPatientMedecin().getAll().toArray()));
        System.out.println(servicePatient.toString());
        JFrame frame = new LoginFrame();
        frame.setVisible(true);
        
    }
    
}