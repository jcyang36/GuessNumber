package com.company;
import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {


        Random r = new Random();
        int x = 1 + r.nextInt(10);
        Scanner keyboard = new Scanner(System.in);
        System.out.print("Enter a guess: ");
        int guess=keyboard.nextInt();
        while (guess!=x){
            if(guess>x){
                System.out.println("Too high");
            }
            else if (guess<x){
                System.out.println("Too low");
            }
            System.out.println("Try again? (Y/N) ");
            if (keyboard.next().equalsIgnoreCase("N")){
                break;
            }
            System.out.println("Enter a new guess: ");
            guess=keyboard.nextInt();
        }
        if (guess==x){
            System.out.println("You guessed correctly!");
        }
        System.out.println("Good bye!");
    }
}
