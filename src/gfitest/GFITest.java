/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gfitest;

import gfitest.entity.Patient;
import gfitest.facade.PatientFacade;
import gfitest.frame.LoginFrame;
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
        
        PatientFacade p = new PatientFacade();
        List<Patient> list = p.findAll();
        System.out.println(p.findById(list.get(0).getNum_dossier()));
        System.out.println(Arrays.toString(list.toArray()));
        JFrame frame = new LoginFrame();
        frame.setVisible(true);
        
    }
    
}