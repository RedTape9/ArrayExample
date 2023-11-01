package org.example;

import java.util.Scanner;

public class BonusExercise {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        String inputString = scn.nextLine();

        for (int i = 0; i < inputString.length(); i++) {
            System.out.println(inputString.charAt(i));
        }
    }
}






