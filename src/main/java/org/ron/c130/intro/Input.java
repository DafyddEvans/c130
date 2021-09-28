package org.ron.c130.intro;
import java.util.Scanner;

public class Input {
    public static void main(String[] args) {

        Scanner myScanner = new Scanner(System.in);

        String stringOperand1 = "";

        System.out.print("Please enter the first number to be added: ");
        stringOperand1 = myScanner.nextLine();
        System.out.println(stringOperand1);
    }
}
