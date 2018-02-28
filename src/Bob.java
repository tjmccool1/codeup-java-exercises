import java.util.Scanner;

public class Bob {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String userChoice;
        do {
            System.out.print("Say something to Bob.  ");
            String userInput = sc.nextLine();

            if (userInput.endsWith("?")) {
                System.out.println("Sure.");
            } else if (userInput.trim().equals("")) {
                System.out.println("Fine be that way.");
            } else if (userInput.endsWith("!")) {
                System.out.println("Whoa, chill out!");
            } else {
                System.out.println("Whatever");
            }
            System.out.println("Would you Like to say any thing else?  ");
            userChoice = sc.nextLine();
        }while (userChoice.equals("y"));

    }
}
