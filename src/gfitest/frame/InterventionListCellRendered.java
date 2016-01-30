/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gfitest.frame;

import gfitest.entity.Intervention;
import java.awt.Color;
import java.awt.Component;
import java.awt.ComponentOrientation;
import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.LayoutManager;
import java.text.DateFormat;
import javax.swing.JComponent;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.ListCellRenderer;

/**
 *
 * @author antony
 */
public class InterventionListCellRendered implements ListCellRenderer<Intervention>{
    @Override
    public Component getListCellRendererComponent(JList<? extends Intervention> list, Intervention value, int index, boolean isSelected, boolean cellHasFocus) {
        GridLayout gridLayout = new GridLayout(2, 1);
        JPanel jp = new JPanel(gridLayout);
        JLabel jLabel = new JLabel(value.getResultat());
        jLabel.setPreferredSize(new Dimension(25, 20));
        JTextArea jTextArea = new JTextArea(value.getDescription());
        jTextArea.setWrapStyleWord(true);
        if((index % 2) == 0){
            jp.setBackground(new Color(230, 230, 230));
        }
        jp.setPreferredSize(new Dimension(25, 80));
        jp.add(jLabel);
        jp.add(jTextArea);
        return jp;
    }
}
