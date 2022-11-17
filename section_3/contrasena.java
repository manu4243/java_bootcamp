import java.util.Scanner;

import java.util.Scanner;
public class contrasena {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String secretPassword = "manzana";
        System.out.println("Tienes 1 intento para adivinar la contrasena: ");
        String passwd = scan.nextLine();
        Boolean bool1 = (secretPassword.equals(passwd)); 
        System.out.println(bool1);
        scan.close();
    }
    
}
