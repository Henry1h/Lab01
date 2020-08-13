/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package abecedarioinvertido;



/**
 *
 * @author USER
 */
public class AbecedarioInvertido {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        char abecedario[];
        abecedario = new char [90];
        
        int indice = 0 ;
            
        do{
            abecedario[indice]=(char)(abecedario.length-indice);
            System.out.println(abecedario[indice]);
            indice++;
            
        }while(indice<26);
      
        }
        
                
}        
   
    

