/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package affichage;

import java.awt.Component;
import javax.swing.DefaultListCellRenderer;
import javax.swing.JList;
import javax.swing.JTextArea;
import javax.swing.ListCellRenderer;

/**
 *
 * @author Philip
 */
public class MonRenderer extends JTextArea  implements ListCellRenderer {
    
    
    
    public Component getListCellRendererComponent(JList list, Object value, int index, boolean isSelected, boolean cellHasFocus){
        
        JTextArea res= new JTextArea();
        res.setText(value.toString());
        
        
        return res;
    
    
    
    
    
    }
}
