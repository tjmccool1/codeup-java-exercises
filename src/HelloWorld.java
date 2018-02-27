public class HelloWorld {
    public static void main(String[] args) {
//        System.out.println("Hello, World!");
        System.out.print("Hello, ");
        System.out.print("World! \n");
//declare a variable
        int myFavoriteNumber;
//initialize variable
        myFavoriteNumber = 7;
        System.out.println(myFavoriteNumber);
//Declare and initialize
        String myString = "My favorite number is ";
        System.out.println(myString + myFavoriteNumber);

        //myString = 'c';
        //myString = 3.1459;

        //long myNumber;
       // myNumber = 3.14;
       // myNumber = 123L;
       // myNumber = 123;
        float myNumber = (float)3.14;
        System.out.println(myNumber);

//        int x = 5;
//        System.out.println(x++);
//        System.out.println(x);
/* The code above(pre-increment) prints x then prints to new value of x
* the code below(post-increment) prints the value of x + 1 then the new vale of x.
 *
 * */
//        int x = 5;
//        System.out.println(++x);
//        System.out.println(x);

        //class is a reserve word.
//        String class;
//        class = "Teddy";
//        System.out.println(class);

//        int x = 4;
//        x += 5;
//        System.out.println(x);

//        int x = 3;
//        int y = 4;
//        y *= x;
//        System.out.println(y);
//
        int x = 10;
        int y = 2;
        x /= y;
        y -= x;
        System.out.println(x);
        System.out.println(y);

       /* // how java code runs
       * write java to .java file
       * compile your java with java compiler
       * java compiler gives you a .class file, which is bytecode
       * run(interpret the bytecode) in java virtual machine
       * jvm calls you main method
       * */

    }
}
