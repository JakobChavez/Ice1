/**
// @Programmer: jakobchavez
// DisplayData.java
// Date: Jan 27 2021
// version: 1.23
*/
import java.util.Scanner;

public class Play {

    public static void main(String[] args) {
        // This is just determeining the sides on the die and showing the max possible rolls
        final int DIE1_SIDES = 6;
        final int DIE2_SIDES = 6;
        final int MAX_ROLLS = 10;
        //  This is just printing The enter computer name and to enter user name for the player
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter computer name: ");
        String name = scanner.nextLine();
        System.out.print("Enter user name: ");
        String username = scanner.nextLine();
        // Create two objects of Die class
        Die userDie = new Die(DIE1_SIDES);
        Die computerDie = new Die(DIE2_SIDES);
        userDie.setUserName(name);
        computerDie.setUserName(username);
        System.out.println("This simulates the rolling of a " + userDie.getSide() + " sided die and "
                + "a " + computerDie.getSide() + " sided die");
        System.out.println("Rolling the dice " + MAX_ROLLS + " times");
        // Set count of computer and integer to zero 
        int computerWins = 0, userWins = 0;
        System.out.println("Die1\tDie2");
        for (int roll = 1; roll <= MAX_ROLLS; roll++) {
            // Call roll method for computer    
            computerDie.roll();
            // Call roll method for user    
            userDie.roll();
            // This is checkinhg to see whos value is greater than the other    
            System.out.println(computerDie.getValue() + "\t" + userDie.getValue());
            if (computerDie.getValue() >= userDie.getValue()) {
                // Increment so if the compuer wins        
                computerWins++;
            } else if (computerDie.getValue() < userDie.getValue()) {
                // Increment so if the user wins  
                userWins++;
            }
        }
        // This is printing the final winner of the game 
        System.out.println("Computer=" + computerWins + " user=" + userWins);
        if (computerWins > userWins) {
            System.out.println("Grand winner is computer " + computerDie.getUserName());
        } else if (computerWins < userWins) {
            System.out.println("Grand winner is user " + userDie.getUserName());
        } else {
            System.out.println("There is tie between computer " + computerDie.getUserName() + " and "
                    + "user " + userDie.getUserName());
        }
    }   // This is the end of the main method 
}       // This is the end of the class 
