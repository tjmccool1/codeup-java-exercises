import java.util.Scanner;

public class MethodsExercises {
    public static void main(String[] args) {

        System.out.println("Hello");
        int a = 4;
        int b = 5;
        double a1 = 4.0;
        double b1 = 5.0;
        int sum = add(a,b);
        int sub = subtract(a,b);
        int multi = multiply(a,b);
        double multi2 = multiply(a1,b1);
        int divide = divide(a,b);
        int remainder = modulus(a,b);


//        part 1
        System.out.println(sum);
        System.out.println(sub);
        System.out.println(multi);
        System.out.println(multi2);
        System.out.println(divide);
        System.out.println(remainder);

        int minMax = getInterger(1 , 8); // part 2
        long factor = factorial(1, 200); // part 3
        long diceGame = dice(2, 120);   //part 4



    }
/////part 1

        public static int add(int a, int b) {
            return a + b;
        }

        public static int subtract(int a, int b){
        return a - b;
        }

        public static double multiply(double a, double b) {
            return a * b;
        }

        public static int multiply (int a, int b) {
            if(a == 0 || b == 0){
                return 0;
            }
            if(a < 0) {
                return -multiply(-a, b);//recursion //https://codereview.stackexchange.com/questions/157344/multiplying-2-numbers-without-using-operator-in-java
            }
            int result = 0;
            for(int i = a; i > 0; i--){
                result += b;
            }
            return result;
        }

        public static int divide(int a, int b){
        return a / b;
        }

        public static int modulus(int a, int b){
        return a % b;
        }

//        Part 2
        public static int getInterger(int min, int max){
            Scanner sc = new Scanner(System.in);
            System.out.print("Enter a number between " + min + " and " + max + " : ");
            int userInput = sc.nextInt();
            if(userInput < min | userInput > max){
                return getInterger(min, max);//recursion
            }else{
                System.out.println("good job");
            }
            return userInput;
        }

//        part 3
        public static long factorial(int min, int max){
            StringBuilder count = new StringBuilder();
            Scanner sc = new Scanner(System.in);
            String userChoice;
            System.out.print("Enter a number between " + min + " and " + max + " : ");
            int userInput = sc.nextInt();

            long result = 1;
            if(userInput < min | userInput > max){
                return factorial(min,max);
            }else{
                do {
                    for (int i = 1; i <= userInput; i++) {

                        System.out.print(i + "! = ");
                        //have factors //need to get multiplication
                        count.append(i).append(" x ").append("\t");
                        System.out.printf("%-30s", count.deleteCharAt(count.length() - 1).toString());
                        result *= i;

                        System.out.printf(" = %d", result);
                        System.out.println();
                    }
                    System.out.println("would you like another number factored? y/n");
                    userChoice = sc.next();
                }while (userChoice.equalsIgnoreCase("y"));
                return result;
            }

        }

//    part 4
            public static int dice(int minSides, int maxSides){
                Scanner sc = new Scanner(System.in);
                int userInput;
                int dice1;
                int dice2;
                int total;
                String userChoice;
                //String readString = sc.nextLine();
                do{
                    System.out.print("How many sides on your Dice?  ");
                    userInput = sc.nextInt();
                    do {
                        if(userInput >= minSides & userInput <= maxSides) {
                            System.out.print("Roll the dice? ");
                            userChoice = sc.next();

                            if (userChoice.equalsIgnoreCase("Y")) {
                                dice1 = (int) Math.ceil(Math.random() * userInput);
                                dice2 = (int) Math.ceil(Math.random() * userInput);
                                total = (dice1 + dice2);
                                System.out.println("die 1 = " + dice1);
                                System.out.println("die 2 = " + dice2);
                                System.out.println("Total = " + total);
                            }else sc.nextLine();

                        } else dice(minSides, maxSides);
                        System.out.println("-------Roll again? ");
                        userChoice = sc.next();
                    }while(userChoice.equalsIgnoreCase("y"));
                        System.out.println("-------Change Dice? ");
                        userChoice = sc.next();
                }while(userChoice.equalsIgnoreCase("y"));
                return userInput;

            }

//    part 5


}
