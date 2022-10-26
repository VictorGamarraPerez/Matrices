/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package matrices;

/**
 *
 * @author 
 */
public class Ejercicio2 {
//MATRIZ DE 10X10 INGRESADO POR TECLADO MULTIPLIQUE LA DIAGONAL PRIMARIA Y SECUNDARIA
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         int matriz[][]=new int [10][10];
         int dato=1;
         for (int[] matriz1 : matriz) {
         for (int j = 0; j < matriz1.length; j++) {
            matriz1[j] = dato;
            dato++;
         }
         }
         for(int i=0; i<matriz. length; i++){
         for(int j=0; j<matriz[i]. length; j++){
           System.out.print("\t"+matriz[i][j]);
         }
          System.out.println("");
         }
         int diagonalPrincipal[]=new int[matriz. length];
         int diagonalSecundaria[]=new int[matriz. length];
         for(int i=0; i<matriz. length; i++){
         for(int j=0; j<matriz[i]. length; j++){
         if(i==j){
           diagonalPrincipal[i]=matriz[i][j];
         }
         if( (i+j) == matriz. length-1){
           diagonalSecundaria[i]=matriz[i][j];
         }
         }
         }
         int multiplicacion=1;
         System.out.println("\nEste es tu diagonal principal");
         for(int elemento:diagonalPrincipal){
           System.out. print("\t"+elemento);
           multiplicacion=multiplicacion*elemento;
         }
          System.out. print(" = "+multiplicacion);
          System.out. println("");
          multiplicacion=1;
          System.out. println("\nEste es tu diagonal secundaria");
         for(int elemento:diagonalSecundaria){
           System. out. print("\t"+elemento);
           multiplicacion=multiplicacion*elemento;
        }
         System.out. print(" = "+multiplicacion);
         System.out. println("");
 
      }
}
