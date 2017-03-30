/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package contacts;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

/**
 *  Gere la liste des contacts 
 * @author Nanwee
 */
public class ListeContacts {
    private static ListeContacts instance = null;
    private ArrayList<Contact> contacts;
    private String pathname = "./listeContacts.dat";
    
    
    private ListeContacts() throws IOException, FileNotFoundException, ClassNotFoundException{
        
        contacts = new ArrayList<>();
        
    }
    public static ListeContacts getInstance() throws IOException, FileNotFoundException, ClassNotFoundException {
        if(ListeContacts.instance==null){
            ListeContacts.instance = new ListeContacts();
            instance.charger();
           
            
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
       this.enregistrer();
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
    
    

    /**
     *fonction de sauvegarde de la liste de contacts.
     */
    
    public void enregistrer(){
        
    try {
        ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream(this.pathname));
        out.writeObject(this.contacts);
        out.close();
        }catch(IOException e){
            e.getMessage();
        }
    }
    
    

    /**
     *fonction qui charge la liste de contacts au démarrage.
     */
    public void charger(){
        try{
            ObjectInputStream in;
            in = new ObjectInputStream(new FileInputStream(this.pathname));
            ArrayList listeContact = (ArrayList) in.readObject();
            this.contacts= listeContact;
        }catch(IOException|ClassNotFoundException e){
            System.out.println("Erreur de chargement du fichier" + e.getMessage());
        }
    }
    
    
    @Override
    public String toString(){
    
    return (""+contacts);
    }
}
