/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package contacts;

import java.util.ArrayList;

/**
 *
 * @author Nanwee
 */
public class ListeContacts {
    private static ListeContacts instance = null;
    private ArrayList<Contact> contacts;
    
    
    private ListeContacts(){
        contacts = new ArrayList<>();
    }
    public static ListeContacts getInstance() {
        if(ListeContacts.instance==null){
            ListeContacts.instance = new ListeContacts();
        }
        return ListeContacts.instance;
    }

    /**
     * Fonction qui permet d'ajouter un contact à la liste.
     * @param c C'est le contact que l'on veut ajouter, objet de type Contact.
     * @return retourne un booléen indiquant si la fonction a réussi.
     */
    public boolean ajouter(Contact c) {
        
       boolean result =this.contacts.add(c);
       return result;
    }
    
    /**
     *  Méthode qui permet de rechercher un contact dans la liste.
     * @param nom Le nom du contact à rechercher, type String
     * @return La liste des contacts correspondant à la recherche.
     */
    public ArrayList rechercher(String nom){
        
        ArrayList listeRetour = new ArrayList();
        nom = nom.toLowerCase();
        for(Contact c : this.contacts){
        
        if( c.getNom().toLowerCase().contains(nom)){
            listeRetour.add(c);
        } else {
        }
        }
        
        return listeRetour;
    
    
    }
    
    //fonction de sauvegarde de la liste de contacts.
    public void enregistrer(){}
    
    //fonction qui charge la liste de contacts.
    static public void charger(){}
}
