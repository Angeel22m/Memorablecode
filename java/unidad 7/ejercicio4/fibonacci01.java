package ejercicio4;

import java.util.Scanner;

 public class fibonacci01
 
 {            // Abre clase publica Fibonacci
 public int Principal(int n)
 {        // Abre metodo Principal 
 int fibonaccin2 = 1;
 int fibonaccin1 = 0;
 int fibonaccin = 0;
 Scanner entrada = new Scanner(System.in);

 for ( int i = 3; i <= n; i++)
 {
 fibonaccin = fibonaccin2 + fibonaccin1;
 fibonaccin1 = fibonaccin2; 
 fibonaccin2 = fibonaccin;
 } 

 return fibonaccin;
 }        // Cierra metodo Principal
 }            // Cierra clase publica Fibonacci