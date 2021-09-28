import java.util.Scanner;
/*
 Create a loop to print all odd numbers from 1 to 20
 Create a loop to print all even numbers from 1 to 20
 Create a loop to reverse an input string
 Create a loop that displays all factors of an input number
 Create a loop that computes the factorial value of input number
 */
public class MoreForLoops {
    public static void main(String [] args) {
        //Declare the variables
        int factorSum = 1, numToFactor, numToFactoral;
        // double factoralSum = 1;
        long factoralSum = 1;
        String userInput;
        Scanner kybrd = new Scanner(System.in);

        //Print even numbers from 1 to 20
        for (int i = 1; i <= 20; i++) {
            if (i % 2 == 0)
                System.out.print(i + " ");
        }
        System.out.println(); //Carriage return

        //Print the odd numbers from 1 to 20
        for (int i = 1; i <= 20; i++) {
            if (i % 2 != 0)
                System.out.print(i + " ");
        }
        System.out.println(); //Carriage return

        //Prompt user for a word
        System.out.print("Enter a word: ");
        userInput = kybrd.nextLine();
        //Now reverse the entered word
        for (int i = userInput.length(); i > 0; i--) {
            System.out.print(userInput.charAt(i - 1)); //i-1 as the index starts at zero
        }
        System.out.println(); //Carriage return

        System.out.println("Enter a number to see all the factors: ");
        numToFactor = kybrd.nextInt();
        System.out.println("The factors of " + numToFactor + " are:");
        for(int i = 1;i <= numToFactor;i++){
            if (numToFactor%i == 0)
                System.out.print(i + " ");
        }
        System.out.println(); //Carriage return

        //Prompt user for a number to be factorial function
        //i.e. 5 would be 5*4*3*2*1=
        System.out.print("Enter a number to be factorial: ");
        numToFactoral = kybrd.nextInt();

        for (int i = numToFactoral; i > 0; i--) {
            factoralSum *= i;
        }
     //System.out.println(numToFactoral + " factorial is: " + factoralSum);
     System.out.printf("%,d factorial is: %,d", numToFactoral,factoralSum);
    }
}
