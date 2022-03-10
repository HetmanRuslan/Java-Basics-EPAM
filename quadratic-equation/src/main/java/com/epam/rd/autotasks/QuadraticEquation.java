package com.epam.rd.autotasks;

import java.util.Locale;
import java.util.Scanner;

import static java.lang.Math.sqrt;

public class QuadraticEquation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);
        double a = scanner.nextDouble();
        double b = scanner.nextDouble();
        double c = scanner.nextDouble();
        if (a == 0){
            throw new IllegalArgumentException();
        }

        Double D = b * b - 4 * a * c;

        if (D > 0){
            double x1;
            double x2;

            x1 = (-b + Math.sqrt(D))/(2 * a);
            x2 = (-b - Math.sqrt(D))/(2 * a);

            System.out.println(x1 + " " + x2);
        }
        else if (D == 0) {
            double x;

            x = (-b)/(2 * a);

            System.out.println(String.valueOf(x));
        }
        else{
            System.out.println("no roots");
        }


    }

}