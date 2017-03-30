/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package affichage;

import java.awt.Component;
import javax.swing.JList;
import javax.swing.JTextArea;
import javax.swing.ListCellRenderer;

/**
 * Class to set a custom renderer(in column) for the contacts list
 * @author Philip
 */
public class MonRenderer extends JTextArea  implements ListCellRenderer {
    
    /**
     *
     * @param list
     * @param value
     * @param index
     * @param isSelected
     * @param cellHasFocus
     * @return
     */
    @Override
    public Component getListCellRendererComponent(JList list, Object value, int index, boolean isSelected, boolean cellHasFocus){
        
        JTextArea res= new JTextArea();
        res.setText(value.toString());

        return res;
    }
}
