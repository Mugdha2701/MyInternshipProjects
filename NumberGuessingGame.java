import java.lang.Math;
import java.util.Scanner;

public class NumberGuessingGame {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
   

        int highestValue = 100;   //highest value of random number
        int lowestValue = 1;      //lowest value of random number
        int randomNumber = (int)(Math.random() * 99 + 1);  //Generates random number
        int attempts = 0;
        int userGuess=0;

        System.out.println("Welcome to the Number Guessing Game!");
        System.out.println("I choose random number between "+ lowestValue + " and " + highestValue + " 1Can you Guess it ?");

       
        do{
            System.out.println("Enter your Guess : ");
            if(sc.hasNextInt())
            {
             userGuess = sc.nextInt();
            
            attempts++;
            if(userGuess < randomNumber)
            {
                System.out.println("To low! Try again.");
            }
            else if(userGuess > randomNumber)
            {
                System.out.println("Too high! Try again");
            }
            else if(attempts==5)
            {
                System.err.println("You didn't get the number between 5 attempts.Try again!");
            }
            else
            {
                System.out.println("Congratulations! You Gussed correct number in " + attempts + " attempts.");
                break;
            }
       
          }
        }while(userGuess != randomNumber);
       sc.close();
    }
    
}
