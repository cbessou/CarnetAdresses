/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package contacts;

/**
 *
 * @author Nanwee
 */
public class ListeContacts {
    private static ListeContacts instance = null;
    
    private ListeContacts(){
    }
    public static ListeContacts getInstance() {
        if(ListeContacts.instance==null){
            ListeContacts.instance = new ListeContacts();
        }
        return ListeContacts.instance;
    }

    public void ajouter(Contact c) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
