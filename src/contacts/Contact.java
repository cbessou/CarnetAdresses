/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package contacts;

import java.io.Serializable;

/**
 *
 * @author Mitch
 */
public class Contact implements Serializable {
    
    // Informations du contact      
    private String nom;
    private String prenom;
    private String tel;
    private String email;
    private String adresse;
    private String cp;
    private String ville;

         
    //Constructeur par paramètres

    /**
     *
     * @param nom
     * @param prenom
     * @param tel
     * @param email
     * @param adresse
     * @param cp
     * @param ville
     */
    public Contact(String nom, String prenom, String tel, String email, String adresse, String cp, String ville){
         
    //Initialisation des attributs
        this.nom = nom;
        this.prenom = prenom;
        this.tel = tel;
        this.email = email;
        this.adresse = adresse;
        this.cp = cp;
        this.ville = ville;
    }
    
/*...............Nom....................*/
    
    //Récupérer le nom

    /**
     *
     * @return
     */
    public String getNom() {
        return nom;
    }
     
    //Modifier le nom   

    /**
     *
     * @param nom
     */
    public void setNom(String nom) {
            this.nom = nom;
        }
         
/*...............Prenom..................*/
    
    //Récupérer le Prenom      

    /**
     *
     * @return
     */
    public String getPrenom() {
        return prenom;
    }
         
    //Modifier le Prenom       

    /**
     *
     * @param prenom
     */
    public void setPrenom(String prenom) {
                this.prenom = prenom;
            }
    
/*...............Telephone................*/
    
    //Récupérer le téléphone

    /**
     *
     * @return
     */
    public String getTel() {
    return tel;
    }
     
    //Modifier le téléphone

    /**
     *
     * @param tel
     */
    public void setTel(String tel) {
            this.tel = tel;
        }
         
/*...............E-Mail...................*/
    
    //Récupérer l'adresse mail  

    /**
     *
     * @return
     */
    public String getEmail() {
        return email;
    }
     
    //Modifier l'adresse mail

    /**
     *
     * @param email
     */
    public void setEmail(String email) {
                this.email = email;
            }
    
/*...............Adresse..................*/
    
        //Récupérer l'adresse

    /**
     *
     * @return
     */
    public String getAdresse() {
        return adresse;
    }
     
    //Modifier l'adresse

    /**
     *
     * @param adresse
     */
    public void setAdresse(String adresse) {
                this.adresse = adresse;
            }
    
/*...............Code postal..............*/
    
    //Récupérer le code postal

    /**
     *
     * @return
     */
    public String getCp() {
        return cp;
    }
     
    //Modifier le code postal  

    /**
     *
     * @param cp
     */
    public void setCp(String cp) {
                this.cp = cp;
            }
    
/*...............Ville....................*/    
    
    //Récupérer la ville     

    /**
     *
     * @return
     */
    public String getVille() {
    return ville;  
    }
     
    //Modifier la ville

    /**
     *
     * @param ville
     */
    public void setVille(String ville) {
            this.ville = ville;
        }
    
/*........................................*/
     
    
    
    //Affiche la chaine de caractère qui décrit l'objet
    @Override
    public String toString()
    {
        return  "Nom : " + nom + " " + prenom + "\n" +
                "Tel : " + tel + "\n" +
                "E-mail : " + email + "\n" +
                "Adresse : \n" + adresse + "\n" +
                cp + " " + ville;
    }
 
}
