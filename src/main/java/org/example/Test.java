package org.example;

import java.util.Arrays;

public class Test {
    public static void main(String[] args) {
        // Aufgabe 1
        int array[] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        System.out.println("Unser Array: ");
        for (int i = 0; i < array.length; i++){
            System.out.print(array[i]+", ");
        }
        // Aufgabe 2
        int sum=0;
        for (int i = 0; i < array.length; i++){
            sum=sum+array[i];
        }
        System.out.println("Die Summe aller Zahlen im Array ist:"+sum);
        //Aufgabe 3
        int biggest=0;
        for (int i = 0; i < array.length; i++){
            if(biggest<array[i]){
                biggest=array[i];
            }

        }
        System.out.println("die größte Zahl im Array ist:"+ biggest);

        //Aufgabe 4 + 5

        int newArray[] = new int[array.length];
        int[] array2 = {11, 12, 13, 14, 15, 16, 17, 18, 19, 20};
        for (int i = 0; i < array2.length; i++) {
            newArray[i] = array[i] + array2[i];
        }

        for (int element : newArray) {
            System.out.print(element + " ");
        }
    }



}
