/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package carnetadresses;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Nanwee
 */
public class SelecteurOperation {
    private boolean exec;
    private Scanner k;
    
    /**
     *
     */
    public SelecteurOperation(){
        this.k = new Scanner(System.in);
        exec = true;
    }

    /**
     * demarre le sélecteur et attends une entrée de l'utilisateur pour choisir l'action à effectuer
     */
    public void start(){
        while(exec){
            System.out.println("Que voulez-vous faire ?\n1: afficher les contacts\n"
                + "2: rechercher des contacts\n3: ajouter un contact\n4: sortir");
            int choix = k.nextInt();
            switch (choix){
                case 1:
            {
                try {
                    afficher("");
                } catch (IOException | ClassNotFoundException ex) {
                    Logger.getLogger(SelecteurOperation.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
                    break;
                case 2:
            {
                try {
                    rechercher();
                } catch (IOException | ClassNotFoundException ex) {
                    Logger.getLogger(SelecteurOperation.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
                    break;
                case 3:
                    ajouter();
                    break;
                case 4:
                    exec = false;
                    break;
            }
        }
        
    }
    
    private String readLine(){
        String val = k.nextLine();
        if(val.length()!=0){
            return val;
        }else{
            return "";
        }
    }

    /**
     * demande à l'utilisateur de saisir les informations du contact puis lance l'ajout
     */
    public void ajouter(){
        k.nextLine();
        String[] coord = new String[7];
        /*Nom*/
        System.out.println("Nom :");
        coord[0]=readLine();
        /*Prenom*/
        System.out.println("Prénom :");
        coord[1]=readLine();
        /*Telephone*/
        System.out.println("Numéro de téléphone :");
        coord[2]=readLine();
        /*Mail*/
        System.out.println("Adresse mail :");
        coord[3]=readLine();
        /*Adresse*/
        System.out.println("Adresse postale (n° et rue) :");
        coord[4]=readLine();
        /*Code Postal*/
        System.out.println("Adresse postale (Code postal) :");
        coord[5]=readLine();
        /*Ville*/
        System.out.println("Adresse postale (Ville) :");
        coord[6]=readLine();
        
        FacadeContacts f = new FacadeContacts();
        f.creerContact(coord);
    }
    
    /**
     * demande à l'utilisateur de saisir le nom à rechercher puis lance l'affichage
     * @throws IOException
     * @throws FileNotFoundException
     * @throws ClassNotFoundException
     */
    public void rechercher() throws IOException, FileNotFoundException, ClassNotFoundException{
        System.out.println("Nom à rechercher :");
        String val = k.nextLine();
        afficher(val);
    }
    
    /**
     * affiche les contacts correspondant à une chaine de caractères
     * @param nom
     * @throws IOException
     * @throws FileNotFoundException
     * @throws ClassNotFoundException
     */
    public void afficher(String nom) throws IOException, FileNotFoundException, ClassNotFoundException{
        FacadeContacts f = new FacadeContacts();
        ArrayList<String> liste = f.rechercher(nom);
        liste.forEach(c->{
            System.out.println(c);
        });
    }
}
