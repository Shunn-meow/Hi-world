import java.util.Scanner;

public class prestamo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese el monto del préstamo: ");
        double P = scanner.nextDouble();

        System.out.print("Ingrese la tasa de interés anual (%): ");
        double tasaInteres = scanner.nextDouble();

        System.out.print("Ingrese el número de años: ");
        int n = scanner.nextInt();

        double r = tasaInteres / 100;

        double VF = P * Math.pow((1 + r), n);

        System.out.printf("El valor futuro del préstamo es: %.2f\n", VF);

        scanner.close();
    }
}