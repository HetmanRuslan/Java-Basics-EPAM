package com.epam.rd.autotasks.godutch;

import java.util.Scanner;

public class GoDutch {

    public static void main(String[] args) {
        //Write code here
        Scanner sc = new Scanner(System.in);
        int price,people,temp;

        price = sc.nextInt();
        people = sc.nextInt();

        if (price <0){
            System.out.println("Bill total amount cannot be negative");
        }
        else if(people<0||people==0){
            System.out.println("Number of friends cannot be negative or zero");
        }
        else{
            temp= (int) ((price*0.1+price)/people);
            System.out.println(temp);
        }

    }
}
