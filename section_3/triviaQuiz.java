import java.util.Scanner;

public class triviaQuiz {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int score = 0;
        System.out.println("Welcome to your Trivia Quiz");
        System.out.println("1. Which country held the 2016 Summer Olympics?");
        System.out.println("\ta) China\n\tb) Ireland\n\tc) Brazil\n\td) Italy\n"); 
        String answer1 = scan.nextLine();
        if (answer1.equals("c")) {
            score += 5;
        }
        System.out.println("\nWhich planet is the hottest?");
        System.out.println("\ta) Venus\n\tb) Saturn \n\tc) Mercury\n\td)Mars");
        String answer2 = scan.nextLine();
        if (answer2.equals("a")) {
            score += 5;
        }
        System.out.println("\nWhat is the rarest blood type?");
        System.out.println("\ta) O \n\tb) A \n\tc) B \n\td) AB-Negative");
        String answer3 = scan.nextLine();
        if (answer3.equals("d")) {
            score += 5;
        }
        System.out.println("\nWhich one of these characters is friends with Harry Potter?");
        System.out.println("\ta) Ron Weasley \n\tb) Hermione Granger \n\tc) Draco Molfey");
        String answer4 = scan.nextLine();
        if (answer4.equals("a")) {
            score += 5;
        
        }
        System.out.println("Your Score is " + score + "/20");
        if (score == 20) {
            System.out.println("Awesome!");
        } else if (score == 15) {
            System.out.println("Not bad!");
        } else {
            System.out.println("Better luck next time.");
        }
        scan.close();
    }   
}
