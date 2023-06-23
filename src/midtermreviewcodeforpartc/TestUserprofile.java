import java.util.Scanner;
//Q5 This is first comment
public class TestUserProfile {
    public static void main(String[] args) {
        TestUserProfile userProfile = new TestUserProfile();
        userProfile.run();
    }

    private void run() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome");
        System.out.println("Enter your name:");
        String name = scanner.nextLine();

        System.out.println("Your favorite genre:");
        displayGenres();
        String genre = selectGenre(scanner);

        UserProfile userProfile = new UserProfile(name, genre);
        System.out.println("User profile created!");
        System.out.println(userProfile);
    }

    private void displayGenres() {
        System.out.println("List of Genres:");
        System.out.println("A. Action");
        System.out.println("B. Comedy");
        System.out.println("C. Adventure");
        System.out.println("D. Fantasy");
        System.out.println("E. Drama");
    }

    private String selectGenre(Scanner scanner) {
        int choice;
        do {
            System.out.print("Enter the number corresponding to your favorite genre: ");
            choice = scanner.nextInt();
        } while (choice < 1 || choice > 5);

        String genre;
        switch (choice) {
            case 1:
                genre = "Action";
                break;
            case 2:
                genre = "Adventure";
                break;
            case 3:
                genre = "Comedy";
                break;
            case 4:
                genre = "Drama";
                break;
            case 5:
                genre = "Fantasy";
                break;
            default:
                genre = "Unknown";
                break;
        }
        return genre;
    }
}

class UserProfile {
    private String name;
    private String favoriteGenre;

    public UserProfile(String name, String favoriteGenre) {
        this.name = name;
        this.favoriteGenre = favoriteGenre;
    }

    public String getName() {
        return name;
    }

    public String getFavoriteGenre() {
        return favoriteGenre;
    }

    @Override
    public String toString() {
        return "User Profile:\n" +
                "Name: " + name + '\n' +
                "Favorite Genre: " + favoriteGenre;
    }
}
