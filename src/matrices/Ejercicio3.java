
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package matrices;

/**
 *
 * @author 
 */
public class Ejercicio3 {
   //MATRIZ DE 10X1O INGRESADO POR TECLADO QUE SUME TODAS LA FILAS DE LA MATRIZ
    public static void main(String[] args) {
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
         //suma de filas 

         //Ahora procedemos a sumar las filas 
         for(int i=0;i<10;i++){
            int sumaFilas = 0;
            for(int j=0;j<10;j++){
                sumaFilas += matriz[i][j];
            }
             System.out.print("\nLa suma de la fila["+i+"] es: "+sumaFilas);
         }
          System.out.println("");
    }
 }