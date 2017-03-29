/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package carnetadresses;

import contacts.Contact;
import contacts.FabriqueContact;
import contacts.ListeContacts;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Nanwee
 */
public class FacadeContacts {
    public ArrayList<String> rechercher(String rech) throws IOException, FileNotFoundException, ClassNotFoundException{
        ArrayList<String> liste = new ArrayList();
        ArrayList<Contact> l = ListeContacts.getInstance().rechercher(rech);
        l.forEach(c->{
            liste.add(c.toString());
        });
        return liste;
    }
    
    public void creerContact(String[] coord){
        FabriqueContact f = new FabriqueContact();
        Contact c;
        c = f.creeContact(coord[0], coord[1], coord[2], coord[3], coord[4], coord[5], coord[6]);
        if (c==null){
            System.out.println("Impossible de créer le contact");
        }else{
            try {
                ajouterContact(c);
            } catch (IOException ex) {
                Logger.getLogger(FacadeContacts.class.getName()).log(Level.SEVERE, null, ex);
            } catch (ClassNotFoundException ex) {
                Logger.getLogger(FacadeContacts.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
    
    public void ajouterContact(Contact c) throws IOException, FileNotFoundException, ClassNotFoundException{
        ListeContacts l = ListeContacts.getInstance();
        l.ajouter(c);
    }
}
