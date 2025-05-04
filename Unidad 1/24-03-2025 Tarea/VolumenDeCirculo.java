import java.util.Scanner;

public class VolumenDeCirculo {

    public static void main(String[] args) {

        double radio;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese el radio: ");
        radio = scanner.nextDouble();

        double volumen = (4*Math.PI*radio)/3; 

        System.out.println("El volumen es: "+volumen);

        scanner.close();
    }

    
}