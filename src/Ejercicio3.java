package src;

import java.util.Scanner;

public class Ejercicio3{
    public static void main (String[] args){
    Ejercicio3 t = new Ejercicio3();
    int ar[]  = new int[8];
    System.out.println("Ingrese 8 numeros enteros");  
    Scanner scanner = new Scanner(System.in);

    for (int i= 0; i < 8; i++){
        ar[i]= scanner.nextInt();
}       
   orden(ar);
   buscar (ar); 
    }
    public static void  orden(  int arreglo[]){
        for (int i = 0; i < 8 ; i++){
        System.out.println ("El Indice "+ (i) +"="+ " esta en el valor "+ arreglo[i]);
    }
    }
    public static void buscar( int  arreglos[]){
        int bus = arreglos [0], num;
        boolean si = false ;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Cual quiere buscar");
        num = scanner.nextInt();
        for ( int i = 0; i < 8 ; i++){
            if (num == arreglos[i] ) {
                si = true;
            }
        }
    }
    }