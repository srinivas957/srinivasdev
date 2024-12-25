import java.util.Scanner;

public class FavoriteMovies {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("What is your favorite movie? ");
        String movie = scanner.nextLine();

        System.out.println("Your favorite movie is: " + movie);

        scanner.close();
    }
}
