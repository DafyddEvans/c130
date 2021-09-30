package org.ron.c130.intro;
import java.util.Scanner;

public class FizzBuzz {
    public static void main(String[] args) {
        int fizzBuzz;
        Scanner myScanner = new Scanner(System.in);

        System.out.println("How many units of fizzing and buzzing do you need in your life? ");

        // add a try clause for bad inputs
        fizzBuzz = Integer.parseInt(myScanner.nextLine());
        
        System.out.println(0);
        for(int i = 1; i <= fizzBuzz; i++) {
            String word = "";
            if (i % 3 == 0) {
               word = "fizz ";
            }
            if (i % 5 == 0) {
                word = word + "buzz";
            }

            if (word.length() == 0) {
                System.out.println(i);
            } else {
                System.out.println(word);
            }
        }

        System.out.println("TRADITION!!!!!");

    }
}
