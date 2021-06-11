package src;

import java.util.Scanner;

public class Ejercicio7{
    public static void main(String[] args){
        Ejercicio7 t = new Ejercicio7();
    }

    public Ejercicio7(){
        ale = llenarMatriz();
        mostrarMatriz(ale);
        System.out.println("La sumatoria es de: " + sum);
    }

    int[][] ale = new int[4][3];
    int sum =0 ;

    public int[][] llenarMatriz(){
        int[][] matriz = new int[4][3];
        for(int i = 0; i < 4; i++){
            for(int j = 0; j < 3; j++){
                matriz[i][j] = (int)(Math.random() * 555);

                if(i == 1){
                    sum += matriz[i][j];
                }
                else if(i == 3){
                    sum += matriz[i][j];
                }
            }
        }
        return matriz;
    }
    public void mostrarMatriz(int[][] matriz){
        for(int i = 0; i < 4; i++){
            for(int j = 0; j < 3; j++){
                if(j == 2){
                    System.out.println(matriz[i][j]);
                }
                }
            }
        }
    }
