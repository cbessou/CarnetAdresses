/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package contacts;

/**
 *
 * @author Mitch
 */
public class Contact {
    
    // Informations du contact      
    //commentaire test
    private String nom;
    private String prenom;
    private String tel;
    private String email;
    private String adresse;
    private String cp;
    private String ville;

         
    //Constructeur par paramètres
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
    public String getNom() {
        return nom;
    }
     
    //Modifier le nom   
    public void setNom(String nom) {
            this.nom = nom;
        }
         
/*...............Prenom..................*/
    
    //Récupérer le Prenom      
    public String getPrenom() {
        return prenom;
    }
         
    //Modifier le Prenom       
    public void setPrenom(String prenom) {
                this.prenom = prenom;
            }
    
/*...............Telephone................*/
    
    //Récupérer le téléphone
    public String getTel() {
    return tel;
    }
     
    //Modifier le téléphone
    public void setTel(String tel) {
            this.tel = tel;
        }
         
/*...............E-Mail...................*/
    
    //Récupérer l'adresse mail  
    public String getEmail() {
        return email;
    }
     
    //Modifier l'adresse mail
    public void setEmail(String email) {
                this.email = email;
            }
    
/*...............Adresse..................*/
    
        //Récupérer l'adresse
    public String getAdresse() {
        return adresse;
    }
     
    //Modifier l'adresse
    public void setAdresse(String adresse) {
                this.adresse = adresse;
            }
    
/*...............Code postal..............*/
    
    //Récupérer le code postal
    public String getCp() {
        return cp;
    }
     
    //Modifier le code postal  
    public void setCp(String cp) {
                this.cp = cp;
            }
    
/*...............Ville....................*/    
    
    //Récupérer la ville     
    public String getVille() {
    return ville;  
    }
     
    //Modifier la ville
    public void setVille(String ville) {
            this.ville = ville;
        }
    
/*........................................*/
     
    
    
    //Affiche la chaine de caractère qui décrit l'objet
    public String toString()
    {
        return  "nom : " + nom + "\n" +
                "prenom : " + prenom + "\n" +
                "tel : " + tel + "\n" +
                "email : " + email + "\n" +
                "adresse : " + adresse + "\n" +
                "cp : " + cp + "\n" +
                "ville : " + ville + "\n" ;
    }
 
}
