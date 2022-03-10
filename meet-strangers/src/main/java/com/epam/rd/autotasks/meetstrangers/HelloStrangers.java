package com.epam.rd.autotasks.meetstrangers;

import java.io.IOException;
import java.util.Scanner;

public class HelloStrangers {
    public static void main(String[] args) throws IOException {
        //Write a program, asks for a number - amount of strangers to meet.
        //Then reads stranger names line by line and prints line by line "Hello, ...".

        Scanner inputAmount = new Scanner(System.in);
        String amountOfPeople = inputAmount.nextLine();
        int parsedAmountOfPeople = Integer.parseInt(amountOfPeople);

        if (parsedAmountOfPeople == 0) {
            System.out.println("Oh, it looks like there is no one here");
            return;
        }


        if (parsedAmountOfPeople < 0) {
            System.out.println("Seriously? Why so negative?");
            return;
        }

        String[] names = new String[parsedAmountOfPeople];


        for (int i = 0; i < parsedAmountOfPeople; i++) {

            names[i] = inputAmount.nextLine();
        }

        for (int i = 0; i < names.length; i++) {

            System.out.println("Hello, " + names[i]);

        }
    }
    }