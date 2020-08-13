/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arraynumerosaleatorios;
import javax.swing.JOptionPane;
/**
 *
 * @author USER
 */
public class ArrayNumerosAleatorios {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        
        String pregunta1=JOptionPane.showInputDialog("ingrese el tamaño de la lista: ");
        int pregunta2[]=new int[Integer.parseInt(pregunta1)];
        int ultimoDigito;
        do{
            pregunta1=JOptionPane.showInputDialog("Indique el ultimo digito deseado(0-9):");
            ultimoDigito=Integer.parseInt(pregunta1);
        }while(!(ultimoDigito>=0 && ultimoDigito<=9));
 
        numerosAleatorios(pregunta2, 1, 300);
 
        int listaFinal[]=resultado(pregunta2, ultimoDigito);
 
     
        mostrarArrayTerminadosEn(listaFinal);
 
    }
    public static void numerosAleatorios(int lista[], int a, int b){
        System.out.println("La lista completa : ");
        for(int i=0;i<lista.length;i++){
            
            lista[i]=((int)Math.floor(Math.random()*(a-b)+b));
            System.out.print(lista[i]+"  ");
        }
        System.out.println(" ");
    }
 
    public static void mostrarArrayTerminadosEn(int lista[]){
        System.out.println("La lista de numeros que cumplen la condicion son :");
        for(int i=0;i<lista.length;i++){         
            if(lista[i]!=0){
                System.out.print(lista[i]+"  ");
            }
            
        }
    }
 
    public static int[] resultado (int num[], int terminaEn){
        int listaFinal[]=new int[num.length];
        int numeroFinal=0;
        for (int i=0;i<listaFinal.length;i++){
            numeroFinal=num[i]-(num[i]/10*10); 
            if (numeroFinal==terminaEn){
                listaFinal[i]=num[i];
            }
        }
        return listaFinal;
    }
}