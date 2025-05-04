
import java.util.Scanner;

public class AreaTriangulo {

    public static void main(String[] args) {
        int b;
        int h;

        Scanner scanner = new Scanner(System.in); // Corrección aquí

        System.out.print("Ingrese la base: ");
        b = scanner.nextInt();

        System.out.print("Ingrese la altura: ");
        h = scanner.nextInt();

        int area = (b * h) / 2;

        System.out.println("El área es: " + area);

        scanner.close();
    }
}
