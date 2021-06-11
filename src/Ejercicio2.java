package src;

import java.util.*;

public class Ejercicio2 {
    public static void main(String[] args){
        Ejercicio2 t = new Ejercicio2();
    }
    int[] ale = new int[10];
    int may=0, men=99; 

    public Ejercicio2(){
        
        for(int i=0; i < ale.length; i++){
            llenarArreglo(i);
        }
        for(int i=0; i < ale.length; i++){
            mostrarArreglo(i);
        }
        for(int i=0; i < ale.length; i++){
            revisioNumeroMayor(i);
        }
        System.out.println("El  mayor es: " + may);
        System.out.println("El  menor es: " + men);
    }

    public void llenarArreglo(int posicion){
        ale[posicion] = (int)(Math.random() * 99);
    }
    public void mostrarArreglo(int posicion){
        System.out.println("El  aleatorio es: "+ale[posicion]);
    }

    public void revisioNumeroMayor(int posicion){
        for(int i=0; i < ale.length; i++){
            if(ale[posicion] > may){
                may = ale[posicion];
            }
            else if(ale[posicion] < men){
                men = ale[posicion];
            }
        }
    }
}