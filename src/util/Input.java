package util;

import java.util.Scanner;
///redo with method overload ////
public class Input {

    private Scanner input;

    public Input() {
        input = new Scanner(System.in);
    }

    public String getString() {
        return this.input.nextLine();
    }

    //prompt????
    public String getString(String prompt) {
        System.out.print(prompt);
        return this.input.nextLine();
//        return getString();
    }

    public boolean yesNo(String prompt) {
        System.out.println(prompt + " Yes/No");
        String yes = this.input.next().toLowerCase();
        return "y".equals( yes ) || yes.contains("yes");
    }

//    break down
//    public int getInt(){
//        return input.nextInt();
//    }
//  then
     public int getInt(int min, int max) {
        System.out.print("Enter An Integer between " + min + " and " + max + ": ");
        int x = this.input.nextInt();
        input.nextLine();
        if (x >= min && x <= max) {
            return x;
        }else {
            return getInt(min, max);
        }
    }

    public double getDouble(){
        return input.nextDouble();
    }

//    public double getDouble(double min, double max,){
//        double y = this.input.nextDouble();
//        if (y >= min && y <= max) {
//            return y;
//        }else {
//            return getDouble(min, max);
//        }
//        return getDouble();
//    }

//add , String prompt
    public double getDouble(double min, double max) {
        System.out.print("Enter An double between " + min + " and " + max + ": ");
        double y = this.input.nextDouble();
        if (y >= min && y <= max) {
            return y;
        }else {
            return getDouble(min, max);
        }
    }


}