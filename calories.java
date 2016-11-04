/*********************************************************
* Last Name: Lac
* First Name: Calvin
* Student ID: 10133628
* Course: CPSC 233
* Tutorial Section: T04
* Assignment: 1
*
*The program accepts the user's gender, weight, height, and age.
*This inputs are ran through an algorithm that determines the 
*calories that are expended through normal metabolism.
*********************************************************/

import java.util.Scanner;

public class calories
{
  public static String getID() {
    return "10133628"; // Your student ID here.
  }

  public static void main (String[] args)
  {
    //initialize all the variables and constants that are need in the calculation
    String gender;
    int weight, height, age;
    double calories, lbConversion = .45359237, heightConversion = 2.54;

    Scanner keyboard = new Scanner(System.in);

    System.out.print("Please enter your gender (male or female): ");
    gender = keyboard.nextLine();

    System.out.print("Please enter your weight (in lb): ");
    weight = keyboard.nextInt();

    System.out.print("Please enter your height (in inch): ");
    height = keyboard.nextInt();

    System.out.print("Please enter your age (in year): ");
    age = keyboard.nextInt();

    //if statements to determine the differnce in calories for males and females
    if (gender.equals("male")) {
      calories = ( (10 * (weight*lbConversion)) + (6.25 * (height * heightConversion)) - (5 * age) + 5);
      System.out.println("Your calories used per day is " + calories + ".");
    }
    else if (gender.equals("female")) {
      calories = ( (10 * (weight*lbConversion)) + (6.25 * (height * heightConversion)) - (5 * age) - 161);
      System.out.println("Your calories used per day is " + calories + ".");
    }
  }
}