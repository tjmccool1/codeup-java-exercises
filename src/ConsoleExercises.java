import java.util.Scanner;

public class ConsoleExercises {
    public static void main(String[] args) {
//        String userInput;
//        Scanner sc = new Scanner(System.in);
//        System.out.print("Enter something: ");
//        userInput = sc.nextLine();
//        System.out.println("You entered: --> \"" + userInput + "\" <--");

        int userInput;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter an Integer.\n");
        userInput = sc.nextInt();
        System.out.println(userInput);



//        sc.useDelimiter(" ");

        System.out.print("Enter three Words: ");

        String word1 = sc.next();
        String word2 = sc.next();
        String word3 = sc.next();
        System.out.println(word1);
        System.out.println(word2);
        System.out.println(word3);
        sc.nextLine();

        System.out.println("Enter a sentence");
        String sentence = sc.nextLine();
        System.out.println(sentence);

        System.out.println("Enter the width of the classroom");
        double width = Double.parseDouble(sc.nextLine());
        // scanner.nextDouble();

        System.out.println("Enter the length of the classroom");
        double length = Double.parseDouble(sc.nextLine());

        double area = length * width;
        double perimeter = 2 * length + 2 * width;

        // output
        System.out.println("The area of the classroom is " + area);
        System.out.println("The perimeter of the classroom is " + perimeter);




    }
}
