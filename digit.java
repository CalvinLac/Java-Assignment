import java.util.Scanner;

public class digit
{
  public static void main(String[] args)
  {
    int four_digit_number;
    System.out.print("Please enter in your 4 digit number: ");

    //Initializing the keybaord inputs
    Scanner keyboard = new Scanner(System.in);
    four_digit_number = keyboard.nextInt();
    
    //Assigning the remainder digits to their respective positions within the array
    int[] four_digit_array = new int[4];
    int n;
    for (n = 3; n > -1; n--) {
      four_digit_array[n] = four_digit_number % 10;
      four_digit_number = four_digit_number / 10;
    }


    //iterating through four_digit_array to display the digits on a new line every time. 
    int i;
    for (i = 0; i < 4; i++) {
      System.out.println(four_digit_array[i]);
    }
  }
}