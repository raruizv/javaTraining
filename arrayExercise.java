// Guia UDistrial, programación básica (Capitulo Arreglos)

//import java.util.Scanner;

public class arrayExercise {

    // Escribir un programa que llene un arreglo con los numeros comprendidos
    //  entre 4 y 14
    public static void main(String[] args){
        int[] arraySimple = new int[11];

        for (int idx = 0; idx < arraySimple.length; idx++) {
            for (int item = 4; item < 15; item++)
            arraySimple [idx] = item;
        }

        for (int idx = 0; idx < arraySimple.length; idx++) {
            System.out.println(arraySimple[idx]);
        }
    }
}

