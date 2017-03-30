/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package contacts;

import java.util.ArrayList;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Philip
 */
public class ListeContactsTest {

    public ListeContactsTest() {
    }

    @BeforeClass
    public static void setUpClass() {
    }

    @AfterClass
    public static void tearDownClass() {
    }

    @Before
    public void setUp() {
    }

    @After
    public void tearDown() {
    }

    /**
     * Test of getInstance method, of class ListeContacts.
     */
    @Test
    public void testGetInstance() throws Exception {
        System.out.println("\n getInstance");
        ListeContacts expResult = null;
        ListeContacts result = ListeContacts.getInstance();
        String resultlist = result.toString();
        if (!resultlist.isEmpty()) {
            System.out.println(resultlist + "\nInstance trouvée");
        } else {
            fail("instance non trouvée");
        }

    }

    /**
     * Test of ajouter method, of class ListeContacts. Be careful, this test
     * will add a default testajout contact in your contact list!
     */
    @Test
    public void testAjouter() {
        System.out.println("\n ajouter");
        ListeContacts instance = ListeContacts.getInstance();
        Contact c = new Contact("testajout", "test", "0000000000", "testtest", "testadresse", "31000", "toulouse");
        boolean result = instance.ajouter(c);
        if (result) {
            ArrayList resultat = instance.rechercher("testajout");
            if (!resultat.toString().isEmpty()) {
                System.out.println(resultat.toString() + "\n Test ajout Réussi.");
            } else {
                fail("la liste de résultat est vide");
            }
        } else {
            fail("La liste de contacts est vide");
        }
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of rechercher method, of class ListeContacts.
     */
    @Test
    public void testRechercher() {
        System.out.println("\n rechercher");
        String nom = "test";
        ListeContacts instance = ListeContacts.getInstance();

        ArrayList result = instance.rechercher(nom);
        if (!result.toString().isEmpty()) {
            System.out.println(result.toString() + "\n Test recherche Réussi.");
        } else {
            fail("Test recherche échoué.");
        }

    }

    /**
     * Test of enregistrer method, of class ListeContacts.
     */
    @Test
    public void testEnregistrer() {
        System.out.println("\n enregistrer");
        ListeContacts instance = ListeContacts.getInstance();
        boolean enregistrer = instance.enregistrer();
        if (enregistrer) {
            System.out.println("Enregistrement réussi");
        } else {
            fail("Test de l'enregistrement échoué.");
        }
    }

    /**
     * Test of charger method, of class ListeContacts.
     */
    @Test
    public void testCharger() {
        System.out.println("\n charger");
        ListeContacts instance = ListeContacts.getInstance();
        boolean resultat = instance.charger();
        if (resultat) {
            System.out.println("Chargement fichier réussi.");
        } else {
            fail("Chargement fichier échoué.");
        }

    }

    /**
     * Test of toString method, of class ListeContacts.
     */
    @Test
    public void testToString() {
        System.out.println("\n toString");
        ListeContacts instance = ListeContacts.getInstance();

        String result = instance.toString();
        if (!instance.toString().isEmpty()) {
            System.out.println("Méthode toString fonctionnelle.");

        } else {

            fail("Méthode toString échouée.");
        }
    }

}
