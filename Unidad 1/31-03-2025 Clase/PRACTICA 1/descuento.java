import java.util.Scanner;

public class descuento {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese el precio del producto: ");
        double precioOriginal = scanner.nextDouble();

        System.out.print("Ingrese el porcentaje de descuento (%): ");
        double porcentajeDescuento = scanner.nextDouble();

        double descuento = (precioOriginal * porcentajeDescuento) / 100;

        double precioFinal = precioOriginal - descuento;

        System.out.printf("El precio final del producto es: %.2f\n", precioFinal);

        scanner.close();
    }
}
