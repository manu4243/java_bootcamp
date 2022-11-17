import java.util.Scanner;
public class brothers {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Favor introduzca el nombre de uno de sus hermanos: ");
        String hermano = scan.nextLine();
        switch (hermano) {
            case "Edward": System.out.println("Este hermano vive en las charcas de Azua y es el segundo mayor"); break;
            case "David": System.out.println("Existen dos hermanos con este nombre, uno de padre y uno de madre."); break;
            case "Edisson": System.out.println("Es el hermano mayor de los de padre y madre"); break;
            case "Eddileicy": System.out.println("Es la unica hermana de padre y madre"); break;
            case "Edilenia": System.out.println("Es la unica hermana de padre"); break;
            case "Edwing": System.out.println("Este hermano vive en la ciudad de Santo Domingo"); break;
            case "Ruddy": System.out.println("Este es el hermano mayor de madre"); break;
            default: System.out.println("No reconozco ese nombre");
        }
        scan.close();
    }
    
}
