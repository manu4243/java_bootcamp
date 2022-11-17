import java.util.Scanner;
public class ifElse {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Por favor introduzca su calificacion para matematica: ");
        int score = scan.nextInt();
        if (score >= 90) {
            System.out.println("Congratulations, You got an A");
        }else if (score >= 80) {
            System.out.println("Great, you got a B");
        }else if (score >= 70){
            System.out.println("You passed!");
        }else {
            System.out.println("Sorry, You did not pass.\nTry harder next time!");
        }
    }
    
}
