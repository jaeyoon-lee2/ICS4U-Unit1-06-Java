/*
* This program gets the range of random number,
* generates and shows random number between 1 to max value using procedure.
*
* @author  Jay Lee
* @version 1.0
* @since   2020-04-28
*/
// package ca.mths.unit1.unit06.java.main;

import java.util.Scanner;
import java.util.Random;

public final class RollDice {
    /**
    * This method gets max value of random number,
    * generates random number between 1 to max value and
    * prints out the random number.
    * @param maxValue -  the range of the random number
    */
    public static void rollDie(final int maxValue) {
        Random random = new Random();

        // Genrate random number between 1 to maxValue
        int randomNumber = random.nextInt(maxValue) + 1;

        // Output
        System.out.println("The random number is " + randomNumber + ".");
        System.out.println("\nDone.");
    }

    private RollDice() {
        // Prevent instantiation
        // Optional: throw an exception e.g. AssertionError
        // if this ever *is* called
        throw new IllegalStateException("Cannot be instantiated");
    }

    /**
    * This method gets the range of random
    * number and checks invalid inputs.
    * @param args
    */
    public static void main(final String[] args) {
        Scanner myObj = new Scanner(System.in);

        System.out.print("Chose the range (1 to ?): ");
        try {
            // condition
            int userRange = Integer.parseInt(myObj.nextLine());
            if (userRange >= 1) {
                RollDie(userRange);
            } else {
                System.out.print("Out of range!");
            }
        } catch (Exception ex) {
            System.err.print("Invalid input!");
        }
    }
}
