import java.util.Scanner;
public class Dealership {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Welcome to Java Dealership.\nSelect option A to buy a car.\nSelect option B to sell a car");
        String option = scan.nextLine();
        switch (option) {
            case "A": System.out.println("What is your budget?");
            int budget = scan.nextInt();
            if (budget >= 10000) {
                System.out.println("Great, A Nissan Altima is available!");
                System.out.println("\nDo you have insurance? Write 'yes' or 'no' ");
                scan.nextLine();
                String insurance = scan.nextLine();
                System.out.println("\nDo you have Driver License? Write 'yes' or 'no'");
                String license = scan.nextLine();
                System.out.println("\nWhat is your credit score?");
                int creditScore = scan.nextInt();
                if (insurance.equals("yes") && license.equals("yes") && creditScore >= 660) {
                    System.out.println("Sold, pleasure doing business with you.");
                } else {
                    System.out.println("Sorry, you do not meet all requirements.");
                }
            } else {
                System.out.println("\nWe Dont't sell cars under $10,000 dollars. Sorry!");
            }
            break;
            case "B": 
            System.out.println("\nWhat is your car's value?");
            int value = scan.nextInt();
            System.out.println("\nWhat is the selling price of your car?");
            int price = scan.nextInt();
            if (value > price && price < 30000) {
                System.out.println("\nGreat, We'll buy your car.");
            } else {
                System.out.println("\nSorry, We can't buy your car.");
            }
            break;
            default: System.out.println("\nYou chose an invalid option.");
        }
        scan.close();
    }
    
}
