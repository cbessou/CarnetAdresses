/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package contacts;

/**
 *
 * @author Philip
 */
public class FabriqueContact {

    //fonctions de validation des données reçues.
    public boolean valideNom(String nom) {
        //2 à 30 caract alpha, tirets, apostrophes, espaces

        return nom.matches("^[a-zA-Z\\p{L}\\'\\.\\-\\s]{2,30}$");
    }

    public boolean validePrenom(String prenom) {
        //2 à 30 caractères alphabétiques, tirets, apostrophes, espaces
        System.out.println(prenom);
        if (prenom == "") {
            return true;
        } else {
            
            return prenom.matches("^[a-zA-Z\\p{L}\\'\\.\\-\\s]{2,30}$");
            
        }

    }

    public boolean valideTel(String tel) {
        //10 à 14 caractères numériques, tirets, espaces, points
        if (tel == "") {
            return true;
        } else {
            return tel.matches("^[0-9\\-\\.\\s]{10,14}$");
        }
    }

    public boolean valideAdresse(String adresse) {
        // 300 caractères alphanumériques, tirets, apostrophes, espaces, points
        if (adresse == "") {
            return true;
        } else {
            return adresse.matches("^[a-zA-Z0-9\\p{L}\\'\\.\\-\\,\\s]{1,300}$");
        }
    }

    public boolean valideCP(String cp) {
        // 4 à 5 caractères numériques
        
        if (cp == "") {
            return true;
        } else {
            return cp.matches("^[0-9]{4,5}$");
        }
    }

    public boolean valideVille(String ville) {
        //45 caractères alphabétiques, tirets, apostrophes, espaces, points

         if (ville == "") {
             return true;
         } else {
             return ville.matches("^[a-zA-Z\\p{L}\\'\\.\\-\\s]{1,45}$");
         }
    }

    public boolean valideMail(String mail) {
        //254 caractères
        if(mail == ""){
            return true;
        }else{
            return mail.matches("^.{1,254}$");
        }
    }

    //TODO après la validation de tous les champs.
   // public boolean valideContact() {

     //   return false;

    //}

    //fonction qui va finalement fabriquer le contact après vérifications.
    public Contact creeContact(String nom, String prenom, String tel, String mail, String adresse, String cp, String ville) {

        Contact contact = null;
        try {

            if (valideNom(nom) && validePrenom(prenom) && valideAdresse(adresse)&& valideTel(tel) && valideCP(cp) && valideVille(ville) && valideMail(mail)) {
                contact = new Contact(nom, prenom, tel, mail, adresse, cp, ville);

            }

        } catch (Exception e) {

            System.out.println(e.getMessage());

        }

        return contact;

    }
}
