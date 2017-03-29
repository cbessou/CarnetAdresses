/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package contacts;

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
public class FabriqueContactTest {
    
    public FabriqueContactTest() {
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
     * Test of valideNom method, of class FabriqueContact.
     */
    @Test
    public void testValideNom() {
        System.out.println("valideNom");
        String nom = "";
        FabriqueContact instance = new FabriqueContact();
        boolean expResult = false;
        boolean result = instance.valideNom(nom);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of validePrenom method, of class FabriqueContact.
     */
    @Test
    public void testValidePrenom() {
        System.out.println("validePrenom");
        String prenom = "";
        FabriqueContact instance = new FabriqueContact();
        instance.validePrenom(prenom);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of valideTel method, of class FabriqueContact.
     */
    @Test
    public void testValideTel() {
        System.out.println("valideTel");
        String nom = "";
        FabriqueContact instance = new FabriqueContact();
        instance.valideTel(nom);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of valideAdresse method, of class FabriqueContact.
     */
    @Test
    public void testValideAdresse() {
        System.out.println("valideAdresse");
        String nom = "";
        FabriqueContact instance = new FabriqueContact();
        instance.valideAdresse(nom);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of valideCP method, of class FabriqueContact.
     */
    @Test
    public void testValideCP() {
        System.out.println("valideCP");
        int cp = 0;
        FabriqueContact instance = new FabriqueContact();
        instance.valideCP(cp);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of valideVille method, of class FabriqueContact.
     */
    @Test
    public void testValideVille() {
        System.out.println("valideVille");
        String ville = "";
        FabriqueContact instance = new FabriqueContact();
        instance.valideVille(ville);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of valideMail method, of class FabriqueContact.
     */
    @Test
    public void testValideMail() {
        System.out.println("valideMail");
        String nom = "";
        FabriqueContact instance = new FabriqueContact();
        instance.valideMail(nom);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of valideContact method, of class FabriqueContact.
     */
    @Test
    public void testValideContact() {
        System.out.println("valideContact");
        FabriqueContact instance = new FabriqueContact();
        boolean expResult = false;
        boolean result = instance.valideContact();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of creeContact method, of class FabriqueContact.
     */
    @Test
    public void testCreeContact() {
        System.out.println("creeContact");
        String nom = "";
        String prenom = "";
        String tel = "";
        String mail = "";
        String adresse = "";
        int cp = 0;
        String ville = "";
        FabriqueContact instance = new FabriqueContact();
        Contact expResult = null;
        Contact result = instance.creeContact(nom, prenom, tel, mail, adresse, cp, ville);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
