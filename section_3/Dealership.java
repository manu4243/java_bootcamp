import java.util.Scanner;
public class Dealership {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Welcome to Java Dealership.\nSelect option A to buy a car.\nSelect option B to sell a car");
        String option = scan.nextLine();
        switch (option) {
            case "A": System.out.println("You chose option " + option); break;
            case "B": System.out.println("You chose option " + option); break;
            default: System.out.println("You chose an invalid option.");
        }
        scan.close();
    }
    
}
