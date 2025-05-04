import java.util.Scanner;


public class Promedio {

    public static void main(String[] args){

        Double N1;
        Double N2;
        Double N3;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese el 1er número: ");
        N1=scanner.nextDouble();

        System.out.println("Ingrese el 2do número: ");
        N2=scanner.nextDouble();

        System.out.println("Ingrese el 3er número: ");
        N3=scanner.nextDouble();

        Double Promedio = (N1+N2+N3)/3;

        System.out.println("El promedio es: "+Promedio);

        scanner.close();

    }
}   