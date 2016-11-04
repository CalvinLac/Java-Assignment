/*********************************************************
* Last Name: Lac
* First Name: Calvin
* Student ID: 10133628
* Course: CPSC 233
* Tutorial Section: T04
* Assignment: 1
*
*The program prompts the user to enter a binary number.
*The program then changes the binary number to a decimal. 
*********************************************************/

import java.util.Scanner;

public class binary
{
  public static String getID() {
    return "10133628"; // Your student ID here.
  }
  
  public static void main(String[] args)
  {
    int four_digit_binary;
    System.out.print("Please enter in your 4 digit binary number: ");

    //initializing the keyboard to accept a four digit binary number
    Scanner keyboard = new Scanner(System.in);
    four_digit_binary = keyboard.nextInt();

    //Assigning the remainder digits to their respective positions within the array
    int[] four_digit_array = new int[4];
    int counter;
    for (counter = 0; counter < 4; counter++) {
      four_digit_array[counter] = four_digit_binary % 10;
      four_digit_binary = four_digit_binary / 10;
    }


    //iterating through four_digit_array to get the sum of the binary numbers 
    int i, multiplier = 1, total = 0;
    for (i = 0; i < 4; i++) {
      total = total + (four_digit_array[i] * multiplier);
      multiplier = multiplier*2;
    }
    System.out.println("Decimal value: " + total);
  }
}