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
        String nom = "Lhubert-ma.n man'";
        FabriqueContact instance = new FabriqueContact();
        
        boolean result = instance.valideNom(nom);
        
        if(result){
        System.out.println("Regex du Nom Validée");
        }else{
        fail("Regex Echoué");
        }
    }

    /**
     * Test of validePrenom method, of class FabriqueContact.
     */
    @Test
    public void testValidePrenom() {
        System.out.println("validePrenom");
        String prenom = "Test Prénom - '. Test";
        FabriqueContact instance = new FabriqueContact();
        
        boolean result = instance.validePrenom(prenom);
       
        if(result){
        System.out.println("Regex du prénom réussie");
 
        }else{
            
        fail("Regex du prénom échouée");}
    }

    /**
     * Test of valideTel method, of class FabriqueContact.
     */
    @Test
    public void testValideTel() {
        System.out.println("valideTel");
        String tel = "";
        FabriqueContact instance = new FabriqueContact();
        boolean result = instance.valideTel(tel);
        
        if(result){
        System.out.println("Regex du numéro de téléphone validée");
        }else{
        fail("Regex échouée");}
    }

    /**
     * Test of valideAdresse method, of class FabriqueContact.
     */
    @Test
    public void testValideAdresse() {
        System.out.println("valideAdresse");
        String adresse = "325 Rue de Test-Regex. Appartement rez de chaussée, l'artiste.";
        FabriqueContact instance = new FabriqueContact();
        boolean result = instance.valideAdresse(adresse);
         if(result){
        System.out.println("Regex de l'adresse validée");
        }else{
        fail("Regex échouée");}
    }

    /**
     * Test of valideCP method, of class FabriqueContact.
     */
    @Test
    public void testValideCP() {
        System.out.println("valideCP");
        String cp = "92000";
        FabriqueContact instance = new FabriqueContact();
        boolean result = instance.valideCP(cp);
         if(result){
        System.out.println("Regex du code postal validée");
        }else{
        fail("Regex échouée");}
    }

    /**
     * Test of valideVille method, of class FabriqueContact.
     */
    @Test
    public void testValideVille() {
        System.out.println("valideVille");
        String ville = "";
        FabriqueContact instance = new FabriqueContact();
        boolean result = instance.valideVille(ville);
         if(result){
        System.out.println("Regex de la ville validée");
        }else{
        fail("Regex échouée");}
    }

    /**
     * Test of valideMail method, of class FabriqueContact.
     */
    @Test
    public void testValideMail() {
        System.out.println("valideMail");
        String mail = "testtest@test.com";
        FabriqueContact instance = new FabriqueContact();
        boolean result = instance.valideMail(mail);
        if(result){
        System.out.println("Regex du mail validée");
        }else{
        fail("Regex échouée");}
    }

    /**
     * Test of valideContact method, of class FabriqueContact.
     */
 /*   @Test
    public void testValideContact() {
        System.out.println("valideContact");
        FabriqueContact instance = new FabriqueContact();
        boolean expResult = false;
        boolean result = instance.valideContact();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }*/

    /**
     * Test of creeContact method, of class FabriqueContact.
     */
    @Test
    public void testCreeContact() {
        System.out.println("creeContact");
        String nom = "testNom";
        String prenom = "testPrénom";
        String tel = "00-00.00-00.00";
        String mail = "test@exemple.test";
        String adresse = "test de l'adresse";
        String cp = "31000";
        String ville = "Test ville";
        FabriqueContact instance = new FabriqueContact();
        
        Contact result = instance.creeContact(nom, prenom, tel, mail, adresse, cp, ville);
        if(result != null){
        
            System.out.println("Contact créé! \n nom :" + result.getNom()+"\n prénom :" + result.getPrenom()+"\n Tel : "+ result.getTel()+"\n adresse :" + result.getAdresse()+"\n Code Postal :" + result.getCp()+"\n Ville :" + result.getVille()+"\n Mail :" + result.getEmail());
        }else{
        
        fail("Contact non créé.");
        }
    }
    
}
