/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package contacts;

import java.io.IOException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
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
        System.out.println("getInstance");
        ListeContacts expResult = null;
        ListeContacts result = ListeContacts.getInstance();
        String resultlist= result.toString();
        if(!resultlist.isEmpty()){
        System.out.println(resultlist);
        }else{
        fail("instance non trouvée");
        }
        
    }

    /**
     * Test of ajouter method, of class ListeContacts.
     */
    @Test
    public void testAjouter() {
        try {
            System.out.println("ajouter");
            
            ListeContacts instance = ListeContacts.getInstance();
            Contact c = new Contact("testajout","test", "0000000000", "testtest", "testadresse", "31000", "toulouse");
            
            boolean result = instance.ajouter(c);
            if(!instance.toString().isEmpty()){
               ArrayList resultat = instance.rechercher("testajout");
                if(!resultat.toString().isEmpty()){
                System.out.println(resultat.toString());
                }else{
                fail("la liste de résultat est vide");
                }
            }else{
                fail("La liste de contacts est vide");
            }
            // TODO review the generated test code and remove the default call to fail.
          
        } catch (IOException ex) {
            Logger.getLogger(ListeContactsTest.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(ListeContactsTest.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    /**
     * Test of rechercher method, of class ListeContacts.
     */
    @Test
    public void testRechercher() {
        System.out.println("rechercher");
        String nom = "";
        ListeContacts instance = null;
        ArrayList expResult = null;
        ArrayList result = instance.rechercher(nom);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of enregistrer method, of class ListeContacts.
     */
    @Test
    public void testEnregistrer() {
        System.out.println("enregistrer");
        ListeContacts instance = null;
        instance.enregistrer();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of charger method, of class ListeContacts.
     */
    @Test
    public void testCharger() {
        System.out.println("charger");
        ListeContacts instance = null;
        instance.charger();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of toString method, of class ListeContacts.
     */
    @Test
    public void testToString() {
        System.out.println("toString");
        ListeContacts instance = null;
        String expResult = "";
        String result = instance.toString();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
