import java.util.Scanner;

public class kilometros {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese la distancia recorrida (km): ");
        double distancia = scanner.nextDouble();

        System.out.print("Ingrese el tiempo empleado (horas): ");
        double tiempo = scanner.nextDouble();

        if (tiempo <= 0) {
            System.out.println("El tiempo debe ser mayor que cero.");
        } else {
            double velocidad = distancia / tiempo;
            System.out.println("La velocidad promedio es: " + velocidad + " km/h");
        }

        scanner.close();
    }
}