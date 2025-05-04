import java.util.Scanner;

public class PerimetroCirculo {
    public static void main(String[] args) {
        // Crear un objeto Scanner para leer la entrada del usuario
        Scanner scanner = new Scanner(System.in);

        // Pedir al usuario el radio del círculo
        System.out.print("Ingrese el radio del círculo: ");
        double radio = scanner.nextDouble();

        // Calcular el perimetro usando la fórmula p = 2 * π * radio
        double perimetro = 2 * Math.PI * radio;

        // Mostrar el resultado
        System.out.printf("El perímetro del círculo es: %.2f%n", perimetro);

        // Cerrar el Scanner
        scanner.close();
    }





}