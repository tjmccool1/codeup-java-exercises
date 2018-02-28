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
//        double multi2 = multiply(a1,b1);
        int divide = divide(a,b);
        int remainder = modulus(a,b);
        System.out.println(sum);
        System.out.println(sub);
        System.out.println(multi);
//        System.out.println(multi2);
        System.out.println(divide);
        System.out.println(remainder);

    }


        public static int add(int a, int b) {
            return a + b;
        }

        public static int subtract(int a, int b){
        return a - b;
        }

//        public static int multiply(int a, int b){
//        return a * b;
//        a

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


//        public static double multiply(double a, double b){
//        do{
//            for (int i = 0; i <= b; i++)
//            a += a;
//        }while(i <= b);
//            return a;
//
//        }

        public static int divide(int a, int b){
        return a / b;
        }
        public static int modulus(int a, int b){
        return a % b;
        }
}
