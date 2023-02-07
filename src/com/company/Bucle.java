package com.company;

import java.util.Scanner;

public class Bucle {

    public static void main(String[] args){

        String base = "";
        String nuevoString;
        Scanner llamarString = new Scanner(System.in);

        System.out.println("Inserte un String");
        nuevoString = llamarString.nextLine();
        System.out.println(nuevoString);
        base = nuevoString;

        while (!nuevoString.equalsIgnoreCase("close")){

            System.out.println("Inserte un String, para finalizar escriba la palabra: close");
            nuevoString = llamarString.nextLine();

            if(!nuevoString.equals("close")){
                base = base + " " + nuevoString;
                System.out.println(base);
            }
        }
        System.out.println("fin");
    }
}