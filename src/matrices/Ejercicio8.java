/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package matrices;

import java.util.Arrays;

/**
 *
 * @author 
 */
public class Ejercicio8 {
    //MATRIZ DE 10X10 INGRESADO POR TECLADO SUME TODAS LAS FILAS PARES DE LA MATRIZ
   public static void main(String[] args) {
       int[][]matriz = new int[10][10];
       int f=0;
       int j=0;
       int suma=0;
       int resta =0;
       int b =1;
       for (f=0 ; f < matriz.length ; f++){
          for (j=0 ; j < matriz.length ; j++){
            matriz[f][j]=(int)(Math.random()*100+1);
          }
       }
       for (f=0 ; f < matriz.length ; f++){
          System.out.println(Arrays.toString (matriz [f]));

       }
       for (int i = 0; i < 10; i++) {
          if (i%2==0) {
             resta=0;
          for (j=0 ; j < matriz.length ; j++){
             resta = resta + matriz[j][i];   
          }
          System.out.println("La suma de la fila "+i+" es:"+resta);

          }
       }
    }
    
}