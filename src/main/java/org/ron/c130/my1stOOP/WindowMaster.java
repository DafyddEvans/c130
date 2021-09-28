package org.ron.c130.my1stOOP;
import java.util.Scanner;

public class WindowMaster {
    /*
        It must prompt the user for the height of the window (in feet).
        It must prompt the user for the width of the window (in feet).
        It must calculate and display the area of the window.
        It must calculate and display the perimeter of the window.
        Based on the area and perimeter, it must calculate the total cost of the window.
        The glass for the windows cost $3.50 per square foot.
        The trim for the windows cost $2.25 per linear foot.
     */
    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);
        boolean isValid = false;
        int windowHeight = 0, windowWidth = 0, windowArea, windowPerimeter;
        double windowPrice;

        while (!isValid)
        {
            try {
                System.out.print("Please enter the height of your window: ");
                windowHeight = Integer.parseInt(myScanner.nextLine());
                isValid = true;
            }
            catch (NumberFormatException ex) {
                System.out.println("Invalid input type, please use numbers only.");
            }

        }

        isValid = false;
        while (!isValid)
        {
            try {
                System.out.print("Please enter the width of your window: ");
                windowWidth = Integer.parseInt(myScanner.nextLine());
                isValid = true;
            }
            catch (NumberFormatException ex) {
                System.out.println("Invalid input type, please use numbers only.");
            }

        }

        windowArea = windowWidth * windowHeight;
        windowPerimeter = (windowHeight + windowWidth) * 2;

        System.out.println("\nWindow area is: " + windowArea + " sq ft");
        System.out.println("Window perimeter is: " + windowPerimeter + " ft");

        windowPrice = (windowArea * 3.50) + (windowPerimeter * 2.25);

        System.out.println("\nTotal price is: $" + windowPrice);
    }
}
