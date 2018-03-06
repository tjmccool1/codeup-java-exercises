import java.util.Random;

public class ServerNameGenerator {

    public static Random rng = new Random();


        public static String[] adjectives = {"small", "large", "ugly", "beautiful", "red", "green", "blue", "black", "white", "purple"};
        public static  String[] nouns = {"dog","cat", "bird", "fish", "flower", "cloud", "tree", "gun", "bow", "bird"};

//    public static String randomElement(String[] array){
//        int randomIndex = rng.nextInt(array.length);
//        return
//    }


    public static String randomElement(String[] array)
    {
        return array[(int)(Math.random() * array.length)];
    }

    public static void main(String[] args) {
        System.out.println("Here is your server name: \n" + randomElement(adjectives) + "-" + randomElement(nouns));

    }


}

