import java.util.Scanner;

public class calories
{
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

    System.out.print("Please enter your weight (in inch): ");
    height = keyboard.nextInt();

    System.out.print("Please enter your weight (in years): ");
    age = keyboard.nextInt();

    //if statements to determine the differnce in calories for males and females
    if (gender.equals("male")) {
      calories = ( (10 * (weight*lbConversion)) + (6.25 * (height * heightConversion)) - (5 * age) + 5);
      System.out.println(calories);
    }
    else if (gender.equals("female")) {
      calories = ( (10 * (weight*lbConversion)) + (6.25 * (height * heightConversion)) - (5 * age) - 161);
      System.out.println(calories);
    }
  }
}