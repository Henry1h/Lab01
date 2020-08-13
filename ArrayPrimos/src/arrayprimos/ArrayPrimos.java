/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arrayprimos;
import javax.swing.JOptionPane;
/**
 *
 * @author USER
 */
public class ArrayPrimos {

    /**
     * @param args    
     */
    public static void main(String[] args) {
            
        String pregunta=JOptionPane.showInputDialog("Ingrese el tamaño de la lista: ");
        int num[]=new int[Integer.parseInt(pregunta)];
   
        numerosPrimosAleatorio(num, 50, 200);
   
        leerArray(num);
        
        int primoMayor=mayor(num);
        System.out.println("El número primo más grande es el "+primoMayor);
    }   
    public static void numerosPrimosAleatorio(int lista[], int inicio, int fin){
   
        int i=0;    
        while(i<lista.length){           
            int num=((int)Math.floor(Math.random()*(inicio-fin)+fin));           
            if (esPrimo(num)){              
                lista[i]=num;               
                i++;            
            }       
        }   
    }   
    private static boolean esPrimo ( int num){ 
        boolean primo = true;
        int contador = 2;
        while ((primo)&&(contador!=num)){
            if ( num%contador == 0){
                primo = false;
            }    
            contador ++;}
        return primo;            
    }
    public static void leerArray(int lista[]){
        System.out.print("La lista de numeros primos es: ");
        for(int i=0;i<lista.length;i++){
            System.out.print( lista[i]+"  ");
        }
        System.out.println();
    }    
    public static int mayor(int lista[]){
        int mayor=0;
        for(int i=0;i<lista.length;i++){
            if(lista[i] > mayor){
                mayor = lista[i] ;
            }
        }
        return mayor;
    }
     
}    
   
    

