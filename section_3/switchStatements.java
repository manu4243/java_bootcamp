import java.util.Scanner;
public class switchStatements {
    public static void main(String[] args) {
        System.out.println("Please enter number corresponding to the current month: ");
        Scanner scan = new Scanner(System.in);
        int month = scan.nextInt();

        switch (month) {
            case 1: System.out.println("This month is January."); break;
            case 2: System.out.println("This month is February."); break;
            case 3: System.out.println("This month is March."); break;
            case 4: System.out.println("This month is April.");break;
            case 5: System.out.println("This month is May."); break;
            case 6: System.out.println("This month is June."); break;
            case 7: System.out.println("This month is July."); break;
            case 8: System.out.println("This month is August."); break;
            case 9: System.out.println("This month is September."); break;
            case 10: System.out.println("This month is October."); break;
            case 11: System.out.println("This month is November."); break;
            case 12: System.out.println("This month is December."); break;
            default: System.out.println("Please enter a valid month!");
        }
        scan.close();
    }
    
}
