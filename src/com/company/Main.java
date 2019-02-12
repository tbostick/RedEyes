package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        String answer = "";
        do {
            Scanner keyboard = new Scanner(System.in);
            System.out.println("Are your eyes red?");
            answer = keyboard.next();
            if (answer.equals("y")) {
                System.out.println("Get some sleep!");
            } else {
                System.out.println("You look great!");
            }
            System.out.println("Do you want to try again?");
            answer = keyboard.next();

        } while (answer.equals("y"));

    }
}

