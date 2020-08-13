/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package abcmaymin;

/**
 *
 * @author USER
 */
public class AbcMayMin {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        System.out.println("El Abecedario en minuscula: ");
        
        for(int i=97; i<123; i++) {
            char abcMin=(char)i;
            System.out.println(abcMin);}
        
        System.out.println("El Abecedario en mayuscula: ");
        
        for(int i=65; i<91; i++) {
            char abcMay=(char)i;
            System.out.println(abcMay);}
    }
    
}
