/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package carnetadresses;

import contacts.Contact;
import contacts.FabriqueContact;
import contacts.ListeContacts;
import java.util.ArrayList;

/**
 *
 * @author Nanwee
 */
public class FacadeContacts {
    public ArrayList<String> rechercher(String rech){
        ArrayList<String> liste = new ArrayList();
        ArrayList<Contact> l = ListeContacts.getInstance().rechercher(rech);
        l.forEach(c->{
            liste.add(c.toString());
        });
        return liste;
    }
    
    public void creerContact(String[] coord){
        FabriqueContact f = new FabriqueContact();
        try{
            Contact c = f.creeContact(coord[0], coord[1], coord[2], coord[3], coord[4], coord[5], coord[6]);
            if (c!=null){
                ajouterContact(c);
            }else{
                System.out.println("Impossible de créer le contact");
            }
            
        }catch(NumberFormatException e){
            System.out.println(e.getMessage());
        }
    }
    
    public void ajouterContact(Contact c){
        ListeContacts l = ListeContacts.getInstance();
        l.ajouter(c);
    }
}
