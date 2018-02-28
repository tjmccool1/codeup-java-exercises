import java.util.Scanner;

public class ControlFlowExercises {
    public static void main (String[] args){
        int x = 5;
        while(x <= 15){
            System.out.println(x);
            x++;
        }
        System.out.println("----------");


        int n = 0;
        do{
            System.out.println(n);
            n += 2;
        }while(n < 100);
        System.out.println("--------------");


        int t = 100;
        do{
            System.out.println(t);
            t-=5;
        }while(t >= -10);
        System.out.println("---------------");

        //why when int returns 0
        long s = 2;
        do{
            System.out.println(s);
            s *= s;
        }while(s <= 1000000);
        System.out.println("---------------");

        for(int i = 1; i <= 100; i++){
            if((i % 3 == 0) & (i % 5 == 0)){
                System.out.println("FizzBuzz");
            }else if(i % 3 == 0){
                System.out.println("Fizz");
            }else if(i % 5 == 0){
                System.out.println("Buzz");
            }else{
                System.out.println(i);
            }
        }System.out.println("---------------");


//       do {
           int input;
           int squared;
           int cubed;
           Scanner sc = new Scanner(System.in);
           System.out.print("What number would you like to go up to? ");
           input = sc.nextInt();
           System.out.println("Here is your table!");
           System.out.println("number | squared | cubed");
           System.out.println("-------|---------|-------");
           for (int i = 1; i <= input; i++) {
               System.out.printf(" %-6s|", i);
//            System.out.print(" |");
               System.out.printf(" %-8s|", i * i);
//            System.out.print(" |");
               System.out.printf(" %-8s", i * i * i);
               System.out.println();
           }
        String input2;
        System.out.println("Do you want to continue: y/n");
        String yes = "y";
        String no = "n";
//       }


       // pryamind example
        for(int i=0;i<5;i++) {
            for(int j=0;j<5-i;j++) {
                System.out.print(" ");
            }
            for(int k=0;k<=i;k++) {
                System.out.print("$ ");
            }
            System.out.println();
        }

        int grade;
        


    }
}
