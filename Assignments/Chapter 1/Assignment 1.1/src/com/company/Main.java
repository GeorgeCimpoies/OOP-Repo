package com.company;
import java.util.*;

public class Main {

    public static void main(String[] args) {

        Scanner keyboard = new Scanner(System.in);
        System.out.println("Enter your number");
        int number = keyboard.nextInt();
        int sum = 0;

        for (int i = 1; i < (number - 1);){
            i++;
            if((i%3==0) || (i%5==0)) sum = sum + i;
        }
        System.out.println(sum);
    }
}
