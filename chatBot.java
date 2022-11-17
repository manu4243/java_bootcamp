import java.util.Scanner;
public class chatBot {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Welcome, Im ChatBot, What is your name?");
        String name = scan.nextLine();
        System.out.println("Hi " + name + " Im ChatBot, Where are you from?");
        String city = scan.nextLine();
        System.out.println("I hear its beautiful at " + city + " . Im from a place called Oracle.\nHow old are You?");
        int age = scan.nextInt();
        System.out.println("So you are " + age + " , thats cool. Im 400 years old.\nIt means I am " + (400/age) + " times older than you");
        System.out.println("Enough about me. What is your favorite language? (Just don't say Python).");
        String favorite = scan.nextLine();
        String language = scan.nextLine();
        System.out.println(language + ", Thats great. Nice chatting with you " + name + " I have to log off now. Talk to you later.");
        scan.close();
    }
    
}
