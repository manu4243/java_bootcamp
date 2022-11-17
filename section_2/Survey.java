
import java.util.Scanner;
public class Survey {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Welcome to the survey ...");
        int counter = 0;
        System.out.println("\nWhat is your name: ");
        String name = scan.nextLine();
        System.out.println("\nYour name is " + name);
        System.out.println("\nWhat is your daughter's name: ");
        String daughter = scan.nextLine();
        System.out.println("\nYour daughter's name is " + daughter);
        System.out.println("\nHow much money do you spend on coffee?");
        double price = scan.nextDouble();
        System.out.println("\nWaoo $" + price + " its a lot of money.");
        System.out.println("\nHow much money do you spend on fast food?");
        double fastFoodPrice = scan.nextDouble();
        System.out.println("\n$" + fastFoodPrice + " spent on fast food its a waste of money.");
        System.out.println("\nHow many times a week do you buy coffee?");
        int coffeeAmount = scan.nextInt();
        System.out.println("\nWaoo $" + (coffeeAmount*price) + " its a lot of money spent on coffee every week.");
        System.out.println("\nHow many times a week do you buy fast food?");
        int foodAmount = scan.nextInt();
        System.out.println("\nWaoo $" + (fastFoodPrice*foodAmount) + " its a lot of money spent on fast food everyweek.");
        
        scan.close();
        
    }
    
}
