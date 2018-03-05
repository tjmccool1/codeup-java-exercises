package movies;

import util.Input;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


public class MoviesApplication {

    private static Input input = new Input();
    private static List<Movie> movies = new ArrayList<>(Arrays.asList(MoviesArray.findAll()));

    public static void addMovie() {


        String name = input.getString("Enter A Name: ");

        String category = input.getString("Enter A Category:").toLowerCase();

        movies.add(new Movie(name, category));
        System.out.println("You added Movie Name:" + name + "Category: " + category);

    }

    public static void main(String[] args) {
        System.out.println(MoviesArray.findAll().toString());

        do {
            System.out.println("\n");
            System.out.println("What would you like to do?\n");
            System.out.println("0 - Exit");
            System.out.println("1 - View All Movies");
            System.out.println("2 - View Movies in the 'Animated' Category");
            System.out.println("3 - View Movies in the 'Drama' Category");
            System.out.println("4 - View Movies in the 'Horror' Category");
            System.out.println("5 - View Movies in the 'Sci-Fi' Category");
            System.out.println("6 - Add a new movie");

            System.out.print("Enter Your Choice: ");
            int option = input.getInt(0, 6);

            switch (option) {
                case 0:
                    System.out.println("Goodbye!");
                    return;
                case 1:
                    for (Movie movie : movies)
                        System.out.printf("%s -- %s\n", movie.getName(), movie.getCategory());
                    break;
                case 2:
                    for (Movie movie : movies)
                        if ("animated".equals(movie.getCategory()))
                            System.out.printf("%s -- %s\n", movie.getName(), movie.getCategory());
                    break;
                case 3:
                    for (Movie movie : movies)
                        if ("drama".equals(movie.getCategory()))
                            System.out.printf("%s -- %s\n", movie.getName(), movie.getCategory());
                    break;
                case 4:
                    for (Movie movie : movies)
                        if ("horror".equals(movie.getCategory()))
                            System.out.printf("%s -- %s\n", movie.getName(), movie.getCategory());
                    break;
                case 5:
                    for (Movie movie : movies)
                        if ("scifi".equals(movie.getCategory()))
                            System.out.printf("%s -- %s\n", movie.getName(), movie.getCategory());
                    break;
                case 6:
                    addMovie();

                    break;
                default:
                    System.out.println("Invalid Option");
            }
        } while (input.yesNo("Continue?"));
    }
}