/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package carnetadresses;

import contacts.ListeContacts;
import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author Nanwee
 */
public class SelecteurOperation {
   
    public static void start(){
        boolean exec = true;
        Scanner k = new Scanner(System.in);
        while(exec){
            System.out.println("Que voulez-vous faire ?\n1: afficher les contacts\n"
                + "2: rechercher des contacts\n3: ajouter un contact\n4: sortir");
            int choix = k.nextInt();
            switch (choix){
                case 1:
                    SelecteurOperation.afficher("");
                    break;
                case 2:
                    SelecteurOperation.rechercher();
                    break;
                case 3:
                    SelecteurOperation.ajouter();
                    break;
                case 4:
                    exec = false;
                    break;
            }
        }
        
    }
    
    public static void ajouter(){
        String[] coord = new String[7];
        String val;
        Scanner k = new Scanner(System.in);
        /*Nom*/
        System.out.println("Nom :");
        val = k.nextLine();
        //verif validité
        
        //si ok, ajout dans le tableau
        coord[0]=val;
        /*Prenom*/
        System.out.println("Prénom :");
        val = k.nextLine();
        //verif validité
        
        //si ok, ajout dans le tableau
        coord[1]=val;
        /*Telephone*/
        System.out.println("Numéro de téléphone :");
        val = k.nextLine();
        //verif validité
        
        //si ok, ajout dans le tableau
        coord[2]=val;
        /*Mail*/
        System.out.println("Adresse mail :");
        val = k.nextLine();
        //verif validité
        
        //si ok, ajout dans le tableau
        coord[3]=val;
        /*Adresse*/
        System.out.println("Adresse postale (n° et rue) :");
        val = k.nextLine();
        //verif validité
        
        //si ok, ajout dans le tableau
        coord[4]=val;
        /*Code Postal*/
        System.out.println("Adresse postale (Code postal) :");
        val = k.nextLine();
        //verif validité
        
        //si ok, ajout dans le tableau
        coord[5]=val;
        /*Ville*/
        System.out.println("Adresse postale (Ville) :");
        val = k.nextLine();
        //verif validité
        
        //si ok, ajout dans le tableau
        coord[6]=val;
        
        System.out.println(Arrays.toString(coord));
    }
    
    public static void rechercher(){
        Scanner k = new Scanner(System.in);
        System.out.println("Nom à rechercher :");
        String val = k.nextLine();
        //verif validité
        
        //recherche
        afficher(val);
    }
    
    public static void afficher(String nom){
        //ListeContacts liste = ListeContacts.getInstance();
        System.out.println(nom);
    }
}
