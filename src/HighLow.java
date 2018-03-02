import java.util.Scanner;

public class HighLow {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int random;
        int userGuess;
        String userChoice;
        int numOfGuess = 1;
        int maxNumOfGuess;
        random = (int) Math.ceil(Math.random() * 100);
        do {
            System.out.println("How many guesses would you like?");
            maxNumOfGuess = sc.nextInt();
            if (maxNumOfGuess < 100) {
                do {
                    System.out.println("Pick a number between 1 and 100");
                    userGuess = sc.nextInt();
                    numOfGuess += 1;
                    if(userGuess > 100 || userGuess < 1) {
                        System.out.println("You wasted that guess. ");
                    }else if (userGuess == random) {
                        System.out.println("GOOD GUESS");
                    } else if (userGuess < random) {
                        System.out.println("HIGHER");
                    } else System.out.println("LOWER");
                } while (numOfGuess <= maxNumOfGuess);
                System.out.println("The random number was " + random);
            } else System.out.println("That's way to many tries!");
            System.out.println("Would you like to try again? Y/N");
            userChoice = sc.next();
        } while (userChoice.equalsIgnoreCase("y"));


    }

}