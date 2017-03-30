/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package contacts;

/**
 *  Class that Check the data entered, and create the contact if all tests passed.
 * @author Philip
 */
public class FabriqueContact {

    //fonctions de validation des données reçues.

    /**
     * validation du nom
     * @param nom
     * @return
     */
    public boolean valideNom(String nom) {
        //2 à 30 caract alpha, tirets, apostrophes, espaces

        return nom.matches("^[a-zA-Z\\p{L}\\'\\.\\-\\s]{2,30}$");
    }

    /**
     * validation du prenom
     * @param prenom
     * @return
     */
    public boolean validePrenom(String prenom) {
        //2 à 30 caractères alphabétiques, tirets, apostrophes, espaces
      
        if ("".equals(prenom)) {
            return true;
        } else {
            return prenom.matches("^[a-zA-Z\\p{L}\\'\\.\\-\\s]{2,30}$");
        }
    }

    /**
     * validation du numero de telephone
     * @param tel
     * @return
     */
    public boolean valideTel(String tel) {
        //10 à 14 caractères numériques, tirets, espaces, points
        if ("".equals(tel)) {
            return true;
        } else {
            return tel.matches("^[0-9\\-\\.\\s]{10,14}$");
        }
    }

    /**
     * validation de l'adresse
     * @param adresse
     * @return
     */
    public boolean valideAdresse(String adresse) {
        // 300 caractères alphanumériques, tirets, apostrophes, espaces, points
        if ("".equals(adresse)) {
            return true;
        } else {
            return adresse.matches("^[a-zA-Z0-9\\p{L}\\'\\.\\-\\,\\s]{1,300}$");
        }
    }

    /**
     * vérifie que le code postal contient 4 à 5 caractères numériques
     * @param cp
     * @return
     */
    public boolean valideCP(String cp) {
        // 4 à 5 caractères numériques
        if ("".equals(cp)) {
            return true;
        } else {
            return cp.matches("^[0-9]{4,5}$");
        }
    }

    /**
     * validation de la ville
     * @param ville
     * @return
     */
    public boolean valideVille(String ville) {
        //45 caractères alphabétiques, tirets, apostrophes, espaces, points

         if ("".equals(ville)) {
             return true;
         } else {
             return ville.matches("^[a-zA-Z\\p{L}\\'\\.\\-\\s]{1,45}$");
         }
    }

    /**
     * validation du mail
     * @param mail
     * @return
     */
    public boolean valideMail(String mail) {
        //254 caractères
        if("".equals(mail)){
            return true;
        }else{
            return mail.matches("^.{1,254}$");
        }
    }

    /**
     * Method that finally create the contacts with all the parameters
     * @param nom String that Matches a regex and can't be empty
     * @param prenom  String that matches a Regex, can be empty (2-30) char.
     * @param tel   String that matches a Regex, can be empty, (10-14) char. only numbers (-,.)
     * @param mail  String up to 254 char. can be empty 
     * @param adresse   String up to 300 char. can be empty
     * @param cp    String, can be empty, (4-5) char, only numbers.
     * @param ville String, can be empty, (1-45) char.
     * @return return an Contact object.
     */
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
