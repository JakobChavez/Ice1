/**
// @Programmer: jakobchavez
// DisplayData.java
// Date: Jan 27 2021
// version: 1.24
*/

import java.util.Random;

public class Die {
// This is the instance variables of dice class

    private String computerName;
    private String userName;
    private int sides;
    int value;
// This is the constructor that sets the number of sides of dice

    public Die(int sides) {
        this.sides = sides;
        value = 0;
        computerName = "";
        userName = "";
    }
// This is setting there is 6 sides, value = 0

    public Die(String computerName, String userName) {
        this.computerName = computerName;
        this.userName = userName;
        sides = 6;
        value = 0;
    }
// This returns the value of the sides of the dice

    public int getSide() {
        return sides;
    }
// This returns the value of the sides of the dice

    public void setSides(int sides) {
        if (sides <= 0) {
            throw new IllegalArgumentException("Error: Sides cannot be 0 or negative");
        }
        this.sides = sides;
    }
// This returns the value of the dice roll

    public int getValue() {
        return value;
    }
// This sets the intValue value for the setValue

    public void setValue(int value) {
        if (value <= 0 || value > sides) {
            throw new IllegalArgumentException("Error: Illegal value");
        }
        this.value = value;
    }
// This is the method that creates a random value 

    public void roll() {

        Random random = new Random();
        value = random.nextInt(sides) + 1;

    }
// This is to call the computerName

    public String getComputerName() {
        return computerName;
    }
// This is to call the userName

    public String getUserName() {
        return userName;
    }
// This is to declare an invalid username

    public void setUserName(String userName) {
        if (userName == null || userName.trim().length() == 0) {
            throw new IllegalArgumentException("Error: Invalid username");
        }
        this.userName = userName;
    }
}
// This is the end of the die class
