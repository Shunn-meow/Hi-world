import java.util.Scanner;

public class SumaV2 {

    public static void main(String[] args) {

        double a;
        double b;

        Scanner scanner = new Scanner(System.in);

        System.out.println("ingrese el 1er nuemro: ");
        a = scanner.nextDouble();

        System.out.println("ingrese el segundo digito: ");
        b = scanner.nextDouble();

        double Suma = a+b;

        System.out.println("ek resultado es: "+Suma);

        scanner.close();


    }
}
