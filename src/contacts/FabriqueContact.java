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

        return nom.matches("[a-zA-Z\\'\\.\\-\\s]{2,30}");
    }

    public void validePrenom(String prenom) {
        //2 à 30 caractères alphabétiques, tirets, apostrophes, espaces

    }

    public void valideTel(String nom) {
        //10 à 14 caractères numériques, tirets, espaces, points

    }

    public void valideAdresse(String nom) {
        // 300 caractères alphanumériques, tirets, apostrophes, espaces, points

    }

    public void valideCP(int cp) {
        // 4 à 5 caractères numériques

    }

    public void valideVille(String ville) {
        //45 caractères alphabétiques, tirets, apostrophes, espaces, points

    }

    public void valideMail(String nom) {
        //254 caractères

    }

    //TODO après la validation de tous les champs.
    public boolean valideContact() {

        return false;

    }

    //fonction qui va finalement fabriquer le contact après vérifications.
    public Contact creeContact(String nom, String prenom, String tel, String mail, String adresse, int cp, String ville) {

        Contact contact = null;

        try {

            if (valideNom(nom)) {

                contact = new Contact(nom, prenom, tel, mail, adresse, cp, ville);

            }

        } catch (Exception e) {

            System.out.println(e.getMessage());

        }

        return contact;

    }
}
